package com.learning.springCloud;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;

@SpringBootTest
class CloudGatewayGateway9527ApplicationTests {

    @Test
    void contextLoads() {
    }

    /***
     * @Author zhumengren
     * @Description 获取指定时区的时间
     * @Date 10:32 2021/12/21
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
        // 2021-12-21T10:33:19.958+08:00[Asia/Shanghai]

        // 获取指定时区的当前时间
        //ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York"));
        //System.out.println(zny);
        // 2021-12-20T21:34:31.606-05:00[America/New_York]
    }
}
