package com.niit.UserBoott.service;

import java.util.List;

public interface UserCircleService {
	boolean addUserToCircle(String emailId,String circleName);
	boolean deleteUserFromCircle(String emailId,String circleName);
	List<String> getUsersOfCircle(String circleName);

}
