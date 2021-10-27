package com.spring.biz.board;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;


public class BoardServiceClient {
	public static void main(String[] args) {
		System.out.println("--- 스프링 컨테이너 구동전 ----");
		//1. 스프링 컨테이너 구동(스프링 설정 파일 읽어서)
		GenericXmlApplicationContext container
				= new GenericXmlApplicationContext("applicationContext.xml");
		
		System.out.println("--- 스프링 컨테이너 구동후 ----");
		
		//2. 스프링 컨테이너 사용 : 생성된 객체 요청(lookup)
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		BoardVO vo = new BoardVO();
		vo.setTitle("테스트-spring");
		vo.setWriter("홍길동-spring");
		vo.setContent("테스트spring-내용");
		
		//boardService.insertBoard(vo);
		
		
		
		BoardVO vo1 = new BoardVO();
		vo1.setTitle("1212테스트4");
		vo1.setContent("테스트spring4-내용");
		vo1.setSeq(12);
		
		//boardService.updateBoard(vo1);
		
		
		BoardVO vo2 = new BoardVO();
		vo2.setSeq(12);
		
		//boardService.deleteBoard(vo2);
		
		vo2.setSeq(10);
		vo2 = boardService.getBoard(vo2);
		System.out.println(vo2);
		
		List<BoardVO> list = boardService.getBoardList();
		for (BoardVO board : list) {
			System.out.println(board);
		}
		
		
		System.out.println("--- 스프링 컨테이너 사용 후 종료처리 ----");
		//3. 스프링 컨테이너 종료(close)
		container.close();
	}
}
