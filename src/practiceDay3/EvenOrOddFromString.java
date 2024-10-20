package practiceDay3;

public class EvenOrOddFromString {
	public static void main(String args[]) {
		String s="1234";
		for(int i=0;i<s.length();i++) {
			
            int digit = Character.getNumericValue(s.charAt(i));
		if(digit%2==0) {
			System.out.println(digit + "is even");
		}
	}
}

}
