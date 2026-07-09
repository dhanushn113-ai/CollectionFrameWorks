package PrirityQeue;
import java.util.*;
public class MaxelementatFirst {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue(Collections.reverseOrder());
		pq.add(101);
		pq.add(10);
		pq.add(125);
		pq.add(594);
		System.out.println(pq);
		
	}

}

