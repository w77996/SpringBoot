package com.w77996.springbootquertz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringbootQuertzApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootQuertzApplication.class, args);
    }
}
