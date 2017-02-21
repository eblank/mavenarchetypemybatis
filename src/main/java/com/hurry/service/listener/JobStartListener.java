package com.hurry.service.listener;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2016/12/6.
 * 容器初始化监听器
 */
@Service
public class JobStartListener implements ApplicationListener<ContextRefreshedEvent> {
    @Resource
    private JobDetail importLineBillJobMethod;
    @Resource
    private Scheduler springJobSchedulerFactoryBean;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if(event.getApplicationContext().getParent() == null){//root application context初始化完成
            try {
                springJobSchedulerFactoryBean.triggerJob(importLineBillJobMethod.getKey());
            } catch (SchedulerException e) {
                e.printStackTrace();
            }
        }
    }
}
