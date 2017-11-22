package com.vankeytech.pmp.hms.intf;

import com.vankeytech.pmp.hms.condition.SelectCondition;
import com.vankeytech.pmp.hms.entity.User;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;


public interface UserIntf {

    /**
     * 查询所有用户
     * @return
     */
    List<User> selectAllUsers() ;

    /**
     * 通过条件查询用户（用户id、用户名、手机号）
     * @param selectCondition
     * @return
     */
    List<User> selectByCondition(SelectCondition selectCondition) ;

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
     * @param selectCondition
     */
    Integer selectCountByCondition(SelectCondition selectCondition) ;

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
