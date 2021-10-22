package com.mystudy.poly2_overriding;

//메서드의 오버로딩은 하나의 클래스에서 메소드 이름을 동일하게 쓰면서 파라미터 타입, 값 등이 달라지는 것. 

///오버라이딩은 클래스가 다름. 다른 클래스에서 메소드 명이 같아야 함. 



public class TypeTest {

	public static void main(String[] args) {
		
	//	Animal an = new Animal();
		Dog dog = new Dog();
		Pig pig  = new Pig();
		Cat cat = new Cat();
		
		dog.sound();
		pig.sound();
		cat.sound();
		
		System.out.println("sound () 호출");
		sound(dog);
		sound(pig);
		sound(cat);
		

	}
	
	//부모 타입에 메소드를 만들고, 자녀타입에 똑같은 메소드가 있는지 확인. 
	//메소드 오버라이팅 활용. 
	static void sound (Animal animal) {
		animal.sound();
	}
	
	
	
	
	
	/* 다형성을 사용한 것. 
	static void sound (Animal animal ) {
		if(animal instanceof Dog) {		
		((Dog)animal).sound();
		}
		if(animal instanceof Pig) {		
			((Pig)animal).sound();
			}
		
	}
	*/
	
	
	
	//다형성을 사용하지 않으면 메소드를 늘 하나씩 추가 해야한다.
	//메소드 오버로딩 : 과적의 의미 : 쌓아간다. 
	//static void sound (Dog dog) {
			
	//		dog.sound();
		
	//}
	
	//static void sound (Pig pig) {
		
	//	pig.sound();
	
//}
	
	
}
