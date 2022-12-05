package com.shan.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.shan.App.AppConfig;
import com.shan.Service.PersonService;

@Service
public class Demo {

	public static void main(String[] args) {
		ApplicationContext cxt = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PersonService personService = cxt.getBean(PersonService.class,"personService");
		
		
		
		personService.printList();
		
		System.out.println("==================================");
		
		personService.printAppName();
		
	}
}
