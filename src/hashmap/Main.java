package hashmap;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		Student s1 = new Student(11,"Anbu",80.5);
		Student s2 = new Student(12,"Vijay",90.5);
		Student s3 = new Student(13,"Ajith",85.5);
		
		hm.put(1, s1);
		hm.put(2, s2);
		hm.put(3, s3);
		
		System.out.println(hm);
		System.out.println("Key:");
		
		Set res1=hm.keySet();
		Iterator itr1 = res1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("Values: ");
		
		Collection res2 = hm.values();
		Iterator itr2 = res2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println("Key-Value:");
		
		Set res3 = hm.entrySet();
		Iterator itr3 = res3.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		
		

	}

}
