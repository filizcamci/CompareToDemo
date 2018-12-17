package comparableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.github.javafaker.Faker;

public class EmployeeDriver {
public static void main(String[] args) {
	List<Employee> employees=new ArrayList();
	Faker faker=new Faker();
	
	for(int i=0; i<5; i++) {
		employees.add(new Employee(faker.name().firstName(),
								faker.name().lastName(),
								faker.number().numberBetween(20, 90),
								faker.number().numberBetween(1000, 1100)));
	      
	      
	}
	employees.get(0).setLastname(employees.get(1).getLastname());
	for(Employee e:employees) {
		System.out.println(e.getId()+"\t"+e.getLastname()+", "+e.getFirstname()+"\t"+e.getAge());
	}
	Collections.sort(employees); 
	System.out.println("---------------");
	for(Employee e:employees) {
		System.out.println(e.getId()+"\t"+e.getLastname()+", "+e.getFirstname()+"\t"+e.getAge());
	}
}
}
