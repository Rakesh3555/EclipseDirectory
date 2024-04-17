
/*You have a list of employees with their names, salaries, and departments. 
How would you sort the employees based on their salaries in descending order?*/

package com.chainsys.day6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	private String name;
	private double salary;
	private String department;

	public Employee(String name, double salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}


	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", salary=" + salary +", department='" + department + '\'' +'}';
	}
}

public class EmployeeSortExample {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Rakesh", 75000.0, "HR"));
		employees.add(new Employee("Jona", 90000.0, "Engineering"));
		employees.add(new Employee("Gokula", 80000.0, "Manager"));

		Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary).reversed());


		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}
}

