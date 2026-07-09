package hashset;
import java.util.*;

public class HashSetex {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		LinkedHashSet lhs = new LinkedHashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(75);
		hs.add(125);
		hs.add(175);
		System.out.println("Hash Set:" + hs);
		
		lhs.add(100);
		lhs.add(50);
		lhs.add(150);
		lhs.add(25);
		lhs.add(75);
		lhs.add(125);
		lhs.add(175);
		
		System.out.println("Linked Hash Set" +lhs);
		
		
	

	}

}
