package com.task.service.impl;

import com.task.pojo.Task;
import com.task.repository.TaskDao;
import com.task.service.TaskService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author YangQX   2022/4/10 - 20:23
 */
@Service
public class TaskServiceImpl implements TaskService
{
    @Autowired
    TaskDao taskDao;

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void save(Task task, String[] requestUserId) throws Exception
    {
        taskDao.save(task);
        taskDao.addReceiveUserById(task.getId(), requestUserId);
    }

    @Override
    public List<Task> findAll() throws Exception
    {
        return taskDao.findAll();
    }

    @Override
    public List<Task> findByUserId(String userId) throws Exception
    {
        return taskDao.findByUserId(userId);
    }

    @Override
    public List<Task> findStateByUserId(Long taskState, String userId) throws Exception
    {
        return taskDao.findStateByUserId(taskState, userId);
    }

    @Override
    public List<Task> findReceiveTask(String userId) throws Exception
    {
        return taskDao.findReceiveTask(userId);
    }
}
