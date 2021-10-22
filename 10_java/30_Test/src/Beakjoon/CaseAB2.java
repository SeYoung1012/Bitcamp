package Beakjoon;

//백준은 공백도 확인해야함. 공백으로 4번 틀렸음. 
import java.util.Scanner;

public class CaseAB2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();
		int a;
		int b;

		for (int i = 1; i <= t; i++) {

			a = scn.nextInt();
			b = scn.nextInt();

			if (a > 0 && b < 10) {
				System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
			}

		}

	}

}
