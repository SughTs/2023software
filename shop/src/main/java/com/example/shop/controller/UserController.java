package com.example.shop.controller;


import com.example.shop.bean.UserBean;
import com.example.shop.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.net.URLEncoder;

@Controller//控制器注释
public class UserController {
    //登录
    @Autowired//注入，可以理解成new
    UserMapper userMapper;
    @RequestMapping("/login")
    public String login(UserBean bean, HttpServletRequest req) throws Exception {//注意抛出异常，扔给了tomcat，项目外壳是tomcat
        //System.out.println(username);
        //System.out.println(password);//测试
        UserBean user = userMapper.getUser(bean.username,bean.password);
        //if (user==null)
        //    return"/main";
        if(user == null) {
            System.out.println("Wrong username or password");
            return "redirect:/index.html?msg="+ URLEncoder.encode("用户名或密码错误！","utf-8");
        }
        else{
            System.out.println("Successful!");
            req.setAttribute("user",user);
            return "/main";//转发会自动加.html
        }
    }
}
