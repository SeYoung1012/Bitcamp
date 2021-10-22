package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 1110번
public class NewNum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int c = 0;
		int copy = n;

		do {
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
			c++;

		} while (copy != n);

		System.out.println(c);

	}

}
