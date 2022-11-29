package com.shan.UseCases;

import com.shan.CourseDao.StudentCourseDao;
import com.shan.CourseDao.StudentCourseDaoImpl;
import com.shan.Entity.Course;
import com.shan.Entity.Student;

public class AddCourse {
	
	public static void addCourse() {
		
		Course c1 = new Course();
		
		c1.setCourseName("Java");
		c1.setDuration("30-Days");
		c1.setFee(15000);
		
		
		Student s1 = new Student();
		s1.setName("Shan");
		s1.setEmail("shan@gmail.com");
		s1.setMobile("9894980977");
		
		
		Student s2 = new Student();
		s2.setName("Sudharshan");
		s2.setEmail("sudhar@gmail.com");
		s2.setMobile("9150599010");
		
		
		s1.setCorse(c1);
		s2.setCorse(c1);
		c1.getList().add(s1);
		c1.getList().add(s2);

		StudentCourseDao scd = new StudentCourseDaoImpl();
		
		scd.addCourse(c1);
	}

}
