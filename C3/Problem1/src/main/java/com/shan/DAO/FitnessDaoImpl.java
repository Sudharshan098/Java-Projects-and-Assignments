package com.shan.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.shan.EmUtil.EmUtil;
import com.shan.Entities.Gym;
import com.shan.Entities.Person;
import com.shan.Entities.Trainer;
import com.shan.Exception.GymException;
import com.shan.Exception.TrainerException;

public class FitnessDaoImpl implements FitnessDao {

	@Override
	public void addGym(Gym gym) {
		
	    EntityManager em = EmUtil.provideEntityManager();
	    
	    em.getTransaction().begin();
	    
	    em.persist(gym);
	    
	    System.out.println("New Gym added in database.........");
	    
	    em.getTransaction().commit();
	    
	    em.close();
	}

	@Override
	public void registerPerson(Person person, int gym_id) throws GymException {
		
	    EntityManager em = EmUtil.provideEntityManager();
	    
	    Gym gym = em.find(Gym.class, gym_id);
	    
	    if(gym!=null) {
	    	 em.getTransaction().begin();
	 	    
	 	    gym.getPersonList().add(person);
	 	    
	 	    System.out.println("Person Added.............");
	 	    
	 	    em.getTransaction().commit();
	    }
	    else {
	    	throw new GymException("Gym_id not found......");
	    }
	   
	    em.close();
	    
	}

	@Override
	public void registerTrainer(Trainer trainer) {
		
		    EntityManager em = EmUtil.provideEntityManager();
		    
		    em.getTransaction().begin();
		    
		    em.persist(trainer);
		    
		    System.out.println("New trainer added in database.........");
		    
		    em.getTransaction().commit();
		    
		    em.close();
		
	}

	@Override
	public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException, GymException {
	   
		EntityManager em = EmUtil.provideEntityManager();
		
		Gym gym = em.find(Gym.class, gym_id);
		
		Trainer trainer = em.find(Trainer.class, trainer_id);
		
		
		   if(gym!=null && trainer!=null) {
		    	 em.getTransaction().begin();
		 	    
		 	    gym.setTrainer(trainer);
		 	    
		 	    System.out.println("Trainer Added.............");
		 	    
		 	    em.getTransaction().commit();
		    }
		    else {
		    	throw new GymException("Gym_Id / Trainer_Id not found......");
		    }
		   
		    em.close();
		    
	    

	}

	@Override
	public List<Person> getAllthePersonByGymName(String gym_name) throws GymException {
		List<Person> list = new ArrayList<>();
		
		
		EntityManager em = EmUtil.provideEntityManager();

		
		Query que = em.createQuery("from Gym where gym_name=:name");
		
		que.setParameter("name", gym_name);
		
		Gym gym = (Gym) que.getSingleResult();
		
		if(gym!=null) {
			Query que1 = em.createQuery("from Person");			
			
			list = que1.getResultList();
		}
		
		
		else {
			throw new GymException("Gym name not found..........");
		}
		
		
		em.close();
		
		return list;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
