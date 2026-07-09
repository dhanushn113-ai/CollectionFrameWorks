package arrayList;
import java.util.*;

public class IterableInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList al = new ArrayList();
		
		for(int i = 0; i <= n-1;i++) {
			int elements = sc.nextInt();
			al.add(elements);
		}
		 Iterator itr= al.iterator();
		 System.out.print("[");
		 while(itr.hasNext()) {
			 System.out.print(itr.next());
			 if(itr.hasNext() == true) {
				 System.out.print(", ");
			 }
		 }
		 System.out.print("]");
	}
}
