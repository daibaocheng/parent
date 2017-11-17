package com.vankeytech.pmp.auth.controller;


import com.vankeytech.pmp.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  xieliang
 */
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public Object index(){
//        User user=new User();
//        user.setUserPassword("123456");
//        user.setUserRegisterAccount("zhangshan");
//        user.setUserName("张三");
//        user.setUserPhone("12345678945");
//        userService.insert(user);
        System.out.println("添加用户信息");
        return "login.html";
    }




}
