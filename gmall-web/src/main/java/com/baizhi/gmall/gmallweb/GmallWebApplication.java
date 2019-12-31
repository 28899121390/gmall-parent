package com.baizhi.gmall.gmallweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GmallWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallWebApplication.class, args);
    }

}
