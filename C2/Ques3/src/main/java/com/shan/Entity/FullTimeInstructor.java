package com.shan.Entity;

import javax.persistence.Entity;

@Entity
public class FullTimeInstructor extends Instructor {
	
	private String email;
	private double salary;
	
	

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "FullTimeInstructor [email=" + email + ", salary=" + salary + "]";
	}

}
