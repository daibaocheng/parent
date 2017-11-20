package com.vankeytech.pmp.hms.intf.impl;

import com.vankeytech.pmp.hms.entity.User;
import com.vankeytech.pmp.hms.intf.DeleteUserIntf;
import com.vankeytech.pmp.hms.intf.InsertUserIntf;
import com.vankeytech.pmp.hms.intf.SelectUserIntf;
import com.vankeytech.pmp.hms.intf.UpdateUserIntf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserIntfTests {

    @Resource
    private InsertUserIntf insertUserIntf;
    @Resource
    private SelectUserIntf selectUserIntf;
    @Resource
    private DeleteUserIntf deleteUserIntf;
    @Resource
    private UpdateUserIntf updateUserIntf;

    @Test
    public void selectAll() {
        System.out.println(selectUserIntf.selectAll());
    }
    @Test
    public void selectByIds() {
//        String ids = "2L,3L,4L";
        System.out.println(selectUserIntf.selectByIds("2L,3L,4L"));
    }
    @Test
    public void selectCount() {
        User user = new User();
        System.out.println("count="+selectUserIntf.selectCount(user));
    }
    @Test
    public void selectCountByCondition() {
        Condition condition = new Condition() {
            @Override
            public void await() throws InterruptedException {

            }

            @Override
            public void awaitUninterruptibly() {

            }

            @Override
            public long awaitNanos(long nanosTimeout) throws InterruptedException {
                return 0;
            }

            @Override
            public boolean await(long time, TimeUnit unit) throws InterruptedException {
                return false;
            }

            @Override
            public boolean awaitUntil(Date deadline) throws InterruptedException {
                return false;
            }

            @Override
            public void signal() {

            }

            @Override
            public void signalAll() {

            }
        };
        System.out.println("count="+selectUserIntf.selectCountByCondition(condition));
    }
    @Test
    public void insertUser() {
        User user = new User(15L);
        System.out.println(insertUserIntf.insertUser(user));
    }
    @Test
    public void insertUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User(12L);
        User user2 = new User(13L);
        User user3 = new User(14L);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        System.out.println(insertUserIntf.insertUsers(users));
    }
    @Test
    public void deleteByIds() {
        String ids = "3,4";
        System.out.println(deleteUserIntf.deleteByIds(ids));
    }
    @Test
    public void deleteById() {
        Integer id = 003;
        System.out.println(deleteUserIntf.deleteByPrimaryKey(id));
    }
    @Test
    public void updateUser() {
        User user = new User();
        user.setUserId(002L);
        user.setUserName("xxxxx");
        user.setSex(20L);
        System.out.println(updateUserIntf.updateUser(user));
    }

}
