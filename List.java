import java.util.*;
class List{
	public static void main(String[] args) {
		Comparator<Integer> com = new Comparator<>(){
		public int compare(Integer a,Integer b){
		return b.compareTo(a);
		}
		};
		ArrayList<Integer> al=new ArrayList<>();
		TreeSet ts=new TreeSet(com);
		ts.add(23);
		ts.add(2);
		ts.add(20);
		ts.add(27);
		ts.add(26);
		ts.add(27);
		ts.add(25);
		ts.add(22);
		al.add(123);
		al.add(586);
		al.add(13);
		al.add(86);
		al.add(86);
		al.add(12);
		al.add(56);
		al.add(23);
		al.add(58);
		Collections.sort(al,com);
		System.out.println(al);
		System.out.println(ts);
	}
}
