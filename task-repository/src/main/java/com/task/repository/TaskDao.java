package com.task.repository;

import com.task.pojo.Task;

/**
 * @author YangQX   2022/4/10 - 20:24
 */
public interface TaskDao
{
    /**
     * 添加任务
     * @param task
     */
    void save(Task task) throws Exception;
}
