//Given a string, remove the vowels from the string and print the string without vowels.
//https://practice.geeksforgeeks.org/problems/remove-vowels-from-string/0
public class RemoveVowelsString {

	public static void main(String[] args) {

		String inp = "My name is Debashish Pattnaik";
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		char[] out = inp.toCharArray();
		for (int i = 0; i < out.length; i++) {

			for (int j = 0; j < vowels.length; j++) {
				if (out[i] == vowels[j]) {
					out[i] = ' ';

				}
			}

		}

		System.out.println(String.valueOf(out));
	}

}
