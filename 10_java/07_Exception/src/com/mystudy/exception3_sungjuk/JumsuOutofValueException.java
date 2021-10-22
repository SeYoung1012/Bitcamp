package com.mystudy.exception3_sungjuk;

public class JumsuOutofValueException extends SungjukProcessException{

	public JumsuOutofValueException () {
		super("점수 범위 (0~100)를 벗어난 값입니다.");
		
	}
	

}
