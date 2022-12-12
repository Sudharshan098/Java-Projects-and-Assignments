package com.shan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.shan.myservice.MyService;

@SpringBootApplication
public class SpringDay1Application {

	public static void main(String[] args) {
		ApplicationContext cxt =  SpringApplication.run(SpringDay1Application.class, args);
		MyService result = cxt.getBean("myService",MyService.class);
		
		result.sayHello("Sudharshan");
	}

}
