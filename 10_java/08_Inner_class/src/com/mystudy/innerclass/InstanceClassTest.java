package com.mystudy.innerclass;

public class InstanceClassTest {
	
	
	int a = 100;
	private int b = 10;
	static int c = 200;
	int sum = 0;
	
	void sum() {
		
	}
	
	
	//내부 클래스 : 인스턴스 클래스 
	//내부 클래스에서는 외부 클래스의 인스턴스를 사용할 수 있다. 
	class Inner {
		
		int in = 100;
		
		void prinDate() {
			System.out.println(" int a : " + a );
			System.out.println(" int b : " + b );
			System.out.println(" static int c : " + c );
			sum();
			System.out.println("sum : " +sum);
			System.out.println("내부클래스 필드 in " + in);
		}
		
	}
	
	public static void main(String[] args) {
		InstanceClassTest out = new InstanceClassTest();
		System.out.println("필드 변수 a : " + out.a);
		
		System.out.println("----인스턴스 클래스 사용-----");
		//내부 클래스 Inner에 있는 printData() 실행
		
		//Inner 클래스에 객체 생성
		//외부클래스. 내부클래스 : 내부클래스의 타입 지정
		
		InstanceClassTest.Inner inner = new InstanceClassTest().new Inner();
	//	InstanceClassTest.Inner inner =  out.new Inner();
		
		inner.prinDate();
		
		
	}

}
