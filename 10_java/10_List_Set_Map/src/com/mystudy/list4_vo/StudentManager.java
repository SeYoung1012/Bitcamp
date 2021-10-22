package com.mystudy.list4_vo;

import java.util.ArrayList;

public class StudentManager {

	public static void main(String[] args) {
		/*
		 * 실습) list를 사용한 성적 처리.
		 
		  
		  
		 */

		StudentVO stu1 = new StudentVO("서강준", 100, 100, 90);
		System.out.println(stu1.getName());
		stu1.printData();

		StudentVO stu2 = new StudentVO("강태오", 90, 90, 80);
		StudentVO stu3 = new StudentVO("송강", 80, 80, 70);

		ArrayList<StudentVO> list = new ArrayList<>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);

		System.out.println(stu1.getName());
		System.out.println(list);
		System.out.println("====================");

//		StudentVO svo1 = list.get(0);
//		String name = svo1.getName();
//		int kor = svo1.getKor();
//		int eng = svo1.getEng();

		for (int i = 0; i < list.size(); i++) {
			StudentVO vo = list.get(i);
			vo.printData();
		}

		System.out.println("----------------");
		for (StudentVO vo : list) {
			vo.printData();
		}
		System.out.println("=======");
		printData(list);
		
		

		System.out.println("==== 리스트의 데이터 값 변경=====");
		System.out.println("--데이터 변경 전 ---");
		stu1.printData();
		list.get(0).printData();
		
		
		list.get(0).setKor(95);
		
		System.out.println("--데이터 변경 후 ---");
		stu1.printData();
		list.get(0).printData();
		
		
		
	}

	static void printData(ArrayList<StudentVO> list) {
		for (StudentVO vo : list) {
			vo.printData();
		}
	}
}
