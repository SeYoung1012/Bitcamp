package com.mystudy.interface2;


//전화기 정보 확인, 전화 걸고, 전화 받고, 문자 주고 받고, 음악플레이
//extends , implements 사용


public class Mp3Phone extends Phone implements I_Mp3Phone {
	
	public Mp3Phone(String phoneNo) {
		super("Mp3Phone 타입 " , phoneNo );
		
	}
	public Mp3Phone(String type, String phoneNo) {
		super(type, phoneNo);
		
		
	}
	
	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		
	}
	
	

}
