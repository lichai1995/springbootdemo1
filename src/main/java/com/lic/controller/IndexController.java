package com.lic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author lichai
 * @date 11:26 2019/7/16
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        System.out.println("测试1111");
        return "测试jenkins打包服务是否成功" + new Date();
    }
}
