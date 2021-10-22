package com.mystudy.scanner2_caffe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;



public class StudentMapManager {

	public static void main(String[] args) {

		// 1. 제공된 3명과 추가한 2명의 합계 5명의 학생데이터를 생성하시오.
		StudentVO stu1 = new StudentVO("홍길동", 100, 90, 81);
		StudentVO stu2 = new StudentVO("이순신", 95, 88, 92);
		StudentVO stu3 = new StudentVO("김유신", 90, 87, 77);
		StudentVO stu4 = new StudentVO("서강준", 100, 100, 90);
		StudentVO stu5 = new StudentVO("강태오", 90, 90, 80);

		// 2. 5명의 데이터를 선택한 list/set/map 타입의 저장공간을 만들고 저장하시오.

		Map<String, StudentVO> map = new HashMap<>();
		map.put(stu1.getName(), stu1);
		map.put(stu2.getName(), stu2);
		map.put(stu3.getName(), stu3);
		map.put(stu4.getName(), stu4);
		map.put(stu5.getName(), stu5);
		System.out.println(map);

		// 3. 저장되어 있는 학생데이터를 성명, 국어, 영어, 수학 총점, 평균을 목록형태로 출력
		for(StudentVO student : map.values()) {
			student.printData(); 
			
		}

		// 4. <홍길동> 학생의 데이터 중 영어점수를 95점 수학점수를 85점으로 수정하고 수정된 값 출력.

		System.out.println(map.containsKey("홍길동"));
		StudentVO vo = map.get("홍길동");
		System.out.println(">>영어점수, 수학점수 변경 전 : " + vo.getName() + "-" + vo);
		vo.setEng(95);
		vo.setMath(85);
		System.out.println(">>영어점수, 수학점수 변경 후 : " + vo.getName() + "-" + vo);

		// 5. 최종 처리 완료된 모든 학생 정보 출력
		System.out.println("----모든 학생 정보 출력----");
		for (StudentVO student : map.values()) {
			student.printData();

		}

		// 6. 학생 데이터 중 성명, 총점, 평균만 화면에 출력하시오.
		System.out.println("----학생 데이터 중 성명, 총점, 평균만 출력---");
		StudentVO so = map.get("홍길동");
		System.out.print("성명 :" + so.getName() + " ");
		System.out.print("총점 :" + so.getTot() + " ");
		System.out.println("평균 :" + so.getAvg());

		StudentVO so2 = map.get("이순신");
		System.out.print("성명 :" + so2.getName() + " ");
		System.out.print("총점 :" + so2.getTot() + " ");
		System.out.println("평균 :" + so2.getAvg());

		StudentVO so3 = map.get("김유신");
		System.out.print("성명 :" + so3.getName() + " ");
		System.out.print("총점 :" + so3.getTot() + " ");
		System.out.println("평균 :" + so3.getAvg());

		StudentVO so4 = map.get("서강준");
		System.out.print("성명 :" + so4.getName() + " ");
		System.out.print("총점 :" + so4.getTot() + " ");
		System.out.println("평균 :" + so4.getAvg());

		StudentVO so5 = map.get("강태오");
		System.out.print("성명 :" + so5.getName() + " ");
		System.out.print("총점 :" + so5.getTot() + " ");
		System.out.println("평균 :" + so5.getAvg());

	}

}
