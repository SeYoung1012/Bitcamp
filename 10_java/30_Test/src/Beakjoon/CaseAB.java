package Beakjoon;


import java.util.Scanner;

public class CaseAB {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int T = scn.nextInt();
		int A = 0,  B =0;
		int c = A;
		int d = B;
		
		for (int i = 0; i <= T; i++) {
			A = scn.nextInt();
			B = scn.nextInt();
			System.out.print("Case#" + (i + 1) + ": " + (c + d));

		}

		scn.close();

	}

}
