package com.mystudy.exception2;

public class MyExceptionTest {

	public static void main(String[] args) {
		System.out.println("---main() 시작---"); //1번
		//throw new MyException();

	
		//try ~ catch 구문을 통한 예외처리
			try {
				firstMethod();
			} catch (MyException e) {
				//e.printStackTrace();
				System.out.println(">>>main - catch 문 실행");
				System.out.println(">>오류 메시지 : " +e.getMessage());
			}
		
		
		
		System.out.println("---main() 끝---"); //6번
		

	}
	
	//throws 선언을 통한 예외처리.
	static void firstMethod() throws MyException {
		
		System.out.println("--firstMethod () 시작 ---"); //2번
		secondMethod();
		System.out.println("--firstMethod () 종료 ---"); //5번
		
	}
	
	static void secondMethod() throws MyException {
		
		System.out.println("--secondMethod () 시작 ---"); //3번
		//예외발생시키기
		throw new MyException("secondMethod() 에서 예외발생 ");
		
		//System.out.println("--secondMethod () 종료 ---"); //4번
		
	}

}
