package arrayList;

//compareTo

class Student1 implements Comparable<Student1>{
	
	int roll;
	String name;
	double marks;
	
	
	Student1(int roll, String name, double marks){
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public String toString() {
		return roll + " " + name + " " + marks;
	}
	@Override
	public int compareTo(Student1 obj) {
		if(this.roll > obj.roll) {
			return 1;
		}else if(this.roll < obj.roll) {
			return -1;
		}else {
			return 0;
		}
	}

}

