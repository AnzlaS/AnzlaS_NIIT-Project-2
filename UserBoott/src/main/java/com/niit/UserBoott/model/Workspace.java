package com.niit.UserBoott.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Workspace implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int workspaceId;
private String purpose;
private String typeofOrganization;
private int teamSize;
private String role;
private String companyName;
private String adminEmailId;
private Date creationDate;
public Workspace() {
	
}
public Workspace(String purpose, String typeofOrganization, int teamSize, String role, String companyName,
		String adminEmailId, Date creationDate) {
	super();
	this.purpose = purpose;
	this.typeofOrganization = typeofOrganization;
	this.teamSize = teamSize;
	this.role = role;
	this.companyName = companyName;
	this.adminEmailId = adminEmailId;
	this.creationDate = creationDate;
}
public int getWorkspaceId() {
	return workspaceId;
}
public void setWorkspaceId(int workspaceId) {
	this.workspaceId = workspaceId;
}
public String getPurpose() {
	return purpose;
}
public void setPurpose(String purpose) {
	this.purpose = purpose;
}
public String getTypeofOrganization() {
	return typeofOrganization;
}
public void setTypeofOrganization(String typeofOrganization) {
	this.typeofOrganization = typeofOrganization;
}
public int getTeamSize() {
	return teamSize;
}
public void setTeamSize(int teamSize) {
	this.teamSize = teamSize;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getAdminEmailId() {
	return adminEmailId;
}
public void setAdminEmailId(String adminEmailId) {
	this.adminEmailId = adminEmailId;
}
public Date getCreationDate() {
	return creationDate;
}
public void setCreationDate(Date creationDate) {
	this.creationDate = creationDate;
}
@Override
public String toString() {
	return "Workspace [workspaceId=" + workspaceId + ", purpose=" + purpose + ", typeofOrganization="
			+ typeofOrganization + ", teamSize=" + teamSize + ", role=" + role + ", companyName=" + companyName
			+ ", adminEmailId=" + adminEmailId + ", creationDate=" + creationDate + "]";
}



}
