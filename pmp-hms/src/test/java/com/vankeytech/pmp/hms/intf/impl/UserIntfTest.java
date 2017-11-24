package com.vankeytech.pmp.hms.intf.impl;

import com.vankeytech.pmp.hms.condition.UserCondition;
import com.vankeytech.pmp.hms.intf.UserIntf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserIntfTest {

    @Resource
    private UserIntf userIntf;

    @Test
    public void selectAll() {
        System.out.println(userIntf.selectAllUsers());
    }
    @Test
    public void selectAllByPage() {
        System.out.println(userIntf.selectAllByPage(1,10));
    }
    @Test
    public void selectByIds() {
        Integer[] ids = {1,2,3};
        System.out.println(userIntf.selectByIds(ids));
    }
    @Test
    public void selectUserByCondition() {
        UserCondition userCondition = new UserCondition(0L,0L,9L,9L,null,null,null);
        System.out.println("userCondition = " + userCondition);
        System.out.println(userIntf.selectByCondition(userCondition,1,10));
    }
    @Test
    public void selectUserCountByCondition() {
        UserCondition userCondition = new UserCondition(null,null,9L,9L,null,null,null);
        System.out.println(userIntf.selectCountByCondition(userCondition));
    }
    @Test
    public void deleteUserByPrimaryKey() {
        userIntf.deleteByPrimaryKey(null);
    }
    @Test
    public void deleteUserByIds() {
        Integer[] ids = {1,2,3};
        userIntf.deleteByIds(ids);
    }

}
