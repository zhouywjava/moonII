package com.zyw.moonII.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: 消费者控制器
 * @Author: zyw
 * @Date: 2018/4/7
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/ribbon-consumer")
    public String helloConsumer(){
        return restTemplate.getForEntity("http://SUN/home/hello",String.class).getBody();
    }
}
