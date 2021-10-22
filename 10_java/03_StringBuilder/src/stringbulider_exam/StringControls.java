package stringbulider_exam;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringControls {

	public static void main(String[] args) {

		/* 문자열 다루기
	      0.문자열 데이터
	        String str1 = "홍길동 이순신   이순신 Tom 홍길동";
	        String str2 = "    TOM    을지문덕 김유신 연개소문";
	      1. 위의 문자열을 StringBuilder 변수 sb를 이용해서 하나의 문자열로 만들고,
	      2-1. sb의 문자열을 빈칸(" ")을 구분자로 잘라서(이름만 추출) 화면 출력(데이터확인)
	           (String.split() 또는 StringTokenizer 클래스 사용)
	            예) 홍길동 이순신 이순신 Tom 홍길동 TOM...
	      2-2. 문자열을 저장할 수 있는 배열변수(names)에 저장
	      3. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한라인에 출력(StringBuilder 객체 생성 해서 사용)
	            예) 홍길동,이순신,이순신,Tom,홍길동,TOM...   
	      4. 데이터의 첫글자만 추출해서 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
	            예) 홍,이,이,T,홍,T,을... 
	      5. 배열의 문자열중 이름의 글자수가 4 이상인 값을 "인덱스번호:이름" 출력
	            예) 인덱스번호:을지문덕
	      ********************************/
		String str1 = "홍길동 이순신   이순신 Tom 홍길동";
		String str2 = "    TOM    을지문덕 김유신 연개소문";

		// 1번 위의 문자열을 StringBuilder 변수 sb를 이용해서 하나의 문자열로 만들고,
		StringBuilder sb = new StringBuilder();
		sb.append(str1).append(str2);
		System.out.println(sb);
		String sb2 = sb.toString(); // append 합친거를 쓰려면 toString으로 새로 받아야 함.

		// sb에는 문자가 담겨 있지 않음. toString으로 값을 불러와야 함.
		// ===================================================================================

		// 2-1번 sb의 문자열을 빈칸(" ")을 구분자로 잘라서(이름만 추출) 화면 출력(데이터확인)
		//

		StringTokenizer stk = new StringTokenizer(sb.toString(), " ");
		System.out.println("토큰 갯수 : " + stk.countTokens());

		while (stk.hasMoreTokens()) {
			String name = stk.nextToken();
			System.out.println("-" + name + "-"); // name 대신 stk.nextToken써도 됨. 두번세번 사용할 거면 name

		}
		System.out.println("토큰 갯수 : " + stk.countTokens());

		// 2-2. 문자열을 저장할 수 있는 배열변수(names)에 저장
		System.out.println("토큰 재사용");
		stk = new StringTokenizer(sb.toString(), " ");
		System.out.println("토큰 갯수 : " + stk.countTokens());

		String[] names = new String[stk.countTokens()];

		int idx = 0;
		while (stk.hasMoreTokens()) {
			names[idx] = stk.nextToken();
			idx++;
		}
		System.out.println(Arrays.toString(names)); //어레이 배열을 toSrting을 써서 출력해야 함.

		System.out.println("----3번----");
		// 3번 배열에 있는 값을 구분자 콤마(,)로 구분하여 한라인에 출력(StringBuilder 객체 생성 해서 사용)
		// 두번 출력됨. 

		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < names.length; i++) {
			sb1.append(names[i]).append(",");
		}
		System.out.println(sb1.toString());
		System.out.println(sb1);
		System.out.println();

		// 두번째 방법.
		sb1 = new StringBuilder();

		for (int i = 0; i < names.length; i++) {
			if (i == 0) {
				sb1.append(names[i]);
			} else {
				sb1.append(",").append(names[i]);
			}
		}
		System.out.println(sb1.toString());

		// 세번째 방법(콤마가 마지막에 빠져있음)
		System.out.println("----------");
		sb1 = new StringBuilder();
		boolean isFisrt = true; // 첫번째 데이터냐??
		for (int i = 0; i < names.length; i++) {
			if (i == 0) {
				sb1.append(names[i]);
				isFisrt = false;
			} else {
				sb1.append(",").append(names[i]);
			}
		}
		System.out.println(sb1.toString());
		
		
		//4번째 방법
		System.out.println("----------3번 문제 4번째 풀이");
		sb1 = new StringBuilder();
		if (names.length > 0) {
			sb1.append(names[0]);
		}
		for (int i = 0; i < names.length; i++) {
			sb1.append(",").append(names[i]);

		}
		System.out.println(sb1.toString());

		// 4번 데이터의 첫글자만 추출해서 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		
		StringBuilder sb21 = new StringBuilder();
	      if(names.length > 0) {
	         sb21.append(names[0].charAt(0));
	      }
	      for(int i = 1; i < names.length; i++) {
	         sb21.append(",").append(names[i].charAt(0));
	      }
	      System.out.println("sb21 : " + sb21);
		
		// 5번 배열의 문자열중 이름의 글자수가 4 이상인 값을 "인덱스번호:이름" 출력
		sb21.setLength(0);
	    System.out.println(" sb21 " + sb21);
	    for(int i = 0; i <names.length; i++) {
	    	if(names[i].length() >= 4) {
	    		sb21.append(i + ":" +names[i] + "\n");
	    	}
	    }
	    System.out.println(sb21);
	      
		
		

	}

}
