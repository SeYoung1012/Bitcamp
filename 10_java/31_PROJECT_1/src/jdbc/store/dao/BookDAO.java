package jdbc.store.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.store.common.CommonUtil;
import jdbc.store.vo.BookVO;

public class BookDAO {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	
	//도서 목록 전체 조회
	public List<BookVO> selectAll() {
		
	      List<BookVO> list = new ArrayList<BookVO>();
	      conn = CommonUtil.getConnection();
	         
	      try {	         
	         
	         StringBuilder sql = new StringBuilder();
	         sql.append("SELECT ID, NAME, WRITER, PUBLISHER, CLASSFICATION, PRICE, RELEASDATE");
	         sql.append("    FROM BOOK ");
	         sql.append(" ORDER BY ID");
	         pstmt = conn.prepareStatement(sql.toString());

	      
	         rs = pstmt.executeQuery();
	         list = new ArrayList<BookVO>();
	            
	         while (rs.next()) {
	            BookVO vo = new BookVO(rs.getString("ID"), 
	                           rs.getString("NAME"), 
	                            rs.getString("WRITER"),
	                           rs.getString("PUBLISHER"), 
	                           rs.getString("CLASSFICATION"),
	                            rs.getString("PRICE"),
	                          rs.getString("RELEASDATE"));
	            
	            list.add(vo);
	         }
	            
	            
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         CommonUtil.close(conn, pstmt, rs);
	      }
	      
	      return list;
	 }
				
	
	// 제목으로 조회
	public List<BookVO> selectName(String name) {
		BookVO vo = null;
		conn = CommonUtil.getConnection();
		List<BookVO> list = new ArrayList<BookVO>();
		
		try {
			StringBuilder sql = new StringBuilder();
	        sql.append("SELECT ID, NAME, WRITER, PUBLISHER, CLASSFICATION, PRICE, RELEASDATE");
	        sql.append("    FROM BOOK ");
	        sql.append(" WHERE NAME = ?");
	        
	        pstmt = conn.prepareStatement(sql.toString());
	        
	        int index = 1;
	        pstmt.setString(index++, name);
	        
	        rs = pstmt.executeQuery();
	        list = new ArrayList<BookVO>();
	            
	        while (rs.next()) {
	        	vo = new BookVO(rs.getString("ID"), 
                        rs.getString("NAME"), 
                         rs.getString("WRITER"),
                        rs.getString("PUBLISHER"), 
                        rs.getString("CLASSFICATION"),
                         rs.getString("PRICE"),
                       rs.getString("RELEASDATE"));
	        	
	        	list.add(vo);
	            			
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			CommonUtil.close(conn, pstmt, rs);
		}

		return list;
	}
	
	
	//작가로 검색
	public List<BookVO> selectWriter(String writer) {
		BookVO vo = null;
		conn = CommonUtil.getConnection();
		List<BookVO> list = new ArrayList<BookVO>();
		
		try {
			StringBuilder sql = new StringBuilder();
	        sql.append("SELECT ID, NAME, WRITER, PUBLISHER, CLASSFICATION, PRICE, RELEASDATE");
	        sql.append("    FROM BOOK ");
	        sql.append(" WHERE WRITER = ?");
	        
	        pstmt = conn.prepareStatement(sql.toString());
	        
	        int index = 1;
	        pstmt.setString(index++, writer);
	        
	        rs = pstmt.executeQuery();
	        list = new ArrayList<BookVO>();
	            
	        while (rs.next()) {
	        	vo = new BookVO(rs.getString("ID"), 
                        rs.getString("NAME"), 
                         rs.getString("WRITER"),
                        rs.getString("PUBLISHER"), 
                        rs.getString("CLASSFICATION"),
                         rs.getString("PRICE"),
                       rs.getString("RELEASDATE"));
	        	
	        	list.add(vo);
	            			
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			CommonUtil.close(conn, pstmt, rs);
		}

		return list;
	}
	
	// 출판사로 조회
	public List<BookVO> selectPublisher(String publisher) {
		BookVO vo = null;
		conn = CommonUtil.getConnection();
		List<BookVO> list = new ArrayList<BookVO>();
		
		try {
			StringBuilder sql = new StringBuilder();
	        sql.append("SELECT ID, NAME, WRITER, PUBLISHER, CLASSFICATION, PRICE, RELEASDATE");
	        sql.append("    FROM BOOK ");
	        sql.append(" WHERE PUBLISHER = ?");
	        
	        pstmt = conn.prepareStatement(sql.toString());
	        
	        int index = 1;
	        pstmt.setString(index++, publisher);
	        
	        rs = pstmt.executeQuery();
	        list = new ArrayList<BookVO>();
	            
	        while (rs.next()) {
	        	vo = new BookVO(rs.getString("ID"), 
                        rs.getString("NAME"), 
                         rs.getString("WRITER"),
                        rs.getString("PUBLISHER"), 
                        rs.getString("CLASSFICATION"),
                         rs.getString("PRICE"),
                       rs.getString("RELEASDATE"));
	        	
	        	list.add(vo);
	            			
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			CommonUtil.close(conn, pstmt, rs);
		}

		return list;
	}
	
	
	//분류로 검색
	public List<BookVO> selectClassfication(String classfication) {
		BookVO vo = null;
		conn = CommonUtil.getConnection();
		List<BookVO> list = new ArrayList<BookVO>();
		
		try {
			StringBuilder sql = new StringBuilder();
	        sql.append("SELECT ID, NAME, WRITER, PUBLISHER, CLASSFICATION, PRICE, RELEASDATE");
	        sql.append("    FROM BOOK ");
	        sql.append(" WHERE CLASSFICATION = ?");
	        
	        pstmt = conn.prepareStatement(sql.toString());
	        
	        int index = 1;
	        pstmt.setString(index++, classfication);
	        
	        rs = pstmt.executeQuery();
	        list = new ArrayList<BookVO>();
	            
	        while (rs.next()) {
				index = 1;
				vo = new BookVO(rs.getString(index++), 
					      	rs.getString(index++), 
					       	rs.getString(index++),
					      	rs.getString(index++), 
					      	rs.getString(index++),
					       	rs.getString(index++),
					        rs.getString(index++));
				
				list.add(vo);
	            			
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			CommonUtil.close(conn, pstmt, rs);
		}

		return list;
	}

	/*
	 작가로 조회
	public BookVO selectWriter(String writer) {
		BookVO vo = null;
		conn = CommonUtil.getConnection();

		String sql = "";

		sql += "SELECT ID, NAME, WRITER, PUBLISHER,"
				    + " CLASSIFICATION, PRICE, RELEASDATE ";
		sql += "FROM BOOK ";
		sql += "WHERE WRITER =? ";

		try {
			pstmt = conn.prepareStatement(sql);

			int index = 1;
			pstmt.setString(index++, writer);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				index = 1;
				vo = new BookVO(rs.getString(index++), 
					      	rs.getString(index++), 
					       	rs.getString(index++),
					      	rs.getString(index++), 
					      	rs.getString(index++),
					       	rs.getString(index++),
					        rs.getString(index++));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			CommonUtil.close(conn, pstmt, rs);
		}

		return vo;
	}
		

		*/
    //책정보 입력
	public int insert(BookVO vo) {
		int result = 0;
		conn = CommonUtil.getConnection();

		try {
			StringBuilder sql = new StringBuilder();
			sql.append("  INSERT INTO BOOK");
			sql.append("  (ID, NAME, WRITER, PUBLISHER, CLASSFICATION, PRICE, RELEASDATE)");
			sql.append("  VALUES (?, ?, ?, ?, ?, ?, ?) ");
			pstmt = conn.prepareStatement(sql.toString());
			
			
			int index = 1;
			pstmt.setString(index++, vo.getId());
			pstmt.setString(index++, vo.getName());
			pstmt.setString(index++, vo.getWriter());
			pstmt.setString(index++, vo.getPublisher());
			pstmt.setString(index++, vo.getClassfication());
			pstmt.setString(index++, vo.getPrice());
			pstmt.setString(index++, vo.getReleasdate());

			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			CommonUtil.close(conn, pstmt);
		}
		return result;
	}
	
	//책정보 수정
	public int update(BookVO vo) {
		int result = 0;
		
		try {
			
			conn = CommonUtil.getConnection();
			if (conn == null) return 0;
			
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE BOOK ");
			sql.append(" 	SET NAME = ? ");
			sql.append("  	  , WRITER = ?");
			sql.append("  	  , PUBLISHER = ?");
			sql.append("  	  , CLASSFICATION = ?");
			sql.append("  	  , PRICE = ?");
			sql.append("  	  , RELEASDATE = ?");
			sql.append("	WHERE ID = ?");
						
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getPublisher());
			pstmt.setString(4, vo.getClassfication());
			pstmt.setString(5, vo.getPrice());
			pstmt.setString(6, vo.getReleasdate());
			pstmt.setString(7, vo.getId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			CommonUtil.close(conn, pstmt);
		}
		
		return result;
	}
	

	
	//책정보 ID값으로 삭제
	public int delete (String id) {
		int result = 0;
		conn = CommonUtil.getConnection();
		
		String sql = "DELETE FROM BOOK WHERE ID = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
}
