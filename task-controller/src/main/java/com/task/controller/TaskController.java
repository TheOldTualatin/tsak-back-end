package com.task.controller;

import com.task.pojo.Task;
import com.task.service.TaskService;
import com.task.utils.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String save(Task task) throws Exception
    {
        task.setId(IdUtils.getId());
        taskService.save(task);
        return "OK";
    }

}
