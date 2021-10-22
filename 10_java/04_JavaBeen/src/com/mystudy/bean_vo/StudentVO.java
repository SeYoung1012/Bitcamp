package com.mystudy.bean_vo;

//자바빈(Java Bean) 형태의 클래스 작성

//VO(Value Object) : 값을 저장하기 위한 클래스(객체) - xxxVO, xxxVo
//DTO(Date Transfer Object) : 값을 저장해서 전달하기 위한 클래스 - xxxDTO, xxxDto

public class StudentVO {
	// 필드 선언 ------------------------------------
	// 성명 - name : String
	// 국어 - kor : int
	// 영어 - eng : int
	// 수학 - math : int
	// 총점 - tot : int
	// 평균 - avg : int

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;

	// 생성자 선언 -----------------------------------
	// 생성자 - 성명, 국어, 영어, 수학 점수를 입력 받는 생성자
	// 총점 , 평균 계산처리 computerTotAvg () 사용

	
	public StudentVO(String name, int kor, int eng, int math) {
		super(); //오브젝트 클래스 객체의 인스턴스를 쓴다? 이 코드를 안써도 컴터가 자동으로 컴파일러해줌.
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computerTotAvg(); //점수가 변경될 때 재계산 처리를 함.  
	}


	// setter , getter 메소드 선언 ---------------------------------------
	// 국어, 영어, 수학 점수가 변경되면 총점, 평균 재계산 처리
	// 점수는 0~100 값만 입력 처리
	//vo는 다른 클래스가 가져다가 쓰게끔 해주는 거 
	//그래서 get은 값만 다른 클래스가 가져가는 것.(리턴된 값을 외부에서 가져다가 쓴다.)
	//set은 데이터를 전달받는 것.
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
		if (kor >= 0 && kor <= 100) {// 정상데이터.
			this.kor = kor;
			 computerTotAvg();

		} else {
			System.out.println("[예외 발생] 점수가 범위(0~100)에서 벗어남.");
		}
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if (eng >= 0 && eng <= 100) {// 정상데이터.
			this.eng = eng;
			 computerTotAvg();

		} else {
			System.out.println("[예외 발생] 점수가 범위(0~100)에서 벗어남.");
		}
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if (math >= 0 && math <= 100) {// 정상데이터.
			this.math = math;
			 computerTotAvg();

		} else {
			System.out.println("[예외 발생] 점수가 범위(0~100)에서 벗어남.");
		}
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}


	
	public void computerTotAvg() {
		tot = kor + eng + math;
		avg = tot * 100 /3 /100.0;
	}


	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + "]";
	}
	
	

	public void printData () {
		System.out.println(name + "\t" + kor + "\t" + eng +  "\t" + math +  "\t" + tot + "\t" + avg);
	}
	
}
