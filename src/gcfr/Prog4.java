package gcfr;

import java.util.HashMap;

import java.util.IdentityHashMap;



public class Prog4 {



	public static void main(String[] args) {



		String s1 = "Key";

        String s2 = "Key";



        HashMap hm = new HashMap();

        hm.put(s1,"Value1"); // Key

        hm.put(s2,"Value2");// Key



        System.out.println(hm);//{Key=Value2}

        

        

        IdentityHashMap<String, String> ihm = new IdentityHashMap();

        

        ihm.put(s1, "Val1");

        ihm.put(s2, "Val1");

        System.out.println(ihm);//{Key=Val1, Key=Val1}

        



	}



}