
//You are given an array A of size N. You need to print elements of A in alternate order.
//https://practice.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1

public class AlternateArrayElements {

	public static void main(String[] args) {

   Integer[] inp = {2,5,6,7,10,9,4,3,8,1};
   System.out.println("Length " + inp.length);
		
   for (int i=1; i<inp.length; i++) {
	  
	   System.out.println(inp[i]);
	   i++;
   }
   

	}

}
