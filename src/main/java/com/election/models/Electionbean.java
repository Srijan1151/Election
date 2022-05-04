package com.election.models;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name="Election_details")

public class Electionbean {
	@Id
	private String electionID;
	private String name;
	private Date electionDate;
	private String district;
	private String constituency;
	private Date countingDate;
	
	
	@OneToOne(mappedBy = "Election",orphanRemoval = true)
	@JsonIgnore
	private Candidatebean schdlelections;


	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}


	public void setElectionID(String string) {
		// TODO Auto-generated method stub
		
	}


	public Date getElectionDate() {
		return electionDate;
	}


	public void setElectionDate(Date electionDate) {
		this.electionDate = electionDate;
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


	public Date getCountingDate() {
		return countingDate;
	}


	public void setCountingDate(Date countingDate) {
		this.countingDate = countingDate;
	}


	public Candidatebean getSchdlelections() {
		return schdlelections;
	}


	public void setSchdlelections(Candidatebean schdlelections) {
		this.schdlelections = schdlelections;
	}


	public String getElectionID() {
		return electionID;
	}


	public void setName(String name) {
		this.name = name;
	}

}
