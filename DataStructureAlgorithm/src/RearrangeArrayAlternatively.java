//Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively 
//i.e first element should be max value, second should be min value, third should be second max, 
//fourth should be second min and so on...
//Note: O(1) extra space is allowed. Also, try to modify the input array as required.

public class RearrangeArrayAlternatively {

	public static void main(String[] args) {
		Integer[] inp = { 20, 5, 2, 15, 1, 17, 4, 3, 7, 19, 6, 18, 16 };
		Integer[] out = new Integer[inp.length];
		int fst;
		int backup;
		int length = inp.length;
		int arraylength = inp.length - 1;
		int indx = 1;
		// int k=0;
		String maxmin = "max";
		for (int i = 0; i < inp.length; i++) {

			fst = inp[i];
			out[i] = inp[i];

			for (int j = indx; j < length; j++) {

				if (fst < inp[j]) {
					backup = inp[i];
					fst = inp[j];
					inp[i] = inp[j];
					out[i] = inp[j];
					inp[j] = backup;

				}

			}
			indx += 1;

		}

		System.out.println("*************");
		for (Integer integer : out) {
			System.out.println(integer);

		}
		System.out.println("*************");
		int a = 0;
		int n = 0;
		Integer[] alterarray = new Integer[inp.length];
		for (int k = 0; k < inp.length; k++) {

			System.out.println("maxmin: " + maxmin);
			if (maxmin == "max") {

				alterarray[a] = out[n];
				maxmin = "min";
				n += 1;
				System.out.println("Entered Max....Value of a: " + a + " and alterarray[a] is " + alterarray[a]
						+ ": value of k : " + k);
			}

			else if (maxmin == "min") {
				alterarray[a] = out[arraylength];
				maxmin = "max";
				System.out.println("Entered Min....Value of a: " + a + " and alterarray[a] is " + alterarray[a]
						+ " : and value of arraylength : " + arraylength + " value of out[arraylength]: "
						+ out[arraylength] + ": value of k : " + k);
				// a+=1;
				arraylength -= 1;

			}

			a += 1;

		}

		System.out.println("##########################");
		System.out.println("##########################");
		System.out.println("##########################");
		for (Integer myalts : alterarray) {
			System.out.println(myalts);

		}
	}

}
