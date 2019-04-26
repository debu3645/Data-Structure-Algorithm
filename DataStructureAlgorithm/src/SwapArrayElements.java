//Given an array of size N, swap the kth element from beginning with kth element from end.
//
//https://practice.geeksforgeeks.org/problems/swap-kth-elements/0
public class SwapArrayElements {

	public static void main(String[] args) {

		Integer[] inp = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 180 };
		int fst;
		int j = inp.length - 1;
		for (int i = 0; i < inp.length / 2; i++) {
			fst = inp[i];

			inp[i] = inp[j];
			inp[j] = fst;

			j -= 1;

		}

		System.out.println("***************");

		for (Integer elements : inp) {

			System.out.println(elements);
		}

	}

}
