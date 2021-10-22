package jdbc.store.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.store.common.UtilZip;
import jdbc.store.vo.StoreVO;

public class StoreDAO {

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// SELECT : 테이블 전체 데이터 조회 : selectALL : List<StoreVO>
	public List<StoreVO> selectAll() {
		List<StoreVO> list = new ArrayList<StoreVO>();

		Connection conn = UtilZip.getConnection();

		try {

			StringBuilder sql = new StringBuilder();
			sql.append("SELECT STORENAME, STORECALL, STOREADDRESS, STOREMAIL, STORETIME ");
			sql.append("    FROM STORE ");
			sql.append(" ORDER BY STORENAME");
			pstmt = conn.prepareStatement(sql.toString());

			rs = pstmt.executeQuery();
			list = new ArrayList<StoreVO>();

			while (rs.next()) {
				
				StoreVO vo = new StoreVO(rs.getString("storeName"), rs.getString("storeCall"),
						rs.getString("storeAddress"), rs.getString("storeMail"), rs.getString("storeTime"));

				
				list.add(vo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			UtilZip.close(conn, pstmt, rs);
		}

		return list;

	}

	// SELECT : 지점확인 : selectOne : StoreVO

	public StoreVO selectOne(String storeName) {
		StoreVO vo = null;

		Connection conn = UtilZip.getConnection();

		try {

			StringBuilder sql = new StringBuilder();
			sql.append("SELECT STORENAME, STORECALL, STOREADDRESS, STOREMAIL, STORETIME");
			sql.append("  FROM STORE ");
			sql.append("  WHERE STORENAME = ? ");
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, storeName);

			rs = pstmt.executeQuery();

			
			if (rs.next()) {
				vo = new StoreVO(rs.getString("STORENAME"), rs.getNString("STORECALL"), rs.getString("STOREADDRESS"),
						rs.getString("STOREMAIL"), rs.getString("STORETIME"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			UtilZip.close(conn, pstmt, rs);
		}

		return vo;

	}

	// SELECT : 하나의 데이터 조회(VO) : selectOne : StoreVO

	public StoreVO selectOne(StoreVO vo) {
		Connection conn = UtilZip.getConnection();

		try {

			StringBuilder sql = new StringBuilder();
			sql.append("SELECT STORENAME, STORECALL, STOREADDRESS, STOREMAIL,STORETIME");
			sql.append("  FROM STORE ");
			sql.append("  WHERE STORENAME = ? ");
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, vo.getStoreName());

			rs = pstmt.executeQuery();

			

			if (rs.next()) {
				vo = new StoreVO(rs.getString("STORENAME"), rs.getNString("STORECALL"), rs.getString("STOREADDRESS"),
						rs.getString("STOREMAIL"), rs.getString("STORETIME"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			UtilZip.close(conn, pstmt, rs);
		}

		return vo;

	}

	// INSERT :VO 객체를 받아서 입력 -insert : int

	public int insert(StoreVO vo) {

		int result = 0;
		Connection conn = UtilZip.getConnection();

		try {

			StringBuilder sql = new StringBuilder();
			sql.append(" INSERT INTO STORE"  );
			sql.append("  (STORENAME, STORECALL, STOREADDRESS, STOREMAIL, STORETIME) ");
			sql.append("  VALUES ( ?, ?, ?, ?, ?) ");
			pstmt = conn.prepareStatement(sql.toString());

			
			pstmt.setString(1, vo.getStoreName());
			pstmt.setString(2, vo.getStoreCall());
			pstmt.setString(3, vo.getStoreAddress());
			pstmt.setString(4, vo.getStoreMail());
			pstmt.setString(5, vo.getStoreTime());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			UtilZip.close(conn, pstmt);
		}

		return result;

	}
	// UPDATE : 전체 수정 - updateAll 
	
	public int updateAll(StoreVO vo) {

		int result = 0;

		Connection conn = UtilZip.getConnection();

		try {

			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE  STORE");
			sql.append("      SET STORECALL = ?");
			sql.append("          ,STOREADDRESS = ?");
			sql.append("          ,STOREMAIL = ?");
			sql.append("          ,STORETIME = ?");			
			sql.append("    WHERE STORENAME= ? ");
			pstmt = conn.prepareStatement(sql.toString());

			int index = 1;
			pstmt.setString(index++, vo.getStoreCall());
			pstmt.setString(index++, vo.getStoreAddress());
			pstmt.setString(index++, vo.getStoreMail());
			pstmt.setString(index++, vo.getStoreTime());	
			pstmt.setString(index++, vo.getStoreName());
			result = pstmt.executeUpdate();

			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			UtilZip.close(conn, pstmt, rs);
		}

		return result;
	}

		

	// UPDATE : 전화번호 수정 - updateCall 

	public int updateCall(StoreVO vo) {

		int result = 0;

		Connection conn = UtilZip.getConnection();

		try {

			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE  STORE ");
			sql.append("      SET STORECALL = ?");
			sql.append("    WHERE STORENAME = ? ");
			pstmt = conn.prepareStatement(sql.toString());

			int index = 1;
			pstmt.setString(index++, vo.getStoreCall());
			pstmt.setString(index++, vo.getStoreName());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			UtilZip.close(conn, pstmt, rs);
		}

		return result;
	}

	// UPDATE : 주소 수정 - updateAddress 
	public int updateAddress(StoreVO vo) {

		int result = 0;

		Connection conn = UtilZip.getConnection();

		try {

			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE STORE ");
			sql.append("      SET STOREADDRESS = ?");
			sql.append("    WHERE STORENAME = ? ");
			pstmt = conn.prepareStatement(sql.toString());

			int index = 1;
			pstmt.setString(index++, vo.getStoreAddress());
			pstmt.setString(index++, vo.getStoreName());
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			UtilZip.close(conn, pstmt, rs);
		}

		return result;
	}

	// UPDATE : 영업시간 수정 - updateTime 

	public int updateTime(StoreVO vo) {

		int result = 0;

		Connection conn = UtilZip.getConnection();

		try {

			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE STORE");
			sql.append("      SET STORETIME = ?");
			sql.append("    WHERE STORENAME = ? ");
			pstmt = conn.prepareStatement(sql.toString());

			int index = 1;
			pstmt.setString(index++, vo.getStoreTime());
			pstmt.setString(index++, vo.getStoreName());
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			UtilZip.close(conn, pstmt, rs);
		}

		return result;
	}

	// DELETE : VO 객체를 받아서 삭제 - delete : int

	public int delete(StoreVO vo) {

		int result = 0;

		Connection conn = UtilZip.getConnection();

		try {

			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM STORE WHERE STORENAME = ?");
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, vo.getStoreName());
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			UtilZip.close(conn, pstmt);
		}

		return result;
	}

	// DELETE : 키값(StoreName) 받아서 삭제 - delete : int

	public int delete(String storeName) {

		int result = 0;

		Connection conn = UtilZip.getConnection();

		try {

			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM STORE WHERE STORENAME = ?");
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, storeName);
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			UtilZip.close(conn, pstmt);
		}
 
		return result;
	}

}
