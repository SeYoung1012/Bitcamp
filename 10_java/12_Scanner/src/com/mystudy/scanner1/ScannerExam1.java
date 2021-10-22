package com.mystudy.scanner1;

import java.util.Scanner;

public class ScannerExam1 {

	public static void main(String[] args) {
		// Scanner : 특정 위치에서 값을 읽어 사용하기 위한 클래스
		// 입력 : 성명, 국어, 영어, 수학 점수를 입력받아
		// 처리 : 총점, 평균 구하기
		// 출력 : 성적처리된 데이터를 화면출력
		/*
		이름 : 서강준
		국어 : 100
		영어 : 100
		수학 : 90
		-----------
		총점 : 290
		평균 : 96.66
		**************************************/
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : " );
		String name = scan.next();
		
		
		System.out.print("국어 :");
		int kor = scan.nextInt();
		
		
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		scan.nextLine(); //줄 바꿈 이전에 읽는 빈문자열 읽기
		
		System.out.print("수학 :" );
		String strMath = scan.nextLine();
		System.out.println("strMath : -" + strMath + "-");
		int math = Integer.parseInt(strMath);
		
		//처리 ----------------
		int tot = kor + eng + math;
		double ave = tot *100/ 3 /100.0;
		
		//출력------------
		System.out.println("===성적처리 결과=====");
		System.out.println("이름 :" + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("------------");
		System.out.println("총점 : " + tot);
		System.out.println("평균: " + ave);
		
		
	}

}
