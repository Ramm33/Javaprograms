package com.oops;

public class Oops17 {

	private int Id;
	private String Name;
	private double salary;

	public void setId(int Id) {
		this.Id = Id;
	}

	public int getId() {
		return Id;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getName() {
		return Name;
	}

	public void setsalary(double salary) {
		this.salary = salary;
	}

	public double getsalary() {
		return salary;
	}

	public void increaseSalary(double amount) {
		salary = salary + amount;
	}

	public void decreaseSalary(double amount) {
		salary = salary - amount;
	}

}