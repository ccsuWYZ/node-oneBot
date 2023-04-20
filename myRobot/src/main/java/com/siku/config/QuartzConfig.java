package com.siku.config;//package com.example.qqrobt.config;
//
import com.siku.jobs.sendCourseMessageJob;
import com.siku.jobs.UpdateQqNumber;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * 定义任务描述和具体的执行时间
 */
@Configuration
public class QuartzConfig {


    /**
     *
     * 两个定时任务：每天更新数据库的好友列表，每天晚上发送第二天的课表
     *
     */



    // 配置定时任务1
    @Bean(name = "firstJobDetail")
    public MethodInvokingJobDetailFactoryBean firstJobDetail(sendCourseMessageJob sendCourseMessageJob) {
        MethodInvokingJobDetailFactoryBean jobDetail = new MethodInvokingJobDetailFactoryBean();
        // 是否并发执行
        jobDetail.setConcurrent(false);
        // 为需要执行的实体类对应的对象
        jobDetail.setTargetObject(sendCourseMessageJob);
        // 需要执行的方法
        jobDetail.setTargetMethod("task");
        return jobDetail;
    }


    // 配置触发器1
    @Bean(name = "firstTrigger")
    public CronTriggerFactoryBean firstTrigger(JobDetail firstJobDetail) {
        CronTriggerFactoryBean trigger = new CronTriggerFactoryBean();
        trigger.setJobDetail(firstJobDetail);
        // cron表达式
        trigger.setCronExpression("0 30 19 * * ?");
        return trigger;
    }







    // 配置定时任务2
    @Bean(name = "secondJobDetail")
    public MethodInvokingJobDetailFactoryBean secondJobDetail(UpdateQqNumber updateQqNumber) {
        MethodInvokingJobDetailFactoryBean jobDetail = new MethodInvokingJobDetailFactoryBean();
        // 是否并发执行
        jobDetail.setConcurrent(false);
        // 为需要执行的实体类对应的对象
        jobDetail.setTargetObject(updateQqNumber);
        // 需要执行的方法
        jobDetail.setTargetMethod("task");
        return jobDetail;
    }

    // 配置触发器2
    @Bean(name = "secondTrigger")
    public CronTriggerFactoryBean secondTrigger(JobDetail secondJobDetail) {
        CronTriggerFactoryBean trigger = new CronTriggerFactoryBean();
        trigger.setJobDetail(secondJobDetail);
        // cron表达式
        trigger.setCronExpression("0 31 16 * * ?");
        return trigger;
    }

    // 配置Scheduler
    @Bean(name = "scheduler")
    public SchedulerFactoryBean schedulerFactory(Trigger firstTrigger, Trigger secondTrigger) {
        SchedulerFactoryBean bean = new SchedulerFactoryBean();
        // 延时启动，应用启动1秒后
        bean.setStartupDelay(1);
        // 注册触发器
        bean.setTriggers(firstTrigger,secondTrigger);
        return bean;
    }
}



