package common.intemediate.op;

import java.util.List;
import java.util.stream.Collectors;

import stream.create.primitive.Employee;
import stream.create.primitive.StreamGetListOfEmployees;

/**
 * limit():
	*You can use limit() to limit the number of elements in the stream.
	*For example:
	*limit(3) returns first 3 elements in the list.
	*
 * @author PKumar14
 * 
 * Skip():
*skip(int n) method is used to discard first n elements from the stream.
*For example:
*skip(3) discards first 3 elements from stream.
 */
public class LimitAndSkip {

	public static void main(String[] args) {
		List<Employee> employeesList = StreamGetListOfEmployees.getListOfEmployees();
		List<Employee> employees = employeesList.stream()
                .limit(3)
             .collect(Collectors.toList());
		System.out.println(employees);
		employees = null;

		//Output
		//[Employee [name=Mohan, age=24], Employee [name=John, age=27], Employee [name=Vaibhav, age=32]]
		
		employees = employeesList.stream()
                .skip(3)
             .collect(Collectors.toList());
		System.out.println(employees);

		//Output
		//[Employee [name=Amit, age=22]]
	
	}

}
