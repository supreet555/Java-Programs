package map;
import java.util.HashMap;

public class HashPractice {
	public static void main(String[] args) {
		
		HashMap<Integer, Object> h = new HashMap<>();
		h.put(1, "Smith");
		h.put(2, "Allen");
		h.put(3, "Miller");
		h.put(4, "James");
		h.put(5, "Adam");
		
//		System.out.println(h.get(5));
//		System.out.println(h.values());
//		System.out.println(h.keySet());
//		System.out.println(h.entrySet());
		
//		h.remove(1);
//		h.clear();
		System.out.println(h);

	}
}
