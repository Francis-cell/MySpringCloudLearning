package com.learning.springCloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationContextConfig
 * @Description TODO
 * @Author zhumengren
 * @Date 2021/12/9 11:07
 * @Email zhumengren@sinosoft.com.cn
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
