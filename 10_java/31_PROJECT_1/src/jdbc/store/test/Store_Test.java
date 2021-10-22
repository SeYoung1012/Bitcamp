package jdbc.store.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.store.common.UtilZip;
import jdbc.store.dao.StorageDAO;
import jdbc.store.dao.StoreDAO;
import jdbc.store.vo.StorageVO;
import jdbc.store.vo.StoreVO;

public class Store_Test {

	public static void main(String[] args) {

		StoreDAO dao = new StoreDAO();
		List<StoreVO> list = new ArrayList<StoreVO>();

		list = dao.selectAll();

		System.out.println("==selectAll 테스트====");

		for (StoreVO vo : list) {
			System.out.println(vo);
		}

		System.out.println("==selectOne(지점이름) 테스트 =====");

		StoreVO vo = dao.selectOne("신촌점");
		System.out.println("지점확인" + vo);

		System.out.println("===SELECT ONE (VO) 테스트====");

		vo = new StoreVO("신촌점", "", "", "", "");
		StoreVO vo3 = dao.selectOne(vo);
		System.out.println("StoreVO vo검색" + vo3);

		// System.out.println("===INSERT(vo) 테스트 ====");
		// StoreVO vo2 = new StoreVO("서촌점", "02-444-4444","서울시 종로구 누하동", "ch@store.com",
		// "오전11시_오후8시");
		// System.out.println(">>insert처리건수:" + dao.insert(vo2));

		// System.out.println("===INSERT(vo) 테스트 ====");
		// StoreVO vo2 = new StoreVO("광화문점", "02-555-5555", "서울시 종로구 청진동",
		// "ch@store.com", 5, "오전11시_오후8시");
		// System.out.println(">>insert처리건수:" + dao.insert(vo2));

		//System.out.println("====업데이트(지점 이름)==");
		//System.out.println("업데이트처리여부: " + dao.updateName("홍대점"));
		//System.out.println();

	//	System.out.println("====업데이트(지점 전화번호 )==");
	//	StoreVO vo5 = new StoreVO("잠실점", "02-444-3333");
	//	System.out.println("업데이트처리여부: " + dao.updateCall(vo5));
	//	System.out.println();

		//System.out.println("====업데이트(지점 주소 변경 )==");
		StoreVO vo6 = new StoreVO("강남점", "","서울시 강남구 서초동","","");
		System.out.println("업데이트처리여부: " + dao.updateAddress(vo6));
		System.out.println();

		//System.out.println("====업데이트(지점 영업시간 변경)==");
	    StoreVO vo7 = new StoreVO("강남점", "","","","오전10시_오후시");
	    System.out.println("업데이트처리여부: " + dao.updateTime(vo7));
		System.out.println();

		// System.out.println("DELETE 삭제 ");
		// StoreVO vo5 = dao.selecOne("서촌점");
		// System.out.println("서촌점 삭제");
		// System.out.println("삭제처리여부:" + dao.delete(vo5));
		// System.out.println();

		
		// System.out.println("===INSERT(vo) 테스트 ====");
		// StoreVO vo2 = new StoreVO("서촌점2", "02-555-5555","서울시 종로구 누하동",
		// "ch@store.com", 5, "오전11시_오후8시");
		// System.out.println(">>insert처리건수:" + dao.insert(vo2));

		
		// System.out.println("DELETE name 삭제");
		// System.out.println("서촌점2");
		// System.out.println("삭제처리여부:" +dao.delete("서촌점2"));
		
		StorageDAO dao2 = new StorageDAO();
		List<String> list3 = dao2.selectOne();
		for (String vo8 : list3) {
			System.out.println(vo8);
		}
		System.out.println();
		
		
		StorageDAO dao1 = new StorageDAO();
		List<String> list2 = dao1.selectAll();
		for (String vo9 : list2) {
			System.out.println(vo9);
		}
		
		

	}

}
