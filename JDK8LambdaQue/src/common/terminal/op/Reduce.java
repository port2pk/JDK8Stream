package common.terminal.op;

import java.util.List;

import stream.create.primitive.Employee;
import stream.create.primitive.StreamGetListOfEmployees;

/**
 * Reduce
*The reduce operation combines all elements of Stream and produces single result.
*Java 8 has three overloaded version of reduce method.
 * @author PKumar14
 *
 */
public class Reduce {

	public static void main(String[] args) {
		/**
		 * Optional&lt;T&gt; reduce(BinaryOperator&lt;T&gt; accumulator): 
		 * This method takes BinaryOperator accumulator function. 
		 * BinaryOperator is BiFunction where both the operands are of same type. 
		 * First parameter is result till current execution, and second parameter is
		 *  the current element of the Stream.
		 *  
		 *  Let’s find name of Person with minimum age.
		 */
		List<Employee> employeesList = StreamGetListOfEmployees.getListOfEmployees();	
		employeesList.stream()
		.reduce( (e1,e2)-> (e1.getAge() < e2.getAge()? e1:e2))
		.ifPresent(System.out::println);
		// Output
		// Employee [name=Amit, age=22]
		
		/**
		 * T reduce(T identity, BinaryOperator<T> accumulator): This method takes identity value and accumulator function. identity value is initial value of the reduction. If Stream is empty,then identity value is the result.
		* Let’s find sum of all ages of Employees
		 */
		int sumAge = employeesList.stream()
				.mapToInt(Employee::getAge)
				.reduce(0, (age1,age2)-> (age1 + age2));
				 
				System.out.println("Sum of ages of all Employees: "+sumAge);
				// Output
				// Sum of ages of all Employees: 105
		
				/**
				 * &lt;U&gt; U reduce(U identity, BiFunction&lt;U,? super T,U&gt; accumulator, BinaryOperator&lt;U&gt; combiner): This method takes identity value and accumulator function and combiner. Combiner is mainy used in case of Parallel Streams. Combiner comibnes the result of sub-stream that run in Parallel.
				 */
			
		
	}

}
