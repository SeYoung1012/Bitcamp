package com.test.testp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ResultTest {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\MyStudy\\datatest\\data_utf8.txt"));
		// 값을 라인 별로 list에 넣음
		StringBuilder stbu = new StringBuilder();
		String st;
		int sum;
		double avg;
		List<StudentVO> list = new ArrayList<>();
		// 파일 쓰기 경로 설정 및 변수 선언
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("C:\\MyStudy\\datatest\\result.txt")));
		String splitStr[] = new String[5];

		while ((st = br.readLine()) != null) {
			splitStr = st.split(",");

			list.add(new StudentVO(splitStr[0], splitStr[1], Integer.parseInt(splitStr[2]),
					Integer.parseInt(splitStr[3]), Integer.parseInt(splitStr[4])));
		}
		   printInfo(list);
		

		for (int i = 0; i < list.size(); i++) {
			pw.println(list.get(i).getId() + "," + list.get(i).getName() + "," + list.get(i).getKor() + ","
					+ list.get(i).getEng() + "," + list.get(i).getMath() + "," + list.get(i).getTot() + ","
					+ list.get(i).getAvg());
		}
		// 파일 닫기
		pw.close();
		br.close();

	}

	private static void printInfo(List<StudentVO> list) {
		for (StudentVO stu : list) {
			System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getKor() + "," + stu.getEng() + ","
					+ stu.getMath() + "," + stu.getTot() + "," + stu.getAvg());
		}

	}
}