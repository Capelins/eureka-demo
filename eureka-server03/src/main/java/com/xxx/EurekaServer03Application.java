package com.xxx;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer   //告诉eureka注册中心这个是eureka服务
@SpringBootApplication
public class EurekaServer03Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer03Application.class);
    }
}

