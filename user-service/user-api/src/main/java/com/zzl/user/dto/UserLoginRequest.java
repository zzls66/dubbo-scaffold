package com.zzl.user.dto;

import java.io.Serializable;


public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 686223598602505582L;
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
