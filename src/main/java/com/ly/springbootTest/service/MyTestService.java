package com.ly.springbootTest.service;

import com.ly.springbootTest.myinterface.MyService;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：LY
 * @date ：2021/4/15 11:26
 * @description ：MyTestService
 */

@MyService
public class MyTestService {
    @RequestMapping
    public void test(){
        System.out.println("MyTestService");
    }
}
