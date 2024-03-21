package com.api;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Userdao implements Database {

	@Override
	public String userName() {
		return "mohit Bodkhe";
	}

}
