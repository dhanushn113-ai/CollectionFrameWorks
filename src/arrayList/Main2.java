package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main2 {

	public static void main(String[] args) {
		Student2 s1 = new Student2(1,"Anbu",80.5);
		Student2 s2 = new Student2(3,"Vijay",90.2);
		Student2 s3 = new Student2(2,"Ajith",99.5);
		
		
		ArrayList al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println(al);
		
		SortingHelper sh = new SortingHelper();
		
		Collections.sort(al,sh);
		System.out.println(al);
		

	}

}
