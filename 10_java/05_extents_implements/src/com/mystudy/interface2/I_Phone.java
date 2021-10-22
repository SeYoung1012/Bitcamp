package com.mystudy.interface2;

//인터페이스는 다른곳에서도 써야 하기에 public을 주로 씀.



 interface I_Phone {
	 //{} 없음 : 추상메소드(abstract 메소드 - 구현부 없음)
	 //인터페이스에 정의되는 메소드는 기본적으로 public abstract임.
	 
	 public abstract void view(); //abstract 생략해도 abstract 메소드
	 
	 public void call();  //public abstract 메소드
	 
	 void recriveCall(); //public abstract 메소드
	 
	 void sendSMS(); //public abstract 생략가능. 
	 
	 void receiveSMS();//public abstract 생략가능. 
	 
	 

	 
}
