package com.election.models;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name="Party_details")
public class Partybean {
	@Id

		private String partyID;
		private String name;
		private String leader;
		private String symbol;
		
		@OneToOne(mappedBy = "Party",orphanRemoval = true)
		@JsonIgnore
		private Candidatebean schdlparty;

		public Object getPartyID() {
			// TODO Auto-generated method stub
			return null;
		}

		public void setPartyID(String string) {
			// TODO Auto-generated method stub
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLeader() {
			return leader;
		}

		public void setLeader(String leader) {
			this.leader = leader;
		}

		public String getSymbol() {
			return symbol;
		}

		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}

		public Candidatebean getSchdlparty() {
			return schdlparty;
		}

		public void setSchdlparty(Candidatebean schdlparty) {
			this.schdlparty = schdlparty;
		}

		public void setPartyID(Object partyID2) {
			// TODO Auto-generated method stub
			
		}


}
