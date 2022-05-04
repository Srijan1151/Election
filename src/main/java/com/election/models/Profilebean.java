package com.election.models;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="profile_details")
@NoArgsConstructor
public class Profilebean {



	@Id
	@GeneratedValue
	private String userID;
	private String firstName;	
	private String lastName;	
	private Date dateOfBirth;
	private String gender;
	private String street;	
	private String location;	
	private String city;
	private String state;	
	private String pincode;
	private String mobileNo;
	private String emailID;	
	private String password;
	
	
	@JsonIgnore
	@OneToOne
	@MapsId
	private Credentialsbean cred;


	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}


	public void setCred(Credentialsbean c) {
		// TODO Auto-generated method stub
		
	}


	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) {
		this.userID = userID;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getEmailID() {
		return emailID;
	}


	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}


	public Credentialsbean getCred() {
		return cred;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
