package Beakjoon;

import java.util.Scanner;

public class ForSum {

	public static void main(String[] args) {
		

		//출력초과 뜸. 
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int sum = 0;
		
		for (int i = 1; i <=n; i++) {
			
			sum += i;
			
			//헐....단순했다...
			//여기에 프린트문을 쓰면 3을입력했을 때 1,3,6이 출력된다. 
			//System.out.println(sum);

		}
		System.out.println(sum);
		scn.close();
		
		
		
		
		
		

	}

}
