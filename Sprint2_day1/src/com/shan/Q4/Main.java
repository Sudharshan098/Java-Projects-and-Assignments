package com.shan.Q4;

public class Main {
	
	void whole_number(int n) {
		if(n%2==1){
			System.out.println("Input :"+n+" Output :"+n);
		}
		else if(n%2==0){
			int x=n/10;
			System.out.println("Input :"+n+" Output :"+(x+1)*10);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj=new Main();
		obj.whole_number(44);
		obj.whole_number(43);

	}

}
