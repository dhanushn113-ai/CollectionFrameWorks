package sets;
import java.util.*;

public class Treeset {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(200);
		ts.add(10);
		ts.add(150);
		ts.add(100);
		ts.add(1);
		ts.add(10);
		System.out.println(ts);
		
		System.out.println(ts.headSet(100));
		System.out.println(ts.headSet(100,true));
		System.out.println(ts.tailSet(100));
		System.out.println(ts.tailSet(100,false));
		
		System.out.println(ts.higher(100));
		System.out.println(ts.higher(80));
		System.out.println(ts.higher(1000));
		
		System.out.println(ts.lower(100));
		System.out.println(ts.lower(170));
		System.out.println(ts.lower(1));
		
		System.out.println(ts.ceiling(100));
		System.out.println(ts.ceiling(1));
		System.out.println(ts.ceiling(80));
		
		System.out.println(ts.floor(100));
		System.out.println(ts.floor(1));
		System.out.println(ts.floor(4));
		
		System.out.println(ts.first());
	   
		
		
		

	}

}

//it will store the data in ascending order
//duplicates are not allowed
//TreeSet -RBBBST -red black balances binary search treee