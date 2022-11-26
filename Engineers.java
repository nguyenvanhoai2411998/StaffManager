package com.vti.entity;

public class Engineers extends Staff {
	private String major;

	// CONSTRUCTOR
	public Engineers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engineers(String name, int age, Gender gender, String adress, String major) {
		super(name, age, gender, adress);
		this.major = major;
	}

	// GETTER AND SETTER
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public void displayInformation() {
		System.out.printf("|%-20s|", super.getName());
		System.out.printf("%-20d|", super.getAge());
		System.out.printf("%-20s|", super.getGender());
		System.out.printf("%-20s|", super.getAdress());
		System.out.printf("%-20s|\n", getMajor());
		System.out.println(
				" --------------------------------------------------------------------------------------------------------");
	}
}
