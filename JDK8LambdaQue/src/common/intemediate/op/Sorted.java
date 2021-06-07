package common.intemediate.op;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import stream.create.primitive.Employee;
import stream.create.primitive.StreamGetListOfEmployees;

/**
 * sorted()
 *You can use sorted() method to sort list of objects. 
 *sorted method without arguments sorts list in natural order. 
 *sorted() method also accepts comparator as parameter to support custom sorting.
 *
 * @author PKumar14
 *Natural order means sorting the list based on comparable interface implemented by list element type.
 *For example:
 * List<Integer> will be sorted on the basis of comparable interface implemented by
 *  Integer class.
 */
public class Sorted {

	public static void main(String[] args) {
		List<Employee> employeesList = StreamGetListOfEmployees.getListOfEmployees();
		List<Employee> employees = employeesList.stream()
                .sorted()
                .collect(Collectors.toList());
		System.out.println(employees);
		employees = null;
		//Output
		//[Employee [name=Amit, age=22], Employee [name=John, age=27], Employee [name=Mohan, age=24], Employee [name=Vaibhav, age=32]]
	
		/**
		 * Here is the sorted() method example with Comparator as a parameter.
		 */
		employees = employeesList.stream()
                .sorted((e1,e2)->e1.getAge() - e2.getAge())
                 .collect(Collectors.toList());
		System.out.println(employees);
		employees = null;
		//Output
		//[Employee [name=Amit, age=22], Employee [name=Mohan, age=24], Employee [name=John, age=27], Employee [name=Vaibhav, age=32]]
		
		/**
		 * You can also rewrite this with method reference as below:
		 */
		employees = employeesList.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .collect(Collectors.toList());
		System.out.println(employees);

		//Output
		//[Employee [name=Amit, age=22], Employee [name=Mohan, age=24], Employee [name=John, age=27], Employee [name=Vaibhav, age=32]]
	}

}
