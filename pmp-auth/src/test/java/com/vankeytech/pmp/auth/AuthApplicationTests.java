package com.vankeytech.pmp.auth;


import com.vankeytech.pmp.auth.entity.Permission;
import com.vankeytech.pmp.auth.entity.Role;
import com.vankeytech.pmp.auth.entity.User;
import com.vankeytech.pmp.auth.intf.UserIntf;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthApplicationTests {

	@Autowired
	private UserIntf userIntf;

	private List<User> userList;
	private List<Role> roleList;
	private List<Permission> permissionList;
	private User users=new User();

	/**
	 * 单元测试前执行
	 */
	@Before
	public void  before(){

	}

	/**
	 * 单元测试后执行
	 */
	@After
	public void after(){

	}

	@Test
	public void contextLoads() {
		users.setUserId(1L);
		users.setUserStatus(0);
		userIntf.updateStatus(users);
	}
}
