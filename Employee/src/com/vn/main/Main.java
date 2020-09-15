package com.vn.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.vn.entities.Employee;
import com.vn.controller.Controller;

public class Main {
	public static void main(String[] args) {

		Controller controller = new Controller();
		List<Employee> listEmployee = new ArrayList<Employee>();
		listEmployee.add(new Employee(1, "Nam", 25, 12000));
		listEmployee.add(new Employee(2, "Thuy", 26, 11000));
		listEmployee.add(new Employee(3, "Hoang", 22, 10000));
		listEmployee.add(new Employee(4, "Ngan", 27, 15000));
		listEmployee.add(new Employee(5, "Hoan", 22, 17000));
		listEmployee.add(new Employee(5, "Hoan", 22, 17000));
		
		//Hiện tại output k bị trùng lặp nên k làm b1
		Set<Employee> set = new HashSet<Employee>(listEmployee);
		System.out.println(set.size());
		
		System.out.println("Sorting by Name: ");
		List<Employee> listSortName = controller.sortByName(listEmployee);
		controller.showEmployees(listSortName);

		System.out.println("------------------------------------------------");
		System.out.println("Sorting by Salary DESC: ");
		List<Employee> listSortSalary = controller.sortBySalaryDESC(listEmployee);
		controller.showEmployees(listSortSalary);
		
		System.out.println("------------------------------------------------");
		System.out.println("List of 3 youngest employees and highest salary: ");
		List<Employee> listsortSalaryAge = controller.sortBySalaryAge(listEmployee);
		controller.showEmployees(listsortSalaryAge);


		System.out.println("------------------------------------------------");
		System.out.println("List of employee contain character N: ");
		List<Employee> listcontainName = controller.containNameChar(listEmployee);
		controller.showEmployees(listcontainName);
	}
}
