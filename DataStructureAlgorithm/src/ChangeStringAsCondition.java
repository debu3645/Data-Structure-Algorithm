//Given a string S, the task is to change the string according to the condition; 
//If the first letter in a string is capital letter then change the full string to 
//capital letters, else change the full string to small letters.
//https://practice.geeksforgeeks.org/problems/change-the-string/0
public class ChangeStringAsCondition {

	public static void main(String[] args) {

		char chr = 'a';
		System.out.println(chr + " : " + (int) chr);
		System.out.println((char) ((int) chr - 32));
		String inp = "hello...My Name is Debashish Pattnaik";

		char[] out = inp.toCharArray();

		if (((int) out[0] >= 65) && ((int) out[0] <= 90)) {

			System.out.println(out[0] + " : " + (int) out[0]);
			System.out.println("First letter is capital");

			for (int i = 1; i < out.length; i++) {
				if (((int) out[i] >= 97) && ((int) out[i] <= 122)) {
					out[i] = (char) ((int) out[i] - 32);
				}
			}

		} else {
			System.out.println("First letter is lower letter");
			for (int j = 1; j < out.length; j++) {
				if (((int) out[j] >= 65) && ((int) out[j] <= 90)) {
					out[j] = (char) ((int) out[j] + 32);
				}
			}

		}
		System.out.println(String.valueOf(out));

	}

}
