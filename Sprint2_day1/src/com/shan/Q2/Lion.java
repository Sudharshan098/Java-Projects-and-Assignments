package com.shan.Q2;

public class Lion {
	
	String name;
	boolean isHungry;
	int age;
	static int totalDeaths;
	static void printKilling(int n) {
		System.out.println("Total killings by lions in jungle "+ n);
	}
	void thinking() {
		
		if(isHungry=false) {
			System.out.println(name+" is sleeping");
		}
		if(isHungry=true && age>12) {
			 totalDeaths+=2;
			 System.out.println(name+" has eaten two animals");
					 
		}
		if(isHungry=true && age<=12 && age>=2) {
			totalDeaths+=1;
			System.out.println(name+" has eaten one animal");
		}
		if(isHungry=true && age<2) {
			System.out.println(name+" is calling Mom");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion1=new Lion();
		Lion lion2=new Lion();
		Lion lion3=new Lion();
		lion1.age=20;
		lion2.age=10;
		lion3.age=1;
		lion1.isHungry=true;
		lion2.isHungry=false;
		lion3.isHungry=true;
		lion1.name="lion1";
		lion2.name="lion2";
		lion3.name="lion3";
		lion3.thinking();
		lion1.thinking();
		lion2.thinking();
		printKilling(totalDeaths);

		
		
		
	}

}
