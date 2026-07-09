package cuncurrentException;

import java.util.*;

public class Prog1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(int x:al) {
			System.out.println(x);
			al.add(99);
		}
		

	}

}
