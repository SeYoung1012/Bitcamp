package com.mystudy.extends2;

 class Mp3Phone extends Phone {
	
	public Mp3Phone (String phoneNo) {
		super("Mp3Phone타입" , phoneNo);
		
		
	}
	
	public Mp3Phone(String type, String phoneNo) {
		super(type, phoneNo);
		
	}
	
	public void playMusic() {
		System.out.println("Mp3Phone - 음악플레이 ");
		
	}
	
	
	
}
