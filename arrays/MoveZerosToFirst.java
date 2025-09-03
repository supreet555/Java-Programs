package arrays;

// Move zeros to the first position
public class MoveZerosToFirst {
	public static void main(String[] args) {

	   // dummy = {15, 0, 26, 0, 73, 0, 45, 45, 82};
		int[] a = {15, 0, 26, 0, 73, 0, 45, 0, 0, 82}; // length: 9
		int count = a.length-1;                     // count: 6
		
		for(int i=a.length-1; i>=0; i--) {          // i: 5, 5>=0
			if(a[i] != 0) {							// a[6] != 0
				a[count] = a[i];					// a[7] = a[6] = 45
				count--;                            // count = 6
			}
		}
		
		while(count >= 0) {
			a[count] = 0;
			count--;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
