package com.matt.spring;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Person {
	
	@NotNull(message="Have to specify name")
	private String name;
	
	@NotNull(message="Age cannot be null")
	@Min(value=0, message="Can not be smaller than 0")
	@Max(value=100, message="Can not be greater than 100")
	private Integer age;
	
	public Person() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+" - "+ age;
	}

}
