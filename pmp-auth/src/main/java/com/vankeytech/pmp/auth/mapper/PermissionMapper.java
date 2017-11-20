package com.vankeytech.pmp.auth.mapper;

import com.vankeytech.baseservice.mapper.BasicMapper;
import com.vankeytech.pmp.auth.entity.Permission;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xieliang
 */
@Repository
public interface PermissionMapper extends BasicMapper<Permission> {

    /**
     * 根据角色的id查询权限
     * @param ids
     * @return
     */
    List<Permission> getPermisstionByRoleIds(@Param("ids") List<Integer> ids);
}