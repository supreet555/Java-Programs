package arrays;

public class SearchElement {
	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int target = 2;
		boolean isPresent = false;
		
		for(int i=0; i<nums.length; i++) {
			if(target==nums[i]) {
				isPresent = true;
				break;
			}		
		}
		
		System.out.println(
			isPresent ? "Element found" : "Element not found"
		);

	}
}
