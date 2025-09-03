package arrays;

public class CountOccurances {
	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int target = 2;
		int count = 0;
		
		for(int i=0; i<nums.length; i++) {
			if(target == nums[i]) {
				count++;
			}
		}

		System.out.println("Count of " + target + " is " + count);
	}
}
