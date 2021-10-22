package com.mystudy.been;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu = new Student();
		//stu.name = "서강준";
		stu.setName("서강준");
		System.out.println("name : " + stu.getName());
		
		stu.setKor(100); 
		stu.setEng(90);
		stu.setMath(100);
		
		int tot = stu.getKor() + stu.getEng() + stu.getMath();
		stu.setTot(tot);
	
		
		double avg = stu.getTot()  * 100 /3 /100.0; //소수점 둘째 자리
		System.out.println(avg);
		stu.setAvg(avg);
		System.out.println(stu);
		
		
		
		Student stu2 = new Student("차은우", 100, 90, 82);
		System.out.println(stu2);
		
		stu2.setKor(95);
		System.out.println(stu2);
		
		
		
		
	}

}
