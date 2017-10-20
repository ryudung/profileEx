package com.example.config;

import com.example.domain.Animal;
import com.example.domain.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class AnimalDevConfig {
    @Bean
    Animal cofnig(){
        return new Bird();
    }
}
