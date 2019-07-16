package com.lic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lichai
 * @date 11:26 2019/7/16
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "测试jenkins打包服务是否成功";
    }
}
