package com.cg.sprint.bus.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class User {

	@Id
	int userLoginId;
	
	@Column
	String userName;
	
	@Column
	String password;
	
	@Column
	String firstName;
	
	@Column
	String lastName;
	
	@Column
	long contact;
	
	@Column
	String email;
	
//	@Column
//	Reservation reservation;

	
	public User() {
		super();
	}

	public User(int userLoginId,String userName,String password,
			String firstName,String lastName,long contact,String email) {
//		,Reservation reservation) {
	
		super();
		this.userLoginId = userLoginId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.email = email;
//		this.reservation = reservation;
		
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public Reservation getReservation() {
//		return reservation;
//	}
//
//	public void setReservation(Reservation reservation) {
//		this.reservation = reservation;
//	}

	public int getUserLoginId() {
		return userLoginId;
	}

	public void setUserLoginId(int userLoginId) {
		this.userLoginId = userLoginId;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
public String toString() {
		return "User [userLoginId=" + userLoginId + ", userName=" + userName + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", contact=" + contact + ", email=" + email + "]";
//				+ ", reservation=" + reservation + "]";
	}
	
	
	
	
}

