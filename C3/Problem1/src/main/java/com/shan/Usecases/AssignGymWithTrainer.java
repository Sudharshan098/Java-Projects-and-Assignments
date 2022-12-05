package com.shan.Usecases;

import java.util.Scanner;

import com.shan.DAO.FitnessDao;
import com.shan.DAO.FitnessDaoImpl;
import com.shan.Entities.Trainer;
import com.shan.Exception.GymException;
import com.shan.Exception.TrainerException;

public class AssignGymWithTrainer {
	
	
	public static void assignTrainer() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Trainer Id : ");
		int trainer_id = in.nextInt();
		System.out.println("Enter Gym id : ");
		int gym_id = in.nextInt();

		FitnessDao fdao = new FitnessDaoImpl();
		
		try {
			fdao.assignTrainerWithGym(trainer_id, gym_id);
		} catch (TrainerException | GymException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}


}
