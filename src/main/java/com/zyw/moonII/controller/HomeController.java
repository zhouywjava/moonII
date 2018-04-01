package com.zyw.moonII.controller;

import com.zyw.moonII.conf.ApplicationConf;
import com.zyw.moonII.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 欢迎控制器
 * @Author: zyw
 * @Date: 2018/3/31
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private Book book;
    @Autowired
    private ApplicationConf applicationConf;

    @PostMapping("/hello")
    public String hello(){
        return applicationConf.getAppName()+" : "+"Hello World," + book.getBookName() + book.getBookAuthor();
    }
}
