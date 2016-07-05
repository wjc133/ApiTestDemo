package com.elite.test.boot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wjc133
 * Date: 2016/7/1
 * Time: 18:03
 */
@Controller
@RequestMapping("boot")
public class SampleController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }
}
