package com.niit.UserBoott.model;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class UserMessage implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int messageId;
		private String messageText;
		private String senderEmailId;
		private String sentDate;
		private long messageSize;
		private long maximumSize;
		private String messageType;
		private String receiverEmailId;
		private String circleName;
		public UserMessage() {
		
		}
		public UserMessage(String messageText, String senderEmailId, String sentDate, long messageSize, long maximumSize,
				String messageType, String receiverEmailId, String circleName) {
			super();
			this.messageText = messageText;
			this.senderEmailId = senderEmailId;
			this.sentDate = sentDate;
			this.messageSize = messageSize;
			this.maximumSize = maximumSize;
			this.messageType = messageType;
			this.receiverEmailId = receiverEmailId;
			this.circleName = circleName;
		}
		@Override
		public String toString() {
			return "UserMessage [messageId=" + messageId + ", messageText=" + messageText + ", senderEmailId="
					+ senderEmailId + ", sentDate=" + sentDate + ", messageSize=" + messageSize + ", maximumSize="
					+ maximumSize + ", messageType=" + messageType + ", receiverEmailId=" + receiverEmailId
					+ ", circleName=" + circleName + "]";
		}
		public void setMessageId(int messageId2) {
			// TODO Auto-generated method stub
			
		}
		

		
	}



