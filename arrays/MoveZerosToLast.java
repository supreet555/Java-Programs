package arrays;

public class MoveZerosToLast {
	public static void main(String[] args) {

		int[] a = {15, 0, 26,0, 0, 73, 0, 45, 0, 82};
		int count = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] != 0) {
				a[count] = a[i];
				count++;
			}
		}
		
		while(count < a.length) {
			a[count] = 0;
			count++;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
