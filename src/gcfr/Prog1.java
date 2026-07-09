package gcfr;

public class Prog1 {

	public static void main(String[] args) {

			String s = "hello world";

			System.out.println(s);

			s = null;

			//System.out.println(s);

			System.gc();//

			System.out.println(s);

	}

}
