package com.zzl.activity.services.processor.exception;


public class RewardException extends RuntimeException {

    public RewardException(String msg) {
        super(msg);
    }

    public RewardException(String msg, Throwable e) {
        super(msg, e);
    }
}
