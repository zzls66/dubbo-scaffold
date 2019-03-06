package com.zzl.activity.dal.persistence;


import com.zzl.activity.dal.entitys.ActDrawAward;

public interface ActDrawAwardMapper {


    /**
     * 根据id获取奖品
     * @param id
     * @return
     */
    ActDrawAward queryAwardById(Integer id);
}