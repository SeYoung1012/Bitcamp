package jdbc.store.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jdbc.store.dao.StorageDAO;
import jdbc.store.dao.StoreDAO;
import jdbc.store.vo.StoreVO;

public class StoreViewer {

	private StoreDAO storeDAO;
	private StorageDAO storageDAO;
	private Scanner scanner;

	public StoreViewer() {
		storeDAO = new StoreDAO();
		scanner = new Scanner(System.in);

	}

	public void startStore() {
		System.out.println(">> 지점 관리 및 조회를 시작합니다.");

		while (true) {
			if (!showmenu()) {
				scanner.close();
				break;

			}
		}
		System.out.println(">>지점 관리 및 조회를 종료합니다.");

	}

	public boolean showmenu() {
		boolean isContinue = true;
		System.out.println("1. 전 지점 조회 2. 지점별 조회 3.전 지점별 재고 조회 4. 지점 별 소장 도서 조회  5.새로운 지점 등록 6. 지점 변경 7. 지점 삭제 ");
		int adminChoice = scanner.nextInt();
		scanner.nextLine();
		if (adminChoice == 1) {
			selectAll();
		} else if (adminChoice == 2) {
			selectOne();
		} else if (adminChoice == 3) {
			storageSelectAll();
		} else if (adminChoice == 4) {
			storageSelectOne();
		} else if (adminChoice == 5) {
			insert();
		} else if (adminChoice == 6) {
			update();
		} else if (adminChoice == 7) {
			delete();
		} else {

		}
		return isContinue;
	}

	// 전체 지점 조회

	public void selectAll() {

		System.out.println("1. 전 지점 조회 2. 메뉴로 돌아가기");
		int adminChoice = scanner.nextInt();
		scanner.nextLine();
		if (adminChoice == 1) {
			storeDAO = new StoreDAO();
			List<StoreVO> list = new ArrayList<StoreVO>();
			list = storeDAO.selectAll();
			for (StoreVO vo : list) {
				System.out.println(vo);
			}

		} else if (adminChoice == 2) {

			showmenu();
		}

	}

	// 지점별 정보 조회
	public void selectOne() {
		System.out.println("1.신촌점 2.강남점 3. 잠실점 4.메뉴로 가기");
		storeDAO = new StoreDAO();
		int adminChoice = scanner.nextInt();
		scanner.nextLine();
		if (adminChoice == 1) {
			StoreVO vo = storeDAO.selectOne("신촌점");
			System.out.println(vo);
		} else if (adminChoice == 2) {
			StoreVO vo2 = storeDAO.selectOne("강남점");
			System.out.println(vo2);
		} else if (adminChoice == 3) {
			StoreVO vo3 = storeDAO.selectOne("잠실점");
			System.out.println(vo3);
		} else if (adminChoice == 4) {
			showmenu();
		}

	}

	// 지점별 재고현황 조회 //STORAGE 테이블 연결
	public void storageSelectAll() {
		System.out.println("1.전 지점별 재고 조회 2. 메뉴로 돌아가기");
		int adminChoice = scanner.nextInt();
		scanner.nextLine();
		if (adminChoice == 1) {
			storageDAO = new StorageDAO();
			List<String> list = storageDAO.selectAll();
			for (String vo8 : list) {
				System.out.println(vo8);
			}

		} else if (adminChoice == 2) {
			showmenu();
		}

	}

	// 지점별 소장된 책 현황 보기
	public void storageSelectOne() {
		System.out.println("1.지점별 소장된 책 재고 조회 2. 메뉴로 돌아가기");
		int adminChoice = scanner.nextInt();
		scanner.nextLine();
		if (adminChoice == 1) {
			storageDAO = new StorageDAO();
			List<String> list2 = storageDAO.selectOne();
			for (String vo : list2) {
				System.out.println(vo);
			}

		} else if (adminChoice == 2) {
			showmenu();
		}

	}

