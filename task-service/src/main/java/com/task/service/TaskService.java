package com.task.service;

import com.task.pojo.Task;

import java.util.List;

/**
 * @author YangQX   2022/4/10 - 20:23
 */
public interface TaskService
{
    void save(Task task,String[] requestUserId) throws Exception;

    List<Task> findAll() throws Exception;

    List<Task> findByUserId(String userId) throws Exception;

    List<Task> findStateByUserId(Long taskState,String userId) throws Exception;

    List<Task> findReceiveTask(String userId) throws Exception;
}
