package com.mystudy.jdbc_dao;

import java.util.List;

public class StudentDAO_Test {

	public static void main(String[] args) {
		//전체 데이터
		StudentDAO dao = new StudentDAO();
		List<StudentVO> list = dao.selectAll();
		
		for(StudentVO svo : list) {
			System.out.println(svo);
		}
		System.out.println("----1개 데이터 조회(ID) ------ ");
		//----1개 데이터 조회(ID) ------ 
		StudentVO vo = dao.selectOne("2021001");
		System.out.println(vo);
		System.out.println(vo.getId());
		System.out.println(vo.getName());
		
		StudentVO vo1 = new StudentVO("2021002", "test" ,0,0,0);
		 vo = dao.selectOne(vo1);
		System.out.println(vo);
		
		System.out.println("--SELECTLIST--");
		List<StudentVO> list2 = dao.selectList("홍길동");
	      System.out.println(list2.toString());
		
	
		
//		System.out.println("---- 입력(INSERT) -----");
		StudentVO insertVO = new StudentVO("2021011", "테스트11", 100, 90, 81);
//	    int result = dao.insert(insertVO);
//		System.out.println(">> 입력건수 : " + result);
		
//		System.out.println("--- 입력데이터 조회 ---");
//		StudentVO insertResultVO = dao.selectOne(insertVO);
//		System.out.println(insertResultVO);
		
		
		System.out.println("--수정(UPDATE) --------");
		StudentVO updateVO = new StudentVO("2021012", "테스트12", 99, 88, 77);
		int updateCnt = dao.update(updateVO);
		System.out.println("수정건수 : " +updateCnt);
		System.out.println("update 결과 :" + dao.selectOne(updateVO));
		 
		
		System.out.println("---삭제(DELETE) ------");
		int deleteCnt = dao.delete(insertVO.getId());
		System.out.println("삭제건수 : " + deleteCnt);
		
		if(dao.selectOne(insertVO)  == null) {
			System.out.println(">>ID : "  + insertVO.getId() + "데이터가 없습니다.");
		}else {
			System.out.println("삭제데이터 조회 결과 : " + dao.selectOne(insertVO));
			
		}
		
		
		
		

		
	}

}
