package com.qf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qf.videos.mapper")
public class VideoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoWebApplication.class, args);
    }

}
