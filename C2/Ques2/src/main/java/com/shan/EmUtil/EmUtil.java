package com.shan.EmUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtil {
	
	private static EntityManagerFactory emf;

	static {
		emf=Persistence.createEntityManagerFactory("Student_Course");
	}
	
	public static EntityManager provideEntityManager(){	
		return emf.createEntityManager();		
	}

}
