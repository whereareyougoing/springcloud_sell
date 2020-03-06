package com.imooc.client.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者 宋艾衡
 * @日期 2020-03-06
 * @时间 02:08
 * @描述
 */

@RestController
@RequestMapping("/demo")
public class Demo {


    @GetMapping("/demo")
    public String demo(){
        return "hello world";
    }


}
