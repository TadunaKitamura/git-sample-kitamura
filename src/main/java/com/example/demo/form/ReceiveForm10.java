package com.example.demo.form;

public class ReceiveForm10 {

	private String name;
	private String age;
	private String comment;
	
	public Integer getIntAge() {
		return Integer.parseInt(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "ReceiveForm10 [name=" + name + ", age=" + age + ", comment=" + comment + "]";
	}

}
