package arrays;
import java.util.Scanner;

public class AddElements {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int[] a = new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("\nafter entering the elements");
		for(int i:a) {
			System.out.println(i);
		}

	}
}
