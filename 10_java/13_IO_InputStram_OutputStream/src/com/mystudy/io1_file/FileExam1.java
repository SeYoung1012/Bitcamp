package com.mystudy.io1_file;

import java.io.File;

public class FileExam1 {
	
	public static void main(String[] args) {
		//File 클래스
		String sepetator = File.separator; //파일경로 구분자
		System.out.println("File.seperator : " + File.separator);

		char seperatorChar = File.separatorChar;
		System.out.println("File.seperatorChar : " + File.separatorChar);

		
		String pathSeperator = File.pathSeparator; //경로(path) 구분자
		System.out.println("File.seperatorChar : " + File.pathSeparator);
		
		System.out.println("-----------------");
		File[] listRoots = File.listRoots();
	      for(File file : listRoots) {
	         System.out.println(file);
	      }
		
		
		
		
	}

}
