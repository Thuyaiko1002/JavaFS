package com.vn.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.vn.entities.Employee;

public class Controller {

	public void showEmployees(List<Employee> empl) {
		empl.forEach(System.out::println);
	}

	public List<Employee> sortByName(List<Employee> empl) {
		empl.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		});
		return empl;
	}

	public List<Employee> sortBySalaryDESC(List<Employee> empl) {
		empl.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getSalary() < e2.getSalary() ? 1 : -1;
			}
		});
		return empl;
	}

	public List<Employee> sortBySalaryAge(List<Employee> empList) {
		List<Employee> list = empList.stream()
				.sorted(Comparator.comparing(Employee::getAge)
						.thenComparing(Comparator.comparing(Employee::getSalary).reversed()))
				.collect(Collectors.toList());
		return list.subList(0, 3);
	}

	public List<Employee> containNameChar(List<Employee> listEmployee) {
		return listEmployee.stream().filter(p -> p.getName().contains("N")).collect(Collectors.toList());
	}

}
