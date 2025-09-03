package projects;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		// taking input from user
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value (numbers should be +ve): ");
		String input = scn.next();
		
		// checking if it is Palindrome
		boolean result = false;
		int lastPosition = input.length();
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == input.charAt(lastPosition-1)) {
				result = true;
			} else {
				result = false;
				break; // if result is false at least one time, then it is not a Palindrome
			}
			
			lastPosition--;
		}
		
		// print the result
		System.out.println(
				result?
				"Yes, \"" + input + "\" is Palindrome.":
				"No, \"" + input + "\" is not Palindrome"
		);
		
		scn.close();
	}
}
