/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.femaleblogdata;

/**
 *
 * @author KshiteejManojVENDORG
 */
public class Post {
    private String title, type, date, fteam, name, description, point, userid, username, programDirector;

	Post(String title, String type, String date,String fteam, String name, String description, String point, String userid, String username, String programDirector) {
		this.title = title;
		this.type = type;
		this.date = date;
		this.fteam = fteam;
		this.name = name;
		this.description = description;
		this.point = point;
		this.userid = userid;
		this.username = username;
		this.programDirector = programDirector;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFteam() {
		return fteam;
	}

	public void setFteam(String fteam) {
		this.fteam = fteam;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getProgramDirector() {
		return programDirector;
	}

	public void setProgramDirector(String programDirector) {
		this.programDirector = programDirector;
	}
}
