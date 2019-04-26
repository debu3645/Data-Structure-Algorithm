//Remove all characters from an alphanumeric string.
//https://practice.geeksforgeeks.org/problems/remove-characters-from-alphanumeric-string/0
public class RemoveCharFromAlphanumerics {

	public static void main(String[] args) {

		String inp = "01239Debashish123Pattn456aik";

		char[] out = inp.toCharArray();

		int totint = 0;

		for (int i = 0; i < out.length; i++) {
			System.out.println(out[i] + " : " + (int) out[i]);
			if ((int) out[i] >= 65 && (int) out[i] <= 122) {
				out[i] = ' ';
			} else {
				totint += 1;
			}

		}

		System.out.println(String.valueOf(out));
		System.out.println(String.valueOf("Length: " + out.length));

		for (int c = 0; c < out.length; c++) {

			System.out.println(out[c] + " : " + (int) out[c]);

			if ((int) out[c] == 32) {
				System.out.println("Its Blank");
				out[c] = '\'';
			}

		}

		System.out.println(String.valueOf(out));

		System.out.println("**********");
		System.out.println("**********");
		char[] whitespace = new char[totint];
		int t = 0;
		for (int d = 0; d < out.length; d++) {

			int fst = 32;

			if ((int) out[d] >= 48 && (int) out[d] <= 57) {

				System.out.println(out[d]);
				whitespace[t] = out[d];
				t += 1;

			}

		}

		System.out.println("**********");
		System.out.println("**********");

		System.out.println("The String is: " + String.valueOf(whitespace));

	}
}
