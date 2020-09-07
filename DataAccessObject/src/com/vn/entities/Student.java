package com.vn.entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class Student implements Serializable {
	private static final long serialVersionUID = -4574392739885594964L;

	private String name;
	private int rollNo;
	
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
}
