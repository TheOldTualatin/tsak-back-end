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

    /**
     * 查询所有任务
     * @return 任务列表
     * @throws Exception
     */
    List<Task> findAll() throws Exception;

    /**
     * 根据用户Id查询自己发表的所有任务
     * @param userId 用户ID
     * @return 任务列表
     * @throws Exception
     */
    List<Task> findByUserId(String userId) throws Exception;

    /**
     * 根据状态和userId查询自己发表的任务
     * @param taskState 任务状态
     * @param userId 用户Id
     * @return 任务列表
     */
    List<Task> findStateByUserId(@Param("taskState") Long taskState,@Param("userId") String userId) throws Exception;

    /**
     * 对用户添加任务
     * @param taskId 任务Id
     * @param requestUserId 目标用户
     * @throws Exception
     */
    void addReceiveUserById(@Param("taskId") String taskId,@Param("requestUserId") String[] requestUserId) throws Exception;

    List<Task> findReceiveTask(String userId) throws Exception;
}
