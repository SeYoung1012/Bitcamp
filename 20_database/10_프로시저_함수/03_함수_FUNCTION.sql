/* ** �Լ� (FUNCTION) ****
CREATE OR REPLACE FUNCTION FUNCTION1 
(
  PARAM1 IN VARCHAR2  --�Ķ���� �ۼ� ���
) RETURN VARCHAR2 AS  --���� ������ Ÿ�Լ���
AS
BEGIN
  RETURN NULL; -- ������ �� 
END;
-----------
--������ �����Ϳ� ���� ������ �ʿ�
 RETURN ������ ����
--���α׷� �������� �� �����ϴ� ���� �ʼ�
RETURN ���ϰ�; -- ������ ��
--���ν����� ó���ϰ� �� / �Լ��� ó���ϰ� �����޾ƾ� ��.
*****************/
--BOOKID�� å���� Ȯ���ϴ� �Լ� (�Ķ���� �� : BOOKID, RETURN �� :BOOKNAME)
CREATE OR REPLACE FUNCTION GET_BOOKNAME (
  IN_ID IN NUMBER 
) RETURN VARCHAR2  --������ ������ Ÿ�� ����
AS 
    V_BOOKNAME book.bookname%TYPE;
BEGIN
    SELECT BOOKNAME INTO V_BOOKNAME
    FROM BOOK
    WHERE BOOKID = IN_ID;

    RETURN V_BOOKNAME;  -- ���ϰ� ����

END;
------------
--�Լ�(FUNCTIOON)�� ���
--SELECT ���� ���
SELECT BOOKID, BOOKNAME , GET_BOOKNAME(BOOKID)
FROM BOOK;
------
SELECT O. * , GET_BOOKNAME(BOOKID) 
   FROM ORDERS O;
------------
--WHERE ������ �Լ� ���
SELECT O. * , GET_BOOKNAME(BOOKID) 
   FROM ORDERS O
   WHERE GET_BOOKNAME(BOOKID) = '�߱��� ��Ź��'
;
------------------------------
--(�ǽ�)��ID ���� �޾Ƽ� ������ �����ִ� �Լ� �ۼ�(CUSTOMER ���̺�)
--�Լ��� : GET_CUSTNAME
--�Լ��� ����ؼ� ORDERS ���̺� ������ ��ȸ
-----GET_BOOKNAME, GET_CUSTNAME �Լ� ��� �ֹ�(�Ǹ�) ������ å����, ���� ��ȸ
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
--��ID ���� �޾Ƽ� ������ �����ִ� �Լ� �ۼ�(CUSTOMER ���̺�)
--�Լ��� : GET_CUSTNAME

SELECT CUSTID, NAME , GET_CUSTNAME(CUSTID)
 FROM CUSTOMER;
-----GET_BOOKNAME, GET_CUSTNAME �Լ� ��� �ֹ�(�Ǹ�) ������ å����, ���� ��ȸ
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
WHERE O.BOOKID = B.BOOID AND O.CUSTID = C.CUSTID --��������
;

--�������� ���
SELECT O.*,
    (SELECT NAME FROM CUSTOMER WHERE CUSTID = O.CUSTID)CUST_NAME
    FROM ORDERS O;
 
