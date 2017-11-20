package com.vankeytech.pmp.hms.intf.impl;

import com.vankeytech.pmp.hms.intf.SelectUserIntf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserIntfTests {

    @Resource
    private SelectUserIntf selectUserIntf;

    @Test
    public void selectAll() {
        System.out.println(selectUserIntf.selectAll());
    }

}
