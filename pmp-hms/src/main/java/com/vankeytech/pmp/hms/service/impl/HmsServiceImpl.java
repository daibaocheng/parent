package com.vankeytech.pmp.hms.service.impl;

import com.vankeytech.pmp.hms.service.HmsService;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service("hmsService")
public class HmsServiceImpl implements HmsService{
    @Override
    public String mytest() {
        System.out.println("---------- ");
        return "---------";
    }
}
