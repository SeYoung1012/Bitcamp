package com.mystudy.set1_hashset;

import java.util.HashSet;

class Person {
	String name;
	int age;
	String jumin;
	
	public Person(String name, int age, String jumin) {
		this.name =name;
		this.age = age;
		this.jumin = jumin;
		
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jumin=" + jumin + "]";
	}

	@Override
	public int hashCode() {
		System.out.println(">>HashCode() 실행 ");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jumin == null) ? 0 : jumin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(">>equals() 실행 ");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (jumin == null) {
			if (other.jumin != null)
				return false;
		} else if (!jumin.equals(other.jumin))
			return false;
		return true;
	}

	
	

	
	
	
	
}

public class HashSetExam2_equals {

	public static void main(String[] args) {
		//Set : 중복데이터는 허용안함(하나만 저장)
		//참조형 데이터의 동일 데이터 여부는 equals 메소드 기준
		//equals () 메소드 오버라이딩 할 떄는 hashCode() 메소드도 함께 재정의
		//Set의 동일 데이터 확인
		//1. 해시코드 값 확인 : hashCode()
		//2. equals() 메소드 결과값이 모두 일치하면 동일데이터.
		
		HashSet<Person> set = new HashSet();
		Person p1 = new Person("서강준", 29, "931012-1234567");
		Person p2 = new Person("서강준", 29, "931012-1234567" );
		System.out.println("p1.hashCode()" + p1.hashCode());
		System.out.println("p2.hashCode()" + p2.hashCode());
		System.out.println("p1.equals(p2)" + p1.equals(p2));
		set.add(p1);
		set.add(p2);
		
//		set.add(new Person("문빈", 24, "980126-1334455"));
		
//		set.add(new Person("강태오", 28, "940620-1444455"));
//		set.add(new Person("서강준", 29, "930801-1223344"));
		
		System.out.println(set);
		
	}

}
