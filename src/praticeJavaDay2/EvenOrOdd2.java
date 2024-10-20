package praticeJavaDay2;

public class EvenOrOdd2 {

		public static void main(String[] args) {

			// Convert the first argument (string) to an integer
			int number = Integer.parseInt(args[0]);
			System.out.println("The number is: " + number);
			  System.out.println(args.length);


			// Check if the number is even or odd
			if (number % 2 == 0) {
				System.out.println(number + " is even");  // Added space before "is"
			} else {
				System.out.println(number + " is odd");   // Added space before "is"
			}
		}
	}
