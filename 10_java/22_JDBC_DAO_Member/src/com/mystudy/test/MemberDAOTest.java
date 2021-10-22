package com.mystudy.test;

import java.util.List;


import com.mystudy.jdbc_member.dao.MemberDAO;
import com.mystudy.jdbc_member.vo.MemberVO;



public class MemberDAOTest {

	public static void main(String[] args) {
		
		//전체 데이터
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.selectAll();
	
		for(MemberVO mvo : list) {
			System.out.println(mvo);
		}
		
		System.out.println("----1개 데이터 조회(ID) ------ ");
		//----1개 데이터 조회(ID) ------ 
		MemberVO vo = dao.selectOne("HONG4");
		System.out.println(vo);
		System.out.println(vo.getId());
		System.out.println(vo.getName());
		
		
		MemberVO vo1 = new MemberVO("HONG4", "홍길동4" ,"1234", "010-2222-2222", "서울시");
		 vo = dao.selectOne(vo1);
		System.out.println(vo);
		
		
		System.out.println("---로그인----");
		
		
		
		
		System.out.println("---카운트 ----");
		
	
		
		

	}

}
