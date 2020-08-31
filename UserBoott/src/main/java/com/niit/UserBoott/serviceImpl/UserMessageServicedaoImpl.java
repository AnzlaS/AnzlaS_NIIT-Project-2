package com.niit.UserBoott.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.niit.UserBoott.dao.UserMessageDao;
import com.niit.UserBoott.model.UserMessage;
import com.niit.UserBoott.service.UserMessageService;



public class UserMessageServicedaoImpl implements UserMessageService {
	 @Autowired  
	    private UserMessageDao usermessagedao;  

	 @Override
	 public boolean sendMessage(UserMessage usermessage) {
		 return usermessagedao.sendMessage(usermessage);
	 }
	 @Override
	 public boolean deleteMessage(int messageId) {
		 return usermessagedao.deleteMessage(messageId);
	 }
		public List<UserMessage> getMyMessages(String emailId){
			return usermessagedao.getMyMessages(emailId);
		}
		@Override
		public List<UserMessage> getAllMessageByCircleName(String circleName){
			return usermessagedao.getAllMessageByCircleName(circleName);
		}
		@Override
		public boolean isReceiverExists(String receiverEmailId) {
			return usermessagedao.isReceiverExists(receiverEmailId);
		}
		@Override
		public boolean isCircleExists(String circleName) {
			return usermessagedao.isCircleExists(circleName);
		}
		@Override
		public List<UserMessage> getAllMessageByUsers(String senderEmailId, String receiverEmailId){
			return usermessagedao.getAllMessageByUsers(senderEmailId, receiverEmailId);
		}
}
