package com.task.service;

import com.task.pojo.Role;

/**
 * @author YangQX   2022/4/10 - 16:06
 */
public interface RoleService
{
    void addRole2User(String userId,String roleId) throws Exception;

    void save(Role role) throws Exception;
}
