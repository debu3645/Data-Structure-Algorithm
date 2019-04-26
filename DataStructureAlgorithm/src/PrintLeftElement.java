//Given a array of length N, at each step it is reduced by 1 element. 
//In the first step the maximum element would be removed, 
//while in the second step minimum element of the remaining array would be removed, 
//in the third step again the maximum and so on. Continue this till the array contains 
//only 1 element. And print that final element remaining in the array.

//https://practice.geeksforgeeks.org/problems/print-the-left-element/0
public class PrintLeftElement {

	public static void main(String[] args) {

		// Integer[] inp = { 11, 23, 10, 29, 34, 5, 7, 31, 4, 14 };
		// Integer[] inp = { 100, 200, 1, 11, 23, 10, 29, 34, 5, 7, 31, 4, 14,6,9, 8,
		// 12, 13, 47,57,67,150,90,300, 2, 27,15 };
		Integer[] inp = { 11, 23, 10, 29, 34, 5, 7, 31, 4 };
		int out;
		int indx = 0;
		String maxormin = "max";
		int fst = inp[0];
		for (int j = 0; j < inp.length; j++) {

			for (int i = 0; i < inp.length; i++) {
				// indx =i;
				if (inp[i] != 555) {

					if (maxormin == "max") {

						if (inp[i] > fst) {
							fst = inp[i];
							indx = i;
							// System.out.println("max---> "+ inp[i]);

						}

					} else {
						if (inp[i] < fst) {
							fst = inp[i];
							indx = i;
							// System.out.println("min---> "+ inp[i]);

						}
					}

				}

			}

			inp[indx] = 555;

			if (maxormin == "max") {
				maxormin = "min";
			} else {
				maxormin = "max";
			}

		}
		System.out.println("Output: " + fst);

	}

}
