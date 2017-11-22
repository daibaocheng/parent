package com.vankeytech.pmp.hms.intf;

import com.vankeytech.pmp.hms.entity.User;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;


public interface UserIntf {

    /**
     * 查询所有用户
     * @return
     */
    List<User> selectAll() ;

    /**
     * 通过条件查询用户（用户id、用户名、手机号）
     * @param condition
     * @return
     */
    List<User> selectByCondition(Condition condition) ;

    /**
     * 通过id查询用户
     * @param ids
     * @return
     */
    List<User> selectByIds(String ids);

    /**
     * 查询所有用户人数
     * @param user
     * @return
     */
    Integer selectCount(User user);

    /**
     * 通过条件查询用户人数
     * @param condition
     * @return
     */
    Integer selectCountByCondition(Condition condition) ;

    /**
     * 增加单个用户
     * @param user
     * @return
     */
    Integer insertUser(User user) ;

    /**
     * 增加多个用户
     * @param users
     * @return
     */
    Integer insertUsers(List<User> users) ;

    /**
     * 修改单个用户
     * @param user
     * @return
     */
    Integer updateUser(User user) ;

    /**
     * 通过主键删除单个用户
     * @param id
     * @return
     */
    Integer deleteByPrimaryKey(Integer id) ;

    /**
     * 通过主键删除多个用户
     * @param ids
     * @return
     */
    Integer deleteByIds(String ids) ;
}
