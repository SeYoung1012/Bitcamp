package com.mystudy.poly2_overriding;

import java.util.ArrayList;

public class Student {

	// 필드 선언 ----

	private int id;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private ArrayList<Student> list;

	// 생성자 선언 -----------------------------------
	public Student() {
	         super();
	      }

	public Student(int id, String name, int kor, int eng, int math) {
	         super();
	         this.id = id;
	         this.name = name;
	         this.kor = kor;
	         this.eng = eng;
	         this.math = math;
	         
	      }

	// ==================================
	
	// 메소드

	// 입력
	public void insert(int id, String name, int kor, int eng, int math) {
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	
	}

	// 수정
	public void update(int getId, String setName, int setKor, int setEng, int setMath) {

		if (this.id == getId) {
			this.name = setName;
			this.kor = setKor;
			this.eng = setEng;
			this.math = setMath;
		} else {
			System.out.println("아이디가 같지 않습니다");
		}
	}

	// 점수 처리
	public void computeTotAvg() {
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
		System.out.println();
	}

	// 삭제
	public void delete(int id) {
		if (this.id == id) {
			this.name = null;
			this.kor = 0;
			this.eng = 0;
			this.math = 0;
			System.out.println("해당 아이디의 정보는 삭제되었습니다");
		}
	}

	// 조회
//	public void printAll() {
//		for (Student s : Student) { // 배열 전달해서 배열에 있는 stu꺼내서 출력
//			s.print();
//		}
//	}

	public void print() {
		System.out.println(name + " " + kor + " " + eng + " " + math + " " + tot + " " + avg);
	}

	// get/set

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;
			computeTotAvg();
		} else {
			System.out.println("[예외발생 점수가 범위(0~100) 벗어남");
		}
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if (eng >= 0 && eng <= 100) {
			this.eng = eng;
			computeTotAvg();
		} else {
			System.out.println("[예외발생 점수가 범위(0~100) 벗어남");
		}
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if (math >= 0 && math <= 100) {
			this.math = math;
			computeTotAvg();
		} else {
			System.out.println("[예외발생 점수가 범위(0~100) 벗어남");
		}
	}

	public int getTot() {
		return tot;
	}

	public double getAvg() {
		return avg;
	}

}
