package hashCode;

import java.util.Objects;

class Student3 extends Object {
	int roll;
	String name;
	
	Student3(int roll,String name){
		this.roll = roll;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student3 s= (Student3)obj;
		if(this.roll == s.roll && this.name == s.name) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override                                 
	public int hashCode() {
		return Objects.hash(roll,name);
	}
	
	@Override
	public String toString() {
		return roll + " " + name;
	}
	
	
	
	

}
