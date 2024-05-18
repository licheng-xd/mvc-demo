package com.lchml.demo.service;

import com.lchml.demo.pojo.User;

public interface UserService {

    User getUser(String username);

    boolean createUser(String username, String passwd, String profile);
}
