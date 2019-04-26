//Given a Integer array A[] of n elements. 
//Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.

public class PalindromicArray {

	public static void main(String[] args) {

		Integer[] inp = { 444444, 11, 224, 33, 44, 666, 555 };
		int num;
		char checkchar;
		boolean PalindromicArray = true;

		for (int i = 0; i < inp.length; i++) {
			String chararr = inp[i].toString();

			// System.out.println(chararr);
			// System.out.println("***");

			for (int j = 0; j < chararr.length(); j++) {
				checkchar = chararr.charAt(0);
				// System.out.println(chararr.charAt(j));

				if (checkchar != chararr.charAt(j)) {
					PalindromicArray = false;
					System.out.println(chararr);
					System.out.println("Not Palindrome");
					break;
				}

			}

		}

		if (PalindromicArray == true) {
			System.out.println("Its a Palindrome array");
		}

	}

}
