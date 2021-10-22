package Beakjoon;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = 0;
		int b = 0;

		a = scn.nextInt();
		b = scn.nextInt();

		System.out.println(a * (b % 10));
		System.out.println(a * (b % 100/ 10));
		System.out.println(a *(b / 100));
		System.out.println(a*b);
		
		scn.close();

	}

}
