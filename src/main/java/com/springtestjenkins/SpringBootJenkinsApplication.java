package com.springtestjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJenkinsApplication.class, args);

        System.out.println("Jenkins Test! Success");
    }
}