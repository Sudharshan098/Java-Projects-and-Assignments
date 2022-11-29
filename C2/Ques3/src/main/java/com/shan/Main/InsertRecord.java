package com.shan.Main;

import javax.persistence.EntityManager;

import com.shan.EmUtil.EmUtil;
import com.shan.Entity.FullTimeInstructor;
import com.shan.Entity.PartTimeInstructor;

public class InsertRecord {
	
	
	public static void addReords() {
	
		
		FullTimeInstructor fti = new FullTimeInstructor();
		fti.setInstructorName("Ankush");
		fti.setEmail("shan@outlook.com");
		fti.setSalary(9000);
		
	
		
		FullTimeInstructor fti2 = new FullTimeInstructor();
		fti2.setInstructorName("Isha");
		fti2.setEmail("isha@outlook.com");
		fti2.setSalary(52000);
		
	
		
		FullTimeInstructor fti3= new FullTimeInstructor();
		fti3.setInstructorName("Roshan");
		fti3.setEmail("roshan@outlook.com");
		fti3.setSalary(15000);
		
	
		
		FullTimeInstructor fti4 = new FullTimeInstructor();
		fti4.setInstructorName("Albert");
		fti4.setEmail("albert@outlook.com");
		fti4.setSalary(30000);
		
		
		PartTimeInstructor pti = new PartTimeInstructor();
		pti.setInstructorName("Ratan");
		pti.setNoOfSession(10);
		pti.setCostPerSession(40000);
		pti.setMobileNumber("9894809877");
		
		PartTimeInstructor pti2 = new PartTimeInstructor();
		pti2.setInstructorName("Arjun");
		pti2.setNoOfSession(5);
		pti2.setCostPerSession(4000);
		pti2.setMobileNumber("9150599010");
		
		PartTimeInstructor pti3 = new PartTimeInstructor();
		pti3.setInstructorName("Karan");
		pti3.setNoOfSession(10);
		pti3.setCostPerSession(2000);
		pti3.setMobileNumber("9486380580");
		
		PartTimeInstructor pti4 = new PartTimeInstructor();
		pti4.setInstructorName("Shan");
		pti4.setNoOfSession(20);
		pti4.setCostPerSession(40000);
		pti4.setMobileNumber("9487224413");
		
		EntityManager em = EmUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(fti);
		em.persist(fti2);
		em.persist(fti3);
		em.persist(fti4);
		em.persist(pti);
		em.persist(pti2);
		em.persist(pti3);
		em.persist(pti4);
		em.getTransaction().commit();
		
		em.close();

		System.out.println("done");
	}

}
