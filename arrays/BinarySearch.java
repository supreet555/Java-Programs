package arrays;
import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		
		//        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
		int[] a = {1, 3, 2, 5, 4, 6, 7, 8, 9, 10};
		boolean isPresent = false;
		int element = 6;
		Arrays.sort(a);
		int low = 0;
		int high = a.length - 1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			if(element == a[mid]) {
				isPresent = true;
				break;
			} else if(element > a[mid]) {
				low = mid + 1;
			} else {
				high = mid-1;
			}
		}
		
		if(isPresent) {
			System.out.println("Element found");
		} else {
			System.out.println("Element not found");
		}

	}
}
