package arrayList;
import java.util.Comparator;

class SortingHelper implements Comparator<Student2> {
	@Override
	public int compare(Student2 obj1, Student2 obj2) {
		return obj1.roll - obj2.roll;
	}

}
