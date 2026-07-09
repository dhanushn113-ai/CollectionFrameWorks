package arrayList;
import java.util.*;

public class AddingElementsToArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList al = new ArrayList();
		
		for(int i = 0; i < n; i++) {
			int elements = sc.nextInt();
			al.add(elements);
		}
		System.out.println("Size: " + al.size());
		System.out.print("Elements are:");
		for(Object x:al) {
			System.out.print(x+" ");
		}
		
	}

}
