package com.mycom.client.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.concurrent.*;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-03-02 下午 03:17
 * @description：
 * @modified By：
 * @version: $
 */
@Component
public class BusinessTask {

    @Autowired
    private RestTemplate restTemplate;

    //每0.1秒执行一次
    @Scheduled(fixedDelay = 100)
    public void applyCerti(){
        String url = "http://localhost:8082/test";
        String response = restTemplate.getForObject(url, String.class);
        System.out.println(Thread.currentThread().getName() + ": " + response);
    }

    //每0.1秒执行一次
    @Scheduled(fixedDelay = 100)
    public void applyCerti1(){
        String url = "http://localhost:8082/test";
        String response = restTemplate.getForObject(url, String.class);
        System.out.println(Thread.currentThread().getName() + ": " + response);
    }

    //每0.1秒执行一次
    @Scheduled(fixedDelay = 100)
    public void applyCerti2(){
        String url = "http://localhost:8082/test";
        String response = restTemplate.getForObject(url, String.class);
        System.out.println(Thread.currentThread().getName() + ": " + response);
    }

    //每0.1秒执行一次
    @Scheduled(fixedDelay = 100)
    public void applyCerti3(){
        String url = "http://localhost:8082/test";
        String response = restTemplate.getForObject(url, String.class);
        System.out.println(Thread.currentThread().getName() + ": " + response);
    }

    //每0.1秒执行一次
    @Scheduled(fixedDelay = 100)
    public void applyCerti4(){
        String url = "http://localhost:8082/test";
        String response = restTemplate.getForObject(url, String.class);
        System.out.println(Thread.currentThread().getName() + ": " + response);
    }

    //每0.1秒执行一次
    @Scheduled(fixedDelay = 100)
    public void applyCerti5(){
        String url = "http://localhost:8082/test";
        String response = restTemplate.getForObject(url, String.class);
        System.out.println(Thread.currentThread().getName() + ": " + response);
    }

    //每0.1秒执行一次
    @Scheduled(fixedDelay = 100)
    public void applyCerti6(){
        String url = "http://localhost:8082/test";
        String response = restTemplate.getForObject(url, String.class);
        System.out.println(Thread.currentThread().getName() + ": " + response);
    }

    //每0.1秒执行一次
    @Scheduled(fixedDelay = 100)
    public void applyCerti7(){
        String url = "http://localhost:8082/test";
        String response = restTemplate.getForObject(url, String.class);
        System.out.println(Thread.currentThread().getName() + ": " + response);
    }

    //每0.1秒执行一次
    @Scheduled(fixedDelay = 100)
    public void applyCerti8(){
        String url = "http://localhost:8082/test";
        String response = restTemplate.getForObject(url, String.class);
        System.out.println(Thread.currentThread().getName() + ": " + response);
    }

    //每0.1秒执行一次
    @Scheduled(fixedDelay = 100)
    public void applyCerti9(){
        String url = "http://localhost:8082/test";
        String response = restTemplate.getForObject(url, String.class);
        System.out.println(Thread.currentThread().getName() + ": " + response);
    }
}
