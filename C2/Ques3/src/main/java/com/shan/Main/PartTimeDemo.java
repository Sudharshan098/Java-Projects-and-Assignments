package com.shan.Main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.shan.EmUtil.EmUtil;
import com.shan.Entity.FullTimeInstructor;
import com.shan.Entity.PartTimeInstructor;

public class PartTimeDemo {
	
	public static void getPartTimeInstructor() {
		
		EntityManager em = EmUtil.provideEntityManager();
		
		
		Query que = em.createQuery("Select p from PartTimeInstructor p");
		
		
		List<PartTimeInstructor> list = que.getResultList();
		
		list .forEach(l->{
			System.out.println(l.getInstructorId());
			System.out.println(l.getInstructorName());
			System.out.println(l.getCostPerSession());
			System.out.println(l.getNoOfSession());
			System.out.println(l.getMobileNumber());

		});
		
	}


}
