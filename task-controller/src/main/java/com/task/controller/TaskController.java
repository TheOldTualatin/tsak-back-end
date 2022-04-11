package com.task.controller;

import com.task.pojo.Task;
import com.task.service.TaskService;
import com.task.utils.IdUtils;
import com.task.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author YangQX   2022/4/10 - 20:21
 */
@CrossOrigin
@Controller
@RequestMapping("/task")
public class TaskController
{
    @Autowired
    TaskService taskService;

    @RequestMapping("/save")
    @ResponseBody
    public String save(Task task,@RequestParam("requestUserId") String[] requestUserId) throws Exception
    {
        task.setId(IdUtils.getId());
        taskService.save(task,requestUserId);
        return "OK";
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll() throws Exception
    {
        List<Task> tasks = taskService.findAll();
        return JsonUtils.getGson().toJson(tasks);
    }

    /**
     * 根据用户ID查询我发布的任务
     * @param userId 用户ID
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/findByUserId",produces = {"text/html;charset=UTF-8;", "application/json;"})
    @ResponseBody
    public String findByUserId(@RequestParam("userId") String userId) throws Exception
    {
        List<Task> tasks = taskService.findByUserId(userId);
        return JsonUtils.getGson().toJson(tasks);
    }

    /**
     * 更具状态查询任务
     */
    @RequestMapping(value = "/findStateByUserId",produces = {"text/html;charset=UTF-8;", "application/json;"})
    @ResponseBody
    public String findStateByUserId(@RequestParam("taskState") Long taskState,@RequestParam("userId") String userId) throws Exception
    {
        List<Task> tasks = taskService.findStateByUserId(taskState,userId);
        return JsonUtils.getGson().toJson(tasks);
    }

}
