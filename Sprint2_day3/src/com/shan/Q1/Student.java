package com.shan.Q1;

public class Student {
	
	private int roll;
	private String name; 
	private int age;
	private int marks;

    
	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public Student() {
		super();
	}


	public Student(int roll, String name, int age, int marks) {
		
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;		
		
	}
	public void getSudent(){
		System.out.println(roll);
		System.out.println(name);
		System.out.println(age);
		System.out.println(marks);

		
	}
}
