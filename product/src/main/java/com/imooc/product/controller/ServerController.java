package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者 宋寒冬
 * @日期 2020-03-15
 * @时间 15:00
 * @描述
 */

@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg(){
        return "product msg";
    }


}
