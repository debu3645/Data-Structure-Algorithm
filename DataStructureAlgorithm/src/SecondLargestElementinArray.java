//Given an array A of size N, print second largest element from an array.
//https://practice.geeksforgeeks.org/problems/second-largest/0

public class SecondLargestElementinArray {

	public static void main(String[] args) {

		Integer[] inp = { 3, 43, 67, 2, 85, 50, 70, 65, 90, 10 };

		Integer[] out = new Integer[inp.length];
		int indx = 1;
		// int fst;
		int arraylength = inp.length;
		int backup;
		for (int i = 0; i < inp.length; i++) {

			// fst = inp[i];
			out[i] = inp[i];

			for (int k = indx; k < arraylength; k++) {

				if (inp[k] > inp[i]) {
					backup = inp[i];
					out[i] = inp[k];
					inp[i] = inp[k];
					inp[k] = backup;

				}

				// k+=1;

			}

			// arraylength -=1;
			indx += 1;
			// out[i] = inp[i];

		}

		for (int j = 0; j < out.length; j++) {
			System.out.println(out[j]);
		}

		System.out.println("*******************");
		System.out.println("The second largest element is: " + out[1]);
		System.out.println("*******************");
	}

}
