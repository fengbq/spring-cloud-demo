package com.example.microservicecloudconsumerdeptfeign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengbq
 * @e-mail 2550577644@qq.com
 * @date 2022/6/18 19:09
 * @package com.example.microservicecloudconsumerdeptfeign.config
 * @description
 */
@RestController
public class ConfigBean {
    /**
     * OpenFeign 日志增强
     * 配置 OpenFeign 记录哪些内容
     */
    @Bean
    Logger.Level feginLoggerLevel() {
        return Logger.Level.FULL;
    }
}
