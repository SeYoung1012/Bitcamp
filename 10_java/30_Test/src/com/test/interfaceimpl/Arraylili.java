package com.test.interfaceimpl;

import java.util.ArrayList;

public class Arraylili {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(); 
		System.out.println(list1.size());
		
		list1.add(1);
		list1.add(5);
		list1.add(99);
		list1.add(54);
		System.out.println(list1.toString());
		
		list1.add(200);
		System.out.println(list1.toString());
		
		list1.add(0, 1000);
		System.out.println(list1.toString());
		
		list1.set(0, 2);
		System.out.println(list1.toString());
		
		System.out.println(list1.contains(99));
		
		
		
		ArrayList list2 = new ArrayList(); 
		System.out.println(list1.size());
		
		//리스트가 비었는지 항시 확인할 것.
		System.out.println(list2.size());
		
		
		list2.add(4);
		list2.add(8);
		list2.add(52);
		list2.add("bb");
		list2.add("서강준");
		
		System.out.println(list2);
		System.out.println(list2.size());
		System.out.println(list2.contains(4));
		
		
		 int lastindex = list2.size() -1;
		 for(int i = lastindex; i >=0; i --) {
			 list2.remove(i);
			 System.out.println(list2);
		 }
		
		
		
		
		
	}

}
