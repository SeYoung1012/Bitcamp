package com.mystudy.extends2;

//클래스 상속(extends)
/*
WebPhone클래스 작성 
Phone 클래스를 상속확장해서 작성(extends - 상속이란 단어 암기)
생성자 정의
	- 폰번호(phoneNo)만 받아서 객체(인스턴스) 생성 :타입명 "WenPhone타입" 적용
	기능 : 전화 걸고, 받고, 전화정보 보기, 웹검색할 수 있는 전화기.
웹 검색 기능 
	-webSearch() : ">>WebPhone - 웹 검색" 문구 화면 출력
 */

	class WebPhone extends Mp3Phone {  //클래스 이름에다가 extends(상속)하고 상속할 클래스이름(Phone)을 써주면 쓸 수 있음. 
		//필드 (속성) --------------
		
		
		
		//생성자------------------------
		public WebPhone (String phoneNo) {
			super("WebPhone타입" , phoneNo);
			
			
		}
		 
		public WebPhone(String type, String phoneNo) {
			super(type, phoneNo);
			
		}
		
		//메소드 선언 영역 ---------------------
		//같은 메소드 이름으로 파라미터 갯수 , 순서 , 타입으로 구분. ->오버로드
		//예 println 
		
		public void webSearch () {
			System.out.println(">>WebPhone - 웹 검색");
			
		}
		
		public void webSearch (String word) { //메소드 오버로딩(overLoading)
			System.out.println(">>WebPhone - 웹 검색 : " + word +" 로 검색");
			
		}
	
		
	

}
