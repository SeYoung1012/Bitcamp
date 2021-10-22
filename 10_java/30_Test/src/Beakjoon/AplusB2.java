package Beakjoon;

import java.util.Scanner;
//백준 10951번 

public class AplusB2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		while (scn.hasNextInt()) {

			int a = scn.nextInt();
			int b = scn.nextInt();

			System.out.println(a + b);
		}
		scn.close();
	}

}
