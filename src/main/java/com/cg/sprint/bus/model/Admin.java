package com.cg.sprint.bus.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin_table")
public class Admin {
	
	@Id
	int adminId;
	
	@Column
	String adminUsername;
	
	@Column
	String adminPassword;
	
	public Admin() {
		super();
	}
	
	public Admin(int adminId, String adminUserName, String adminPassword) {
		super();
		this.adminId=adminId;
		this.adminUsername=adminUserName;
		this.adminPassword=adminPassword;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminUsername() {
		return adminUsername;
	}

	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminUsername=" + adminUsername + ", adminPassword=" + adminPassword
				+ "]";
	}
	
	

}