	// 새로운 지점 넣기
	public void insert() {
		System.out.println("1.새로운 지점 등록 2. 등록 취소 3. 메뉴로 돌아가기");
		int adminChoice = scanner.nextInt();
		if (adminChoice == 1) {
			System.out.println("새로운 지점 이름을 입력하세요.");
			System.out.print(">>");
			String StoreName = scanner.next();
			System.out.println("새로운 지점 전화번호를 입력하세요.");
			System.out.print(">>");
			String StoreCall = scanner.next();
			System.out.println("새로운 지점 주소를 입력하세요.");
			System.out.print(">>");
			String StoreAddress = scanner.next();
			System.out.println("새로운 지점 메일을 입력하세요.");
			System.out.print(">>");
			String StoreMail = scanner.next();
			System.out.println("새로운 지점 영업시간을 입력하세요.");
			System.out.print(">>");
			String StoreTime = scanner.next();
			StoreVO vo2 = new StoreVO(StoreName, StoreCall, StoreAddress, StoreMail, StoreTime);

			int result = storeDAO.insert(vo2);

			if (result == 1) {
				System.out.println("지점 등록 완료");
			} else {
				System.out.println("지점 등록 실패");
			}

		} else if (adminChoice == 2) {
			System.out.println("수정을 취소합니다. ");
		} else if (adminChoice == 3) {
			showmenu();
		}

	}

	/*
	public void updateAll() {
		System.out.println("1.지점 변경 2. 메뉴로 돌아가기");
		int adminChoice = scanner.nextInt();
		if (adminChoice == 1) {

			System.out.println("변경할 지점 이름을 입력해주세요");
			System.out.print(">> ");
			String name = scanner.next();

			System.out.println("변경할 지점 전화번호를 입력해주세요");
			System.out.print(">> ");
			String call = scanner.next();

			System.out.println("변경할 지점 주소를 입력해주세요");
			System.out.print(">> ");
			String address = scanner.next();

			System.out.println("변경할 지점 메일을 입력해주세요");
			System.out.print(">> ");
			String mail = scanner.next();

			System.out.println("변경할 지점 영업시간을 입력해주세요");
			System.out.print(">> ");
			String time = scanner.next();

			StoreVO vo = new StoreVO(name, call, address, mail, time);

			System.out.println(vo);

		} else if (adminChoice == 2) {

			showmenu();
		}
	}
*/
	// 지점 테이블 정보 수정
	public void update() {
		System.out.println("1. 지점 수정 2.메뉴로 돌아가기");
		int adminChoice = scanner.nextInt();
		scanner.nextLine();
		System.out.println("1. 지점 전화번호 수정 2. 지점 주소 수정 3.지점 영업시간 수정 4.메뉴로 돌아가기");
		adminChoice = scanner.nextInt();
		scanner.nextLine();
		if (adminChoice == 1) {
			StoreVO vo5 = new StoreVO("잠실점", "02-444-3333", "", "", "");
			storeDAO.updateCall(vo5);

		} else if (adminChoice == 2) {
			StoreVO vo6 = new StoreVO("강남점", "", "서울시 강남구 잠원동", "", "");
			storeDAO.updateAddress(vo6);

		} else if (adminChoice == 3) {
			StoreVO vo7 = new StoreVO("강남점", "", "", "", "오전10시_오후7시");
			storeDAO.updateTime(vo7);
		} else if (adminChoice == 4) {
			showmenu();

		}

	}

	// 지점 테이블 정보 삭제
	public void delete() {
		System.out.println("1.삭제하기 2.메뉴로 돌아가기");
		int adminChoice = scanner.nextInt();
		scanner.nextLine();
		if (adminChoice == 1) {
			System.out.println("삭제할 지점이름을 쓰세요.");
			String StoreName = scanner.next();
			storeDAO.delete(StoreName);
		} else if (adminChoice == 2) {
			showmenu();
		}

	}

}
