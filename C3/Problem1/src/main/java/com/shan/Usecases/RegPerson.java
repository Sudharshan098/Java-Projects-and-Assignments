package com.shan.Usecases;

import java.util.Scanner;

import com.shan.DAO.FitnessDao;
import com.shan.DAO.FitnessDaoImpl;
import com.shan.Entities.Gym;
import com.shan.Entities.Person;
import com.shan.Exception.GymException;

public class RegPerson {

	
	public static void personReg() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter name : ");
		String name = in.next();
		System.out.println("Enter email : ");
		String email = in.next();
		System.out.println("Enter mobile : ");
		String mobile = in.next();

		System.out.println("Enter Gym Id : ");
		int gym_id  = in.nextInt();
		
		Person person = new Person();
		
		person.setName(name);
		person.setEmail(email);
		person.setMobile(mobile);
		
		FitnessDao fdao = new FitnessDaoImpl();
		
		try {
			fdao.registerPerson(person, gym_id);
		} catch (GymException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
