package com.guying;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Starter
 *
 * @author Frank Zhang
 */
@SpringBootApplication(scanBasePackages = {"com.guying","com.alibaba.cola"})
@MapperScan("com.guying.repository")
public class PracticeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeServerApplication.class, args);
    }
}
