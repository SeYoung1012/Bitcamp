package com.mystudy.stringbuilder;

public class Ex02_StringBuilder {

	public static void main(String[] args) {
		//StringBuilder 클래스 - String 클래스는 값 변경이 불가하기에 StringBuilder을 쓴다. 
		
		int num = 100;
		String str1 = "Hello" ; //사용가능
		String str = new String ("Hello Java!!!");
		System.out.println(str);
		
		//StringBuilder를 쓰고 싶다면 toString()을 사용해야한다. 
		StringBuilder sb = new StringBuilder("Hello Java!!!");
		System.out.println(sb);
		System.out.println(sb.toString());
		String sbValue = sb.toString();  
		System.out.println("sb.toString () : "  + sbValue);
		
		//capacity는 용량 아는 것. 33
		System.out.println("sb.capacity()" + sb.capacity());
		System.out.println("-----StringBuilder--------");
		sb.append("반갑습니다.").append("@@@");
		System.out.println(sb);
		
		sb.reverse(); //문자열 뒤집기
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb);
		
		System.out.println("--------delete(), insert(), replace()----");
		//Hello Java!!! 반갑습니다@@@
		//delete는 특정 문자 삭제
		System.out.println("sd.delete(0, 6) :" + sb.delete(0, 6));
		System.out.println(sb);
		
		
		sb.insert(0, "Hello ");//삽입(추가, 입력)
		System.out.println(sb);
		
		//replace(int start, int end, String str)
		sb.replace(0, 5, "Hi"); //수정
		System.out.println(sb);
		
		System.out.println("sb.length() "+sb.length());
		System.out.println("sb.capacity() "+sb.capacity());
		
		//===============================================================
		
		System.out.println("=========================================");
		StringBuilder sb2 = new StringBuilder(100); //저장공간 100개 확보
		System.out.println("sb2.length () : "  +sb2.length()); //저장 데이터 크기
		System.out.println("sb2.capacity() "+sb2.capacity()); //저장공간의 크기
		
		//체이닝 방식
		sb2.append("안녕하세요").append(" 반갑습니다!!!");
		System.out.println(sb2);
		System.out.println("sb2.length () : "  +sb2.length()); 
		System.out.println("sb2.capacity() "+sb2.capacity()); 
		
		System.out.println("----trimTosize() 실행 후----");
		sb2.trimToSize();
		System.out.println("sb2.length () : "  +sb2.length()); 
		System.out.println("sb2.capacity() : "+sb2.capacity()); 
		
		System.out.println(">>>>append() 실행 후 ----");
		sb2.append(" 자바공부중~");
		System.out.println("sb2 : "  +sb2);
		System.out.println("sb2.length () : "  +sb2.length()); 
		System.out.println("sb2.capacity() "+sb2.capacity()); 
		
		System.out.println(">>>setLength() 실행 후 -----");
		sb2.setLength(5); //데이터 크기 설정(작게하면 delete 효과)
		System.out.println("sb2 : "  +sb2.toString());
		System.out.println("sb2.length () : "  +sb2.length()); 
		System.out.println("sb2.capacity() "+sb2.capacity()); 
		
		
	}
	
	

}
