package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication app=new SpringApplication();
        app.addListeners(new AppNameListener());
        app.run(DemoApplication.class, args);
    }

}
