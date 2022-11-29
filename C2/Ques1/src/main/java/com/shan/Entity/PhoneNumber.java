package com.shan.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PhoneNumber {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int phoneId;
	private String phoneNumber;
	private String phoneType;
	
	public PhoneNumber() {
		super();
	}

	public PhoneNumber(int phoneId, String phoneNumber, String phoneType) {
		super();
		this.phoneId = phoneId;
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
	}

		
	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	@Override
	public String toString() {
		return "PhoneNumber [phoneId=" + phoneId + ", phoneNumber=" + phoneNumber + ", phoneType=" + phoneType + "]";
	}
	
	

}
