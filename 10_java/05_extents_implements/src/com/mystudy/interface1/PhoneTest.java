package com.mystudy.interface1;

public class PhoneTest {

	public static void main(String[] args) {
		
		Phone ph = new Phone("010-0000-0000");
		ph.view();
		ph.call();
		ph.receiveCall();
		ph.sendSms("안녕하세요");
		ph.receiveSme("안녕하세요");
		
	}

}
