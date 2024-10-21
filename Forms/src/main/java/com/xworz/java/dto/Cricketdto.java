package com.xworz.java.dto;

import java.io.Serializable;

public class Cricketdto implements Serializable{
	private String groundName;
	private String CustomerName;
	private String CustomEmail;
	private String seatType;
	private int noOfTickets;
	
	public Cricketdto() {
		
	}

	public Cricketdto(String groundName, String customerName, String customEmail, String seatType, int noOfTickets) {
		super();
		this.groundName = groundName;
		CustomerName = customerName;
		CustomEmail = customEmail;
		this.seatType = seatType;
		this.noOfTickets = noOfTickets;
	}

	public String getGroundName() {
		return groundName;
	}

	public void setGroundName(String groundName) {
		this.groundName = groundName;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomEmail() {
		return CustomEmail;
	}

	public void setCustomEmail(String customEmail) {
		CustomEmail = customEmail;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	@Override
	public String toString() {
		return "Cricketdto [groundName=" + groundName + ", CustomerName=" + CustomerName + ", CustomEmail="
				+ CustomEmail + ", seatType=" + seatType + ", noOfTickets=" + noOfTickets + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CustomEmail == null) ? 0 : CustomEmail.hashCode());
		result = prime * result + ((CustomerName == null) ? 0 : CustomerName.hashCode());
		result = prime * result + ((groundName == null) ? 0 : groundName.hashCode());
		result = prime * result + noOfTickets;
		result = prime * result + ((seatType == null) ? 0 : seatType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cricketdto))
			return false;
		Cricketdto other = (Cricketdto) obj;
		if (CustomEmail == null) {
			if (other.CustomEmail != null)
				return false;
		} else if (!CustomEmail.equals(other.CustomEmail))
			return false;
		if (CustomerName == null) {
			if (other.CustomerName != null)
				return false;
		} else if (!CustomerName.equals(other.CustomerName))
			return false;
		if (groundName == null) {
			if (other.groundName != null)
				return false;
		} else if (!groundName.equals(other.groundName))
			return false;
		if (noOfTickets != other.noOfTickets)
			return false;
		if (seatType == null) {
			if (other.seatType != null)
				return false;
		} else if (!seatType.equals(other.seatType))
			return false;
		return true;
	}
	

	
}
