package com.vankeytech.pmp.ims.service.impl;

import com.vankeytech.pmp.ims.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author AlexWong
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {
    @Override
    public String test() {
        return "Hello!";
    }
}
