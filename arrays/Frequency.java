package arrays;

public class Frequency {
	public static void main(String[] args) {
		int[] a = {1, 2, 2, 4, 5, 4, 6};
		int num = 4;
		int frequency = 0;
		
		for(int i=0; i<a.length; i++) {
			if (num == a[i]) {
				frequency++;
			}
		}
		
		System.out.println(num + " Frequency: " + frequency);
	}
}
