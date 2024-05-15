package com.lchml.demo.dao;

import com.lchml.demo.pojo.User;

public interface UserDao {

    User getByUsername(String username);

    int createUser(User user);
}
