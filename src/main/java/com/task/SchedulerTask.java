package com.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * ${DESCRIPTION}
 *
 * @author luoyalan
 * @date 2018/5/14
 */
@Component
public class SchedulerTask {

    private int count = 0;

    @Scheduled(cron="*/6 * * * * ?")
    private void process(){
        System.out.println("this is a task: "+(count++));
    }
}
