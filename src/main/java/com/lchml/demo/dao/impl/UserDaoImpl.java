package com.lchml.demo.dao.impl;

import com.lchml.demo.common.LocalStorage;
import com.lchml.demo.dao.UserDao;
import com.lchml.demo.pojo.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserDaoImpl implements UserDao {

    // 模拟数据库
    @Resource
    private LocalStorage localStorage;

    @Override
    public User getByUsername(String username) {
        // 查找数据库记录
        return localStorage.selectByUsername(username);
    }

    @Override
    public int createUser(User user) {
        // 创建数据库记录
        return localStorage.insertUser(user);
    }
}
