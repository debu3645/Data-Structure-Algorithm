//Given an array of distinct elements. Your task is to find the third/n-th largest element in it. 
//You have to complete the function thirdLargest which takes two argument. 
//The first argument is the array a[] and the second argument is the size of the array (n). 
//The function returns an integer denoting the third largest element in the array a[]. 
//The function should return -1 if there are less than 3 elements in input.

import java.util.Scanner;

public class kthlargestelement {

	public static void main(String[] args) {
		System.out.println("Finding out the K-th largest element from an array");

		Integer[] inp = { 4, 6, 2, 8, 19, 7, 3, 15, 10, 9 };
		int[] outp = new int[inp.length];
		int fstint;
		int inst = 0;
		int backup;
		System.out.println(inp.length);

		int kth = 3;
		System.out.println("Entered the rank of the largest number " + kth);

		for (int i = 0; i < inp.length; i++) {

			outp[i] = inp[i]; // f=4
			// outp[i] = inp[i];
			for (int j = inst; j < inp.length; j++) {

				if (inp[j] < outp[i]) // fst=4, inp[2] =2
				{
					outp[i] = inp[j];
					backup = inp[i]; // b=2
					inp[i] = inp[j];
					inp[j] = backup;

				}

				// inst++;
			}
			inst++;
		}

		System.out.println("********INP below*********");

		for (Integer out : inp) {
			System.out.println(out);

		}

		System.out.println("*****************");
		System.out.println("********OUT Below*********");

		for (Integer outs : outp) {
			System.out.println(outs);

		}

		System.out.println("*****************");
		System.out.println("*******Test of n-th Largest number**********");

		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter the n-th rank for the largest number");

		int ranking = myObj.nextInt();

		System.out.println("The " + ranking + " th largest number is: " + outp[outp.length - ranking]);

	}

}
