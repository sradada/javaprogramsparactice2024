package practiceDay3;

import java.util.*;

public class EvenOrOdd {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner);
		System.out.println("Enter number:");
		int number = scanner.nextInt();
		System.out.println(number);
		if(number%2==0) {
			System.out.println(number + " is even");
		}
		else {
			System.out.println(number + " is odd");
		}

	}

}
