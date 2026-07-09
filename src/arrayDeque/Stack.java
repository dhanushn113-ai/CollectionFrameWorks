package arrayDeque;
import java.util.*;

public class Stack {

	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.push(10);
		ad.push(20);;
		ad.push(30);
		
		System.out.println(ad);
		ad.pop();
		System.out.println(ad);

	}

}
