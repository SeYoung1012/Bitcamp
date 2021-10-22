package com.mystudy.interface2;

//인터페이스는 추상체(abstract)
//클래스는 구현체 - Object <- Phone(클래스) 상속 
//Phone(클래스) -> I_Phone(implement -구현)

public class PhoneTest {

	public static void main(String[] args) {
		System.out.println("===Phone====");
		Phone ph1 = new Phone("010-0000-0000");
		ph1.view();
		ph1.call();
		ph1.recriveCall();
		ph1.sendSMS();
		ph1.receiveSMS();
		System.out.println("타입 : " + ph1.getType());
		System.out.println("번호 :" + ph1.getPhoneNo());
		
		System.out.println("===Mp3Phone=====");
		Mp3Phone mp3ph = new Mp3Phone("010-1111-1111");
		
		mp3ph.call();
		
		
		

	}

}
