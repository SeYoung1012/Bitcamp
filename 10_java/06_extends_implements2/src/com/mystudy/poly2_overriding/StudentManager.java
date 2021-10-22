package com.mystudy.poly2_overriding;

import java.util.Arrays;

public class StudentManager {

	public static void main(String[] args) {

		 Student s1 = new Student();
	     /*
	      // 입력
	      t1.insert(1, "김", 90, 80, 70);
	      t1.print();
	      
	      // 수정
	      t1.update(1, "이", 95, 85, 75);
	      t1.print();
	          
	      // 삭제
	      t1.delete(1);
	      t1.print();
	      */
	      // 조회
	      
	      //ArrayList<StudentDTO>[] s = new ArrayList<>[];
	      Student[] s2 = new Student[5];
	      s2[0].insert(1, "김", 90, 80, 70);
	      s2[0].print();
	      
	      s2[0].update(1, "이", 95, 85, 75);
	      s2[0].print();
	      
	      s2[0].delete(1);
	      s2[0].print();
	      
	      
	      
	      
	      
	      
	      
	      
	   }
	   

	}
		
		
		
		

