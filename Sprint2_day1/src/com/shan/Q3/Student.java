package com.shan.Q3;

public class Student {
	
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails() {
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1=new Student();
		Student S2=new Student();
		
		S1.name="Sudharshan";
		S1.marks=90;
		S1.roll=27;
		S1.displayStudentDetails();
		
		S1=null;
		
		S2.name="Ashicka";
		S2.marks=92;
		S2.roll=12;
		S2.displayStudentDetails();
		
		S2=null;
				
	}

}
