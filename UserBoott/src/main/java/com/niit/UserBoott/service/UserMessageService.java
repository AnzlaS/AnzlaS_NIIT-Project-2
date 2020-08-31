package com.niit.UserBoott.service;

import java.util.List;

import com.niit.UserBoott.model.UserMessage;

public interface UserMessageService {
	boolean sendMessage(UserMessage usermessage);
	boolean deleteMessage(int messageId);
	List<UserMessage> getMyMessages(String emailId);
	List<UserMessage> getAllMessageByCircleName(String circleName);
	boolean isReceiverExists(String receiverEmailId);
	public boolean isCircleExists(String circleName);
	List<UserMessage> getAllMessageByUsers(String senderEmailId, String receiverEmailId);
}
