package com.stylefeng.roses.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 消息恢复子系统
 *
 * @author stylefeng
 * @Date 2018/1/22 21:27
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "com.stylefeng.roses.account.modular.consumer")
@EnableDiscoveryClient
public class RosesAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(RosesAccountApplication.class, args);
    }
}
