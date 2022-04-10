package com.task.controller;

import com.google.gson.Gson;
import com.task.pojo.User;
import com.task.service.UserService;
import com.task.utils.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.UUID;

/**
 * @author YangQX   2022/4/10 - 14:26
 */
@Controller
@RequestMapping("/user")
@CrossOrigin
public class UserController
{

    @Autowired
    UserService userService;

    @Autowired
    Gson gson;

    /**
     * 保存用户
     * @param user 用户信息
     * @return 返回状态
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public String save(User user) throws Exception
    {
        user.setId(IdUtils.getId());
        userService.save(user);
        return "OK";
    }

    /**
     * 查询所有用户
     * @return 返回角色列表
     * @throws Exception
     */
    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll() throws Exception
    {
        List<User> users = userService.findAll();
        return gson.toJson(users);
    }
}
