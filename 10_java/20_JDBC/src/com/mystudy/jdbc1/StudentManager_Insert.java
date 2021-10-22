package com.mystudy.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Insert {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 2. DB연결 - Connection 객체 생성 <- DriverManager
		// jdbc:oracle:thin:(이부분은 약속)@부터는 필요한 호스트 연결

		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mystudy", "mystudypw");
			System.out.println(">>DB 연결 성공");
		} catch (SQLException e) {
			System.out.println("[예외] DB 연결 실패!!!");
			e.printStackTrace();
		}

		// 3. Statement 문 실행(SQL 문 실행)
		Statement stmt = null;
		
		
		try {
			
			
			stmt = conn.createStatement();
			String sql = "INSERT INTO STUDENT";
			sql += "       (ID, NAME, KOR, ENG, MATH, TOT, AVG) ";
			sql += " VALUES ('2021004', '김유신2', 100, 90 ,80, 0, 0) ";
			//SELECT : executeQuery(sql)
			//INSERT, UPDATE, DELETE : executeUpdate(sql)
			int result =stmt.executeUpdate(sql);
			
			
			// 4. SQL 실행 결과에 대한 처리
			// - INSERT, UPDATE, DELETE : int 값(건수)에 대한 처리
			System.out.println("처리건수 :" +result);
	
		} catch (SQLException e1) {

			e1.printStackTrace();
		}


		// 5. 클로징 처리에 의한 자원 반납
		

		if (stmt != null) {
			try {
				stmt.close();
				System.out.println(">>Statement 객체 close");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
				System.out.println(">>Connection 객체 close");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
