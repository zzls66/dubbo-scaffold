package com.zzl.activity.services.processor;

import com.zzl.activity.dal.entitys.ActDrawAward;
import com.zzl.activity.dal.entitys.ActDrawAwardItem;
import com.zzl.activity.draw.bean.ActivityTurntableDrawReq;
import com.zzl.user.dto.UserQueryResponse;


public class ActivityDrawContext {

    private ActivityTurntableDrawReq activityTurntableDrawReq;

    private ActDrawAwardItem actDrawAwardItem;

    private ActDrawAward actDrawAward;

    private UserQueryResponse currentUser;

    public ActivityTurntableDrawReq getActivityTurntableDrawReq() {
        return activityTurntableDrawReq;
    }

    public void setActivityTurntableDrawReq(ActivityTurntableDrawReq activityTurntableDrawReq) {
        this.activityTurntableDrawReq = activityTurntableDrawReq;
    }

    public ActDrawAwardItem getActDrawAwardItem() {
        return actDrawAwardItem;
    }

    public void setActDrawAwardItem(ActDrawAwardItem actDrawAwardItem) {
        this.actDrawAwardItem = actDrawAwardItem;
    }

    public UserQueryResponse getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(UserQueryResponse currentUser) {
        this.currentUser = currentUser;
    }

    public ActDrawAward getActDrawAward() {
        return actDrawAward;
    }

    public void setActDrawAward(ActDrawAward actDrawAward) {
        this.actDrawAward = actDrawAward;
    }
}
