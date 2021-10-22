package com.test.testp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class trainning {

	public static void main(String[] args) throws IOException {

		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		FileReader fr = null;
		FileWriter fw = null;

		BufferedReader br = null;
		BufferedWriter bw = null;

		File inFile = new File("C:\\MyStudy\\datatest\\data_utf8.txt");
		File outFile = new File("C:\\MyStudy\\datatest\\start.txt");

		try {
			// 파일 읽어오기
			fr = new FileReader(inFile);
			br = new BufferedReader(fr);
			String str = br.readLine();

			while (str != null) {

				String[] strSplit = str.split(",");
				StudentVO str1 = new StudentVO(strSplit[0], strSplit[1], Integer.parseInt(strSplit[2]),
						Integer.parseInt(strSplit[3]), Integer.parseInt(strSplit[4]));

				list.add(str1);
				str = br.readLine();

			}

			printInfo(list);

			fw = new FileWriter(outFile);
			bw = new BufferedWriter(fw);

			for (int i = 0; i < list.size(); i++) {

				bw.write(list.get(i).getId() + "," + list.get(i).getName() + "," + list.get(i).getKor() + ","
						+ list.get(i).getEng() + "," + list.get(i).getMath() + "," + list.get(i).getTot() + ","
						+ list.get(i).getAvg());

				bw.newLine();
				bw.flush();

			}

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();

			} catch (IOException e) {
				e.printStackTrace();

			

		}
		
		}

	

}

	private static void printInfo(ArrayList<StudentVO> list) {
		
		System.out.println("학번" + "\t" + "이름" + "\t" +
				"국어" + "\t" + "영어" +"\t" + "수학" + "\t" 
				+ "총점" + "\t" + "평균");
		
		
		for(StudentVO vo : list) {
			
			System.out.println(vo.getId() + "\t" + vo.getName() + "\t" + 
								vo.getKor() + "\t" + vo.getEng() +"\t" + vo.getMath() +
								"\t" + vo.getTot() + "\t" + vo.getAvg());
			
			
		}
		
		
		
	}
}