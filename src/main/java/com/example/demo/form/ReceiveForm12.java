package com.example.demo.form;

public class ReceiveForm12 {

	private String name;
	private Integer age;
	private Integer money;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	private String comment;

	@Override
	public String toString() {
		return "ReceiveForm12 [name=" + name + ", age=" + age + ", money=" + money + ", comment=" + comment + "]";
	}

}
