package com.vankeytech.pmp.auth;

import com.vankeytech.pmp.auth.entity.User;
import com.vankeytech.pmp.auth.service.UserService;
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
	private UserService userService;
	private List<User> list;
	/**
	 * 单元测试前执行
	 */
	private User users=new User();
	@Before
	public void  before(){
        users.setUserName("王五");
        users.setUserId(1L);


	}

	/**
	 * 单元测试后执行
	 */
	@After
	public void after(){
		for (User user :list){
			System.out.println("------------------------------------");
			System.out.println("账号id:"+user.getUserRegisterAccount()+" 用户密码："+user.getUserPassword()+" 用户姓名:"+user.getUserName()+" 用户电话:"+user.getUserPhone());
		}
	}

	@Test
	public void contextLoads() {
        userService.updateByPrimaryKey(users);
		list=userService.selectAll();

	}
}
