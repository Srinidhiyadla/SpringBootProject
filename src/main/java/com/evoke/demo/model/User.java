package com.evoke.demo.model;

import org.springframework.stereotype.Component;

@Component
public class User {

	private int id;
	private String name;
	private String place;

	public User() {
		super();
	}

	public User(int id, String name, String place) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getplace() {
		return place;
	}

	public void setplace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", place=" + place + "]";
	}

}
