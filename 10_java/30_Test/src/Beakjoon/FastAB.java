package Beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FastAB {

	public static void main(String[] args) throws IOException {
		// 출력에서 에러가 뜨는데 왜 백준에서 돌아가는 거지??
		// 풀었는데 따라 풀어서 모르겠다ㅜㅠㅠ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String stt = br.readLine();
			String[] str = stt.split(" ");

			int A = Integer.parseInt(str[0]);
			int B = Integer.parseInt(str[1]);
			int sum = A + B;

			bw.write(sum + "\n");

		}

		bw.flush();
		bw.close();
		br.close();

	}

}
