package arrayDeque;
import java.util.*;

public class Sample {

	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		
		System.out.println(ad);
		
		ad.addFirst(60);
		System.out.println(ad);
		ad.add(70);
		System.out.println(ad);
		ad.remove();
		System.out.println(ad);
		ad.removeLast();
		System.out.println(ad);
		ad.poll();
		System.out.println(ad);
		ad.pollFirst();
		System.out.println(ad);
		ad.pollLast();
		System.out.println(ad);
		System.out.println(ad.peek());
		ad.removeLast();
		System.out.println(ad);
		ad.remove();
		System.out.println(ad);
		System.out.println(ad.poll());
		System.out.println(ad.remove());
		
		
		//if there is no element in the deque .in the case we use remove() it will return throws the exception 
		//if there is no element in the deque .in the case we use poll() it will return null
		
	}

}
