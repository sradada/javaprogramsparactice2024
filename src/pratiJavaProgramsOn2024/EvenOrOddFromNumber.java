package pratiJavaProgramsOn2024;

public class EvenOrOddFromNumber {
public static void main(String[]args) {
	int number=2356789;
	System.out.println(number);
	while(number>0) {
		int digit=number%10;
		if(digit%2==0) {
			System.out.println(digit +"is even");
		}
		else {
			System.out.println(digit +"is odd");
		}
		number=number/10;
		
			
	}
}

}
