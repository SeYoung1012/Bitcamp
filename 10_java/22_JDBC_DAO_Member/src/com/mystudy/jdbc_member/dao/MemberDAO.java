package com.mystudy.jdbc_member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.mystudy.jdbc_member.common.CommonUtil;
import com.mystudy.jdbc_member.vo.MemberVO;

public class MemberDAO {

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// SELECT : 테이블 전체 데이터 조회 : selectALL : List<MemberVO>
	// SELECT : 하나의 데이터 조회(ID) : selectOne : MemberVO
	// SELECT : 하나의 데이터 조회(VO) : selectOne : MemberVO
	// SELECT : 로그인(id, password) - checkIdPassword : boolean
	// SELECT : 전체 인원수 확인 - getCountAll() : int

	// INSERT : VO 객체를 받아서 입력 -insert : int

	// UPDATE : 이름 수정 - updateName : boolean
	// UPDATE : 패스워드 수정 - updatePassword : boolean
	// UPDATE : 전화번호 수정 - updatePhone : boolean
	// UPDATE : 주소 수정 - updateAddress : boolean

	// DELETE : VO 객체를 받아서 삭제 - delete : int
	// DELETE : 키값(ID) 받아서 삭제 - delete : int
/////////////////////////////////////////////////////////////////////

	// SELECT : 테이블 전체 데이터 조회 : selectALL : List<MemberVO>
	public List<MemberVO> selectAll() {
		List<MemberVO> list = null;

		// 1. JDBC 드라이버 로딩과 DB 연결 - Connection 객체 생성 <- DriverManager
		Connection conn = CommonUtil.getConnection();
		if (conn == null)
			return null;

		try {

			// 2. SQL 문 실행
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT ID, NAME, PASSWORD, PHONE, ADDRESS");
			sql.append("  FROM MEMBER ");
			sql.append(" ORDER BY ID");
			pstmt = conn.prepareStatement(sql.toString());

			rs = pstmt.executeQuery();

			// 3. SQL 문 실행 결과에 대한 처리
			list = new ArrayList<MemberVO>();

			while (rs.next()) {
				// 3-1 DB 데이터 하나를 MemberVO에 저장 + List에 추가
				MemberVO vo = new MemberVO(rs.getString("ID"), rs.getString("NAME"), rs.getString("PASSWORD"),
						rs.getString("PHONE"), rs.getString("ADDRESS"));

				// 3-2 리스트 추가
				list.add(vo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			CommonUtil.close(conn, pstmt, rs);
		}

		return list;

	}

	// SELECT : 하나의 데이터 조회(ID) : selectOne : MemberVO
	public MemberVO selectOne(String id) {

		MemberVO vo = null;

		// 1. JDBC 드라이버 로딩과 DB 연결 - Connection 객체 생성 <- DriverManager
		Connection conn = CommonUtil.getConnection();
		if (conn == null)
			return null;

		try {

			// SQL 문 실행
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT ID, NAME, PASSWORD,PHONE, ADDRESS");
			sql.append("  FROM MEMBER ");
			sql.append(" WHERE ID = ? ");
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			// 4.SQL 실행 결과
			if (rs.next()) {
				vo = new MemberVO(rs.getString("ID"), rs.getString("NAME"), rs.getString("PASSWORD"),
						rs.getString("PHONE"), rs.getString("ADDRESS"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			CommonUtil.close(conn, pstmt, rs);
		}

		return vo;

	}

	// SELECT : 하나의 데이터 조회(VO) : selectOne : MemberVO
	public MemberVO selectOne(MemberVO vo) {

		return selectOne(vo.getId());

	}

	// SELECT : 로그인(id, password) - checkIdPassword : boolean

	public boolean checkIdPassword(String id, String password) {

		MemberVO vo = null;

		// 1. JDBC 드라이버 로딩과 DB 연결 - Connection 객체 생성 <- DriverManager
		Connection conn = CommonUtil.getConnection();

		try {

			// SQL 문 실행
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT ID, NAME, PASSWORD,PHONE, ADDRESS");
			sql.append("  FROM MEMBER ");
			sql.append(" WHERE ID = ? ");
			sql.append("       PASSWORD= ? ");

			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			// 4.SQL 실행 결과
			if (rs.next()) {
				vo = new MemberVO(rs.getString("ID"), rs.getString("NAME"), rs.getString("PASSWORD"),
						rs.getString("PHONE"), rs.getString("ADDRESS"));
				if (vo.getPassword().equals(password)) {
					return true;
				}

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			CommonUtil.close(conn, pstmt, rs);
		}

		return false;

	}

	// SELECT : 전체 인원수 확인 - getCountAll() : int

	public int getCountAll() {

		int result = 0;

		List<MemberVO> list = null;

		// 1. JDBC 드라이버 로딩과 DB 연결 - Connection 객체 생성 <- DriverManager
		Connection conn = CommonUtil.getConnection();
		try {

			// 2. SQL 문 실행
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT ID, NAME, PASSWORD, PHONE, ADDRESS");
			sql.append("  FROM MEMBER ");
			sql.append(" ORDER BY ID");
			pstmt = conn.prepareStatement(sql.toString());

			rs = pstmt.executeQuery();

			// 3. SQL 문 실행 결과에 대한 처리
			list = new ArrayList<MemberVO>();
			while (rs.next()) {
				// 3-1 DB 데이터 하나를 MemberVO에 저장 + List에 추가
				MemberVO vo = new MemberVO(rs.getString("ID"), rs.getString("NAME"), rs.getString("PASSWORD"),
						rs.getString("PHONE"), rs.getString("ADDRESS"));

				// 3-2 리스트 카운트
				list.size();
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			CommonUtil.close(conn, pstmt, rs);
		}

		return result;
	}

	// INSERT : VO 객체를 받아서 입력 -insert : int

	public int insert(MemberVO vo) {

		int result = 0;
		// 1. JDBC 드라이버 로딩과 DB 연결 - Connection 객체 생성 <- DriverManager
		Connection conn = CommonUtil.getConnection();

		try {
			// 2. SQL 문 실행
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO STUDENT ");
			sql.append("       (ID, NAME, PASSWORD, PHONE, ADDRESS) ");
			sql.append("VALUES (?, ?, ?, ?, ?) ");
			pstmt = conn.prepareStatement(sql.toString());

			int idx = 1;
			pstmt.setString(idx++, vo.getId());
			pstmt.setString(idx++, vo.getName());
			pstmt.setString(idx++, vo.getPassword());
			pstmt.setString(idx++, vo.getPhone());
			pstmt.setString(idx++, vo.getAddress());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			CommonUtil.close(conn, pstmt);
		}

		return result;

	}

	// UPDATE : 이름 수정 - updateName : boolean
	public boolean updateName(MemberVO vo) {
		int result = 0;

		// 1. JDBC 드라이버 로딩과 DB 연결 - Connection 객체 생성 <- DriverManager
		Connection conn = CommonUtil.getConnection();

		try {

			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE  ");
			sql.append("        SET NAME =?) ");
			sql.append("WHERE ID = ? ");
			pstmt = conn.prepareStatement(sql.toString());

			int index = 1;
			pstmt.setString(index++, vo.getName());
			pstmt.setString(index++, vo.getId());
			
			result = pstmt.executeUpdate();

			if (result >= 1) {
				return true;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			CommonUtil.close(conn, pstmt);
		}

		return false;
	}

	// UPDATE : 패스워드 수정 - updatePassword : boolean

	public boolean updatePassword(MemberVO vo) {
		int result = 0;

		// 1. JDBC 드라이버 로딩과 DB 연결 - Connection 객체 생성 <- DriverManager
		Connection conn = CommonUtil.getConnection();

		try {

			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE  ");
			sql.append("        SET PASSWORD =?) ");
			sql.append("WHERE ID = ? ");
			pstmt = conn.prepareStatement(sql.toString());

			int index = 1;
			pstmt.setString(index++, vo.getPassword());
			pstmt.setString(index++, vo.getId());
			
			result = pstmt.executeUpdate();

			if (result >= 1) {
				return true;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			CommonUtil.close(conn, pstmt);
		}

		return false;
	}

	// UPDATE : 전화번호 수정 - updatePhone : boolean

	public boolean updatePhone(MemberVO vo) {
		int result = 0;

		// 1. JDBC 드라이버 로딩과 DB 연결 - Connection 객체 생성 <- DriverManager
		Connection conn = CommonUtil.getConnection();

		try {

			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE  ");
			sql.append("        SET PHONE =?) ");
			sql.append("WHERE ID = ? ");
			pstmt = conn.prepareStatement(sql.toString());

			int index = 1;
			pstmt.setString(index++, vo.getPhone());
			pstmt.setString(index++, vo.getId());
			
			result = pstmt.executeUpdate();

			if (result >= 1) {
				return true;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			CommonUtil.close(conn, pstmt);
		}

		return false;
	}

	// UPDATE : 주소 수정 - updateAddress : boolean

	public boolean updateAddress(MemberVO vo) {
		int result = 0;

		// 1. JDBC 드라이버 로딩과 DB 연결 - Connection 객체 생성 <- DriverManager
		Connection conn = CommonUtil.getConnection();

		try {

			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE  ");
			sql.append("        SET ADDRESS =?) ");
			sql.append("WHERE ID = ? ");
			pstmt = conn.prepareStatement(sql.toString());

			int index = 1;
			pstmt.setString(index++, vo.getAddress());
			pstmt.setString(index++, vo.getId());
			
			result = pstmt.executeUpdate();
			
			if (result >= 1) {
				return true;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			CommonUtil.close(conn, pstmt);
		}

		return false;
	}

	// DELETE : VO 객체를 받아서 삭제 - delete : int

	public int delete(MemberVO vo) {
		int result = 0;
		
		Connection conn = CommonUtil.getConnection();
		
		try {
			
			// 3. SQL 문 실행
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM STUDENT WHERE ID = ?");
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, vo.getId());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			CommonUtil.close(conn, pstmt);
		}

		return result;

	}

	// DELETE : 키값(ID) 받아서 삭제 - delete : int

	public int delete(String id) {
		int result = 0;
		Connection conn = CommonUtil.getConnection();

		try {
			
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
			CommonUtil.close(conn, pstmt);
		}

		return result;

	}

}
