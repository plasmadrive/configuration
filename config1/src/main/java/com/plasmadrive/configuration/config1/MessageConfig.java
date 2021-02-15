package com.plasmadrive.configuration.config1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {

    @Bean
    public MyBean myBean() {
        return new MyBean("Hello");
    }
}
