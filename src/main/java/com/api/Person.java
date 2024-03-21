package com.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	@Qualifier("Person")
	private Database database;
	
	public String printName() {
    Logger LOGGER = LoggerFactory.getLogger(Person.class);

	  LOGGER.info("{}",database);
		return "mojii";
	}

}
