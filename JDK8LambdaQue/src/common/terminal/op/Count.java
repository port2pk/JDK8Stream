package common.terminal.op;

import java.util.List;

import stream.create.primitive.Employee;
import stream.create.primitive.StreamGetListOfEmployees;

/**
 * count
*count() is used to count number of elements in the stream.
 * @author PKumar14
 *
 */
public class Count {

	public static void main(String[] args) {
	
		List<Employee> employeeList = StreamGetListOfEmployees.getListOfEmployees();
		long empCountStartJ = employeeList.stream()
                .map(Employee::getName)
                .filter(s -> s.startsWith("J"))
                .count();
		System.out.println(empCountStartJ);

//Output
//1
	}

}
