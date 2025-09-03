package collection;
import java.util.ArrayList;

public class ArrayListPractice {
	public static void main(String[] args) {

		ArrayList<Integer> b = new ArrayList<>();
		b.add(10);
		b.add(20);
		
		for(int i=0; i<b.size(); i++) {
			if(b.get(i)==20) {
				b.remove(i);
			}
		}
		System.out.println(b);

	}
}
