package arrays;
import java.util.Arrays;

public class Frequency1 {
	public static void main(String[] args) {
		       
		int[] nums = {10,10,20,10,30,20,50,40,50};
		Arrays.sort(nums);
		int previousDuplicate = 0;
		
		for(int i=0; i<nums.length; i++) { 
			if(nums[i] != previousDuplicate) { 
				int count = 1;
				for(int j = i+1; j<nums.length; j++){ 
					if (nums[i] == nums[j]) { 
						count++;
						previousDuplicate = nums[j];
					}
				}
				System.out.println(nums[i] + " is repeated " + count+ "times");
			}
		}
		
	}
}