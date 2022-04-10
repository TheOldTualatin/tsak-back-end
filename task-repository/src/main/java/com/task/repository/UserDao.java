package com.task.repository;

import com.task.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author YangQX   2022/4/10 - 14:41
 */
@Repository
public interface UserDao
{
    void save(User user) throws Exception;

    List<User> findAll() throws Exception;
}
