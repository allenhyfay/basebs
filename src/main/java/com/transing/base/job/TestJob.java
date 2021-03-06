/*
 * @project: basebs
 * @package: com.transing.base.job
 * @title:   TestJob.java 
 *
 * Copyright (c) 2017 jeeframework Limited, Inc.
 * All rights reserved.
 */
package com.transing.base.job;

import com.jeeframework.jeetask.task.Job;
import com.jeeframework.jeetask.task.context.JobContext;
import com.jeeframework.logicframework.util.logging.LoggerUtil;

/**
 * 测试用的作业执行类
 *
 * @author lance
 * @version 1.0 2017-08-30 17:35
 */
public class TestJob implements Job {

    @Override
    public void doJob(JobContext jobContext) {
        int i = 0;
        while (true) {
            LoggerUtil.debugTrace("testJob", "dojob  =   " + i);

            i = i + 1;
            if (i > 5) {
                break;
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
