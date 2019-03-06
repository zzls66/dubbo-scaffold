package com.zzl.activity.services.processor.reward;

import com.zzl.activity.services.processor.AbstractRewardProcessor;
import com.zzl.activity.services.processor.ActivityDrawContext;
import com.zzl.activity.services.processor.constants.DrawContants;
import org.springframework.stereotype.Service;


@Service("jdCardRewardProcessor")
public class JdCardRewardProcessor extends AbstractRewardProcessor {

    protected void processor(ActivityDrawContext activityDrawContext) {
        logger.info("用户:{},获得奖项:{}",activityDrawContext.getActivityTurntableDrawReq().getUid(),activityDrawContext.getActDrawAwardItem().getItemName());
        //发放奖品
        //redisTemplate.opsForList.rpop(); //从队列中弹出奖品
        modifyAwardRecord(activityDrawContext); //保存记录
    }

    protected void afterProcessor(ActivityDrawContext activityDrawContext) {
        //发送短信

    }

    protected int getAwardType() {
        return DrawContants.AWARD_TYPE_ENUM.JD_CARD.getValue();
    }
}
