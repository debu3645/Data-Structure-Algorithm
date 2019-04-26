//Given a non-empty sequence of characters, return true if sequence is Binary, 
//		else return false
//
//Input:
//
//The task is to complete the method that takes a string as argument. We should not read any 
//input from stdin/console. There are multiple test cases. 
//For each test case, this method will be called individually.

// https://practice.geeksforgeeks.org/problems/check-for-binary/1

public class BinaryString {

	public static void main(String[] args) {
		Integer[] inp = {110, 111, 11, 1, 1111111101, 11, 01,10101};
		String bin = "true";
		for (int i=0;i<inp.length; i++) {
			String str = inp[i].toString();
		 for (int j=0; j<str.length(); j++) {
			 
			 //System.out.println(str.charAt(j));
			 
			 if ((str.charAt(j) != '0') && (str.charAt(j) != '1')) {
				 
				 System.out.println(str);
				 bin = "false";
				 System.out.println("Not a binary");
				 break;
			 }
			 
			
		 }
		//System.out.println("******");
			
			
//			for  (String st : str) {
//				System.out.println(st);
//				
//			}
			
		}

		if (bin == "true") {
			System.out.println("Binary Array");
		}
		
	}

}
