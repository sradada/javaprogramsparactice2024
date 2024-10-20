package pratiJavaProgramsOn2024;

public class SwapTwoNumbersWithoutThirdVariable {
	public static void main(String[] args) {
		int a=23;
		int b=89;
		System.out.println("Before Swapping " + a + " ... " +b);
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("After Swapping " + a + " ... " +b);	}

}
