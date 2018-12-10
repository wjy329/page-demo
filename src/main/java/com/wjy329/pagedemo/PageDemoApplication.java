package com.wjy329.pagedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.wjy329.pagedemo.dao"})
public class PageDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PageDemoApplication.class, args);
    }
}
