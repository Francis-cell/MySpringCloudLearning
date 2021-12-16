package com.learning.springCloud.controller;

import com.learning.springCloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName PaymentHystrixController
 * @Description TODO
 * @Author 86185
 * @Date 2021/12/15 10:21
 * @Email zhumengren@sinosoft.com
 * @Version 1.0
 **/
@RestController
@RequestMapping("/consumer/payment/hystrix")
@Slf4j
/** 配置默认的兜底方法（目的：避免代码膨胀） */
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfo_OK(id);
        return result;
    }

    // @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod",commandProperties = {
    //         @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")  //3秒钟以内就是正常的业务逻辑
    // })
    /** 此处使用一个单独的@HystrixCommand注解，意味着没有配置它的专属兜底方法，故而一旦出错或者超时将调用默认的兜底方法 */
    @HystrixCommand
    @GetMapping("/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        // 自己制造一个异常，使得方法直接跳转到兜底方法里去
        int a = 10/0;
        String result = paymentHystrixService.paymentInfo_TimeOut(id);
        return result;
    }

    /** 兜底方法 */
    public String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id){
        return "我是消费者80，对付支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,(┬＿┬)";
    }

    /** global fallback方法 */
    public String payment_Global_FallbackMethod(){
        return "Global异常处理信息，请稍后再试,(┬＿┬)";
    }


}
