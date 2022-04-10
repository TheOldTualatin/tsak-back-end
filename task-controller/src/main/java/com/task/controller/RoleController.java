package com.task.controller;

import com.task.pojo.Role;
import com.task.service.RoleService;
import com.task.utils.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author YangQX   2022/4/10 - 15:59
 */
@Controller
@CrossOrigin
@RequestMapping("/role")
public class RoleController
{
    @Autowired
    RoleService roleService;

    /**
     * 添加角色
     * @param role 添加角色
     * @return 返回状态
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public String save(Role role) throws Exception
    {
        role.setId(IdUtils.getId());
        roleService.save(role);
        return "OK";
    }

    /**
     * 角色用户关联
     * @param userId 用户ID
     * @param roleId 角色ID
     * @return 返回状态
     * @throws Exception
     */
    @RequestMapping("/addRoleToUser")
    @ResponseBody
    public String  addRole2User(@RequestParam("userId") String userId, @RequestParam("roleId")  String roleId) throws Exception
    {
        roleService.addRole2User(userId,roleId);
        return "OK";
    }
}
