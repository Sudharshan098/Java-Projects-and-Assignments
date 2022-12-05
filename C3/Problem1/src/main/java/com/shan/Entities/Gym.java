package com.shan.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Gym {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int gym_id; 
	private String gym_name; 
	private double monthly_fee;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Person> personList;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Trainer trainer;
	
	public int getGym_id() {
		return gym_id;
	}
	public void setGym_id(int gym_id) {
		this.gym_id = gym_id;
	}
	public String getGym_name() {
		return gym_name;
	}
	public void setGym_name(String gym_name) {
		this.gym_name = gym_name;
	}
	public double getMonthly_fee() {
		return monthly_fee;
	}
	public void setMonthly_fee(double monthly_fee) {
		this.monthly_fee = monthly_fee;
	}
	
	
	
	
	public List<Person> getPersonList() {
		return personList;
	}
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
	
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "Gym [gym_id=" + gym_id + ", gym_name=" + gym_name + ", monthly_fee=" + monthly_fee + ", personList="
				+ personList + ", trainer=" + trainer + "]";
	}
	
	
	

	
	
}
