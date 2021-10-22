package com.mystudy.random;

import java.util.Calendar;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomExam2 {

	public static void main(String[] args) {
		//(실습) 오늘 당신의 행운지수 알아보기(0~100) 
		//Math.random(), Random 사용해서 행운지수 값 만들기
		//실행 결과
		//2021년 7월 29일 당신의 행운지수(0~100)는 77입니다. 
		//---------------------------------------
		
		//행운지수 값 만들기
		
		int result = 0;
		System.out.println("오늘 나의 행운지수는 얼마일까요?");
		for(int i = 0; i < 1; i++) {
			result = (int)(Math.random() * 100 + 1);
			System.out.println(result);
			
		}
		
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; //0~11 +1 
		int date = calendar.get(Calendar.DATE);
		
		
		
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("date : " + date);
		System.out.println(year + "년" + month + "월" + date +"일");
		String yyyymmdd = year + "년" + month + "월" + date +"일";
		System.out.println("---------------------------");
		
		System.out.println(year + "년" + month + "월" + date +"일" + "당신의 행운지수는 " +result +"입니다.");
		System.out.println();
		
		
		//방법 1 - Random nextInt(숫자)
		System.out.println("----Random nextInt(숫자)-----");
		Random ran = new Random();
		result = ran.nextInt(101); //0~100까지 범위의 정수타입의 난수 생성
		System.out.println(yyyymmdd + "당신의 행운지수" + result+ "입니다.");
		
		//1~100까지의 범위가 확실한지 검증하기.
		Set<Integer> set = new TreeSet<>();
		for(int i =0; i < 1000; i ++ ) {
			set.add(ran.nextInt(101));
		}
		System.out.println(set);
		System.out.println(set.size());
		
		
		//방법 2 - Math.random()
		System.out.println("----Math.random()------");
		result = (int)(Math.random() *101);
		System.out.println(yyyymmdd + "당신의 행운지수는 " + result +"입니다.");
		
		
		
		
		set.clear();
		for(int i = 0; i <1000; i++) {
			//System.out.println((int)(Math.random() *101));
			set.add((int)(Math.random() *101));
			
		}
		System.out.println(set);
		System.out.println(set.size());
		
		
		
		
		
		
	}

}
