package gcfr;

import java.util.HashMap;

import java.util.WeakHashMap;



public class Prog3 {

	public static void main(String[] args) {

        WeakHashMap<String,String> hm = new WeakHashMap();

		String key1 = new String("Key1");

		String key2 = new String("Key2");

		

		

		hm.put(key1, "Value1");

		hm.put(key2, "Value2");

		

		System.out.println(hm);//{Key2=Value2, Key1=Value1}

		

		key1 = null;

		System.gc();

		System.out.println(hm);//{Key2=Value2}



	}



}
