package com.shan.Q3;

public class Student {
	private  int roll;
	private  String name;
	private  String address;
	private  String collegeName;
	boolean isFromNIT;
    
	 
	
	
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public boolean isFromNIT() {
		return isFromNIT;
	}

	public void setFromNIT(boolean isFromNIT) {
		this.isFromNIT = isFromNIT;
	}
	
	Student(){
		
	}

		Student(int roll, String name, String address,String collegeName) {
			this.roll=roll;
			this.name=name;
			this.address=address;
			this.collegeName=collegeName;
			
		} 
	
	   Student(int roll, String name, String address) {
			this.roll=roll;
			this.name=name;
			this.address=address;
			this.collegeName="NIT";
		}
		
	public static Student getStudent(boolean isFromNIT) {
		if(isFromNIT==true) {
			
			Student S1=new Student(10,"Sudharshan","Coimbatore","NIT");
			return S1;
			
		}
		else {
		
			Student S2=new Student(10,"Sudharshan","Coimbatore","IIT");
			return S2;
		}
		
	}
}
