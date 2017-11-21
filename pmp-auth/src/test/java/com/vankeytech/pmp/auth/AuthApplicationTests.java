package com.vankeytech.pmp.auth;


import com.github.pagehelper.PageInfo;
import com.vankeytech.pmp.auth.entity.*;
import com.vankeytech.pmp.auth.intf.OrganizationIntf;
import com.vankeytech.pmp.auth.intf.OvertimeIntf;
import com.vankeytech.pmp.auth.intf.UserIntf;

import com.vankeytech.pmp.auth.mapper.OrganizationMapper;
import com.vankeytech.pmp.auth.service.OrganizationService;
import com.vankeytech.pmp.auth.service.UserService;
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
public class AuthApplicationTests {

	@Autowired
	private UserIntf userIntf;

	@Autowired
	private OvertimeIntf overtimeIntf;

	@Autowired
	private OrganizationIntf organizationIntf;

	private List<User> userList;
	private List<Role> roleList;
	private List<Permission> permissionList;
	private User requestusers=new User();
	private User resultUser;

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
	public void loginTest() {
		requestusers.setUserRegisterAccount("wangwu");
		requestusers.setDeletedId(1);
		resultUser=userIntf.login(requestusers);

	}

	@Test
	public void updatePassword(){
	    requestusers.setUserId(1L);
	    requestusers.setUserPassword("xieliang429");
        userIntf.updatePassword(requestusers);
    }

    @Test
    public void deleteUser(){
        requestusers.setUserId(5L);
        requestusers.setDeletedId(1);
        userIntf.deleteByIds(requestusers);
    }

    @Test
    public void updateStatus(){
        requestusers.setUserId(5L);
        requestusers.setUserStatus(0);
        userIntf.updateStatus(requestusers);
    }

    @Test
    public void slelectRole(){

       List<Role> roles= userIntf.getUserRole(1);
        List<Integer> integers=new ArrayList<Integer>();
       for (Role role : roles){
           System.out.println(role.getRoleName());
            integers.add(role.getRoleId().intValue());
       }
     List<Permission> permissions=  userIntf.getPermisstion(integers);
        for (Permission p :permissions ){
            System.out.println(p.getPermissionName());
        }
    }
    @Test
    public void selectBycondition(){
        requestusers.setUserRegisterAccount("wangwu");
        requestusers.setNickname("wangwu");
        userList= userIntf.selecteByNames(requestusers);
        for (User user :userList){
            System.out.println();
            System.out.println("-----------------------------------------------");
            System.out.println(userList.size());
            System.out.println(user.getUserName());
        }
    }

    @Autowired
    private UserService userService;

    @Test
    public void registerUser(){
        List<User> lists=new ArrayList<User>();
        for (int i = 0;i < 50; i++){
            User addUser = new User();
            addUser.setNickname("liusi"+i);
            addUser.setUserRegisterAccount("liusi"+i);
            addUser.setUserPassword("123456");
            addUser.setCreateAt(new Date());
            addUser.setUserPhone("12345678945");
            addUser.setUserName("liusi"+i);
            lists.add(addUser);
        }
        userService.insertList(lists);
    }


    @Test
    public void selectPage(){
        PageInfo<User> pageInfo= userIntf.pageUser(0,10,requestusers);
    }


    @Test
    public void shouquan(){
        UserRole userRole = new UserRole();
        userRole.setUserId(1L);
        userRole.setRoleId(2L);
        userIntf.authorizationUser(userRole);
    }

    @Test
    public  void fen(){
        userIntf.selectByCondition(requestusers);
    }


    //------------------------------------------值班表接口测试

    @Test
    public void addOvertime(){
        Overtime overtime = new Overtime();
        overtime.setEndTime(new Date());
        overtime.setStartTime(new Date());
        overtime.setOvertimePersonnel("zhangshan");
        overtimeIntf.insert(overtime);
    }

    @Test
    public void updateOvertime(){
        Overtime overtime = new Overtime();
        overtime.setOvertimeId(1L);
        overtime.setEndTime(new Date());
        overtime.setStartTime(new Date());
        overtime.setOvertimePersonnel("wangwu");
        overtimeIntf.updateOvertime(overtime);
    }

    @Test
    public void deleteOvertime(){
        Overtime overtime = new Overtime();
        overtime.setOvertimeId(1L);
        overtimeIntf.delectOvertime(overtime);
    }

    @Test
    public void getOvertimes(){

      List<Overtime> list= overtimeIntf.getOvertimeAll();
        for (Overtime overtime : list){
            System.out.println(overtime.getOvertimePersonnel());
        }
    }

/*------------------------------------部门表接口测试-----------------------------*/

    @Test
    public void insertOrgan(){
        Organization organization=new Organization();
        organization.setPid(0L);
        organization.setOrganizationType("独立组织");
        organization.setOrganizationPhone("12345678");
        organization.setOrganizationName("钥匙");
        organization.setOrganizationLocation("成都市武侯区");
        organization.setOrganizationAddress("杨开大道");
        organization.setOrganizationDescribe("fdfdsfds");
        organization.setCreatedAt(new Date());
        organization.setPid(5L);
        organizationIntf.insert(organization);


    }

    @Test
    public void updateOrg(){
        Organization organization = new Organization();
        organization.setPid(0L);
        organization.setOrganizationId(3L);
        organization.setUpdatedAt(new Date());
        organization.setOrganizationName("商务");
        organization.setCreatedAt(new Date());
        organizationIntf.updateName(organization);
    }

    @Autowired
    private OrganizationMapper organizationMapper;
    @Test
    public void getAll(){
       List<Organization> list= organizationMapper.getAll();

        if(list != null){
       for (Organization o:list ) {
           System.out.println(o.getOrganizationName());
           if (o.getOrganizationList() != null) {
               for (Organization qw : list) {
                   System.out.println(qw.getOrganizationName());
                   if (qw.getOrganizationList() != null) {
                       for (Organization qg : list) {
                           System.out.println(qg.getOrganizationName());
                       }
                   }
               }
           }
       }
       }

    }




}
