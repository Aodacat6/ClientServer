package com.mycom.clientserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-03-02 上午 11:49
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
//@RequestMapping("/test")
public class TestController {

    @GetMapping("test")
    public String test(){
        return "hello world";
    }
}
