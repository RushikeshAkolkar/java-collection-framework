import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;


public class StudSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Students> com = new Comparator<Students>(){
			
			@Override
			public int compare(Students o1, Students o2) {
				// TODO Auto-generated method stub
				String a=String.valueOf(o1.name);
				String b=String.valueOf(o2.name);
				return b.compareTo(a);
			}
		};
		Set<Students> set = new TreeSet<Students>(com);
		set.add(new Students(1, "Rushikesh", 8888440539l));
		set.add(new Students(9, "Rushikesh", 8080523893l));
		set.add(new Students(2, "Pranav1", 8989898989l));
		set.add(new Students(1, "Pranav2", 8888888888l));
		System.out.println(set);
	}
}