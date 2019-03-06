package com.zzl.activity.services.processor.reward;

import com.zzl.activity.services.processor.AbstractRewardProcessor;
import com.zzl.activity.services.processor.ActivityDrawContext;
import com.zzl.activity.services.processor.constants.DrawContants;
import org.springframework.stereotype.Service;


@Service("financeRewardProcessor")
public class FinanceRewardProcessor extends AbstractRewardProcessor {

    protected void processor(ActivityDrawContext activityDrawContext) {
        logger.info("用户:{},获得奖项:{}",activityDrawContext.getActivityTurntableDrawReq().getUid(),activityDrawContext.getActDrawAwardItem().getItemName());
        //TODO 发放奖品
        modifyAwardRecord(activityDrawContext); //保存记录
    }

    protected void afterProcessor(ActivityDrawContext activityDrawContext) {
        //发送短信
    }

    protected int getAwardType() {
        return DrawContants.AWARD_TYPE_ENUM.FINANCE.getValue();
    }
}
