package practiceDay3;

import java.util.*;

public class EvenOrOddFromNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		System.out.println("Entered number is " + number);
		while (number > 0) {
			int digit = number % 10;// this will give last digit from the number
			System.out.println("Digit is " + digit);
			if (digit % 2 == 0) {
				System.out.println(digit + " is even");
			}
			number = number / 10;
		}

	}

}
