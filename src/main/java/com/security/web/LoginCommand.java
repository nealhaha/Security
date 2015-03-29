package com.security.web;

/**
 * @author rui.deng  Date: 2015/3/14 Time: 18:12
 * @version 1.0.0
 */
public class LoginCommand {
    private String userName;

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
