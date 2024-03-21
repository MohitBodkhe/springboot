package com.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
    	
    	Logger LOGGER = LoggerFactory.getLogger(ApiApplication.class);
      
    	ApplicationContext applicationContext = SpringApplication.run(ApiApplication.class, args);
       
        Person person1 = applicationContext.getBean(Person.class);
        Person person2 = applicationContext.getBean(Person.class);
   
       LOGGER.info("{}",person1);
       LOGGER.info("{}",person1.getPersondao());
       LOGGER.info("{}",person2);
       LOGGER.info("{}",person2.getPersondao());
    
    }
   

}
