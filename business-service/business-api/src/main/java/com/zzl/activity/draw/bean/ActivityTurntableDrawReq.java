package com.zzl.activity.draw.bean;

import java.io.Serializable;


public class ActivityTurntableDrawReq implements Serializable{
    private static final long serialVersionUID = 5362481131786992982L;

    private Integer uid;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "ActivityTurntableDrawReq{" +
                "uid=" + uid +
                '}';
    }
}
