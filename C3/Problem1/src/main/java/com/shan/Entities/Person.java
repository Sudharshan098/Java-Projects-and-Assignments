package com.shan.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.ManyToAny;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int person_id; 
	private String name; 
	private String email; 
	private String mobile;


	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "personList",fetch = FetchType.EAGER)
	private List<Gym> gymList;
	
	
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

	
	public List<Gym> getGymList() {
		return gymList;
	}
	public void setGymList(List<Gym> gymList) {
		this.gymList = gymList;
	}
	
	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", gym=" + gymList + "]";
	}
	

	
	
	

}
