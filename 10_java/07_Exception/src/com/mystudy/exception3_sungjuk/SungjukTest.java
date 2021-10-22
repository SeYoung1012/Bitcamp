package com.mystudy.exception3_sungjuk;

public class SungjukTest {

	public static void main(String[] args) {
		System.out.println("---main() 시작");
		StudentVO svo = new StudentVO("서강준", 100, 100, 100);
		System.out.println(svo);
		
		System.out.println(">>국어점수 수정처리 ----");
		try {
			svo.setKor(999);
		}catch (JumsuOutofValueException e) {
			
			System.out.println(e.getMessage());
		}
		System.out.println(svo);
		
		System.out.println("---main() 끝");


		
	}

}
