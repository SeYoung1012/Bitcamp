--��������(�μ�����, SUB QUERY) 
--SQL(SELECT, INSERT, UPDATE, DELETE ) ���� �ִ� ������
----------------------
--�������� ������ ������ �˻�
SELECT CUSTID FROM CUSTOMER WHERE NAME = '������'; -- CUSTID :1
SELECT * FROM ORDERS WHERE CUSTID = 1;
--�������� ��� ( = �ϳ��� �� ���, �ϳ� �̻��� �� IN / NOT IN) 
SELECT * FROM ORDERS
 WHERE CUSTID = (SELECT CUSTID FROM CUSTOMER WHERE NAME = '������')
 ;
 
 --���ι� ó��
SELECT C.NAME , O.* 
 FROM ORDERS O, CUSTOMER C
 WHERE O.CUSTID = C. CUSTID 
 AND C.NAME = '������'
 ;
------------------------------
--WHERE ������ �������� ���� ��ȸ����� 2�� �̻��� ��� IN ���
--������, �迬�� ���� ����
SELECT * FROM ORDERS
 WHERE CUSTID IN (SELECT CUSTID 
                FROM CUSTOMER WHERE NAME IN ('�迬��' ,'������'));

--------------------------
--å �߿��� ������ ���� ��� ������ �̸��� ���Ͻÿ�
SELECT MAX(PRICE) FROM BOOK; -- ���� ��� å�� ���� : 35000
SELECT * FROM BOOK WHERE PRICE = 35000;

--WHERE ���� �������� ����� ��
SELECT * FROM BOOK
WHERE PRICE = (SELECT MAX(PRICE) FROM BOOK);
 
----------------------
--���������� FROM ���� ����ϴ� ���
SELECT * 
 FROM BOOK B, 
      (SELECT MAX(PRICE) MAX_PRICE FROM BOOK)M
WHERE B.PRICE = M.MAX_PRICE
;
--(�ǽ�) ���ǵ� å�� ��ձݾ� �̻��� ���� ���
SELECT *
  FROM BOOK B,
       (SELECT AVG(PRICE) AVG_PRICE FROM BOOK) A
  WHERE B.PRICE >= A.AVG_PRICE
  ;


--(�ǽ�) ������, �迬�� ���Գ���(�������� - FROM ��)
SELECT * 
  FROM ORDERS O,
        (SELECT * FROM CUSTOMER WHERE NAME IN ('�迬��', '������'))C
  WHERE O.CUSTID = C.CUSTID
;

---------------------
--SELECT ���� ���� ���� 
SELECT O.ORDERID , O.CUSTID, O.BOOKID,
        (SELECT NAME FROM CUSTOMER WHERE CUSTID = O.CUSTID )CUSTNAME, 
        (SELECT BOOKNAME FROM BOOK WHERE BOOKID = O.BOOKID ) BOOKNAME,
        O.SALEPRICE, O.ORDERDATE
 FROM ORDERS O
 ;
 
 ----------------------
 --�������� ������ å ���(å����)
 SELECT * 
 FROM BOOK
 WHERE BOOKID IN(SELECT BOOKID 
                  FROM  ORDERS
                  WHERE CUSTID IN ( SELECT CUSTID
                                    FROM CUSTOMER 
                                    WHERE NAME = '������'))
;
------------
--��������, ���ι�
--1.�ѹ��̶� ������ ������ �ִ� ���
----(�Ǵ� �ѹ��� �������� ���� ���) 
--2. 20000�� �̻�Ǵ� å�� ������ �� ��� ��ȸ
--3. '���ѹ̵��' ���ǻ��� å�� ������ ���̸� ��ȸ
--4. ��ü å���� ��պ��� ��� å�� ��� ��ȸ
----------------------------

--1.�ѹ��̶� ������ ������ �ִ� ��� 
SELECT * FROM CUSTOMER
    WHERE CUSTID IN(SELECT DISTINCT CUSTID FROM ORDERS)
;
--JOIN ��
SELECT DISTINCT C.* --DISTINCT : �ߺ������� �ϳ��� ǥ��
 FROM CUSTOMER C INNER JOIN ORDERS O
    ON C.CUSTID = O.CUSTID
 ;

--ǥ�� SQL
SELECT DISTINCT C.* 
  FROM ORDERS O INNER JOIN CUSTOMER C
             ON O.CUSTID = C.CUSTID
;



----(�Ǵ� �ѹ��� �������� ���� ���)
SELECT * FROM CUSTOMER
    WHERE CUSTID NOT IN(SELECT DISTINCT CUSTID FROM ORDERS)
;
--JOIN��
SELECT C.* 
  FROM  CUSTOMER C LEFT OUTER JOIN ORDERS O
        ON O.CUSTID = C.CUSTID
   WHERE O.ORDERID IS NULL
;

--ǥ�� SQL
SELECT C.* 
  FROM ORDERS O, CUSTOMER C
 WHERE O.CUSTID(+) = C.CUSTID
   AND O.ORDERID IS NULL
;


--2. 20000�� �̻�Ǵ� å�� ������ �� ��� ��ȸ
SELECT * FROM ORDERS WHERE SALEPRICE >= 20000;
SELECT * FROM CUSTOMER 
WHERE CUSTID IN (SELECT CUSTID FROM ORDERS WHERE SALEPRICE >= 20000);
 
--JOIN
SELECT *
FROM CUSTOMER C, ORDERS O
WHERE C.CUSTID = O.CUSTID
AND O.SALEPRICE >=20000;
 

--3. '���ѹ̵��' ���ǻ��� å�� ������ ���̸� ��ȸ
SELECT BOOKID FROM BOOK WHERE PUBLISHER = '���ѹ̵��';
 
SELECT * FROM ORDERS
WHERE BOOKID IN(3,4);

SELECT * FROM CUSTOMER
WHERE CUSTID = (SELECT CUSTID FROM ORDERS
                WHERE BOOKID IN
             (SELECT BOOKID FROM BOOK WHERE PUBLISHER = '���ѹ̵��'));

--JOIN
SELECT C.* , O.SALEPRICE, O.ORDERDATE, B.BOOKNAME, B.PUBLISHER
FROM CUSTOMER C, ORDERS O, BOOK B
WHERE C.CUSTID = O.CUSTID AND O.BOOKID = B.BOOKID --��������
 AND B.PUBLISHER = '���ѹ̵��'
;

--ǥ�� SQL
SELECT C.* , O.SALEPRICE, O.ORDERDATE, B.BOOKNAME, B.PUBLISHER
FROM CUSTOMER C INNER JOIN ORDERS O --���� ���̺� ���ι��
    ON C.CUSTID = O.CUSTID --��������
    INNER JOIN BOOK B --�������̺� ���ι��
   ON O.BOOKID = B.BOOKID --��������
 WHERE B.PUBLISHER = '���ѹ̵��' --�˻�����
;


--4. ��ü å���� ��պ��� ��� å�� ��� ��ȸ
---------------------
SELECT * 
 FROM BOOK B,
       (SELECT AVG(PRICE) AVG_PRICE FROM BOOK) A
  WHERE B.PRICE >= A.AVG_PRICE
  ORDER BY PRICE
  ;
    