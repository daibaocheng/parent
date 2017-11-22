package com.vankeytech.pmp.auth;


import com.github.pagehelper.PageInfo;
import com.vankeytech.pmp.auth.entity.Permission;
import com.vankeytech.pmp.auth.entity.Role;
import com.vankeytech.pmp.auth.entity.User;
import com.vankeytech.pmp.auth.entity.UserRole;
import com.vankeytech.pmp.auth.intf.UserIntf;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserIntf userIntf;

    private User requestusers = new User();
    private User resultUser;


    @After
    public void doAfter() {

    }

    @Before
    public void doBefore() {

    }


    @Test
    public void userLoginTest() {
        requestusers.setUserRegisterAccount("wangwu");
        requestusers.setDeletedId(1);
        resultUser = userIntf.login(requestusers);
    }

    @Test
    public void updateUserPassword() {
        requestusers.setUserId(1L);
        requestusers.setUserPassword("xieliang429");
        userIntf.updatePassword(requestusers);
    }

    @Test
    public void deleteUser() {
        requestusers.setUserId(5L);
        requestusers.setDeletedId(1);
        userIntf.deleteByIds(requestusers);
    }

    @Test
    public void updateUserStatus() {
        requestusers.setUserId(5L);
        requestusers.setUserStatus(0);
        userIntf.updateStatus(requestusers);
    }

    @Test
    public void slelectRole() {

        List<Role> roles = userIntf.getUserRole(1);
        List<Integer> integers = new ArrayList<Integer>();
        for (Role role : roles) {
            System.out.println(role.getRoleName());
            integers.add(role.getRoleId().intValue());
        }
        List<Permission> permissions = userIntf.getPermisstion(integers);
        for (Permission p : permissions) {
            System.out.println(p.getPermissionName());
        }
    }


    @Test
    public void registerUser() {


        User addUser = new User();
        addUser.setNickname("liusi");
        addUser.setUserRegisterAccount("liusi");
        addUser.setUserPassword("123456");
        addUser.setCreateAt(new Date());
        addUser.setUserPhone("12345678945");
        addUser.setUserName("liusi");

        userIntf.addUser(addUser);
    }


    @Test
    public void selectPage() {
        PageInfo<User> pageInfo = userIntf.pageUser(0, 10, requestusers);
    }


    @Test
    public void shouquan() {
        UserRole userRole = new UserRole();
        userRole.setUserId(1L);
        userRole.setRoleId(2L);
        userIntf.authorizationUser(userRole);
    }


}
