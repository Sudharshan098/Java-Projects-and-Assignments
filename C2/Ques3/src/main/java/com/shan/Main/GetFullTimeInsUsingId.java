package com.shan.Main;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.shan.EmUtil.EmUtil;
import com.shan.Entity.FullTimeInstructor;

public class GetFullTimeInsUsingId {
	
	public static void getIns() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Instructor ID :");
		
		int n = in.nextInt();
		
		EntityManager em = EmUtil.provideEntityManager();

		FullTimeInstructor obj=	em.find(FullTimeInstructor.class, n);
		
		if(obj==null) {
			System.out.println("Invalid ID...........");
		}
		
		System.out.println(obj);
		
		
	}

}
