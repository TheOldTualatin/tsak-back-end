package com.task.service.impl;

import com.task.pojo.Task;
import com.task.repository.TaskDao;
import com.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void save(Task task) throws Exception
    {
        taskDao.save(task);
    }

    @Override
    public List<Task> findAll() throws Exception
    {
        return taskDao.findAll();
    }
}
