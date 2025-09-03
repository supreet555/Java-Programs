package arrays;

public class MergeArrays {
	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4, 5};
		int[] b = {6, 7, 8, 9, 10};
		int[] c = new int[a.length + b.length];
		
		// multiple for loops
		for(int i=0; i<a.length; i++) {
			c[i] = a[i];
		}
		
		for(int i=0; i<b.length; i++) {
			c[i+a.length] = b[i];
		}
		
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
		
		// only one for loop
		for(int i=0; i<c.length; i++) {
			if(i<a.length) {
				c[i] = a[i];
			} else {
				c[i] = b[i - a.length];
			}
			System.out.println(c[i]);
		}

	}
}
