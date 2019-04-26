//Given a string S , write a program to check if all the characters of the string are same 
//or not.
//https://practice.geeksforgeeks.org/problems/check-string/0
public class CheckStringCharacters {

	public static void main(String[] args) {
		// String str = "Debashish";
		String str = "bbbbcbb";
		String samechar = "true";
		char[] inp = str.toCharArray();
		char fstchar = inp[0];
		for (int i = 0; i < inp.length; i++) {

			if (inp[i] != fstchar) {
				System.out.println("Characters not same: " + str);
				samechar = "false";
				break;
			} else {
				samechar = "true";
			}
		}

		if (samechar == "true") {

			System.out.println("Same character in the string: " + str);
		}

	}

}
