package com.goodlikemax.AllEmployees.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * "Created by : goodlikemax"
 * "Date: "19.04.2022
 */
@Configuration
public class PasswordConfig {
    @Bean
    public PasswordEncoder password(){
        return new BCryptPasswordEncoder(10);
    }
}
