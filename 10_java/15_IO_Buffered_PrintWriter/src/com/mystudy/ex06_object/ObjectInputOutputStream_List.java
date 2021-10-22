package com.mystudy.ex06_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputOutputStream_List {

	public static void main(String[] args) {
		//StudentVO 객체들을 ArrayList에 담아서 파일에 저장하고
		//파일에서 읽어들인 ArrayList 객체에 담긴 VO 정보를 화면에 출력
		
		File file = new File("file/object_io");
		
		System.out.println(">>저장할 데이터 작성");
		StudentVO stu1 = new StudentVO("21001", "서강준", 100, 100, 90);
		StudentVO stu2 = new StudentVO("21002", "강태오", 90, 90, 85);
		System.out.println("stu1 :" + stu1);
		System.out.println("stu2 :" + stu2);
		System.out.println("=======================");
		
		//ArrayList에 담기
		ArrayList<StudentVO> list = new ArrayList<>();
		list.add(stu1);
		list.add(stu2);
		System.out.println(list); //확인용.
		System.out.println("-------------------");
		
		//ArrayList 타입의 객체를 파일에 저장(Output) 
		
		try (FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(list);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//파일에 저장된 ArrayList 객체를 읽어서 화면출력(Input)
		//화면 출력시 toString () 사용하지 말고 필드값 추출해서 화면 출력
		
		System.out.println("====List를 파일에서 읽기(input)===");
		try(FileInputStream fis = new FileInputStream(file); 
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			ArrayList<StudentVO >readList = (ArrayList<StudentVO>)ois.readObject();
			System.out.println(readList);
			
			for(int i =0; i <readList.size(); i++) {
				StudentVO svo = readList.get(i);
				System.out.print(svo.getName() + "\t");
				System.out.print(svo.getTot()+ "\t");
				System.out.print(svo.getAvg());
				System.out.println();
			}
 			
			//개선된 for 문
			System.out.println("--------------");
			for( StudentVO vo :readList ) {
				System.out.println(vo.getName()+ "\t" + vo.getTot() + "\t" + vo.getAvg());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	
		
		
		
		
	}

}
