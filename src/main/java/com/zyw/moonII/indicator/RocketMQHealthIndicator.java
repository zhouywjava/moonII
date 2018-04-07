package com.zyw.moonII.indicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @Description: RocketMq 检测器
 * @Author: zyw
 * @Date: 2018/4/6
 */
@Component
public class RocketMQHealthIndicator implements HealthIndicator {

    private static final int OK = 0;
    private static final int NG = 1;

    @Override
    public Health health() {
        int res = check();
        if(res != OK){
            return Health.down().withDetail("Error Code",res).build();
        }
        return Health.up().withDetail("health ok",res).build();
    }

    private int check(){
        return OK;
    }
}
