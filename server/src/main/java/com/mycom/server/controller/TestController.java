package com.mycom.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-03-02 下午 12:04
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "server: hello world";
    }

    @GetMapping("/gettest/{str}")
    public String getHttp(@PathVariable String str){
        return "response:" + str;
    }
}
