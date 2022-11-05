package com.shan.Q4;

public class Engine {

	int rmp;
	int Power;
	String manufacturer;
	boolean hasTurbo=false;
	
	Engine(int rmp,int Power,String manufacturer){
		this.rmp=rmp;
		this.Power=Power;
		this.manufacturer=manufacturer;
		
	}
	
	
	
   public boolean enableturbo(boolean hasTurbo){
	   return this.hasTurbo=true;
	}
}
