package com.olaniyi.Model;

import java.util.UUID;

public class Person {
	private final UUID id;
	private final String name;
	
	//Constructor with fields 
	public Person(UUID id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	
	
	

}
