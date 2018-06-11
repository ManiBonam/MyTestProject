package com.mytest.domain;

public class Participant {
	private String firstName;
	private String LastName;
	private String middleName;
	private long wsid;
	private long personid;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public long getWsid() {
		return wsid;
	}
	public void setWsid(long wsid) {
		this.wsid = wsid;
	}
	public long getPersonid() {
		return personid;
	}
	public void setPersonid(long personid) {
		this.personid = personid;
	}
		
}
