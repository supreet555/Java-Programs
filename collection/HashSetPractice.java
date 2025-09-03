package collection;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
	public static void main(String[] args) {

/*
		HashSet h = new HashSet();
		h.add(10.2);
		h.add(2.6);
		h.add(8);
		h.add(8);
		h.add(6);
		h.add(4.3);
		h.add(4.3);
		h.add(3);
		h.add('c');
		h.add('c');
		h.add(9);
		h.add(10);
		
		// accessing with index not possible, no get(int index) method
		for(int i=0; i<h.size(); i++) {
			System.out.println(h.get(i));
		}
		
		// order of insertion is not maintained
		Iterator i = h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
*/
		
		// for non primitives, you need to override equals() and hashCode()
		HashSet<Emp> h = new HashSet<>();
		h.add(new Emp(1, "A", 1000));
		h.add(new Emp(2, "B", 2000));
		h.add(new Emp(1, "A", 1000));
		h.add(null);
		h.add(null);
		
		Iterator<Emp> i = h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}
}
