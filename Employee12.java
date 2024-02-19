import java.util.Objects;
import java.util.*;

public class Employee12{
	
	int id;
	String name;
	float salary;
	


	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee12 other = (Employee12) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Employee12 [id=" + id + ", name=" + name + ", salary=" + salary + "]\n";
	}

	public Employee12(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	

}
