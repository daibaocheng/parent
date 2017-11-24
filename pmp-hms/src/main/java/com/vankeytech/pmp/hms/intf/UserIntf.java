package com.vankeytech.pmp.hms.intf;

import com.github.pagehelper.PageInfo;
import com.vankeytech.pmp.hms.condition.UserCondition;
import com.vankeytech.pmp.hms.entity.User;

import java.util.List;


public interface UserIntf {

    /**
     * 查询所有用户
     * @return
     */
    List<User> selectAllUsers() ;

    /**
     * 查询所有用户 分页处理
     * @return
     */
    PageInfo<User> selectAllByPage(Integer currentPage, Integer pageSize) ;

    /**
     * 通过条件查询用户（楼栋号、单元号、房间号、住户类型、认证状态、采集状态、手机号、身份证号、用户名）
     * 并做了分页处理
     * @param userCondition
     * @return
     */
    PageInfo<User> selectByCondition(UserCondition userCondition,Integer currentPage, Integer pageSize) ;

    /**
     * 通过id查询用户
     * @param ids
     * @return
     */
    List<User> selectByIds(Integer[] ids);

    /**
     * 查询所有用户人数
     * @param user
     * @return
     */
    Integer selectCount(User user);

    /**
     * 通过条件查询用户人数
     * @param userCondition
     */
    Integer selectCountByCondition(UserCondition userCondition) ;

    /**
     * 增加单个用户
     * @param user
     */
    void insertUser(User user) ;

    /**
     * 增加多个用户(display 默认为1)
     * @param users
     */
    void insertUsers(List<User> users) ;

    /**
     * 修改单个用户
     * @param user
     */
    void updateUser(User user) ;

    /**
     * 通过主键删除单个用户
     * @param id
     */
    void deleteByPrimaryKey(Integer id) ;

    /**
     * 通过主键删除多个用户
     * @param ids
     */
    void deleteByIds(Integer[] ids) ;
}
