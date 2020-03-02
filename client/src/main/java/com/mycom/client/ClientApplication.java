package com.mycom.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-03-02 上午 11:46
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableScheduling
//@MapperSacn
public class ClientApplication {

    public static void main(String[] args){
        SpringApplication.run(ClientApplication.class, args);
    }

    /**
     * scheduled定时任务默认是串行执行的
     * 这里提供一个ScheduledThreadPoolExecutor的bean，可以实现多任务并行
     * @return
     */
    @Bean
    public ScheduledThreadPoolExecutor scheduledThreadPoolExecutor(){
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(20);
        return scheduledThreadPoolExecutor;
    }
}
