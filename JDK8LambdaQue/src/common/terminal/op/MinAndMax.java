package common.terminal.op;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import stream.create.primitive.Employee;
import stream.create.primitive.StreamGetListOfEmployees;

/**
 * min()
 * min(Comparator) returns minimum element in the stream based on the provided comparator.
 * It returns an object which contains actual value.
 * 
 * 
 * max()
 * max(Comparator) returns maximum element in the stream based on the provided comparator.
 * It returns an object which contains actual value.
 *
 */
public class MinAndMax {

	public static void main(String[] args) {
		
		List<Employee> employeesList = StreamGetListOfEmployees.getListOfEmployees();
		//MIN & MAX
		Optional<Employee> minEmpOpt = employeesList.stream()
                .min(Comparator.comparing(Employee::getAge));
		//or
		Optional<Employee> maxEmpOpt = employeesList.stream()
                .max(Comparator.comparing(Employee::getAge));

		Employee minAgeEmp = minEmpOpt.get();
		Employee maxAgeEmp = maxEmpOpt.get();
		
		System.out.println("Employee with minimum age is: " +minAgeEmp);
		System.out.println("Employee with maxium age is: " +maxAgeEmp);

		//Output
		//Employee with minimum age is: Employee [name=Amit, age=22]
		//Employee with maxium age is: Employee [name=Vaibhav, age=32]
		
		
	}

}
