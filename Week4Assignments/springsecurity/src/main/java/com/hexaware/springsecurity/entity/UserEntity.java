package com.hexaware.springsecurity.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_db")
public class UserEntity {
	@Id
   private long id;
   private String username;
   private String password;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getUserName() {
	return username;
}
public void setUserName(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public UserEntity(long id, String username, String password) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
}
   
}
