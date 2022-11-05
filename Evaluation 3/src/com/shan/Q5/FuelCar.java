package com.shan.Q5;

public class FuelCar implements Vehicle{

	@Override
	public void run() {
		System.out.println("Fuel Car is running");
			
	}
	
	public void service() {
		System.out.println("Fuel Car needs service");
	}

}
