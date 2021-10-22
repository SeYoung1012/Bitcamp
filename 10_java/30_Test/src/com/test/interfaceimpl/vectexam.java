package com.test.interfaceimpl;

import java.util.Iterator;
import java.util.Vector;

public class vectexam {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(6);
		v.add("1");
		v.add("2");
		v.add("3");
		System.out.println(v);
		System.out.println(v.size());
		
		
		String temp = v.toString();
		System.out.println(temp);

		v.remove(2);
		System.out.println(v);
		
		v.addElement("4");
		System.out.println(v);
		
		System.out.println("=====Iterator 활용 조회 ======");
		Iterator<String> ite = v.iterator();
		System.out.println(ite.hasNext());
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println(ite.hasNext());
	}

}
