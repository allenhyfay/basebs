/**
 * @project: basebs
 * @Title: JeeTaskController.java
 * @Package: com.transing.base.web.controller
 * <p>
 * Copyright (c) 2014-2017 Jeeframework Limited, Inc. All rights reserved.
 */
package com.transing.base.web.controller;

import com.jeeframework.jeetask.startup.JeeTaskClient;
import com.jeeframework.jeetask.task.Task;
import com.mangofactory.swagger.annotations.ApiIgnore;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller("jeeTaskController")
@Api(value = "任务调度管理类", position = 3)
public class JeeTaskController {
    @Resource
    private JeeTaskClient jeeTaskClient;


    @RequestMapping(value = "/submitTask.json", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    @ApiOperation(value = "提交任务接口", position = 0)
    public void submitTask(@RequestParam(value = "taskName", required = false) @ApiParam(value = "任务名")
                                   String taskName, @RequestParam(value = "taskParam", required = false)
                           @ApiParam(value = "任务参数") String taskParam, HttpServletRequest req,
                           HttpServletResponse res) {
        Task task = new Task();
        task.setName(taskName);
        task.setParam(taskParam);
        task.setJobClass("com.transing.base.job.TestJob");


        jeeTaskClient.submitTask(task);


    }


}
