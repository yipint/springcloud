package com.product.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan("com.example.dao")
public class AppConfig {

    @PostConstruct
    public void test() {
        System.out.printf("app config");
    }
}
