package com.shan.Q6;

public class ArtStudent implements Student {

	private int hindiMarks;
	private int englishMarks;
	private int historyMarks;
	
	
	
	public int getHindiMarks() {
		return hindiMarks;
	}
	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}
	
	
	
	public int getEnglishMarks() {
		return englishMarks;
	}
	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}
	
	
	
	public int getHistoryMarks() {
		return historyMarks;
	}
	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}
	
	
	public ArtStudent(int hindiMarks, int englishMarks, int historyMarks) {
		super();
		this.hindiMarks = hindiMarks;
		this.englishMarks = englishMarks;
		this.historyMarks = historyMarks;
	}
	
	
	public ArtStudent() {
		super();
	}
	@Override
	public double findPercentage() {
	    
		double sum=hindiMarks+englishMarks+historyMarks;
		double percent=sum/3;
		return percent;
	}

	
	
	
}
