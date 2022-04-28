package com.wxy.dubboprovider.service.impl;

import com.wxy.dubboapi.service.IDemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * demo service impl
 *
 * @author WangXiangyue
 * @date 2022/3/26 15:12
 */
@Service(version = "${dubbo.nacos.service.version}")
public class IDemoServiceImpl implements IDemoService {
    @Override
    public String saySomething(String name) {
        return "Say something I'm giving up on you," + name;
    }
}
