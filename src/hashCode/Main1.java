package hashCode;

public class Main1 {

	public static void main(String[] args) {
		Student1 s1 = new Student1(11,"Arjun");
		Student1 s2 = new Student1(12,"Ravi");
		Student1 s3 = new Student1(11,"Arjun");
		
		s1.display();
		s2.display();
		s3.display();
		
		System.out.println("-----------------------");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		

	}

}
