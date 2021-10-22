package com.mystudy.set1_hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExam {

	public static void main(String[] args) {
		// HashSet : Set 인터페이스를 구현한 구현체(클래스)
		// 순서가 없고, 중복데이터 허용안함(동일 데이터는 하나만 저장)
		// Set 에서 동일데이터 여부 확인은 hashCode (), equals() 값 확인
		// 1. 해시코드 값 확인 : hashCode()
		// 2. equals() 메소드 결과값이 모두 일치하면 동일데이터

		HashSet<String> set = new HashSet<>();
		set.add("서강준");
		set.add("서강준");
		set.add("강태오");
		set.add(new String("서강준"));

		System.out.println("서강준 해시코드 : " + "서강준".hashCode());
		System.out.println("new String (\"서강준\") 해시코드 : " + new String("서강준").hashCode());
		System.out.println(set);
		System.out.println("set.size() :" + set.size());
		System.out.println("set.contains() :" + set.contains("서강준"));

		set.add("공유");
		set.add("김우빈");
		System.out.println(set);

		// iterator은 한번 쓰면 재사용할 수 없음.
		System.out.println("----Set 전체 데이터 조회(Iterator)");
		Iterator<String> ite = set.iterator();

		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

		System.out.println("----------");
		for (String name : set) {
			System.out.println(name);
		}

		// (실습) 공유 --> 문빈
		// 공유 삭제 and 문빈 입력
		System.out.println("-----공유 ==> 문빈(수정/변경 처리)-----");
		//System.out.println("set.remove(\"현빈 \") " + set.remove("현빈"));
		//System.out.println("set.remove(\"공유\") " + set.remove("공유"));

		//간편한 방법이지만, 데이터가 있는 지 확인 필수. 
		set.remove("공유");
		set.add("문빈");
		
		
		if (set.contains("공유")) {
			set.remove("공유");
			System.out.println(">>공유 데이터가 삭제되었습니다.");
			set.add("문빈");
		} else {
			System.out.println(">>공유 데이터가 없습니다. ");
		}
		if (set.remove("서강준")) {
			System.out.println(">>서강준 데이터가 삭제되었습니다. ");
		} else {
			System.out.println(">>서강준 삭제 실패! 데이터를 확인하세요. ");
		}

		System.out.println(set);

	}

}
