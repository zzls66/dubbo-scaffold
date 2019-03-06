package com.zzl.activity.notify;

import com.zzl.activity.dal.entitys.ActDrawNum;
import com.zzl.activity.dal.persistence.ActDrawNumMapper;
import com.zzl.common.utils.JsonUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Service;


@Service
public class RegistryListener implements MessageListener<Integer,String> {

    @Autowired
    ActDrawNumMapper actDrawNumMapper;

    @Override
    public void onMessage(ConsumerRecord<Integer, String> integerStringConsumerRecord) {
        UserBean userBean=null;
        try {
            String jsonStr=integerStringConsumerRecord.value();
            userBean=(UserBean) JsonUtils.json2Object(integerStringConsumerRecord.value(),UserBean.class);
            ActDrawNum actDrawNum=new ActDrawNum();
            actDrawNum.setName(userBean.getName());
            actDrawNum.setNowNumber(0);
            actDrawNum.setUid(userBean.getUid());
            actDrawNum.setMaxNumber(1);
            actDrawNumMapper.inputDrawNumber(actDrawNum);
        }catch (DuplicateKeyException e){
            //已经存在用户的抽奖资格记录，则累加抽奖机会
            actDrawNumMapper.updateMaxNumber(userBean.getUid());
        }catch(Exception e){
            throw new RuntimeException("消息处理异常:"+e);
        }
    }
}
