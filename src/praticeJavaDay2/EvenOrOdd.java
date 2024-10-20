package praticeJavaDay2;

import java.util.*;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Execution starts from main method");
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner);
		System.out.println("Enter Number:");
		int number = scanner.nextInt();
		System.out.println("Number is: " + number);
		if (number % 2 == 0) {
			System.out.println(number + "is even");
		} else {
			System.out.println(number + "is odd");
		}

		System.out.println("Execution ended");
	}

}
