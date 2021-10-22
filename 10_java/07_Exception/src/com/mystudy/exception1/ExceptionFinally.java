package com.mystudy.exception1;

public class ExceptionFinally {

	public static void main(String[] args) {
		//try ~catch ~finally
		System.out.println("---main() 시작 ---");
		int num =20;
		int result = 0;
		try {
			System.out.println(">>try 문 시작");
			num = 0;
			result = 100/num;
			
			//값이 정상이면 밑에 두 문장이 출력되지만 
			//0을 넣으면 이 두 문장을 빠져나가서 캐치문에서 실행처리됨.
			System.out.println("연산처리 정상 실행");
			System.out.println(">>try 문 끝");
		}catch (ArithmeticException e) {
			System.out.println(">> catch 문 실행");
		}finally {
			System.out.println("***>finally : 항상실행(무조건) ");
		}
		System.out.println(">>finally 다음 문장");
		System.out.println("result : " +result );
		
		System.out.println("---main() 끝 ----");

	}

}
