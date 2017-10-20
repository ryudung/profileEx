package com.example.config;

import com.example.domain.Man;
import com.example.domain.Person;
import com.example.domain.Woman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class PersonConfig {

    @Bean
    @Profile("dev")
    Person man(){
        return new Man();
    }

    @Bean
    @Profile("prod")
    Person woman(){
        return new Woman();
    }


}
