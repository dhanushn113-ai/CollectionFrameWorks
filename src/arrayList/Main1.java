package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main1 {

	public static void main(String[] args) {
		Student1 s1 = new Student1(1,"Anbu",80.5);
		Student1 s2 = new Student1(3,"Vijay",90.2);
		Student1 s3 = new Student1(2,"Ajith",99.5);
		
		
		ArrayList al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		

	}

}
