package stream.exercise.practise;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import stream.create.primitive.Employee;
import stream.create.primitive.StreamGetListOfEmployees;
/**
 * Used Command:
 * 1.)  filter
 * 2.)  collect
 * 3.)  map
 * 4.)  count
 * 5.)  forEach
 * 6.)  Optional
 * 7.)  findAny
 * 8.)  max
 * 9.)  OptionalInt
 * 10.) mapToInt
 * 
 * @author PKumar14
 *
 */
public class Ex1234 {

	public static void main(String[] args) {
		/**Exercise 1
		* 
		* Given a list of employees, you need to find all the employees
		*  whose age is greater than 30 and print the employee names.(Java 8 APIs only).
		*/
		List<Employee> employeesList = StreamGetListOfEmployees.getListOfEmployees();
		List<Employee> filterEmpList = employeesList.stream()
										.filter((e1)-> e1.getAge()>30)
										.collect(Collectors.toList());
		filterEmpList.forEach(System.out::println);
		//or Solution
		List<String> employeeFilteredList = employeesList.stream()
                .filter(e->e.getAge()>30)
                .map(Employee::getName)//is used to convert Stream<T> to Stream<R>
                .collect(Collectors.toList());
		System.out.println(employeeFilteredList);
		
		/**
		 * Exercise 2
		 * Given the list of employees, find the count of employees with age greater than 25?
		 */
		long countEmp = employeesList.stream()
				.filter((e1)-> e1.getAge()>25)
				.count();
		System.out.println("Total Employees whose age greater than 25 is :"+countEmp);
		/**
		 * Exercise 3
		 * Given the list of employees, find the employee whose name is John.
		 */
		List<Employee> filterList = employeesList.stream()
									.filter((e1)-> e1.getName().equals("John"))
									.collect(Collectors.toList());
		filterList.forEach(System.out::println);
		
		//Solution
		
		Optional<Employee> e1 = employeesList.stream()
				.filter(e->e.getName().equalsIgnoreCase("John"))
		                                          .findAny();
		         
		if(e1.isPresent())
		      System.out.println(e1.get());
		
		/**
		 * Exercise 4
		 * Given a list of employees, You need to find highest age of employee?
		 */
		Optional<Employee> emp=employeesList.stream()
		.max(Comparator.comparing(Employee::getAge));
		if(emp.isPresent())
			System.out.println("max age is : "+emp.get().getAge()+" for the person name:"+emp.get().getName());
		
		//or Solution
		OptionalInt max = employeesList.stream()
                .mapToInt(Employee::getAge)
                .max();

		if(max.isPresent())
			System.out.println("Maximum age of Employee: "+max.getAsInt());
		
	}

}
