package com.test.testp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;;

public class TestTest {

	public static void main(String[] args) {

		File file = new File("C:\\MyStudy\\datatest\\data_utf8.txt"); // 절대 경로 사용.
		FileReader fr = null;

		try {
			// 1. 객체 생성
			fr = new FileReader(file);
			// 2. 객체 사용을 통해서 성적 읽기
			while (true) {
				int readChar = fr.read();
				if (readChar == -1)
					break;
				System.out.print((char) readChar);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					// 객체 사용 후 닫기.
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
