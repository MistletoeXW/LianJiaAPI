package com.lianjia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lianjia.dao")
public class LianjiaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LianjiaApiApplication.class, args);
    }
}
