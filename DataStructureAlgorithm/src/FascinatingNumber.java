//Given a number N. Your task is to check whether it is fascinating or not.
//Fascinating Number : When a number( 3 digit or more) is multiplied by 2 and 3 ,
//and when both these products are concatenated with the original number, 
//then it results in all digits from 1 to 9 present exactly once.
//
//https://practice.geeksforgeeks.org/problems/fascinating-number/0

public class FascinatingNumber {

	public static void main(String[] args) {

		int inp = 192; // Enter the number here. You can also use Scanner utility to get the input from
						// user
		int inp2 = inp * 2;
		int inp3 = inp * 3;
		int totcnt = 0;
		boolean match = false;
		String present = "started";
		int x;

		String sinp = String.valueOf(inp) + String.valueOf(inp2) + String.valueOf(inp3);
		System.out.println("The String is: " + sinp);
		char[] concatstr = sinp.toCharArray();
		outer: for (int i = 1; i < 10; i++) {

			present = "not found";

			totcnt = 0;

			for (int j = 0; j < concatstr.length; j++) {
				x = Character.getNumericValue(concatstr[j]);

				// System.out.println(concatstr[j]);
				if (i == x) {
					// System.out.println("Entered. " + " : "+ concatstr[i] + " : " + j);
					totcnt += 1;
					present = "found";
					match = true;
					// break inner;
					// System.out.println("value of totcnt: " + totcnt);
					if (totcnt > 1) {

						System.out.println("frequency of the digit " + concatstr[j] + " is more than one");
						break outer;
					}

				}

			}

		}
		if (present == "not found") {
			System.out.println("There is one digit missing");
		} else if (present == "found" && totcnt == 1) {
			System.out.println("Its a perfect Fascinating Number");
		}

	}

}
