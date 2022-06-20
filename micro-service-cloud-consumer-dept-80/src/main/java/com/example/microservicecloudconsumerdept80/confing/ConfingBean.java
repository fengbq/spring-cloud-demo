package com.example.microservicecloudconsumerdept80.confing;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author fengbq
 * @e-mail 2550577644@qq.com
 * @date 2022/6/18 17:13
 * @package com.example.microservicecloudconsumerdept80.confing
 * @description
 */
@Configuration
public class ConfingBean {
    @Bean //将 RestTemplate 注入到容器中
    @LoadBalanced //在客户端使用 RestTemplate 请求服务端时，开启负载均衡（Ribbon）
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {
        // RandomRule 为随机策略
        return  new RandomRule();
    }
}
