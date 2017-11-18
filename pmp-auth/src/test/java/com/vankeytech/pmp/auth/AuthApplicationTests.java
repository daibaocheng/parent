package com.vankeytech.pmp.auth;

import com.vankeytech.pmp.auth.entity.Organization;
import com.vankeytech.pmp.auth.entity.User;
import com.vankeytech.pmp.auth.intf.UserIntf;
import com.vankeytech.pmp.auth.service.OrganizationService;
import com.vankeytech.pmp.auth.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthApplicationTests {

	@Autowired
	private UserIntf userIntf;

	@Autowired
	private OrganizationService organizationService;



	private List<User> list;
	/**
	 * 单元测试前执行
	 */
	private User users=new User();
	private Organization organization=new Organization();
	@Before
	public void  before(){
		users.setUserId(1L);
		users.setAreaId(0l);
	}

	/**
	 * 单元测试后执行
	 */
	@After
	public void after(){
		System.out.println("更新成功！！");
		if(list == null){
			System.out.printf("没有查询到");
		}else{
			for (User user : list){
				System.out.println(user.getUserName());
			}
		}

	}

	@Test
	public void contextLoads() {
    	//userIntf.updateAeaId(users);
		users.setUserRegisterAccount("wangwu");
		users.setNickname("wangwu");
		userIntf.selecteByName(users);
		//int result=organizationService.updateByPrimaryKeySelective(organization);


	}
}
