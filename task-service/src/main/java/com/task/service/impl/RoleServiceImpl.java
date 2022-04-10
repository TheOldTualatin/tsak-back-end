package com.task.service.impl;

import com.task.pojo.Role;
import com.task.repository.RoleDao;
import com.task.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author YangQX   2022/4/10 - 16:06
 */
@Service
public class RoleServiceImpl implements RoleService
{
    @Autowired
    RoleDao roleDao;
    @Override
    public void addRole2User(String userId,String roleId)
    {
        roleDao.addRole2User(userId,roleId);
    }

    @Override
    public void save(Role role) throws Exception
    {
        roleDao.save(role);
    }
}
