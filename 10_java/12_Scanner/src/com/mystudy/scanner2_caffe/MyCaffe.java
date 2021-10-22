package com.mystudy.scanner2_caffe;

import java.util.Scanner;

/* 카페만들기
 음료의 종류
 1. 아메리카노(3000) 2. 카페라테(3500) 3. 카페 모카(4000) 4. 과일주스(5000)
 입력값 : 메뉴 번호, 주문 수량, 지불금액(고객이 지불한 금액) 
 출력값 : 지불금액, 판매금액(단가 * 수량), 잔액(지불금액 - 판매금액)
 //----------------------------------------------------
 <메뉴>
 while() { 
  1. 아메리카노(3000) 2. 카페라테(3500) 3. 카페 모카(4000) 4. 과일주스(5000)
 메뉴를 선택하세요. (1~4 번까지) : 
 주문 수량 : 3
 >지불금액 : 1000
 ============================
 지불금액 : 10000
 판매금액 : 9000
 잔액 : 1000
 */

public class MyCaffe {

	Scanner scan = new Scanner(System.in);
	private static final int AMERICANO = 3000;
	private static final int CAFFELATTE = 3500;
	private static final int CAFFEMOCHA = 4000;
	private static final int JUICE = 5000;

	private int inMoney; // 지불금액
	private int ea; // 수량
	private int change; // 거스름돈(잔액)
	private int totMoney; // 판매금액
	private int income; // 매출액

	private String selectedMenuName; // 선택 메뉴명
	private int selectedMenuDanga; // 선택 메뉴 단가

	public void caffeOpen() {
		System.out.println(">> 카페 가게를 오픈합니다. ");

		while (true) {
			
			if(! isOpening()) {
				System.out.println("\n==================");
				System.out.println(">>오늘 총 판매액 : " + income + "원");
				System.out.println(">>카페를 닫습니다.");
				break;
			}
		}
	}

	private boolean isOpening() {
		boolean isOpen = true;
		// 1. 메뉴 보여주기
		showMenu();

		// 2. 메뉴선택
		String select = scan.nextLine();
		if ("0".equals(select)) {
			return false;
		}

		// 3. 수량 입력
		System.out.print(">주문수량 : ");
		ea = scan.nextInt();

		// 4. 금액 입력
		System.out.print(">입금액(원) :");
		inMoney = scan.nextInt();
		scan.nextLine(); // 줄바꿈 문자 위치까지 빈 문자열 읽어서 처리

		// 5. 계산처리
		// 5-1 판매액 계산(메뉴단가 * 수량)
		computeMoney(select);

		// 5-2. 잔액 계산(거스름돈)
		change = inMoney - totMoney;

		// 5-3. 매출 총액 계산
		income += totMoney;

		// 6. 계산 결과 화면 출력
		displayCompute();

		return true;
	}

	private void showMenu() {
		System.out.println("\n======================");
		System.out.println("1. 아메리카노(3000) 2. 카페라테(3500) 3. 카페 모카(4000) 4. 과일주스(5000) 0. 종료");
		System.out.print(">>메뉴를 선택하세요,(1~4): ");

	}

	private void displayCompute() {
		System.out.println("================");
		System.out.println("주문 메뉴 : " + selectedMenuName + "(" + selectedMenuDanga + ")");
		System.out.println("주문 수량 : " + ea + "개");
		System.out.println("입금액 : " + inMoney);
		System.out.println("----------------");
		System.out.println("판매액 : " + totMoney);
		System.out.println("거스름돈 : " + change);
		System.out.println("");

	}

	private void computeMoney(String select) {
		if ("1".equals(select)) {
			totMoney = AMERICANO * ea;
			selectedMenuDanga = AMERICANO;
			selectedMenuName = "아메리카노";
		} else if ("2".equals(select)) {
			totMoney = CAFFELATTE * ea;
			selectedMenuDanga = CAFFELATTE;
			selectedMenuName = "카페라떼";
		} else if ("3".equals(select)) {
			totMoney = CAFFEMOCHA * ea;
			selectedMenuDanga = CAFFEMOCHA;
			selectedMenuName = "카페모카";
		} else if ("4".equals(select)) {
			totMoney = JUICE * ea;
			selectedMenuDanga = JUICE;
			selectedMenuName = "과일주스";
		}

	}

	// 내가 만든 코드
	private void menu() {

		while (true) {
			System.out.print("메뉴를 골라주세요.");
			System.out.println("1. 아메리카노(3000) 2. 카페라테(3500) 3. 카페 모카(4000) 4. 과일주스(5000) 0. 종료");
			System.out.print(">>");
			int userChoice = scan.nextInt();

			if (userChoice == 1) {
				cntCount();
				totMoney = ea * AMERICANO;
				count();
				income += totMoney;

			} else if (userChoice == 2) {
				cntCount();
				totMoney = ea * CAFFELATTE;
				count();
				income += totMoney;

			} else if (userChoice == 3) {
				cntCount();
				totMoney = ea * CAFFEMOCHA;
				count();
				income += totMoney;

			} else if (userChoice == 4) {
				cntCount();
				totMoney = ea * JUICE;
				count();
				income += totMoney;

			} else if (userChoice == 0) {
				System.out.println("운영이 끝났습니다. ");

			}

		}
	}

	private int cntCount() {
		System.out.println("수량을 입력하세요.");
		ea = scan.nextInt();
		return ea;

	}

	private int count() {
		System.out.println("총 지불금액은 " + totMoney + "입니다.");
		System.out.println("지불할 금액을 입력하세요.");
		inMoney = scan.nextInt();

		if (inMoney >= totMoney) {
			change = inMoney - totMoney;

		} else {
			while (inMoney < totMoney) {
				int m = totMoney - inMoney;
				System.out.println("금액이 부족합니다 " + m + "원을 추가해주세요");
				System.out.print(">> ");
				inMoney += scan.nextInt();
			}

		}

		System.out.println("잔돈은 " + change + " 입니다");

		return change;

	}

}
