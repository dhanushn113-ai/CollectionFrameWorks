package arrayList;
import java.util.*;

public class SampleProg {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add("hi");
		al.add("hello");
		al.add('d');
		al.add(4.23);
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.size());
		System.out.println(al.contains(2));
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		System.out.println(al.set(3, "anbu"));
		System.out.println(al);
		al.addFirst(5);
		System.out.println(al);
		al.add(2, 45);
		System.out.println(al);
		al.removeFirst();
		System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		al2.add(101);
		al2.add(102);
		al2.add(103);
		System.out.println(al2);
		al.addAll(al2);
		System.out.println(al);

	}

}
