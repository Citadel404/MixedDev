package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: 973969022@qq.com
 * Date: 2024/5/20 11:17
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public void test()
    {
        System.out.println("test is successful");
    }
}
