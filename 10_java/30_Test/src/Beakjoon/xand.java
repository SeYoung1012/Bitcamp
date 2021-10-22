package Beakjoon;

import java.util.Scanner;

public class xand {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int x = scn.nextInt();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			int value = scn.nextInt();
			if (value < x) {
				sb.append(value + " ");
			}

		}
		System.out.println(sb);

	}

}
