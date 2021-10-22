package com.mystudy.poly3_abstract_class;

import com.mystudy.poly2_overriding.Animal;

public class TypeTest {

	public static void main(String[] args) {

		// 추상클래스는 객체 생성하면 안됨
		// AbstractAnimal animal = new AbstractAnimal();

		Cat cat = new Cat();
		Dog dog = new Dog();
		sound(cat);
		sound(dog);
	}

	// 메소드 오버라이딩(overriding) 활용
	static void sound(AbstractAnimal animal) {
		animal.sound();
	}
}
