package com.shan.Q2;

import java.util.Scanner;

public class IPL {
	public void homeTeamStadium(Stadium stadium) {
		if(stadium==Stadium.EDEN_GARDENS_STADIUM) {
			System.out.println("This is the home ground of KKR");	
		}
		if(stadium==Stadium.WANKHEDE_STADIUM) {
			System.out.println("This is the home ground of Mumbai Indians");	
		}
		if(stadium==Stadium.CHIDAMBARAM_STADIUM) {
			System.out.println("This is the home ground of CSK”");	
		}
		if(stadium==Stadium.M_CHINNASWAMY_STADIUM) {
			System.out.println("This is the home ground of RCB”");	
		}
	}
public static void main(String[] args) {
	IPL obj=new IPL();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Stadium Name");
	String stad=sc.next();
	
	Stadium stadium=Stadium.valueOf(stad.toUpperCase());
	
	obj.homeTeamStadium(stadium);
}
}
