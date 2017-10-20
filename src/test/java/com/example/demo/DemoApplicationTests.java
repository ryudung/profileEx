package com.example.demo;

import com.example.config.AnimalDevConfig;
import com.example.config.AnimalProdConfig;
import com.example.config.PersonConfig;
import com.example.domain.Animal;
import com.example.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.ws.spi.WebServiceFeatureAnnotation;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {PersonConfig.class, AnimalDevConfig.class, AnimalProdConfig.class})
@ActiveProfiles("prod")
public class DemoApplicationTests {

	@Autowired
	Person person;

	@Autowired
	Animal animal;

	@Test
	public void contextLoads() {
		System.out.println(person.getName());
		System.out.println(animal.bite());
	}

}
