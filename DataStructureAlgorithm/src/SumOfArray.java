//Given an integer array A of size N, find sum of elements in it.
//
//https://practice.geeksforgeeks.org/problems/sum-of-array-elements/0

public class SumOfArray {

	public static void main(String[] args) {
		Integer[] inp = { 10, 20, 30, 40, 50 };
		int totsum = 0;

		for (int i = 0; i < inp.length; i++) {
			totsum += inp[i];
		}

		System.out.println("The sum of array is: " + totsum);

	}

}
