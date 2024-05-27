package com.example;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class Main {
    public static void main(String[] args) {
        System.out.printf("111");
        SpringApplication.run(Main.class);
    }
}