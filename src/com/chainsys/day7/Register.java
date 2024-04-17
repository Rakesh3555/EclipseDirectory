package com.chainsys.day7;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Register Student = new Register();
		Scanner stu = new Scanner(System.in);
		Student data = new Student();

		String name = "";
		while (true) {
			System.out.println("Enter student name : ");
			name = stu.next();
			if (name.length() <= 2 || name.isEmpty()) {
				System.out.println("Invalid input");
			} else {
				data.setName(name);
				break;
			}
		}

		int age;
		while (true) {
			System.out.println("Enter student age : ");
			age = stu.nextInt();
			if (age < 0) {
				System.out.println("Invalid input");
			} else {
				data.setAge(age);
				break;
			}
		}

			String dateOfBirth;
			while (true) {
				System.out.println("Enter student DOB : ");
				dateOfBirth = stu.next();
				if (dateOfBirth.length() < 2 || dateOfBirth.isEmpty()) {
					System.out.println("Invalid input ");
				} else {
					data.setDateOfBirth(dateOfBirth);
					break;
				}
			}

			String rollNum ;
			while (true) {
				System.out.println("Enter student Roll no : ");
				rollNum = stu.next();
				if (rollNum.length() < 2 || rollNum.isEmpty()) {
					System.out.println("Invalid input ");
				} else {
					data.setRollNum(rollNum);
					break;
				}
			}
				String department ;
				while (true) {
					System.out.println("Enter student Department : ");
					department = stu.next();
					if (department.length() < 2 || department.isEmpty()) {
						System.out.println("Invalid input ");
					} else {
						data.setDepartment(department);
						break;
					}
				}

				String location ;
				while (true) {
					System.out.println("Enter student Location : ");
					location = stu.next();
					if (location.length() < 2 || location.isEmpty()) {
						System.out.println("Invalid input ");
					} else
						data.setLocation(location);
					break;
				}
				
				System.out.println(data.name);
				System.out.println(data.rollNum);
				System.out.println(data.department);

			}
		}
	