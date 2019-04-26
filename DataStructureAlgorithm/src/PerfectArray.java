//Given an array of size N and you have to tell whether the array is perfect or not. 
//An array is said to be perfect if it's reverse array matches the original array. 
//If the array is perfect then print "PERFECT" else print "NOT PERFECT".

//https://practice.geeksforgeeks.org/problems/perfect-arrays/0

public class PerfectArray {

	public static void main(String[] args) {

		// Integer[] inp = {10, 20, 30, 40, 50, 60, 50, 40, 30, 20, 10};
		Integer[] inp = { 10, 10, 10, 10 };

		int j = inp.length - 1;
		String prfct = "";
		for (int i = 0; i < inp.length; i++) {

			if (inp[i] != inp[j]) {
				System.out.println("Not Perfect");
				System.out.println("Suspected element: " + inp[i] + " : " + inp[j]);
				prfct = "false";
				break;
			} else {
				prfct = "true";
			}
			j--;
		}
		if (prfct == "true") {
			System.out.println("Perfect Array");
		}
	}

}
