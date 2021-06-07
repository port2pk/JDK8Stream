package stream.exercise.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMoreThanOneField {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("A",32));
		list.add(new Person("A",23));
		list.add(new Person("B",23));
		
		Comparator<Person> personByName=Comparator.comparing(Person::getName);
		Comparator<Person> personByAge=Comparator.comparing(Person::getAge);
		Comparator<Person> multiComparing = personByName.thenComparing(personByAge);
		
		Collections.sort(list, multiComparing);
		
		for(Person p:list){
			System.out.println("Name : "+p.getName()+" - "+" Age : "+p.getAge());
		}
		
		
	}

}

class Person{
	
	public String name;
	
	public int age;
	
	Person(){}
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
