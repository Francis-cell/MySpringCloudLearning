package com.learning.springCloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationContextConfig
 * @Description TODO
 * @Author 86185
 * @Date 2021/12/14 11:02
 * @Email zhumengren@sinosoft.com
 * @Version 1.0
 **/
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced // 开启restTemplate的负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
