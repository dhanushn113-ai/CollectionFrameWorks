package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student(1,"Anbu",80.5);
		Student s2 = new Student(2,"Vijay",90.2);
		Student s3 = new Student(3,"Ajith",99.5);
		
		
		ArrayList al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s2);
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		

	}

}
