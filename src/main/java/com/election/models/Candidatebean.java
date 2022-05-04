package com.election.models;
import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Candidate_details")
public class Candidatebean {
	@Id
	private String candidateID;
	private String name;
	private String district;
	private String constituency;
	private Date dateOfBirth;
	private String mobileNo;
	private String address;
	private String emailID;
	
	
@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn (name="election_id")
	private Electionbean Election;
	
	@OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="party_id")
    private Partybean Party;

	public Object getParty() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCandidateID(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public Electionbean getElection() {
		return Election;
	}

	public void setElection(Electionbean election) {
		Election = election;
	}

	public String getCandidateID() {
		return candidateID;
	}

	public void setParty(Partybean party) {
		Party = party;
	}

}

