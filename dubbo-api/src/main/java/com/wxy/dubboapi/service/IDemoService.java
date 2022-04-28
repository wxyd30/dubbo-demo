package com.wxy.dubboapi.service;

/**
 * demo service
 *
 * @author WangXiangyue
 * @date 2022/3/26 14:57
 */
public interface IDemoService {
    /**
     * say something ${name}
     * @param name 输入参数
     * @return something that gonna to say
     */
    String saySomething(String name);
}
