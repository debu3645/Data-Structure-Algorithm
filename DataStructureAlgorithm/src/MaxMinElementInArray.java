//Given an array A[ ], find maximum and minimum elements from the array.
//https://practice.geeksforgeeks.org/problems/maximum-and-minimum-of-array-elements/0
public class MaxMinElementInArray {

	public static void main(String[] args) {

		Integer[] inp = { 10, 4, 20, 3, 7, 15, 45, 30, 11, 18, 1, 99, 21, 3 };
		int min = inp[0];
		int max = inp[0];

		for (int i = 0; i < inp.length; i++) {
			if (min > inp[i]) {
				min = inp[i];
			}

			else if (max < inp[i]) {
				max = inp[i];
			}
		}

		System.out.println("Max Value: " + max);
		System.out.println("Min Value: " + min);
	}

}
