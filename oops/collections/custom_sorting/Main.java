package com.javab5.java.oops.collections.custom_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(4, "John"));
		emp.add(new Employee(34, "Mary"));
		emp.add(new Employee(41, "Tom"));
		emp.add(new Employee(4, "Tanu"));
		emp.add(new Employee(6, "Priyanka"));

		Collections.sort(emp, new EmpIdComparator());
		emp.stream().forEach(System.out::println);

		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(4, "Jamie"));
		students.add(new Student(8, "Tom"));
		students.add(new Student(1, "Arun"));
		students.add(new Student(5, "Lavanya"));
		students.add(new Student(4, "Terry"));

		Collections.sort(students);
		students.stream().forEach(System.out::println);

	}

}

class EmpIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		if (e1.id == e2.id) {
			return 0;
		} else if (e1.id > e2.id)
			return 1;// any +ve num
		else {
			return -1;// any -ve value
		}

	}

}

class EmpNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		//TODO
		return 0;
	}

}
