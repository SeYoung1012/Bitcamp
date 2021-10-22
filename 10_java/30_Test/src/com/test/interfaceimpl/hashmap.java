package com.test.interfaceimpl;

import java.util.HashMap;
import java.util.Iterator;


public class hashmap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("서강준", 100);
		map.put("문빈", 93);
		map.put("공유", 90);
		
		System.out.println(map);
		
		HashMap <String, Integer> map2 = new HashMap<>();
		
		map2.put("잘생긴서강준", 100);
		map2.put("몸좋은문빈", 95);
		System.out.println(map2);
		
		System.out.println(map.isEmpty());
		System.out.println(map2.isEmpty());
		System.out.println(map.get("서강준"));
		System.out.println(map.containsKey("문빈"));
		System.out.println(map.containsValue(90));
		
		System.out.println(map.replace("서강준", 99));
		System.out.println(map);
		
		
		
		
		

	}

}
