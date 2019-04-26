//Given an array C[], write a program that prints 1 if array is sorted in non-decreasing order, else prints 0.
//https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted/0
public class CheckSortedArray {

	public static void main(String[] args) {

		Integer[] inp = { 10, 20, 30, 40, 35 };
		int fst = inp[0];
		boolean issorted = true;
		for (int i = 0; i < inp.length; i++) {

			if (fst >= inp[i]) {
				System.out.println("Array not sorted");
				issorted = false;
				break;
			}

			else if (fst < inp[i]) {
				fst = inp[i];
				issorted = true;

			}
		}
		if (issorted == true) {
			System.out.println("Array is sorted");
		}
	}

}
