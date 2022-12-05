package com.shan.Entity;

import org.springframework.stereotype.Controller;

@Controller
public class Person {
	
	
	private int person_id;
	private String name;
	private String email;
	private int age;
	private String mobile;
	
	
	
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", name=" + name + ", email=" + email + ", age=" + age + ", mobile="
				+ mobile + "]";
	}

	
	
	

}
