package com.task.repository;

import com.task.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author YangQX   2022/4/10 - 14:41
 */
@Repository
public interface UserDao
{
    /**
     * 添加用户
     * @param user 用户信息
     * @throws Exception
     */
    void save(User user) throws Exception;

    /**
     * 查询所有用户
     * @return 返回用户列表
     * @throws Exception
     */
    List<User> findAll() throws Exception;

    /**
     * 根据用户名和密码查询用户
     * @param username 用户名
     * @param password 密码
     * @return 查询到的数量
     */
    User findUserByUsernameAndPassword(@Param("username") String username,@Param("password") String password);
}
