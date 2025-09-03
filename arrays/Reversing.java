package arrays;

public class Reversing {
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		int arrayLength = array.length;
		int[] reversedArray = new int[arrayLength];
		
		for(int i=0; i<array.length; i++) {
			reversedArray[i] = array[arrayLength-1];
			arrayLength--;
		}
		
		System.out.print("[");
		for(int i=0; i<reversedArray.length; i++) {
			if(i==reversedArray.length - 1) {
				System.out.print(reversedArray[i]);
			} else {
				System.out.print(reversedArray[i] + ", ");
			}
		}
		System.out.print("]");
	}
}


//6