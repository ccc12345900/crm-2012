package com.example.jsoup1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//使用定时任务，需要先开启定时任务，需要添加注解
@EnableScheduling
public class Jsoup1Application {

    public static void main(String[] args) {
        SpringApplication.run(Jsoup1Application.class, args);
    }

}
