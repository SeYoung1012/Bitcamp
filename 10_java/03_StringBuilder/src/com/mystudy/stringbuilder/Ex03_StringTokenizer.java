package com.mystudy.stringbuilder;

import java.util.StringTokenizer;

public class Ex03_StringTokenizer {
	

	public static void main(String[] args) {
		//String split() vs StringTokenizer
		// split은 , 도 문자화시킨다.
		//스플릿은 긴 문장도 배열되고 유의미함. 
		System.out.println("------String split()-------");
		String str = "사과,배,복숭아,,포도";
		System.out.println("str : " +str);
		
		
		String [] strSplit = str.split(",");
		System.out.println("strSplit : " +  strSplit.length);
		
		System.out.println("------str.split(\",\") 결과 ----");
		
		//i 가 인덱스 번호
		for(int i =0; i < strSplit.length; i ++ ) {
			//System.out.println(strSplit[i]); //데이터 저장 값 확인
			System.out.println(i + ": -" + strSplit[i] + "-"); 
			
			
			
		}
		System.out.println("-----개선된 for문 형태-------");
		for(String str2 : strSplit) {
			System.out.println("-" + str2 + "-");
		}
		System.out.println("----------------");
		
		
		int idx = 0;
		for(String str2 : strSplit ) {
			System.out.println(idx++ + ": -" + str2 + "-");
			//idx++;
		}
		
		System.out.println("===================================");
		// 토크나이저는 긴 문자열을 쓸 수 없다. 
		System.out.println("---------StringTokenizer 사용 ---------");
		str = "사과,배,복숭아,,포도";
		StringTokenizer strToken = new StringTokenizer(str,",");
		System.out.println("strToken.countTokens() : " + strToken.countTokens()); //string.length 와 같음
		
		//.hasMoreTokens = > 토큰이 더 있냐? 하면 nextToken으로 쓴다.
		//string토크 나이저는 한번 쓰고나면 토큰이 사라짐. 다시 쓰려면 tokenizer를 해야함. 
		//빈 문자열은 토크닝을 하지 않는다. 스플릿은 재사용 가능하지만 토큰은 담겨 있는 걸 꺼내 쓰는 방식. 
		//재사용이 어렵고 다시 객체 생성해야함. 
		//for문으로 쓸 때는 불편함. 
		
		
		while (strToken.hasMoreTokens()) {
			String token = strToken.nextToken();
			System.out.println("-" + token + "-");
			
		}
		System.out.println("저장된 토큰 갯수 : " + strToken.countTokens());
		
		//=====================================================
		
		System.out.println("-----for문 사용 토큰값 조회 -----");
		strToken = new StringTokenizer(str, ",");
		System.out.println("저장된 토큰 갯수 : " + strToken.countTokens());
		
		//배열의 length 역할 ->strToken.countToken로 쓰면 안됨.
		//다른 곳에다가 토큰 값을 넣어서 써야함. 
		
		int tokenCnt = strToken.countTokens();
		for(int i = 0; i <tokenCnt; i++) {
			String token = strToken.nextToken();
			System.out.println("-" + token + "-");
			
		}
		
	}

}
