package com.zzl.activity.services.processor.exception;


public class UnRewardException extends RuntimeException {

    private static final long serialVersionUID = -4928964211797413219L;

    public UnRewardException(String msg) {
        super(msg);
    }

    public UnRewardException(String msg, Throwable e) {
        super(msg, e);
    }

}
