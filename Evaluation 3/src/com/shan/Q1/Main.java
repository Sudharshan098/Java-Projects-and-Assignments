package com.shan.Q1;

import java.lang.reflect.Array;

public class Main {
	
	
	
   public static String str;
   public static int num;



	public static Object[] changeArray(Object[] arr) {
		int n=arr.length;
		Student S1= new Student();
		Employee E1= new Employee();
		
		for(int i=0;i<n;i++) {
			if(arr[i]==new Student()) { 
				
				S1.setMarks(S1.getMarks()+10);
			}
			
			if(arr[i]==new Employee()) {
				
				E1.setSalary(E1.getSalary()+10000);
			}
		
			if(arr[i]==str) {
				String bag="";
				
				char[] ch=str.toCharArray();
				for(int i1=ch.length-1;i1>=0;i1--) {
					bag+=ch[i1];
				}
			}
			
		}
		
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		
		
		Object arr[]= {new Student(23, "rakesh", 450),new Employee(12, "Lokesh",85000),"String",50};
		Main.str=(String) arr[2];
		Main.num=(int) arr[3];

		
		Object[] result=changeArray(arr);
		System.out.println(result);
	}

}
