package com.shan.myservice;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class MyService {

	public void sayHello(String name){
		System.out.println("Welcome "+name);
		}
	
	
}
