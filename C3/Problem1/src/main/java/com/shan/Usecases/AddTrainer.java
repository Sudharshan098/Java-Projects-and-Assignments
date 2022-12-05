package com.shan.Usecases;

import java.util.Scanner;

import com.shan.DAO.FitnessDao;
import com.shan.DAO.FitnessDaoImpl;
import com.shan.Entities.Gym;
import com.shan.Entities.Trainer;

public class AddTrainer {
	
	public static void trainerAdd() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Trainer name : ");
		String name = in.next();
		System.out.println("Enter years of Experience : ");
		int exp = in.nextInt();
		System.out.println("Enter Trainer email : ");
		String email = in.next();
		
		Trainer trainer = new Trainer();
		
		trainer.setTrainer_name(name);
		trainer.setYear_of_experience(exp);
		trainer.setEmail(email);
		
		FitnessDao fdao = new FitnessDaoImpl();
		
		fdao.registerTrainer(trainer);
	}

}
