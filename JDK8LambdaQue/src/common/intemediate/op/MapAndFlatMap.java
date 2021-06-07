package common.intemediate.op;

import java.util.List;
import java.util.stream.Collectors;

import stream.create.primitive.Employee;
import stream.create.primitive.StreamGetListOfEmployees;
/**
 * flatmap():
	map() operation generates one output for each input element.
	What if you want more than one output for each input?
	flatmap() operation is exactly used for this purpose. 
	It is used to map multiple-output for each input.
	For example:
	We want to accumulate list of cities in which all employees have lived. 
	One employee could have lived in multiple cities so that we may have more than 
	one city for each employee.
	
 * @author PKumar14
 *
 */
public class MapAndFlatMap {

	public static void main(String[] args) {
		/**
		 * Map()
		*	Map() operation is used to convert Stream<T> to Stream<R>.
		* It produces one output result of type 'R' for each input value of type 'T'. 
		* It takes Function interface as parameter.
			For example:
			You have stream of list of employees and you need a list of employee names,
			 you simply need to convert Stream<Employee> to Stream<String>.
		 */
		List<Employee> employeesList = StreamGetListOfEmployees.getListOfEmployees();
		List<String> employeeNames = employeesList.stream()
                .map(e -> e.getName())
               .collect(Collectors.toList());
		System.out.println(employeeNames);
		
		/**
		 * You can also use map even if it produces result of same type.
			* In case, you want employee name in uppercase, you can use another map()
			*  function to convert string to uppercase.
		 */
		employeeNames = employeesList.stream()
                .map(e -> e.getName())
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
		System.out.println(employeeNames);
		
		/**
		 * FLAT MAP
		 */
		List<String> listOfCities = employeesList.stream()
                .flatMap(e -> e.getListOfCities().stream())
                .collect(Collectors.toList());

		System.out.println("listOfCities: " +listOfCities);

		//Output
		//listOfCities: [Newyork, Banglore, Paris, London, Pune, Seattle, Chennai, Hyderabad]
	}

}
