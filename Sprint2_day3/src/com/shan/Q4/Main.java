package com.shan.Q4;

public class Main {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Harrier","Tata","black");
		Engine e1 = new Engine(10000,110,"Tata");
		
		System.out.println("Car Model :"+ c1.model);
		System.out.println("Car companyName :"+c1.companyName);
		System.out.println("Car color : "+c1.Color);

		System.out.println("Car RPM : "+e1.rmp);
		System.out.println("Car power : "+e1.Power);
		System.out.println("Car Engine Manufacture :"+e1.manufacturer);
		System.out.println("Car Has Turbo : "+e1.enableturbo(true));

		
		

		
	}

}
