package com.zzl.activity.dal.entitys;


public class ActDrawNum {
    private Integer id;
    private Integer uid;
    private String name;
    private Integer nowNumber;
    private Integer maxNumber;
    private String createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNowNumber() {
        return nowNumber;
    }

    public void setNowNumber(Integer nowNumber) {
        this.nowNumber = nowNumber;
    }

    public Integer getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(Integer maxNumber) {
        this.maxNumber = maxNumber;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "ActDrawNum{" +
                "id=" + id +
                ", uid=" + uid +
                ", name='" + name + '\'' +
                ", maxNumber=" + maxNumber +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
