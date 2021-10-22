package com.mystudy.interface2;

//전화기 기본 기능 + 음악플레이 + 웹서치 기능

//extends + 인터페이스명 + 인터페이스명 쓰면 가져다 쓸 수 있음. 

public interface I_WebPhone extends I_Phone, I_Mp3Phone{

	
	//웹서치 기능
	void webSearch();

}
