package Beakjoon;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		
		//알람 예제는 1 ~ 60분까지 쓰면 다시 1로 돌려주어야 한다. 
		//구글에 나오는 많은 예제들이 시간을 돌려주지 않아 틀린 경우가 있다. 
		
		
		Scanner scn = new Scanner(System.in);

		int h = scn.nextInt();
		int m = scn.nextInt();

		if ((m - 45) < 0) {
			if ((h - 1) < 0) {
				
				//23시간
				h = -1 + 24;
				//
				m = m - 45 + 60;

			} else {

				h -= 1;
				m = m - 45 + 60;

			}

		} else {
			//예를 들어 9시 45분에서 -45분을 빼면 9시이므로 시간을 빼줄 필요 없음. 
			m = m - 45;
		}

		System.out.println(h + " " + m);
		scn.close();

	}

}
