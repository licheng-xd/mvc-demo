package com.lchml.demo.controller;

import com.lchml.demo.pojo.User;
import com.lchml.demo.service.UserService;
import com.lchml.demo.utils.StringUtil;
import com.lchml.demo.utils.TimeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Objects;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/")
    public String index(){
        return "login";
    }


    @RequestMapping("/reg")
    public String register(){
        return "register";
    }

    @RequestMapping("/login")
    public String login(@RequestParam String username, @RequestParam String passwd, ModelMap modelMap) {
        System.out.println("input:" + username);
        // 查询用户
        User user = userService.getUser(username);
        if (Objects.isNull(user) || StringUtil.notEquals(passwd, user.getPasswd())) {
            modelMap.addAttribute("errorInfo", "用户不存在或密码错误");
            return "error";
        }
        modelMap.addAttribute("loginInfo", user.info());
        modelMap.addAttribute("today", TimeUtil.getNow());
        return "hello";
    }

    @RequestMapping("/register")
    public String register(@RequestParam String username, @RequestParam String passwd, @RequestParam String desc, ModelMap modelMap) {
        // 校验参数
        if (!StringUtil.lengthCheck(username, 6, 12)) {
            modelMap.addAttribute("errorInfo", "用户名过长");
            return "error";
        }
        if (StringUtil.isEmpty(desc)) {
            modelMap.addAttribute("errorInfo", "请输入个人简介");
            return "error";
        }
        try {
            // 创建用户
            userService.createUser(username, passwd, desc);
            return "regSucc";
        } catch (Exception e) {
            modelMap.addAttribute("errorInfo", e.getMessage());
            return "error";
        }
    }
}
