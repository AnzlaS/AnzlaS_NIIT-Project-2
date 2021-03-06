package com.niit.UserBoott.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Entity
@Component
public class UserCircle implements Serializable{

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int userCircleId;
		private String circleName;
		private String emailId;
		public UserCircle() {
		
		}
		public UserCircle(String circleName, String emailId) {
			super();
			this.circleName = circleName;
			this.emailId = emailId;
		}
		public int getUserCircleId() {
			return userCircleId;
		}
		public void setUserCircleId(int userCircleId) {
			this.userCircleId = userCircleId;
		}
		public String getCircleName() {
			return circleName;
		}
		public void setCircleName(String circleName) {
			this.circleName = circleName;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		@Override
		public String toString() {
			return "UserCircle [userCircleId=" + userCircleId + ", circleName=" + circleName + ", emailId=" + emailId
					+ "]";
		}
		
}