import java.util.Scanner;

//Given an sorted array A of size N. 
//Find number of elements which are less than or equal to given element X.


public class CountSmallerElements {

	public static void main(String[] args) {
		
		Integer[] inp = {11,12,43,78,42,64,38,35,18,50,33};
		System.out.println("Enter the number you want to compare:  ");
		
		Scanner enter = new Scanner(System.in);
		int element = enter.nextInt();
		System.out.println("*******************");
		System.out.println("Numbers are as below: ");
		System.out.println("*******************");
		System.out.println();
		
		for (int i=0; i< inp.length; i++) {
			
			if (inp[i] <= element) {
				
				System.out.println(inp[i]);
				System.out.println("*****");
			}
			
			
		}
		

	}

}
