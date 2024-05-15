package com.lchml.demo.pojo;

import java.io.Serializable;

public class User implements Serializable {

    private String username;

    private String passwd;

    private String desc;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String info() {
        return "哈哈, 我是" + username + ", " + desc;
    }

}
