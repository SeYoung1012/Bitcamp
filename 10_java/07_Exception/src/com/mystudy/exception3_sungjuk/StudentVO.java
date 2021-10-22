package com.mystudy.exception3_sungjuk;

//자바빈(Java Bean) 형태의 클래스 작성

//VO(Value Object) : 값을 저장하기 위한 클래스(객체) - xxxVO, xxxVo
//DTO(Date Transfer Object) : 값을 저장해서 전달하기 위한 클래스 - xxxDTO, xxxDto

public class StudentVO {


	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;

	// 생성자 선언 -----------------------------------


	
	public StudentVO(String name, int kor, int eng, int math) {
		super(); //오브젝트 클래스 객체의 인스턴스를 쓴다? 이 코드를 안써도 컴터가 자동으로 컴파일러해줌.
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computerTotAvg(); //점수가 변경될 때 재계산 처리를 함.  
	}


	public String getName() {   
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	//호출한 곳으로 예외 던지기(throws)
	public void setKor(int kor) throws JumsuOutofValueException { //발생 예외 던지기
		if (kor >= 0 && kor <= 100) {// 정상데이터.
			this.kor = kor;
			 computerTotAvg();

		} else {
			
			//System.out.println("[예외 발생] 점수가 범위(0~100)에서 벗어남.");
			throw new JumsuOutofValueException(); //예외 발생시키고 던지기 
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
