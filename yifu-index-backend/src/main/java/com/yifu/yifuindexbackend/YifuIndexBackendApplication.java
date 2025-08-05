package com.yifu.yifuindexbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan("com.yifu.yifuindexbackend.mapper")
@Configuration

public class YifuIndexBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(YifuIndexBackendApplication.class, args);
    }

}
