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

		listEmployee.add(new Employee(1, "Thuy", 26, 12000, convertStringToDate("1994/02/16")));
		listEmployee.add(new Employee(2, "Hoang", 24, 11000, convertStringToDate("1996/01/10")));
		listEmployee.add(new Employee(3, "Long", 22, 14000, convertStringToDate("1998/12/19")));
		listEmployee.add(new Employee(4, "Hung", 23, 10000, convertStringToDate("1997/07/22")));
		listEmployee.add(new Employee(5, "Dat", 26, 13000, convertStringToDate("1994/10/20")));

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
