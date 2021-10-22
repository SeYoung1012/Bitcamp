package com.test.testp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ExTrainning {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int i = Integer.parseInt(br.readLine());
		int j = Integer.parseInt(br.readLine());
		
	
		for(i = 2; i <= 9; i++) {
			for(j = 1; j <= 9; j++) {
				System.out.println( i + "*"+ j + "=" + i * j);
			}
			
		}
						
		
		bw.flush();
		bw.close();
		br.close();
		
		

	}

}
