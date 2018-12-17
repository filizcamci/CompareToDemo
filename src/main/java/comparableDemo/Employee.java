package comparableDemo;

public class Employee implements Comparable<Employee>{
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
//		if (age != other.age)			//since age and id are not in out compareto method we do not need here also
//			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
//		if (id != other.id)
//			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}
private String firstname;
private String lastname;
private int age;
private int id;

public Employee(String firstname, String lastname, int age, int id) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.age = age;
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public int compareTo(Employee e) {
	//compare by id
	//return this.getId()-e.getId();
	//compare by lastname
	int last=this.getLastname().compareTo(e.getLastname());
	return last==0?this.getFirstname().compareTo(e.getFirstname()):last;
}
}
