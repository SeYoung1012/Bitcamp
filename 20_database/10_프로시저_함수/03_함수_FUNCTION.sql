/* ** 함수 (FUNCTION) ****
CREATE OR REPLACE FUNCTION FUNCTION1 
(
  PARAM1 IN VARCHAR2  --파라미터 작성 명명
) RETURN VARCHAR2 AS  --리턴 데이터 타입선언
AS
BEGIN
  RETURN NULL; -- 리턴할 값 
END;
-----------
--리턴할 데이터에 대한 선언이 필요
 RETURN 데이터 유형
--프로그램 마지막에 값 리턴하는 문장 필수
RETURN 리턴값; -- 리턴할 값
--프로시저는 처리하고 끝 / 함수는 처리하고 돌려받아야 함.
*****************/
--BOOKID로 책제목 확인하는 함수 (파라미터 값 : BOOKID, RETURN 값 :BOOKNAME)
CREATE OR REPLACE FUNCTION GET_BOOKNAME (
  IN_ID IN NUMBER 
) RETURN VARCHAR2  --리턴할 데이터 타입 지정
AS 
    V_BOOKNAME book.bookname%TYPE;
BEGIN
    SELECT BOOKNAME INTO V_BOOKNAME
    FROM BOOK
    WHERE BOOKID = IN_ID;

    RETURN V_BOOKNAME;  -- 리턴값 전달

END;
------------
--함수(FUNCTIOON)의 사용
--SELECT 절에 사용
SELECT BOOKID, BOOKNAME , GET_BOOKNAME(BOOKID)
FROM BOOK;
------
SELECT O. * , GET_BOOKNAME(BOOKID) 
   FROM ORDERS O;
------------
--WHERE 절에서 함수 사용
SELECT O. * , GET_BOOKNAME(BOOKID) 
   FROM ORDERS O
   WHERE GET_BOOKNAME(BOOKID) = '야구를 부탁해'
;
------------------------------
--(실습)고객ID 값을 받아서 고객명을 돌려주는 함수 작성(CUSTOMER 테이블)
--함수명 : GET_CUSTNAME
--함수를 사용해서 ORDERS 테이블 데이터 조회
-----GET_BOOKNAME, GET_CUSTNAME 함수 사용 주문(판매) 정보와 책제목, 고객명 조회
-----------------------------------
create or replace FUNCTION GET_CUSTNAME 
(
  IN_CUSTID IN NUMBER 
) RETURN VARCHAR2 
AS 
     V_NAME customer.name%TYPE;
BEGIN
    SELECT NAME INTO V_NAME
    FROM CUSTOMER
    WHERE CUSTID = IN_CUSTID;
    
    RETURN V_NAME; 
END ;
--고객ID 값을 받아서 고객명을 돌려주는 함수 작성(CUSTOMER 테이블)
--함수명 : GET_CUSTNAME

SELECT CUSTID, NAME , GET_CUSTNAME(CUSTID)
 FROM CUSTOMER;
-----GET_BOOKNAME, GET_CUSTNAME 함수 사용 주문(판매) 정보와 책제목, 고객명 조회
SELECT O. * , GET_BOOKNAME(BOOKID), GET_CUSTNAME(CUSTID)
 FROM ORDERS O;
 
SELECT O. * , 
    GET_BOOKNAME(BOOKID) AS BOOK_NAME,
    GET_CUSTNAME(CUSTID)AS CUST_NAME    
 FROM ORDERS O
; 
 
----------
SELECT O.* , B.BOOKNAME, C.NAME
    FROM ORDERS O, BOOK B, CUSTOMER C
WHERE O.BOOKID = B.BOOID AND O.CUSTID = C.CUSTID --조인조건
;

--서브쿼리 방식
SELECT O.*,
    (SELECT NAME FROM CUSTOMER WHERE CUSTID = O.CUSTID)CUST_NAME
    FROM ORDERS O;
 
