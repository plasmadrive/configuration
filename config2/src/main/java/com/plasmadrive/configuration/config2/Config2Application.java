package com.plasmadrive.configuration.config2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Config2Application {

    private static final Logger logger = LoggerFactory.getLogger(Config2Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Config2Application.class, args);
    }

}
