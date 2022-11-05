package com.shan.Q5;

public class Main {

	public static void main(String[] args) {
		FuelCar F=new FuelCar();
		ElectricCar E=new ElectricCar();
		
		F.run();//calling run method on fuelcar object
		F.service();;//calling service method on fuelcar object
		
		
		E.run();;//calling service method on ElectricCar object
		E.service();//calling service method on ElectricCar object
		

	}

}
