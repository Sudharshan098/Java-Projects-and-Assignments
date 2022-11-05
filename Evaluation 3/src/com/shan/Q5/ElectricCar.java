package com.shan.Q5;

public class ElectricCar implements Vehicle{

	@Override
	public void run() {
		System.out.println("Electric Car is running");
	}
	
	public void service() {
		System.out.println("Electric Car needs service");
	}


}
