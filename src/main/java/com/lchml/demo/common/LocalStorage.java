package com.lchml.demo.common;

import com.lchml.demo.pojo.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

// 模拟数据库存储
@Component
public class LocalStorage {

    private static Map<String, User> storage = new HashMap<>();

    public int insertUser(User user) {
        User succ = storage.putIfAbsent(user.getUsername(), user);
        if (succ != null) {
            return 0;
        } else {
            return 1;
        }
    }

    public User selectByUsername(String username) {
        return storage.get(username);
    }
}
