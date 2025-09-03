package arrays;

public class NthSmallest {
	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4, 5, 6, 7};
		int n=5;
		
		for(int i=0; i<a.length; i++) {
			int count = 1;
			for(int j=0; j<a.length; j++) {
				if(a[i]>a[j]) {
					count++;
				}
			}
			
			if(count == n) {
				System.out.println(n+"th smallest element is "+a[i]);
			}
		}

	}
}
