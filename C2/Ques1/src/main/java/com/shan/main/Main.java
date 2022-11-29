package com.shan.main;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.shan.EmUtil.EmUtil;
import com.shan.Entity.User;

public class Main {
	
	

	public static void main(String[] args) {
		
//		InsertTwoUsers.insertUsers();
		EntityManager em = EmUtil.provideEntityManager();
		
		Query que = em.createQuery("Select u from User u where u.userName=:name");
		
		que.setParameter("name", "Nrupul");
		
		User u1 = (User) que.getSingleResult();
		
		
		System.out.println(u1.getList());
	}
	


}
