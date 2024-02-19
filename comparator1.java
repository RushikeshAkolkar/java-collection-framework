/*
        Treeset Automatically Doing Default Natural Ordering. It Means Asending Order.
        If You Want to do Decending Order Then go for Comparator interface
*/import java.util.*;
class String12 implements Comparator{
    public int compare(Object a,Object b)
    {
        String s1,s2;
        s1=(String)a;
        s2=(String)b;
        return s1.compareTo(s2);
        }
    }
    class comparator1{
        public static void main(String args[]){
            TreeSet ts = new TreeSet(new String12());
            ts.add("z");
            ts.add("B");
            ts.add("x");
            ts.add("D");
            ts.add("w");
            ts.add("F");
            ts.add("v");
            Iterator itr=ts.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next()+"");
            }
    }
}