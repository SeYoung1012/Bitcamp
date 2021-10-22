package com.mystudy.been;
/*
 * 자바 빈
 * 멤버변수 (property)의 접근제어자는 ptivate
  멤버변수마다 get/set 메소드 제공(선택적으로 get만 제공)
 * get/set 메소드는 public
 * get 메소드는 파라미터가 없고, set 메소드는 하나 이상의 파라미터가 존재
 * 멤버변수가 boolean 타입이면 get메소드 대신 is  메소드 사용가능
 * 외부에서 멤버 변수가 접근시에는 get/set 메소드를 통해 접근.
 * 
 */




public class Student {
	private String name; // private 선언으로 외부에서 접근 불가
	private int kor;  //private로 다이렉트로 접근하기 보단 메소드로 접근해 관리.
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	private boolean ok;
	


	public Student() {
		//super :부모 (조상) 클래스로 만들어진 객체(인스턴스)
		//생성자의 맨 처음에 작성
		super(); //생략하면 컴파일시 자동 삽입되어 처리됨. 
	}
	
	
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computerTotAvg();
	}

	
	public void computerTotAvg() {
		tot = kor + eng + math;
		avg = tot *100 /3 /100.0;
	}
	
	
	public Student (String name ) {
		this.name = name;
	}
	
	
	//name에 대한 get 메소드 - 데이터를 가지고 가는 것. 전달 해줄 게 없고.
	public String getName() {
		return this.name;
		
	}
	
	//name에 대한 set 메소드 -외부에서 값을 가져오기에 파라미터가 필요.
	public void setName (String name) {
		 this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		if(kor >= 0 &&kor <=100) {//정상데이터.
			this.kor = kor;	
			computerTotAvg();
		}else { 
			System.out.println("[예외 발생] 점수가 범위(0~100)에서 벗어남.");
		}
		
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		if(eng < 0 && eng > 100) {//정상데이터.
			System.out.println("[예외 발생] 점수가 범위(0~100)에서 벗어남.");
			return;
		}
		this.eng = eng;
		computerTotAvg();
		
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		if(math >= 0 && math <=100) {//정상데이터.
			this.math = math;
			computerTotAvg();
		}else { 
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
	
	public boolean isOk() {  //boolean은 isOk로도 됨. 
		return ok;
	}


	public void setOk(boolean ok) {
		this.ok = ok;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot + ", avg="
				+ avg + ", ok=" + ok + "]";
	}
	
	

}
