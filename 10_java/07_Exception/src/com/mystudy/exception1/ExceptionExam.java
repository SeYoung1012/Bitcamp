package com.mystudy.exception1;

public class ExceptionExam {

	public static void main(String[] args) {
		System.out.println("---- main () 시작 ----");
		
		int num = 100;
		int num1 = 50;
		int num2 = 30;
		int result = 0;

		System.out.println(">>연산 시작 ");
		
		//예외처리 -------
		if(num1 ==0) {
			System.out.println("[예외 발생] 나누는 값이 0입니다. ");
		}else {
			result = num / num1;
			System.out.println( "result :" +result );
		}
		
		//try ~ Catch문을 예외 처리
		//exception 을 먼저 쓰면 arimeticexception과 runtimeexception을 쓸 필요가 없다. 
		//Arithmeticexception 을 먼저 써서 잡아주고 그 다음 runtime을 쓰고 마지막에 exception을 써야한다. 
		
		System.out.println("----try Catch 문으로 예외처리 ");
		try {
			result = num /num1; //java.lang.ArithemticException : /by zero
			System.out.println( "result :" +result );
		}catch (ArithmeticException ex) {
			System.out.println("[예외발생 ~메시지] /by zero" + ex.getMessage());
			ex.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("[예외발생 - runtime] " + e.getMessage());
		}catch (Exception e) {
			System.out.println("[예외 발생] 0으로 나누려고 했습니다." );
		}
		System.out.println("----------------");
		
		
		
		System.out.println("---- main() 끝 -----");
		
	}

}
