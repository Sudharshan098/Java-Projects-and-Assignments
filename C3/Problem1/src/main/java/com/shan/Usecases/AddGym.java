package com.shan.Usecases;

import java.util.Scanner;

import com.shan.DAO.FitnessDao;
import com.shan.DAO.FitnessDaoImpl;
import com.shan.Entities.Gym;

public class AddGym {
	
	public static void gymAdd() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Gym name : ");
		String name = in.next();
		System.out.println("Enter Gym fee : ");
		double fee = in.nextDouble();
		
		Gym new_gym = new Gym();
		
		new_gym.setGym_name(name);
		new_gym.setMonthly_fee(fee);
		
		FitnessDao fdao = new FitnessDaoImpl();
		
		fdao.addGym(new_gym);
		
	}

}
