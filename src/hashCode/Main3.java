package hashCode;
import java.util.*;

public class Main3 {

	public static void main(String[] args) {
		Student3 s1 = new Student3(11,"Arjun");
		Student3 s2 = new Student3(12,"Ravi");
		Student3 s3 = new Student3(11,"Arjun");
		
		HashSet hs = new HashSet();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		
		System.out.println(hs);
		
		

	}

}
