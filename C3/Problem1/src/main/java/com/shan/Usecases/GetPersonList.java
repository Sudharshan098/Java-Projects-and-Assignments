package com.shan.Usecases;

import java.util.List;
import java.util.Scanner;

import com.shan.DAO.FitnessDao;
import com.shan.DAO.FitnessDaoImpl;
import com.shan.Entities.Person;
import com.shan.Exception.GymException;

public class GetPersonList {
	
	public static void getPersonList() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Gym name : ");
		String gym_name = in.next();
		
		FitnessDao fdao = new FitnessDaoImpl();
		
		try {
			List<Person> personList = fdao.getAllthePersonByGymName(gym_name);
			
			personList.forEach(l->{
				System.out.println(l.getPerson_id());
				System.out.println(l.getName());
				System.out.println(l.getEmail());
				System.out.println(l.getMobile());
				System.out.println("===============================");
			});
		} catch (GymException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}


}
