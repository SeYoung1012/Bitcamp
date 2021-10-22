package Beakjoon;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <=i; k++) {

				System.out.print("*");
			}
			System.out.println();
		}
		scn.close();

	}

}
