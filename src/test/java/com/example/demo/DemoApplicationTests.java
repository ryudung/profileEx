package com.example.demo;

import com.example.config.PersonConfig;
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
@ContextConfiguration(classes = {PersonConfig.class})
@ActiveProfiles("dev")
public class DemoApplicationTests {

	@Autowired
	Person person;

	@Test
	public void contextLoads() {
		System.out.println(person.getName());
	}

}
