package arrays;

import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		int[] a = {10, 30, 20, 40, 50, 33};
		TreeMap<Integer, Integer> t = new TreeMap<>();
		for(int i=0; i<a.length; i++) {
			int count=0;
			for(int j=0; j<a.length; j++) {
				if(a[i]>a[j]) {
					count++;
				}
			}
			t.put(count, a[i]);
		}
		
		System.out.println(t.values());
		
	}
}
