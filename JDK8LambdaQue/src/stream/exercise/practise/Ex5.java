package stream.exercise.practise;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import stream.create.primitive.Employee;
import stream.create.primitive.StreamGetListOfEmployees;

public class Ex5 {

	public static void main(String[] args) {
		List<Employee> employeesList = StreamGetListOfEmployees.getListOfEmployees();
		/**
		 * Excercise 5
		 * Given a list of employees, you need sort employee list by age? Use java 8 APIs only
		 */
		List<Employee> sortedEmpByAge = employeesList.stream()
				.sorted(Comparator.comparing(Employee::getAge))
				.collect(Collectors.toList());
		//or
		IntStream sortedAge = employeesList.stream()
		.mapToInt(Employee::getAge)
		.sorted();
		
		System.out.println("Sorted Employees By Age :");
		sortedEmpByAge.forEach(System.out::println);
		
		System.out.println("Sorted Employees Age :");
		sortedAge.forEach(System.out::println);
		/**
		 * 
		 */
	}

}
