package com.mystudy.set1_hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import java.util.Set;



public class HashSetLotto {

	public static void main(String[] args) {
		// Set을 이용한 로또 만들기 : 1~45 랜덤숫자 6개를 Set에 저장
		// 로또번호 6개를 추첨해서 set에 저장하고 화면 출력
		// Math.random() : 0.0 ~0.999999 실수형 데이터 중 랜덤값 리턴
		// Math.random() : (int)(Math.random) * 45 +1)
		// 2. 출력은 작은 숫자부터 큰 숫자 형태로
		// 예) 금주의 로또 번호 : 5, 8, 10, 25, 33, 41
		// -----------------------------------------------------

		Set<Integer> lottoSet = new HashSet<>();
		
		int lottoNo;
		for(; lottoSet.size() < 6;) {
			lottoNo = (int) (Math.random() * 45 + 1);
			System.out.print(lottoNo + ", ");
			lottoSet.add(lottoNo);
		}
		System.out.println();
		System.out.println("로또번호 : " + lottoSet);
		
		
		System.out.println("------------------");
		lottoSet.clear();
		while(lottoSet.size() < 6) {
			lottoNo = (int) (Math.random() * 45 + 1);
			System.out.print(lottoNo + ", ");
			lottoSet.add(lottoNo);
			
		}
		
		System.out.println();
		
		System.out.println("로또번호 : " + lottoSet);
		

		System.out.println("==================");
		lottoSet.clear();
		while(lottoSet.size() < 6) { //Set 데이터가 6개가 될 떄까지
			lottoSet.add((int) (Math.random() * 45 + 1));
			
		}
		
		
		System.out.println("로또번호(Set) : " + lottoSet);
		
		System.out.println("----정렬작업 진행 ---------");
		ArrayList<Integer> list = new ArrayList<>(lottoSet);
		System.out.println("list : " + list);
		
		Collections.sort(list);
		System.out.println("정렬된 로또번호 (list) : " + list);
		
		
	}

}
