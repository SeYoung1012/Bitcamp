package com.mystudy.bean_vo;

import java.util.Arrays;

import com.mystudy.been.Student;

public class StudentManager {

	public static void main(String[] args) {
		
		StudentVO stu = new StudentVO("서강준" , 100, 90, 100 );
		StudentVO stu2 = new StudentVO ("송강" , 80,87,88);
		StudentVO stu3 = new StudentVO("강태오" , 90, 90, 92);

		
		System.out.println(stu);
		System.out.println("------------");
	//	System.out.println(stu.getName() + " " + stu.getKor() + " " + stu.getEng() + " " + stu.getMath() 
	//	+ " " + stu.getTot() + " " +stu.getAvg() );
	//	stu.printDate();
		
		//출력
		stu.printData();
		stu2.printData(); //vo필드에 메소드를 만들어서 쓰자. 
		stu3.printData();
	
		//==========================================================
		System.out.println("======배열에 저장해서 사용=======");
		StudentVO [] students = new StudentVO[3];
		students[0] = stu;
		students[1] = stu2;
		students[2] = stu3;
		System.out.println(Arrays.toString(students));
		
		System.out.println("=====배열 데이터 화면 출력========");
	//	students[0].setKor(95); //점수 변경도 가능. 
		students[0].printData();
		students[1].printData();
		students[2].printData();
		
		System.out.println("-------------------------------");
		printData(students);
	}
	
	static void printData(StudentVO[] students ) {
		//전달 받은 배열 데이터를 화면에 출력
		for( StudentVO vo : students) {
			vo.printData();
		}
		
		
	}
	
	
	
	

}
