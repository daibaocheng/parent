package com.vankeytech.pmp.api.controller;

import com.vankeytech.pmp.ims.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author AlexWong
 */
@RestController
public class ApiController {
    @Resource
    private DemoService demoService;

    @GetMapping("/test")
    public Object test() {
        return demoService.test();
    }
}
