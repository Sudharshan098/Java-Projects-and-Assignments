package com.shan.DAO;

import java.util.List;

import com.shan.Entities.Gym;
import com.shan.Entities.Person;
import com.shan.Entities.Trainer;
import com.shan.Exception.GymException;
import com.shan.Exception.TrainerException;

public interface FitnessDao {

	public void addGym(Gym gym);
	
	public void registerPerson(Person person,int gym_id)throws GymException;
	
	public void registerTrainer(Trainer trainer);
	
	public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException, GymException;

	public List<Person> getAllthePersonByGymName(String gym_name)throws GymException;
}
