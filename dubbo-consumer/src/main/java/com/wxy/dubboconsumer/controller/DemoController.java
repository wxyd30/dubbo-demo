package com.wxy.dubboconsumer.controller;

import com.wxy.dubboapi.service.IDemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo controller
 *
 * @author WangXiangyue
 * @date 2022/3/26 15:28
 */
@RestController
@RequestMapping(value = "demo")
public class DemoController {
    
    @Reference(version = "${dubbo.nacos.service.version}")
    private IDemoService demoService;
    
    @GetMapping(value = "saySomething")
    public ResponseEntity<String> saySomething(@RequestParam String name) {
        return ResponseEntity.ok(demoService.saySomething(name));
    }
}
