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

    void addRole2User(@Param("userId") String userId,@Param("roleId") String roleId);

    void save(Role role);
}
