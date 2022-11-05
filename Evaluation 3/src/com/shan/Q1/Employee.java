package com.shan.Q1;

public class Employee {
	
	private int Id;
	private String Name;
	private Double Salary;
	
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	
	
	
	public Employee() {
		super();
	}
	
	
	
	public Employee(int id, String name, double i) {
		super();
		Id = id;
		Name = name;
		Salary = i;
	}
	
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
	
	
	

}
