//A and B are good friend and programmers. They are always in a healthy competition with each other. 
//They decide to judge the best among them by competing. They do so by comparing their three skills as per their values. 
//Please help them doing so as they are busy.
//
//Set for A are like [a1, a2, a3]
//Set for B are like [b1, b2, b3]
//
//Compare ith skill of A with ith skill of B
//if a[i] > b[i] , A's score increases by 1
//if a[i] < b[i] , B's score increases by 1
//
//https://practice.geeksforgeeks.org/problems/compete-the-skills/0

public class CompeteSkills {

	public static void main(String[] args) {

		Integer[] A = { 40, 50, 60, 70, 80, 90, 100 };
		Integer[] B = { 41, 52, 58, 69, 85, 93, 99 };

		int score_A = 0;
		int score_B = 0;

		for (int i = 0; i < A.length; i++) {

			if (A[i] > B[i]) {
				score_A += 1;
			} else if (A[i] < B[i]) {
				score_B += 1;
			}

		}

		System.out.println("Score of A: " + score_A + "  and Score of B: " + score_B);

	}

}
