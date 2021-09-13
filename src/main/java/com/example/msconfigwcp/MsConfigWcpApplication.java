package com.example.msconfigwcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MsConfigWcpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsConfigWcpApplication.class, args);
    }

}
