package praticeJavaDay2;

public class SwapTwoNumbersWithoutUsingThirdVariableByCLR {
	public static void main(String[] args) {
		int number1=Integer.parseInt(args[0]);
		int number2=Integer.parseInt(args[1]);
		System.out.println("Before Swapping " +number1 +"...." +number2);
		number1 =number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("After Swapping " +number1 +"...." +number2);
	
	}

}
