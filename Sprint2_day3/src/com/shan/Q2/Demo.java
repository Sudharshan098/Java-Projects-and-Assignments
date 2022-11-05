package com.shan.Q2;

public class Demo {
	
	
	public Demo(){
		this("Sudharshan");
		System.out.println("Inside Demo");
		
	}
	public Demo(String s){
		this(20);
		System.out.println("Inside Demo(String s)");

	}
	public Demo(int i){
		this(2.5f);
		System.out.println("Inside Demo(int i)");
	}
	public Demo(float f){
		System.out.println("Inside Demo(float f)");
	}

	public static void main(String[] args) {
		Demo obj=new Demo();
	}

}
