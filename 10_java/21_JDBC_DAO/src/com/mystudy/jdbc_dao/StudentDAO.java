package com.mystudy.jdbc_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//DAO , Dao : Data Access Object / Database Access Object
//데이터 베이스(DB) 와 연동해서 CRUD 를 구현하는 클래스 

public class StudentDAO {
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "mystudy";
	private final String PASSWORD = "mystudypw";

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// static 초기화 구문
	static {
		// 1. JDBC 드라이버 로딩
		try {
			Class.forName(DRIVER);
			System.out.println(">>JDBC 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("[예외발생] 드라이버 로딩 실패!!");

		}

	}
	// SELECT : 테이블 전체 데이터 조회 : selectALL : List<StudentVO>
	// SELECT : 하나의 데이터 조회(ID) : selectOne : StudentVO
	// SELECT : 하나의 데이터 조회(VO) : selectOne : StudentVO
	// INSERT : VO 객체를 받아서 입력 -insert : int
	// UPDATE : VO 객체를 받아서 수정 - update : int
	// DELETE : VO 객체를 받아서 삭제 - delete : int
	// DELETE : 키값(ID) 받아서 삭제 - delete : int

	// SELECT : 테이블 전체 데이터 조회 : selectALL : List<StudentVO>
	public List<StudentVO> selectAll() {
		List<StudentVO> list = null;

		try {
			// 2. DB 연결 - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			// 3. SQL 문 실행
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG");
			sql.append("  FROM STUDENT ");
			sql.append(" ORDER BY ID");
			pstmt = conn.prepareStatement(sql.toString());

			rs = pstmt.executeQuery();

			// 4. SQL 문 실행 결과에 대한 처리
			list = new ArrayList<StudentVO>();
			while (rs.next()) {
				// DB 데이터 하나를 StudentVO에 저장 + List에 추가
				StudentVO vo = new StudentVO(rs.getString("ID"), rs.getString("NAME"), rs.getInt("KOR"),
						rs.getInt("ENG"), rs.getInt("MATH"), rs.getInt("TOT"), rs.getDouble("AVG"));

				// 리스트 추가
				list.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5. 사용객체 close();
			close(conn, pstmt, rs);

		}

		return list;

	}

	// SELECT : 하나의 데이터 조회(ID) : selectOne : StudentVO
	public StudentVO selectOne(String id) {
		StudentVO vo = null;
		// 할일) DB 연결하고 SQL문 실행해서 결과값을 vo변수에 저장하고 리턴

		try {
			// 2. DB 연결 - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			// 3. SQL 문 실행
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG");
			sql.append("  FROM STUDENT ");
			sql.append(" WHERE ID = ? ");
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			// 4.SQL 실행 결과
			if (rs.next()) {
				vo = new StudentVO(rs.getString("ID"), rs.getString("NAME"), rs.getInt("KOR"), rs.getInt("ENG"),
						rs.getInt("MATH"), rs.getInt("TOT"), rs.getDouble("AVG"));

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		close(conn, pstmt, rs);

		return vo;

	}

	private void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		// 5. 사용객체 close();
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		try {
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void close(Connection conn, PreparedStatement pstmt) {
		// 5. 사용객체 close();
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		try {
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// SELECT : 하나의 데이터 조회(VO) : selectOne : StudentVO

	public StudentVO selectOne(StudentVO vo) {

		return selectOne(vo.getId());

	}

	// (개인실습) SELECT : 하나의 데이터 조회(name) : selectList : List<StudentVO>

	public List<StudentVO> selectList(String name) {
		List<StudentVO> list = null;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG  ");
			sql.append("   FROM STUDENT ");
			sql.append("   WHERE NAME = ? ");

			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, name);

			rs = pstmt.executeQuery();

			list = new ArrayList<StudentVO>();
			if (rs.next()) {
				StudentVO vo = new StudentVO(rs.getString("ID"), rs.getString("NAME"), rs.getInt("KOR"),
						rs.getInt("ENG"), rs.getInt("MATH"), rs.getInt("TOT"), rs.getDouble("AVG"));
				list.add(vo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt, rs);
		}

		return list;
	}

	// INSERT : VO 객체를 받아서 입력 - insert : int
	public int insert(StudentVO vo) {
		int result = 0;

		try {
			// 2. DB연결 - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			// 3. SQL문 실행
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO STUDENT ");
			sql.append("       (ID, NAME, KOR, ENG, MATH, TOT, AVG) ");
			sql.append("VALUES (?, ?, ?, ?, ?, ?, ?) ");
			pstmt = conn.prepareStatement(sql.toString());

			// ? 값 설정
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getName());
			pstmt.setInt(3, vo.getKor());
			pstmt.setInt(4, vo.getEng());
			pstmt.setInt(5, vo.getMath());
			pstmt.setInt(6, vo.getTot());
			pstmt.setDouble(7, vo.getAvg());

			// SQL 실행
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt);
		}

		return result;
	}

	// (실습) UPDATE : VO 객체를 받아서 수정 - update : int
	// 국어, 영어, 수학, 총점, 평균 수정 처리
	public int update(StudentVO vo) {

		int result = 0;
	      try {
	          conn = DriverManager.getConnection(URL, USER, PASSWORD);
	          
	          StringBuilder sql = new StringBuilder();
	          sql.append("UPDATE STUDENT ");
	          sql.append("   SET KOR = ? ");
	          sql.append("     , ENG = ? ");
	          sql.append("     , MATH = ? ");
	          sql.append("     , TOT = ? ");
	          sql.append("     , AVG = ? ");
	          sql.append(" WHERE ID = ? ");
	          
	          pstmt = conn.prepareStatement(sql.toString());
	          
	          int idx = 1;
	          
	          pstmt.setInt(idx++, vo.getKor());
	          pstmt.setInt(idx++, vo.getEng());
	          pstmt.setInt(idx++, vo.getMath());
	          pstmt.setInt(idx++, vo.getTot());
	          pstmt.setDouble(idx++, vo.getAvg());
	          pstmt.setString(idx++, vo.getId());
	          
	          result = pstmt.executeUpdate();
	          
	       } catch (SQLException e) {
	          e.printStackTrace();
	       } finally {
	          close(conn, pstmt);
	       }
	       
	       return result;
	    }

	// UPDATE : 이름수정(id, name) - update : int

	public int update(StudentVO vo, String id) {

		int result = 0;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			// 3. SQL 문 실행
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE STUDENT ");
			sql.append("        SET NAME =?) ");
			sql.append("WHERE ID = ? ");
			pstmt = conn.prepareStatement(sql.toString());

			// ? 값 설정
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getId());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close(conn, pstmt);

		}

		return result;

	}

	// DELETE : VO 객체를 받아서 삭제 - delete : int
	// DELETE : 키값(ID) 받아서 삭제 - delete : int

	public int delete(StudentVO vo) {
		int result = 0;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			// 3. SQL 문 실행
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM STUDENT WHERE ID = ?");
			pstmt = conn.prepareStatement(sql.toString());

			// ? 값 설정
			pstmt.setString(1, vo.getId());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(conn, pstmt);
		}

		return result;

	}

	public int delete(String id) {
		int result = 0;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			// 3. SQL 문 실행
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM STUDENT WHERE ID = ?");
			pstmt = conn.prepareStatement(sql.toString());

			// ? 값 설정
			pstmt.setString(1, id);

			result = pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close(conn, pstmt);
		}

		return result;

	}

}
