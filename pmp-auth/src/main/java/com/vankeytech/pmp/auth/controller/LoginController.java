package com.vankeytech.pmp.auth.controller;


import com.vankeytech.pmp.auth.entity.User;
import com.vankeytech.pmp.auth.service.UserService;
import com.vankeytech.pmp.auth.shiro.CaptchaUsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author  xieliang
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public Object index(){

        List<User> list =userService.selectAll();
        for (User user: list){
            System.out.println(user.getUserName());
        }
        System.out.println("添加用户信息");
        return "/login.html";
    }

    public void login(HttpServletRequest request){
        CaptchaUsernamePasswordToken token=(CaptchaUsernamePasswordToken)request.getAttribute("ff");
    }

}
