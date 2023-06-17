package com.example.eatmeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class EatmeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EatmeServerApplication.class, args);
    }

}
