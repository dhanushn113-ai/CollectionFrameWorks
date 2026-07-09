package arrayDeque;
import java.util.*;

public class AscemdingOrder {

	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(100);
		ad.add(20);
		ad.add(10);
		ad.add(30);
		ad.add(200);
		System.out.println("Array Elements: " +ad);
		
		
		TreeSet ts = new TreeSet();
		ts.addAll(ad);
		System.out.println("Elements in Asceding Order : " + ts);
		

	}

}
