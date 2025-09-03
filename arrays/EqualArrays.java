package arrays;

public class EqualArrays {
	public static void main(String[] args) {

		int[] array1 = {1, 2, 3};
		int[] array2 = {1, 2, 3};
		boolean areEqual = false;
		
		if(array1.length == array2.length) {
			for(int i=0; i<array1.length; i++) {
				if(array1[i] == array2[i]) {
					areEqual = true;
				} else {
					areEqual = false;
					break;
				}
			}
		} else {
			System.out.println("Both arrays have different length, hence not equal");
		}

		System.out.println(
			areEqual ? "Array are equal" : "Arrays are not equal"
		);
	}
}
