package com.cg.sprint.bus.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



@Entity
@Table(name = "user_table")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int userId;
	
	@NotEmpty(message= "user-name should not be empty")
	@Size(min=3, message= "user-name should be length minimun 3")
	@Column
	String userName;
	
	
	
	@Pattern(regexp ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", message="Password must contain at least one digit [0-9].\r\n" + 
			"Password must contain at least one lowercase Latin character [a-z].\r\n" +
			"Password must contain at least one uppercase Latin character [A-Z].\r\n" + 
			"Password must contain at least one special character like ! @ # & ( ).\r\n" + 
			"Password must contain a length of at least 8 characters and a maximum of 20 characters.")
	@NotEmpty(message= "password should not be empty")
	@Column
	String password;
	
	@NotEmpty(message= "first-name should not be empty")
	@Size(min=3, message= "first-name should be length minimun 3")
	@Column
	String firstName;
	
	@NotEmpty(message= "last-name should not be empty")
	@Size(min=3, message= "last-name should be length minimun 3")
	@Column
	String lastName;
	
//	@Pattern(regexp="^(\\+91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$", message="contact should contain 10 digits")
	
	@Column
	long contact;

	@NotEmpty(message= "email should not be empty")
	@Email
	@Column
	String email;
	
//	@OneToOne(cascade = {CascadeType.MERGE})
//	@JoinColumn(name = "reservationId")
//	Reservation reservation;
	
	
//	@OneToMany(targetEntity = Reservation.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "UR_fk", referencedColumnName = "userId")
//	private List<Reservation> reservation;
	
	public User() {
		super();
	}

	public User(int userId, String userName, String password, String firstName, String lastName, long contact,
			String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.email = email;
	}

//	public User(int userId, String userName, String password, String firstName, String lastName, long contact,
//			String email, List<Reservation> reservation) {
//		super();
//		this.userId = userId;
//		this.userName = userName;
//		this.password = password;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.contact = contact;
//		this.email = email;
////		this.reservation = reservation;
//	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

//	public List<Reservation> getReservation() {
//		return reservation;
//	}
//
//	public void setReservation(List<Reservation> reservation) {
//		this.reservation = reservation;
//	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", contact=" + contact + ", email=" + email +"]";
//		", reservation="
//				+ reservation + "]";
	}

	
	
	
}