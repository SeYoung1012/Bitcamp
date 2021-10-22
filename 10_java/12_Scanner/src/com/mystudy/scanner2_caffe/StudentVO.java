package com.mystudy.scanner2_caffe;

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

	
	public StudentVO(String name, int kor, int eng, int math) {
		super(); 
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computerTotAvg(); 
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

	public void setKor(int kor) {
		if (kor >= 0 && kor <= 100) {
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
		if (eng >= 0 && eng <= 100) {
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
		if (math >= 0 && math <= 100) {
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
