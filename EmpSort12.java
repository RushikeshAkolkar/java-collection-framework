import java.util.*;
import java.util.Set;

class String12 implements Comparator<Employee12>{
public int compare(Employee12 a,Employee12 b){
		Employee12 a1=(Employee12)a;
		Employee12 a2=(Employee12)b;
		int a3=a1.id;
		int b3=a2.id;
		
		String aa=String.valueOf(a3);
		String bb=String.valueOf(b3);

		return bb.compareTo(aa);
		}
}

public class EmpSort12 {

	public static void main(String[] args) {
		Set<Employee12> le=new TreeSet<Employee12>(new String12());
		le.add(new Employee12(11,"Rushikesh",156.556f));
		le.add(new Employee12(9,"Ram",5655.556f));
		le.add(new Employee12(15,"Rameshwar",15656.556f));
		le.add(new Employee12(15,"Rameshwar",15656.556f));
		le.add(new Employee12(1,"Ramakant",86555.556f));
		le.add(new Employee12(4,"Rushab",155f));
		le.add(new Employee12(9,"Rohan",789f));
		le.add(new Employee12(1,"Rupali",565f));
		System.out.println(le);

	}

}