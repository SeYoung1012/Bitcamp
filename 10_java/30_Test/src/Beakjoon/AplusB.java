package Beakjoon;

import java.util.Scanner;

//백준 10952번
public class AplusB {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while (true) {

			int a = scn.nextInt();
			int b = scn.nextInt();
			if (a == 0 && b == 0) {
				break;
			}
			System.out.println(a + b);
		}
		scn.close();
	}

}
