package com.hibernate_1;

public class App {

	private int id;
	private String name;
	private String email;
	private int marks;

	App() {
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}
}