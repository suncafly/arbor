package com.arbor.schedule;

import lombok.val;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: lifang
 * @Date: 2018/4/26 15:53
 * @Description:
 */
public class TaskSchedule {


    private  static  ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors() + 1);


    public static void main(String[] args) {
        val delay = 0;
        executorService.schedule(new Demo(), delay, TimeUnit.MILLISECONDS);
    }

}


class Demo implements Runnable{


    public void run() {
        System.out.println("Sun");
    }
}