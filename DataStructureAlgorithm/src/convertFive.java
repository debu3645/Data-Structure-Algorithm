//Given a number N. The task is to complete the function convertFive() which replace 
//all zeros in the number with 5 and returns the number.
public class convertFive {

	public static void main(String[] args) {

		Integer[] inp = { 110, 112, 200, 54, 50 };

		for (int i = 0; i < inp.length; i++) {

			String str = inp[i].toString();
			String mystr = "";
			char[] charr = str.toCharArray();
			for (int j = 0; j < str.length(); j++) {

				if (charr[j] == '0') {

					charr[j] = '5';
					
					mystr = new String(charr);

				}

			}
//			for (char integer : charr) {
//				System.out.println(integer);
//
//			}

			//System.out.println("****");
			System.out.println("mystr: " + mystr);
		}

	}

}
