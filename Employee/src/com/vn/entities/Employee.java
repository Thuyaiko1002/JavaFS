package com.vn.entities;

import lombok.Data;

@Data
public class Employee {
	private int id;
	private String name;
	private int age;
	private float salary;

	public Employee() {
		super();
	}
	
	public Employee(int id, String name, int age, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
}
