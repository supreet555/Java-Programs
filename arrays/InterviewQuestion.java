package arrays;

import java.util.Arrays;

public class InterviewQuestion {
	public static void main(String[] args) {

		int[] a = {20, 30, 60, 80, 90, 65};
		Arrays.sort(a);
		int largeDiff = a[0] - a[1];
		int first = a[0];
		int second = a[1];
		
		for(int i=1; i<a.length-1; i++) {
			if(a[i] - a[i+1] > largeDiff) {
				largeDiff = a[i] - a[i+1];
				first = a[i];
				second = a[i+1];
			}
		}
		
		System.out.println(first+" and "+second+" is giving the largest difference "+largeDiff);
	}
}
