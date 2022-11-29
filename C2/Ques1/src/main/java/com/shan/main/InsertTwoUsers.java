package com.shan.main;

import javax.persistence.EntityManager;

import com.mysql.cj.Query;
import com.shan.EmUtil.EmUtil;
import com.shan.Entity.PhoneNumber;
import com.shan.Entity.User;

public class InsertTwoUsers {
	
	public static void insertUsers() {
		
		EntityManager em = EmUtil.provideEntityManager();
		
		User u1 = new User();

		u1.setUserName("Prateek");
		u1.setEmailId("prateek@masai.com");
		u1.getList().add(new PhoneNumber(1,"9894980977", "Home"));		
		u1.getList().add(new PhoneNumber(2,"0422236549", "Landline"));		
		u1.getList().add(new PhoneNumber(3,"989498077", "Office"));		
		
		

		User u2 = new User();
		
		u2.setUserName("Nrupul");
		u2.setEmailId("nrupul@masai.com");
		u2.getList().add(new PhoneNumber(1,"9486380580", "Home"));		
		u2.getList().add(new PhoneNumber(2,"0422659875", "Landline"));		
		u2.getList().add(new PhoneNumber(3,"9487224413", "Office"));		


		
		em.getTransaction().begin();
		
		em.persist(u1);
		em.persist(u2);
		
		System.out.println("Users Added");
		
		em.getTransaction().commit();
		
		em.close();
		
		
		
		
	}

}
