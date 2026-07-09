package arrayList;

class Student3 {
	int roll;
	String name;
	double marks;
	
	
	Student3(int roll, String name, double marks){
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public String toString() {
		return roll + " " + name + " " + marks;
	}
}
