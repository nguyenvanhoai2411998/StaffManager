package com.vti.entity;

public abstract class Staff {
	private String name;
	private int age;
	private Gender gender;
	private String adress;

	// CONSTRUCTOR
	public Staff() {
		super();
	}

	public Staff(String name, int age, Gender gender, String adress) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.adress = adress;
	}

	// GETTER AND SETTER
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	abstract public void displayInformation();
}
