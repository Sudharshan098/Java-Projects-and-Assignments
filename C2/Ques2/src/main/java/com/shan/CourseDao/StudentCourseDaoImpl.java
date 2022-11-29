package com.shan.CourseDao;

import java.util.List;

import javax.persistence.EntityManager;

import com.shan.EmUtil.EmUtil;
import com.shan.Entity.Course;
import com.shan.Entity.Student;
import com.shan.Exception.CourseNotFoundException;
import com.shan.Exception.StudentNotFoundException;

public class StudentCourseDaoImpl implements StudentCourseDao {

	public void addCourse(Course course) {
		EntityManager em = EmUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(course);
		
		em.getTransaction().commit();
		
		System.out.println("Course Added");
		
		em.close();

	}

	public void getStudent(int roll_no) throws StudentNotFoundException {

		EntityManager em = EmUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Student obj = em.find(Student.class,roll_no);
		
		em.getTransaction().commit();
		
		System.out.println("Roll No : " +obj.getRollNo());
		System.out.println("Name  : " +obj.getName());
		System.out.println("Email : " +obj.getEmail());
		System.out.println("Mobile No : " +obj.getMobile());

		System.out.println("Course Id No : " +obj.getCorse().getCourseId());
		System.out.println("Course Name : " +obj.getCorse().getCourseName());
		System.out.println("Course Duration : " +obj.getCorse().getDuration());
		System.out.println("Course Fee : " +obj.getCorse().getFee());


		em.close();
	}

	public void getCourse(int course_id) throws CourseNotFoundException {
		

		EntityManager em = EmUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Course obj = em.find(Course.class,course_id);
		
		em.getTransaction().commit();


		System.out.println("Course Id No : " +obj.getCourseId());
		System.out.println("Course Name : " +obj.getCourseName());
		System.out.println("Course Duration : " +obj.getDuration());
		System.out.println("Course Fee : " +obj.getFee());

		List<Student> list = obj.getList();
		list.forEach(l->{
			System.out.println("Roll No : " +l.getRollNo());
			System.out.println("Name  : " +l.getName());
			System.out.println("Email : " +l.getEmail());
			System.out.println("Mobile No : " +l.getMobile());
		});
		

		em.close();
	}
	
	

}
