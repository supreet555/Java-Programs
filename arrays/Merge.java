package arrays;
import java.util.Arrays;

public class Merge {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {6, 7, 8, 9, 10};
		int[] c = new int[a.length + b.length];
		int referenceIndex = 0;

		for(int i=0; i<c.length; i++) {
			if (i <= a.length-1) {
				c[i] = a[i];
			} else {
				c[i] = b[referenceIndex];
				referenceIndex++;
			}
		}
		
		System.out.println(Arrays.toString(c));
	}
}
