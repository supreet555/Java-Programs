package arrays;
import java.util.Arrays;

public class SimpleMedianOfTwoArrays {
	public static void main(String[] args) {
		int[] a = {1, 4, 2, 5};
		int[] b = {9, 7, 8, 10};
		Arrays.sort(a);
		Arrays.sort(b);
		
		int[] c = new int[a.length+b.length];
		for(int i=0; i<c.length; i++) {
			if(i<a.length) {
				c[i]=a[i];
			} else {
				c[i]=b[i-a.length];
			}
		}
		Arrays.sort(c);
		for(int d:c) {
			System.out.println(d);
		}
		
		if(c.length%2 != 0) {
			System.out.println(c[a.length/2]);
		} else {
			double median = (c[c.length/2] + c[(c.length/2)-1]) / 2;
			System.out.println(median);
		}
	}
}
