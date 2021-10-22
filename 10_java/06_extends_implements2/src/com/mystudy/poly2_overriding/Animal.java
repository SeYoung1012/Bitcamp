package com.mystudy.poly2_overriding;

public class Animal {
	String name; //이름 , 명칭
	int lenCnt; //다리 갯수
	
	void eat () {
		System.out.println(">>먹는다");
	}
	
	void sleep() {
		System.out.println(">>잠을 잔다");
		
	}
	
	void sound() {
		System.out.println(">>Animal - 울음 없음!!");
	}

}
