package assignment1;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);//scanner open
		System.out.println("Enter number1: ");
		int a = input.nextInt();
		System.out.println("Enter number2: ");
		int b = input.nextInt();
		int sum = a + b;
		System.out.println("Sum of a and b is: " + sum);
		
		
		input.close();//scanner close

	}

}
