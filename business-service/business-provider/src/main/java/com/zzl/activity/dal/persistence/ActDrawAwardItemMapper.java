package com.zzl.activity.dal.persistence;



import com.zzl.activity.dal.entitys.ActDrawAwardItem;

import java.util.List;

public interface ActDrawAwardItemMapper {


    /**
     * 查询所有奖项
     * @return
     */
    List<ActDrawAwardItem> queryAwardItem();

}