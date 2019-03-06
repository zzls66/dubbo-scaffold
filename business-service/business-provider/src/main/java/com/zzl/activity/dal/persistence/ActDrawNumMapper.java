package com.zzl.activity.dal.persistence;

import com.zzl.activity.dal.entitys.ActDrawNum;


public interface ActDrawNumMapper {

    /**
     * 插入抽奖次数记录
     * @param ActDrawNum
     * @return
     */
    int inputDrawNumber(ActDrawNum ActDrawNum);

    /**
     * 更新已抽次数
     * @param uid
     * @return
     */
    int updateNowNumber(int uid);

    /**
     * 更新总的抽次数
     * @param uid
     * @return
     */
    int updateMaxNumber(int uid);

    /**
     * 查询指定用户的抽奖次数
     * @param uid
     * @return
     */
    ActDrawNum queryDrawNumForUid(int uid);
}
