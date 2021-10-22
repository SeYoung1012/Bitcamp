package Beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IntAB {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		
		//빼기 5 -> 54321
		for (int i = N; i >= 1; i--) {

			System.out.println(i);
		}
		
		
		
		//더하기 5 -> 12345
		for (int i = 1; i <= N; i++) {

			System.out.println(i);
		}

		bw.flush();
		bw.close();
		br.close();

	}

}
