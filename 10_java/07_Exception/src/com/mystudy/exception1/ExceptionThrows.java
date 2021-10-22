package com.mystudy.exception1;

public class ExceptionThrows {

	public static void main(String[] args) {
		//throws : 예외를 던질 때 (위임, 전가) 사용
		//예외는 직접처리하거나 요청한 곳으로 알리는 방식이 있음. 
		//throws는 요청한 곳으로 알리는 방식. 
		
		//예외가 발생한 곳에서 처리하지 않고, 예외를 던져서 다른 곳에서 
		//처리하도록 한다. 
		//호출한 곳에서 예외를 던짐. 
		System.out.println("----main () 시작 ----");
		//값이 정상이면 이 밑으로 시작. 1번
		int num1 =100;
		int num2 = 50;
		int result = 0;
		
		num2 =0;
		//result가 div 메소드로 넘어감. 2번
		result = div(num1, num2);
		System.out.println("연산결과 : " +result);

		System.out.println("------------------");
		result = 0;
		
		try {
			result = divThrows(num1, num2);
		} catch (MyException e) {
			System.out.println(e.getMessage());
			
		}
		
		//마지막으로 출력
		System.out.println("----main () 끝 ----");
		
		
		
		
	}
	static int div (int num1, int num2) {
		//2-1번 시작
		System.out.println("div () 시작");
		int result = -999;
		//예외를 잡아서 직접처리
		try {
			result = num1 /num2; //여기에서 예외가 발생할 것.
			
		}catch (ArithmeticException e) {
			System.out.println("[div 예외 발생] " + e.getMessage());
			
		}
		
		
		//2-2번 시작
		System.out.println("div () 끝");
		return result;
	}
	
	//throws : 요청한 곳으로 예외를 던져(전달)서 
	static int divThrows ( int num1, int num2) throws MyException  {
		
		System.out.println("-----> divThrows() 시작");
		int result = -1;
		try {
		result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			throw new MyException(); //내가 만든 Exception은 RuntimeException계열이 아님. 
		}
		
		System.out.println("-----> divThrows() 끝");
		return result;
		
	
		
	}
	

}

class MyException extends Exception {
	public MyException() {
		super (">>[예외 발생] 0으로 나누려고 했습니다. 값을 확인하세요.");
		
	}
	
	
}

