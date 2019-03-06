package com.zzl.activity.services.processor.reward;

import com.zzl.activity.services.processor.AbstractRewardProcessor;
import com.zzl.activity.services.processor.ActivityDrawContext;
import com.zzl.activity.services.processor.constants.DrawContants;
import org.springframework.stereotype.Service;


@Service("noneRewardProcessor")
public class NoneRewardProcessor extends AbstractRewardProcessor {

    protected void processor(ActivityDrawContext activityDrawContext) {
        logger.info("用户:{},获得奖项:{}",activityDrawContext.getActivityTurntableDrawReq().getUid(),activityDrawContext.getActDrawAwardItem().getItemName());
        modifyAwardRecord(activityDrawContext); //保存记录
    }

    protected void afterProcessor(ActivityDrawContext activityDrawContext) {

    }

    protected int getAwardType() {
        return DrawContants.AWARD_TYPE_ENUM.NONE.getValue();
    }
}
