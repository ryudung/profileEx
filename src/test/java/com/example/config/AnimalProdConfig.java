package com.example.config;

import com.example.domain.Animal;
import com.example.domain.Lion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class AnimalProdConfig {
    @Bean
    Animal config(){
        return new Lion();
    }
}
