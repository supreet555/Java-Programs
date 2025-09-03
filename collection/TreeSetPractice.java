package collection;
import java.util.TreeSet;

public class TreeSetPractice {
	public static void main(String[] args) {

		TreeSet<Emp> t = new TreeSet<>();
		t.add(new Emp(1, "A", 1000));
		t.add(new Emp(2, "B", 2000));
		
		for(Object obj : t) {
			System.out.println(obj);
		}

	}
}
