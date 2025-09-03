package arrays;

public class MaxArray {
	public static void main(String[] args) {

		int[] a = {1, 3, 5, 2, 4, 3, 6, 7};
		int max = a[0];
		
		for(int i=1; i<a.length; i++) {
			boolean isMax = false;
			for(int j=0; j<a.length; j++) {
				if(a[i]>a[j]) {
					isMax=true;
				} else if(a[i]==a[j]) {
					continue;
				} else {
					isMax=false;
					break;
				}
			}
			if(isMax) {
				max = a[i];
			}
		}
		
		System.out.println(max);

	}
}
