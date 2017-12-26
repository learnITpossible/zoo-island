package com.domain.zooisland;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ZooIslandApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZooIslandApplication.class, args);
    }
}
