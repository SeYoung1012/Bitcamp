package com.mystudy.scanner2_caffe;

import java.util.ArrayList;



public class StudentManager {

	public static void main(String[] args) {
	
		
		
		//1. 제공된 3명과 추가한 2명의 합계 5명의 학생데이터를 생성하시오. 
		StudentVO stu1 = new StudentVO("홍길동", 100, 90, 81);
		StudentVO stu2 = new StudentVO("이순신", 95, 88, 92);
		StudentVO stu3 = new StudentVO("김유신", 90, 87, 77);
		StudentVO stu4 = new StudentVO("서강준", 100, 100, 90);
		StudentVO stu5 = new StudentVO("강태오", 90, 90, 80);
		
		//2. 5명의 데이터를 선택한 list/set/map 타입의 저장공간을 만들고 저장하시오. 
		ArrayList<StudentVO> list = new ArrayList<>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		list.add(stu5);
		System.out.println(list);
		System.out.println("====================");


		//3. 저장되어 있는 학생데이터를 성명, 국어, 영어, 수학 총점, 평균을 목록형태로 출력
		printData(list);
		
		
		
		//4. <홍길동> 학생의 데이터 중 영어점수를 95점 수학점수를 85점으로 수정하고 수정된 값 출력.
		System.out.println("--점수 변경 전 ---");
		list.get(0).printData();

		list.get(0).setEng(95);
		list.get(0).setMath(85);

		System.out.println("--점수 변경 후 ---");
		list.get(0).printData();
		
		//5. 최종 처리 완료된 모든 학생 정보 출력
		System.out.println("----모든 학생 정보 출력----");
		printData(list);
		
		
		//6. 학생 데이터 중 성명, 총점, 평균만 화면에 출력하시오.
		System.out.println("----학생 데이터 중 성명, 총점, 평균만 출력---");
		for (int i = 0; i < list.size(); i++) {
			StudentVO vo = list.get(i);
			System.out.print("성명 : " + vo.getName() + " ");	
			System.out.print("총점 :" + vo.getTot() + " ");		
			System.out.println("평균 :" + vo.getAvg());
		}
		

	}

	static void printData(ArrayList<StudentVO> list) {
		for (StudentVO vo : list) {
			vo.printData();
		}
	}
}
