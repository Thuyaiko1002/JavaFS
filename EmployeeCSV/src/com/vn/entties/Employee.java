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
}
