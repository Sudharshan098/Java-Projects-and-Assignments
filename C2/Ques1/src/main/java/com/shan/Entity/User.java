package com.shan.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int userId;
		private String userName;
		private String emailId;
		
		
		@Embedded
		@ElementCollection(fetch = FetchType.EAGER)
		private List<PhoneNumber> phoneNum =new ArrayList<>();


		public int getUserId() {
			return userId;
		}


		public void setUserId(int userId) {
			this.userId = userId;
		}


		public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}


		public String getEmailId() {
			return emailId;
		}


		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}


		public List<PhoneNumber> getList() {
			return phoneNum;
		}


		public void setList(List<PhoneNumber> phoneNum) {
			this.phoneNum = phoneNum;
		}


		@Override
		public String toString() {
			return "User [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + ", list=" + phoneNum
					+ "]";
		}
		
		
		
		
		
		
		
}
