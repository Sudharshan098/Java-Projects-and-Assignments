package com.shan.Q3;

public class Main {
    
	
	
	void messageToStudents(Evaluation evaluation) {
		
		
		if(evaluation instanceof DsaEvaluation) {
			System.out.println("Its a DSA Evaluation");
			evaluation.printNoOfQuestions(5);
			evaluation.evaluationTiming();
			System.out.println("================================");
		}
		else if(evaluation instanceof CodingEvaluation) {
			System.out.println("Its a Coding Evaluation");
			evaluation.printNoOfQuestions(4);
			evaluation.evaluationTiming();
			System.out.println("================================");
		}
		
		else {
			System.out.println("Invalid Value");
		}
		
	}
	public static void main(String[] args) {
		
	   Main m=new Main();
	   
	
		
		m.messageToStudents(new DsaEvaluation());
		m.messageToStudents(new CodingEvaluation());
		
	}

}
