package com.task.service.impl;

import com.task.pojo.User;
import com.task.repository.UserDao;
import com.task.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YangQX   2022/4/10 - 14:41
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) throws Exception
    {
        userDao.save(user);
    }

    @Override
    public List<User> findAll() throws Exception
    {
        return  userDao.findAll();
    }
}
