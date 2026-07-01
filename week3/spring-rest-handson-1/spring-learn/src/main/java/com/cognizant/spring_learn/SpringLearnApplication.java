package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Main method started");

		SpringApplication.run(SpringLearnApplication.class, args);

		displayCountry();

		LOGGER.info("Main method ended");
	}

	public static void displayCountry() {
		LOGGER.info("displayCountry started");

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) 	context.getBean("country");

		LOGGER.info("Country: {}", country);

		LOGGER.info("displayCountry ended");
	}
}