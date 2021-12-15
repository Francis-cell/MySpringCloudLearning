package com.learning.springCloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FeignConfig
 * @Description TODO
 * @Author 86185
 * @Date 2021/12/14 15:22
 * @Email zhumengren@sinosoft.com
 * @Version 1.0
 **/
@Configuration
public class FeignConfig {
    /**
     * NONE: 默认的，不显示任何日志
     * BASIC: 仅记录请求方法、URL、响应状态码以及执行时间
     * HEADERS: 除了BASIC中定义的信息之外，还有请求和响应的头信息
     * FULL: 除了HEADERS中定义的信息之外，还有请求和响应的正文以及元数据
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
