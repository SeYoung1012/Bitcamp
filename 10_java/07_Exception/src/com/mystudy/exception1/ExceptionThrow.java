package com.mystudy.exception1;

public class ExceptionThrow {

	public static void main(String[] args) {
		//예외처리 throw : 예외를 발생시킬 때 사용
		//throw new ArithmeticException();
		//throw new ArithmeticException("예외메시지 작성 전달");
		//throw new ArithmeticException("/by zero");
		
		//배열에서 예외를 발생시키겠다. 
		throw new ArrayIndexOutOfBoundsException();
		
		

	}

}
