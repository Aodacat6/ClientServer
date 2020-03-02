package com.mycom.client.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-03-02 下午 02:42
 * @description：
 * @modified By：
 * @version: $
 */
@Component
public class TaskTest {

    //1s执行一次
    //@Scheduled(fixedDelay = 1000)
    public void test(){
        for (int i=0; i<100; i++){
            System.out.println("test: " + i + "  " + Thread.currentThread().getName());
        }

    }
    //@Scheduled(fixedDelay = 1000)
    public void test1(){
        for (int i=0; i<100; i++){
            System.out.println("test1: " + i + "  " + Thread.currentThread().getName());
        }
    }
    //@Scheduled(fixedDelay = 1000)
    public void test2(){
        for (int i=0; i<100; i++){
            System.out.println("test2: " + i + "  " + Thread.currentThread().getName());
        }
    }
}
