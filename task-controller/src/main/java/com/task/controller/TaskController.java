package com.task.controller;

import com.task.pojo.Task;
import com.task.service.TaskService;
import com.task.utils.IdUtils;
import com.task.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
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
@Transactional
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

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll() throws Exception
    {
        List<Task> tasks = taskService.findAll();
        return JsonUtils.getGson().toJson(tasks);
    }

    @RequestMapping(value = "/findByUserId",produces = {"text/html;charset=UTF-8;", "application/json;"})
    @ResponseBody
    public String findByUserId(@RequestParam("userId") String userId) throws Exception
    {
        List<Task> tasks = taskService.findByUserId(userId);
        String s = JsonUtils.getGson().toJson(tasks);
        System.out.println(s);
        return s;
    }

}
