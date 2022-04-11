package com.task.repository;

import com.task.pojo.Task;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author YangQX   2022/4/10 - 20:24
 */
public interface TaskDao
{
    /**
     * 添加任务
     * @param task 任务对象
     */
    void save(Task task) throws Exception;

    List<Task> findAll() throws Exception;

    List<Task> findByUserId(String userId) throws Exception;

    List<Task> findStateByUserId(@Param("taskState") Long taskState,@Param("userId") String userId);

    void addReceiveUserById(@Param("taskId") String taskId,@Param("requestUserId") String[] requestUserId) throws Exception;
}
