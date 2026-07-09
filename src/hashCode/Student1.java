package hashCode;

class Student1 extends Object {
	int roll;
	String name;
	
	Student1(int roll,String name){
		this.roll = roll;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student1 s= (Student1)obj;
		if(this.roll == s.roll && this.name == s.name) {  //if(this.roll == s.roll && this.name.equals(s.name))
			return true;
		}else {
			return false;
		}
	}
	
	void display() {
		System.out.println(roll);
		System.out.println(name);
	}
	
	

}
