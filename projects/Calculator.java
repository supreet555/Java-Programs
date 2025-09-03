package projects;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		// first number
		System.out.print("Enter first number: ");
		int num1 = scn.nextInt();
		
		// operator
		System.out.print("Enter operator (+, -, *, /): ");
		String operator = scn.next();
		
		// second number
		System.out.print(
			operator.equals("/")?
			"Enter second number (0 not allowd): ":
			"Enter second number: "
		);
		int num2 = scn.nextInt();
		
		// handling division by zero
		while (operator.equals("/") && num2==0) {
			System.out.print("Enter other than 0: ");
			num2 = scn.nextInt();
		}
		
		// operation
		switch(operator) {
			case "+":
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
				
			case "-":
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
				
			case "*":
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
				
			case "/":
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				break;
		}
		
		scn.close();
	}

}
