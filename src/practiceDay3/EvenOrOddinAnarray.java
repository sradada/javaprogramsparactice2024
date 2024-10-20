package practiceDay3;

public class EvenOrOddinAnarray {
	public static void main(String args[]) {
		int[] arr;
		arr = new int[] { 1, 5, 9, 7, 10 };
		System.out.println(arr);
		int lengthOfArray = arr.length;
		for (int i = 0; i < lengthOfArray; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + " is even");
			} else {
				System.out.println(arr[i] + " is odd");
			}
		}
	}

}
