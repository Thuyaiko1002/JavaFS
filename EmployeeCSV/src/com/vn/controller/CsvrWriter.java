package com.vn.controller;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.vn.entties.Employee;

public class CsvrWriter {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\Admin\\eclipse-workspace\\Data\\employee.txt";

		System.out.println("Starting write employee.csv: " + filePath);
		writeCSV(filePath);
	}

	private static void writeCSV(String filePath) {
		List<Employee> listEmployee = new ArrayList<Employee>();

		// create demo employee
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Thuy");
		employee.setAge(26);
		employee.setSalary(10000);
		employee.setBirthday(convertStringToDate("1994/02/10"));
		listEmployee.add(employee);

		employee = new Employee();
		employee.setId(2);
		employee.setName("Hoang");
		employee.setAge(24);
		employee.setSalary(11000);
		employee.setBirthday(convertStringToDate("1996/07/15"));
		listEmployee.add(employee);

		employee = new Employee();
		employee.setId(3);
		employee.setName("Hung");
		employee.setAge(28);
		employee.setSalary(20000);
		employee.setBirthday(convertStringToDate("1992/09/10"));
		listEmployee.add(employee);

		employee = new Employee();
		employee.setId(4);
		employee.setName("Long");
		employee.setAge(30);
		employee.setSalary(15000);
		employee.setBirthday(convertStringToDate("1991/05/15"));
		listEmployee.add(employee);

		employee = new Employee();
		employee.setId(5);
		employee.setName("Dat");
		employee.setAge(24);
		employee.setSalary(10000);
		employee.setBirthday(convertStringToDate("1996/05/12"));
		listEmployee.add(employee);

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(filePath);
			fileWriter.append("Id, Name, Age, Salary, Birthday\n");
			for (Employee e : listEmployee) {
				fileWriter.append(String.valueOf(e.getId()));
				fileWriter.append(",");
				fileWriter.append(e.getName());
				fileWriter.append(",");
				fileWriter.append(String.valueOf(e.getAge()));
				fileWriter.append(",");
				fileWriter.append(String.valueOf(e.getSalary()));
				fileWriter.append(",");
				fileWriter.append(convertDateToString(e.getBirthday()));
				fileWriter.append("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private static Date convertStringToDate(String str) {
		try {
			return (Date) new SimpleDateFormat("yyyy/MM/dd").parse(str);
		} catch (Exception ex1) {
			ex1.printStackTrace();
		}
		return null;
	}
	
	private static String convertDateToString(Date date) {
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
		return formatDate.format(date);
	}
}
