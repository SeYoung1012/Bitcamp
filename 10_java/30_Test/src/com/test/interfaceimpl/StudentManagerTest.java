package com.test.interfaceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagerTest {

	public static void main(String[] args) {
		// 5명 학생 정보를 만들고 구현 메소드 확인
		List<StudentVO> list = new ArrayList<>();
		StudentManagerImpl students = new StudentManagerImpl();

		StudentVO str1 = new StudentVO("11001", "서강준", 78, 87, 98);
		StudentVO str2 = new StudentVO("11002", "강태오", 90, 90, 80);
		StudentVO str3 = new StudentVO("11003", "송강", 80, 80, 70);
		StudentVO str4 = new StudentVO("11004", "서강준", 100, 100, 90);
		StudentVO str5 = new StudentVO("11005", "문빈", 97, 93, 91);

		System.out.println("=====insert()출력 =====");
		System.out.println();
		students.insert(str1);
		students.insert(str2);
		students.insert(str3);
		students.insert(str4);
		students.insert(str5);
		students.printData();
		System.out.println("----------------------");

		
		
		System.out.println("=====selectOne()출력 =====");
		System.out.println();
		StudentVO one = students.selectOne("11002");
		System.out.println(one);
		System.out.println("------------------------");

		
		
		System.out.println("====selectList()출력 ===");
		System.out.println();
		list = students.selectList("서강준");
		System.out.println(list);
		System.out.println("-------------------------");

		
		
		System.out.println("====selectAll()출력=====");
		System.out.println();
		list = students.selectAll();
		System.out.println(list);
		System.out.println("-------------------------");

		
		
		System.out.println("======update()출력=======");
		System.out.println();
		str2 = new StudentVO("11002", "강태오", 100, 85, 90);
		int grade = students.update(str2);
		System.out.println(grade);

		if (grade == 1) {
			System.out.println("[점수가 변경되었습니다.]");
		} else {
			System.out.println("[점수가 변경이 되지 않았습니다.]");
		}
		students.printData();
		System.out.println("--------------------------");

		
		System.out.println("======delete() 출력=======");
		System.out.println();
		students.delete("11003");
		students.printData();
		System.out.println("--------------------------");

	}

}
