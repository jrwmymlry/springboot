package com.example.SpringbootDemo.Entity;

public class User {
	String name;
	String sex;
	@Override
	public String toString() {
		return "User [name=" + name + ", sex=" + sex + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
}
