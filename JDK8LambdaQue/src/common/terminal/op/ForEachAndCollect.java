package common.terminal.op;

import java.util.List;
import java.util.stream.Collectors;

import stream.create.primitive.Employee;
import stream.create.primitive.StreamGetListOfEmployees;

/**
 * foreach
foreach() is terminal operation which is used to iterate over collection/stream of
 objects. It takes consumer as a parameter.
 * 
 * 
 *collect
collect() is terminal operation which performs mutable reduction on the elements of Stream using Collector. Collectors is utility class which provides inbuilt Collector.
For example:
Collectors.toList() provides a Collector which converts Stream to a list object.
Following code accumultates Employee names into a Arraylist
 */
public class ForEachAndCollect {

	public static void main(String[] args) {
		List<Employee> employeesList = StreamGetListOfEmployees.getListOfEmployees();
		employeesList.stream()
        .forEach(System.out::println);

		//Output
		//Employee [name=Mohan, age=24]
		//Employee [name=John, age=27]
		//Employee [name=Vaibhav, age=32]
		//Employee [name=Amit, age=22]
		
		List<String> employeeNames = employeesList.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
		System.out.println(employeeNames);

		//Output
		//[Mohan, John, Vaibhav, Amit]
		
	}

}
