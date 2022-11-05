package com.shan.Q6;

import java.util.Scanner;

public class Main {

	
	public static double getStudent(int choice) {
		Scanner sc=new Scanner(System.in);
		double percent = 0;
		if(choice==1) {
			System.out.println("Enter the Marks for Hindi");
			int hin=sc.nextInt();
			
			System.out.println("Enter the Marks for English");
			int eng=sc.nextInt();

			System.out.println("Enter the Marks for History");
			int his=sc.nextInt();


			ArtStudent A=new ArtStudent(hin,eng,his);
			percent=A.findPercentage();
			
		}
		if(choice==2) {
			System.out.println("Enter the Marks for Physics");
			int phy=sc.nextInt();
			
			System.out.println("Enter the Marks for Chemistry");
			int che=sc.nextInt();

			System.out.println("Enter the Marks for Maths");
			int mat=sc.nextInt();

			System.out.println("Enter the Marks for Biology");
			int bio=sc.nextInt();

			ScienceStudent S=new ScienceStudent(phy,che,mat,bio);
			percent=S.findPercentage();
			
		}
		if(choice==3) {
			System.out.println("Enter the Marks for Accounts");
			int acc=sc.nextInt();
			
			System.out.println("Enter the Marks for Economics");
			int eco=sc.nextInt();

			System.out.println("Enter the Marks for Business Studies");
			int bus=sc.nextInt();

			CommerceStudent C=new CommerceStudent(acc,eco,bus);
			percent=C.findPercentage();
			
		}
		
		return percent;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Which Student percentage do you want to find:");
		System.out.println("1. ArtStudent");
		System.out.println("2. ScienceStudent");
		System.out.println("3. CommerceStudent");
		
		int i=sc.nextInt();
		double percentage=getStudent(i);
		System.out.println("Percentage is: "+percentage);
	}

}
