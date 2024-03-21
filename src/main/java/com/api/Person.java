package com.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	private Persondao persondao;

	public Persondao getPersondao() {
		return persondao;
	}

	public void setPersondao(Persondao persondao) {
		this.persondao = persondao;
	}
	
	

}
