package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;


public class UserClass {

    private String userName;
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
