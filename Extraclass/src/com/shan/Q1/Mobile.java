package com.shan.Q1;

public class Mobile {
	String[] outdatedModels = {"note4","note5","note6","note7"};
 public void searchOutdatedModel(String model,String...outdatedModels) {
	 for(String x:outdatedModels) {
		 if(x==model) {
			 System.out.println(x+"_Outdated");
		 }
	 }
 }

 public static void main(String[] args) {
  Mobile obj=new Mobile();
obj.searchOutdatedModel("note4",obj.outdatedModels);
}
}
