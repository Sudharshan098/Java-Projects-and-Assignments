package com.shan.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.shan.App.AppConfig;
import com.shan.Entity.Person;


@Service
public class PersonService {

	@Autowired
	private List<Person> theList= new ArrayList<>(); 
	
	@Autowired
	@Value("GymApplication")
	private String appName;
	

   
	public void printList(){
		
		ApplicationContext cxt = new AnnotationConfigApplicationContext(AppConfig.class);
		List<Person> personLList =  (List<Person>) cxt.getBean("insertperson");
		
		personLList.forEach(l->{
			System.out.println(l.toString());
			System.out.println();
		});
	}
	
	public void printAppName(){
		
		System.out.println("The application name is : " + appName);
	}
}
