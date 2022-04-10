package com.task.service;

import com.task.pojo.User;

import java.util.List;

/**
 * @author YangQX   2022/4/10 - 14:39
 */
public interface UserService
{
    void save(User user) throws Exception;

    List<User> findAll() throws Exception;
}
