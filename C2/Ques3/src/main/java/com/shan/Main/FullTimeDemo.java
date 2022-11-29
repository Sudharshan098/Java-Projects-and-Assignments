package com.shan.Main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.shan.EmUtil.EmUtil;
import com.shan.Entity.FullTimeInstructor;

public class FullTimeDemo {
	
	public static void getFullTimeInstructor() {
		
		EntityManager em = EmUtil.provideEntityManager();
		
		
		Query que = em.createQuery("Select f from FullTimeInstructor f");
		
		
		List<FullTimeInstructor> list = que.getResultList();
		
		list .forEach(l->{
			System.out.println(l.getInstructorId());
			System.out.println(l.getInstructorName());
			System.out.println(l.getEmail());
			System.out.println(l.getSalary());

		});
		
	}

}
