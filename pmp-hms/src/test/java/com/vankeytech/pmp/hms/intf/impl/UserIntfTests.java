package com.vankeytech.pmp.hms.intf.impl;

import com.vankeytech.pmp.hms.intf.UserIntf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserIntfTests {

    @Resource
    private UserIntf userIntf;

    @Test
    public void selectAll() {
        System.out.println(userIntf.selectAllUsers());
    }
    @Test
    public void selectByIds() {
        Integer[] ids = {1,2,3};
        System.out.println(userIntf.selectByIds(ids));
    }

}
