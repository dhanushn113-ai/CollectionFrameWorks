package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main3 {

	public static void main(String[] args) {
		Student3 s1 = new Student3(1,"Anbu",80.5);
		Student3 s2 = new Student3(3,"Vijay",90.2);
		Student3 s3 = new Student3(2,"Ajith",99.5);
		
		
		ArrayList al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println(al);
		
		SortingHelper sh = new SortingHelper();
		
		Collections.sort(al,new Comparator<Student3>()
				{
			        @Override
			        public int compare(Student3 obj1,Student3 obj2) 
			        {
			        	   return obj1.roll - obj2.roll;
			        }
				});
		System.out.println(al);
		

	}

}