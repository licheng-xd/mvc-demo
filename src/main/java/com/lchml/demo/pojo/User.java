package com.lchml.demo.pojo;

import java.io.Serializable;

public class User implements Serializable {

    // 用户名
    private String username;

    // 密码
    private String passwd;

    // 个人简介
    private String profile;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String info() {
        return "哈哈, 我是" + username + ", " + profile;
    }

}
