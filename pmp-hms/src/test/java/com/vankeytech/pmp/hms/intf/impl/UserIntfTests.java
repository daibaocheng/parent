package com.vankeytech.pmp.hms.intf.impl;

import com.vankeytech.pmp.hms.entity.User;
import com.vankeytech.pmp.hms.intf.UserIntf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserIntfTests {

    @Resource
    private UserIntf userIntf;

    @Test
    public void selectAll() {
        System.out.println(userIntf.selectAll());
    }
    @Test
    public void selectByIds() {
        System.out.println(userIntf.selectByIds("1,2"));
    }
    @Test
    public void selectCount() {
        User user = new User();
        System.out.println("count="+userIntf.selectCount(user));
    }
    @Test
    public void selectCountByCondition() {
        Condition condition = new Condition(User.class);
//        System.out.println("count="+userIntf.selectCountByCondition(condition));
    }
    @Test
    public void insertUser() {
        User user = new User();
        user.setUserId(2);
        System.out.println(userIntf.insertUser(user));
    }
    @Test
    public void insertUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(3);
        user1.setUserName("333");
        User user2 = new User();
        user2.setUserId(4);
        user1.setUserName("444");
        users.add(user1);
        users.add(user2);
        System.out.println(userIntf.insertUsers(users));
    }
    @Test
    public void deleteByIds() {
        String ids = "1,2";
        System.out.println(userIntf.deleteByIds(ids));
    }
    @Test
    public void deleteById() {
        Integer id = 1;
        System.out.println(userIntf.deleteByPrimaryKey(id));
    }
    @Test
    public void updateUser() {
        User user = new User();
        user.setUserId(2);
        user.setUserName("xxxxx");
        user.setSex(20L);
        System.out.println(userIntf.updateUser(user));
    }

}
