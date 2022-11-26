package com.vti.entity;

public class Worker extends Staff {
	private String level;

	// CONSTRUCTOR
	public Worker() {
		super();
	}

	public Worker(String name, int age, Gender gender, String adress, String level) {
		super(name, age, gender, adress);
		this.level = level;
	}

	// GETTER AND SETTER
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;

	}

	@Override
	public void displayInformation() {
		System.out.printf("|%-20s|", super.getName());
		System.out.printf("%-20d|", super.getAge());
		System.out.printf("%-20s|", super.getGender());
		System.out.printf("%-20s|", super.getAdress());
		System.out.printf("%-20s|\n", getLevel());
		System.out.println(
				" --------------------------------------------------------------------------------------------------------");
	}
}
