package jdbc.store.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.store.common.UtilZip;
import jdbc.store.vo.StorageVO;

public class StorageDAO {

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	//책이 어느 지점에 재고가 얼마 있는지
	public List<String>  selectOne() {

		List<String> list = null;
		StorageVO vo = null;
		Connection conn = UtilZip.getConnection();

		try {

			String sql = " ";
			sql += "SELECT B.NAME, S.STORENAME, S.BOOKCNT";
			sql += " FROM BOOK B ,STORAGE S";
			sql += " WHERE B.ID = S.BOOKID ";
			pstmt = conn.prepareStatement(sql);


			rs = pstmt.executeQuery();

			String str = "";
			list = new ArrayList<>();
			int i = 1; 
			while (rs.next()) {
				str =  "[" + i++ + "] " +  rs.getString(1) + "\t" +rs.getString(2) + "\t" +rs.getInt(3);
				list.add(str);
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			UtilZip.close(conn, pstmt, rs);
		}

		return list;
	}

	// 총 지점 재고확인

	public List<String> selectAll() {

		List<String> list = null;
		StorageVO vo = null;
		Connection conn = UtilZip.getConnection();

		try {

			String sql = " ";
			sql += "SELECT S.STORENAME, SUM(BOOKCNT)";
			sql += "FROM BOOK B, STORAGE S";
			sql += " WHERE B.ID = S.BOOKID ";
			sql += "GROUP BY S.STORENAME";
			pstmt = conn.prepareStatement(sql);

		
			rs = pstmt.executeQuery();
			
      	
			String str = " ";
			list = new ArrayList<>();
			int i = 1; 
			while (rs.next()) {
				str =  "[" + i++ + "] " +  rs.getString(1) + "\t" +rs.getInt(2);
				list.add(str);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			UtilZip.close(conn, pstmt);
		}

		return list;

	}

}
