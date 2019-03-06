package com.zzl.activity.controller;

import com.zzl.activity.commons.ResultResp;
import com.zzl.activity.controller.support.ResponseData;
import com.zzl.activity.draw.ActivityTurntableDrawService;
import com.zzl.activity.draw.bean.ActivityTurntableDrawReq;
import com.zzl.activity.draw.bean.AwardDrawRecordBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class DrawController extends BaseController{


    @Autowired
    ActivityTurntableDrawService activityTurntableDrawService;


    @PostMapping("/doDraw")
    public ResponseData doDraw(){
        ActivityTurntableDrawReq drawReq=new ActivityTurntableDrawReq();
        drawReq.setUid(Integer.parseInt(getUid()));
        ResultResp<AwardDrawRecordBean> resp= activityTurntableDrawService.doDraw(drawReq);
        ResponseData data=new ResponseData();
        data.setCode(resp.getReturnCodeEnum().getCode());
        data.setMessage(resp.getReturnCodeEnum().getMsg());
        data.setData(resp.getResult());
        return data;
    }

    /*public ResponseData drawNum(){

    }*/
}
