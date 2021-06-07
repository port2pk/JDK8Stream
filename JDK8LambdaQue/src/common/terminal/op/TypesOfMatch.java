package common.terminal.op;

import java.util.List;

import stream.create.primitive.Employee;
import stream.create.primitive.StreamGetListOfEmployees;
/**
 * Match Types:
 * 1.) allMatch().
 * 2.) nonMatch().
 * 3.) anyMatch().
 * 4.) 
 * @author PKumar14
 *
 */
public class TypesOfMatch {

	public static void main(String[] args) {
		/**
		 * allMatch()
		 * allMatch() returns true when all the elements in the stream meet provided condition.
		*  This is a short-circuiting terminal operation because operation stops as soon as
		*  it encounters any unmatched element.
		 */
		
		List<Employee> employeesList = StreamGetListOfEmployees.getListOfEmployees();
		boolean allMatch = employeesList.stream()
                .allMatch(e ->e.getAge()>18);

		System.out.println("Are all the employess adult: " +allMatch);
		
		/**
		 * nonMatch()
		 * nonMatch() returns true when all the elements in the stream do not meet provided condition.
		 * This is a short-circuiting terminal operation because operation stops as soon as it encounters any matched element.
		 */
		
		boolean noneMatch = employeesList.stream()
                .noneMatch(e ->e.getAge()>60);

		System.out.println("Are all the employess below 60: " +noneMatch);

		//Output
		//Are all the employess below 60: true
		
		/**
		 * anyMatch()
		 * it returns true when any element in the stream meets provided condition.
		 * This is a short-circuiting terminal operation because operation stops as soon as
		 *  it encounters any matched element.
		 */
		boolean anyMatch = employeesList.stream()
                .anyMatch(e ->e.getAge()>30);

		System.out.println("is any employee's age greater than 30: " +anyMatch);

		//Output
		//is any employee's age greater than 30: true
		
		
	}

}
