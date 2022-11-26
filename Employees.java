package com.vti.entity;

public class Employees extends Staff {

	private String job;

	// GETTER AND SETTER
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	// CONSRTUCTOR
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(String name, int age, Gender gender, String adress, String job) {
		super(name, age, gender, adress);
		this.job = job;
	}

	@Override
	public void displayInformation() {
		System.out.printf("|%-20s|", super.getName());
		System.out.printf("%-20d|", super.getAge());
		System.out.printf("%-20s|", super.getGender());
		System.out.printf("%-20s|", super.getAdress());
		System.out.printf("%-20s|\n", getJob());
		System.out.println(
				" --------------------------------------------------------------------------------------------------------");
	}

}
