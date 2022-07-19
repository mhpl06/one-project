package com.itbaizhan.trave;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.itbaizhan.trave.mapper")
public class TraveApplication {

    public static void main(String[] args) {
        SpringApplication.run(TraveApplication.class, args);
    }

}
