package com.shan.Q3;
import java.util.Scanner;

public class Course {
	
	
	int courseId;
	String courseName;
	int courseFee;
	
	Course(int courseId, String courseName, int courseFee){
			this.courseId=courseId;
			this.courseName=courseName;
			this.courseFee=courseFee;
	}
	
	void displayCourseDetails() {
		System.out.println("The course-ID is "+courseId);
		System.out.println("The course name is "+courseName);
		System.out.println("The course fees is "+courseFee);
	}
	
	static void authenticate(String username,String password) {
		Scanner scan= new Scanner(System.in);
		if(username.equals("Admin")&&password.equals("1234")) {
			
			System.out.println("Enter the Course Name");
			String courseName=scan.nextLine();
			
			System.out.println("Enter the Course ID");
			int courseId=scan.nextInt();
			
			System.out.println("Enter the Course Fees");
			int courseFee=scan.nextInt();
			
			Course obj = new Course(courseId,courseName,courseFee);
			obj.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Credentials");
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        authenticate("Admin","1234");
		authenticate("shan","1234");
	}

}
