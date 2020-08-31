package com.niit.UserBoott.model;


import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;  
import javax.persistence.Table;  
  
@Entity  
@Table(name="Users")

public class User {


@Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    private int User_id;  
    private String User_name;  
    private String User_email;  
    private String User_password;
    private String User_Phone;
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String user_name) {
		User_name = user_name;
	}
	public String getUser_email() {
		return User_email;
	}
	public void setUser_email(String user_email) {
		User_email = user_email;
	}
	public String getUser_password() {
		return User_password;
	}
	public void setUser_password(String user_password) {
		User_password = user_password;
	}
	
	public String getUser_Phone() {
		return User_Phone;
	}
	public void setUser_Phone(String user_Phone) {
		User_Phone = user_Phone;
	}
	@Override
	public String toString() {
		return "User [User_id=" + User_id + ", User_name=" + User_name + ", User_email=" + User_email
				+ ", User_password=" + User_password + ", User_Phone=" + User_Phone + "]";
	}

   

}
