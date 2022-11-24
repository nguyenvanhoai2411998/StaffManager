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

		System.out.println(
				" --------------------------------------------------------------------------------------------------------");
		System.out.printf("|%-20s|", "Name");
		System.out.printf("%-20s|", "Age");
		System.out.printf("%-20s|", "Gender");
		System.out.printf("%-20s|", "Address");
		System.out.printf("%-20s|\n", "Level");
		System.out.println(
				" --------------------------------------------------------------------------------------------------------");
		System.out.printf("|%-20s|", super.getName());
		System.out.printf("%-20d|", super.getAge());
		System.out.printf("%-20s|", super.getGender().values());
		System.out.printf("%-20s|", super.getAdress());
		System.out.printf("%-20s|\n", getLevel());
		System.out.println(
				" --------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
	}
}
