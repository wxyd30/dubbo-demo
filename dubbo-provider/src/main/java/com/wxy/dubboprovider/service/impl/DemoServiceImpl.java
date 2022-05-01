package com.wxy.dubboprovider.service.impl;

import com.wxy.dubboapi.service.IDemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

/**
 * demo service impl
 *
 * @author WangXiangyue
 * @date 2022/3/26 15:12
 */
@Slf4j
@Service(version = "${dubbo.nacos.service.version}")
public class DemoServiceImpl implements IDemoService {
    @Override
    public String saySomething(String name) {
        String str = "Say something I'm giving up on you," + name;
        log.info("服务提供者say:" + str);
        return str;
    }
}
