package com.shan.App;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.shan.Entity.Person;

@Configuration
@ComponentScan(value = "com.shan")
public class AppConfig {

	@Bean
	public static List<Person> insertperson() {
		List<Person> list = new ArrayList<>();
		
		Person p1 = new Person();
		p1.setPerson_id(101);
		p1.setName("Shan");
		p1.setAge(24);
		p1.setEmail("shan@hotmail.com");
		p1.setMobile("9894980977");
		list.add(p1);
		
		Person p2 = new Person();
		p2.setPerson_id(102);
		p2.setName("Sudharshan");
		p2.setAge(25);
		p2.setEmail("sudharshan@hotmail.com");
		p2.setMobile("9150599010");
		list.add(p2);

		Person p3 = new Person();
		p3.setPerson_id(103);
		p3.setName("Varsha");
		p3.setAge(23);
		p3.setEmail("varsha@hotmail.com");
		p3.setMobile("9487224413");
		list.add(p3);

		Person p4 = new Person();
		p4.setPerson_id(104);
		p4.setName("Veer");
		p4.setAge(40);
		p4.setEmail("veer@hotmail.com");
		p4.setMobile("9500889710");
		list.add(p4);

		Person p5 = new Person();
		p5.setPerson_id(105);
		p5.setName("Varshan");
		p5.setAge(24);
		p5.setEmail("varshan@hotmail.com");
		p5.setMobile("9150919420");
		list.add(p5);
		
		return list;

	}
}
