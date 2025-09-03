package arrays;

public class RemovingDuplicates {
	public static void main(String[] args) {

		int[] array = {1, 1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 9};
        int[] uniqueArray = new int[array.length];
        uniqueArray[0] = array[0];
        int uniqueCount = 1; // Start with 1 unique element

        for (int i = 1; i < array.length; i++) { // Start from the second element of the original array
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) { // Compare with the unique elements found so far
                if (array[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        System.out.print("[");
        for (int i = 0; i < uniqueCount; i++) { // Only print up to the number of unique elements
            if (i == uniqueCount - 1) {
                System.out.print(uniqueArray[i]);
            } else {
                System.out.print(uniqueArray[i] + ", ");
            }
        }
        System.out.print("]");
		
			
			
		//int[] uniqueArray = 

	}
}
