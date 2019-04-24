package com.test.country.model;

public class CountryCard {
	
	private String country;
	private String phoneNumber;
	private String dialNumber;
	private String dialType;
	private String callType;
	private String instructionType;
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDialNumber() {
		return dialNumber;
	}
	public void setDialNumber(String dialNumber) {
		this.dialNumber = dialNumber;
	}
	public String getDialType() {
		return dialType;
	}
	public void setDialType(String dialType) {
		this.dialType = dialType;
	}
	public String getCallType() {
		return callType;
	}
	public void setCallType(String callType) {
		this.callType = callType;
	}
	public String getInstructionType() {
		return instructionType;
	}
	public void setInstructionType(String instructionType) {
		this.instructionType = instructionType;
	}
	
	public String toString() {
		return this.country+" "+this.callType+" "+this.dialNumber+" "+this.dialType+" "+this.phoneNumber+" "+this.instructionType;
		
	}
	
	

}
