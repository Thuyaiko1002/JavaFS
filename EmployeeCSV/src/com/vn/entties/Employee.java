package com.vn.entties;


import java.util.Date;

import lombok.Data;

@Data
public class Employee{
	
	private int id;
	private String name;
	private int age;
	private float salary;
	private Date birthday;
	
	public Employee(int id, String name, int age, float salary, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.birthday = birthday;
	}
}
