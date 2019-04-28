package com.pk.jenkins_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengkun
 * @date 2019/4/26 0026 14:37
 * @description 测试jenkins
 */
@RestController
public class TestController {


    @GetMapping("/test")
    public String test(){
        System.out.println("合并");
        return "这是一个测试jenkins自动部署的测试demo777";
    }
}
