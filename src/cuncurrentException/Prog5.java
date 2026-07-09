package cuncurrentException;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;


public class Prog5 {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		
		for(int x:al) {
			System.out.print(x + " ");
			al.add(99);
		}
		System.out.println();
		System.out.println(al);
	}
}
