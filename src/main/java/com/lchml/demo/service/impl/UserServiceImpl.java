package com.lchml.demo.service.impl;

import com.lchml.demo.dao.UserDao;
import com.lchml.demo.pojo.User;
import com.lchml.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public boolean createUser(String username, String passwd, String desc) {
        // 首先检查用户名是否已存在
        User exist = userDao.getByUsername(username);
        if (exist != null) {
            throw new RuntimeException("用户名已存在");
        }
        User user = new User();
        user.setUsername(username);
        user.setDesc(desc);
        user.setPasswd(passwd);
        // 创建数据库记录
        int ret = userDao.createUser(user);
        if (ret == 0) {
            throw new RuntimeException("创建用户失败");
        }
        return ret > 0;
    }

    public User getUser(String username) {
        // 从数据库获取user信息
        return userDao.getByUsername(username);
    }
}
