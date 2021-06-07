package stream.create.primitive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamGetListOfEmployees {

	public static void main(String[] args) {
		List<Employee> employeesList=getListOfEmployees();
	}
	
	public static List<Employee> getListOfEmployees(){
		List<Employee> listOfEmployees = new ArrayList<>();
		 
        Employee e1 = new Employee("Mohan", 24,Arrays.asList("Newyork","Banglore"));
        Employee e2 = new Employee("John", 27,Arrays.asList("Paris","London"));
        Employee e3 = new Employee("Vaibhav", 32,Arrays.asList("Pune","Seattle"));
        Employee e4 = new Employee("Amit", 22,Arrays.asList("Chennai","Hyderabad"));
 
        listOfEmployees.add(e1);
        listOfEmployees.add(e2);
        listOfEmployees.add(e3);
        listOfEmployees.add(e4);
 
        return listOfEmployees;
	}

}
