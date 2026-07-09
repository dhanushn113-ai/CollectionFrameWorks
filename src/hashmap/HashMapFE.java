package hashmap;

import java.util.*;
import java.util.Map.Entry;

public class HashMapFE {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(101, "Anbu");
		hm.put(102, "Vijay");
		hm.put(103, "Ajith");
		
	
		
		System.out.println(hm);
		
		for(Entry<Integer, String> entry:hm.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

	}

}
