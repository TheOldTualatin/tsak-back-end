package com.task.repository;

import com.task.pojo.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author YangQX   2022/4/10 - 16:10
 */
@Repository
public interface RoleDao
{

    /**
     * 对用户添加角色
     * @param userId 用户ID
     * @param roleId 角色ID
     */
    void addRole2User(@Param("userId") String userId,@Param("roleId") String roleId);

    /**
     * 添加角色
     * @param role 角色信息
     */
    void save(Role role);
}
