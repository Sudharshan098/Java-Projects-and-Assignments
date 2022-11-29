package com.shan.UseCases;

import java.util.Scanner;

import com.shan.CourseDao.StudentCourseDao;
import com.shan.CourseDao.StudentCourseDaoImpl;
import com.shan.Exception.CourseNotFoundException;

public class GetCourse {
	
	
public static void getCoursebyId() {
		
		Scanner in =new Scanner(System.in);
		System.out.print("Enter Course Id :");
		int id = in.nextInt();
		
		StudentCourseDao scd = new StudentCourseDaoImpl();
	
		try {
			scd.getCourse(id);
		} catch (CourseNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
