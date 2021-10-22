package com.mystudy.list3_linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {

		// LinkedList : List 속성
		LinkedList<String> list = new LinkedList<>();
		list.add("서강준");
		list.add("서강준");
		list.add("강태오");
		System.out.println("list : " + list);
		System.out.println(list.get(0));

		String str = "서강준,강태오,문빈,공유,김우빈,강태오,서강준";
		String[] strs = str.split(",");
		System.out.println("strs : " + Arrays.toString(strs));

		// 배열에 있는 데이터를 리스트에 추가
		for (int i = 0; i < strs.length; i++) {
			list.add(strs[i]);
		}
		System.out.println("list : " + list);

		// ---------------------
		// (실습) 리스트에 있는 데이터 변경하기
		// 변경할 데이터를 찾고, 해당 위치값 처리하기
		// 강태오 삭제
		// 서강준 -> 서강준2 로 바꾸기
		// -----------------
		System.out.println("변경전 list : " + list);
		// 강태오 삭제
		// list.remove("강태오"); // 있으면 맨 앞쪽 데이터 1개 삭제

		// 데이터가 있으면 삭제, 없으면 작업끝
		while (true) {
			if (list.contains("강태오")) { // 있으면
				list.remove("강태오");
			} else { // 없으면
				break;
			}
		}

		// 서강준 -> 서강준2 로 바꾸기
//		int index = list.indexOf("서강준");
//		System.out.println("index : " + index);
//		if (index >= 0)  {
//			list.set(index, "서강준2");
//		}

		// 리스트 전체 데이터 대상으로
		while (true) {
			int index = list.indexOf("서강준");
			if (index == -1)
				break;
			list.set(index, "서강준2");
		}

		System.out.println("변경후 list : " + list);

	}

}
