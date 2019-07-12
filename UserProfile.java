package com.mycompany.femaleblogdata;

public class UserProfile {
	private String userID, type, fromDate, toDate, id, revision;
	

	UserProfile(String userID, String type, String fromDate, String toDate) {
		this.userID = userID;
		this.type = type;
		this.fromDate = fromDate;
		this.toDate = toDate;
		//this.id = Integer.toString(id);
	}
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}
	
}
