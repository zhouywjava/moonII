package com.zyw.moonII.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 应用配置类
 * @Author: zyw
 * @Date: 2018/3/31
 */
@Configuration
public class ApplicationConf {

    @Value("${spring.application.name}")
    private String appName;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
