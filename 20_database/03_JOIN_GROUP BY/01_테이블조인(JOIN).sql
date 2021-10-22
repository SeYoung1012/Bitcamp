--������ �� ID
SELECT CUSTID FROM CUSTOMER WHERE NAME = '������'; --CUSTID : 1
--�������� ������ å�� �հ� �ݾ�
SELECT * FROM ORDERS WHERE CUSTID = 1;
SELECT SUM(SALEPRICE) FROM ORDERS WHERE CUSTID = 1;

--���� ���� (SUB QUERY) ��� 
SELECT SUM(SALEPRICE) FROM ORDERS
WHERE CUSTID = (SELECT CUSTID FROM CUSTOMER WHERE NAME = '������');

--======================
--���̺� ����(JOIN) ���
SELECT * FROM CUSTOMER WHERE CUSTID = 1;
SELECT * FROM ORDERS WHERE CUSTID = 1;

--CUSTOMER, ORDERS ���̺� ������ ���� ��ȸ
SELECT * 
FROM CUSTOMER, ORDERS
WHERE CUSTOMER.CUSTID = ORDERS.CUSTID --���� ����
AND NAME  = '������' --������ ã�� ����
;
---------------
--���̺� ���� ��Ī ������� �����ϰ� ǥ���ϰ� ���
SELECT * 
FROM CUSTOMER C, ORDERS O -- ���̺� ���� ��Ī ���
WHERE C.CUSTID = O.CUSTID --��������
AND C.NAME = '������' --�˻�����
;
--ANSI ǥ�� ���� ����
SELECT * 
  FROM CUSTOMER C INNER JOIN ORDERS O
       ON  C.CUSTID = O.CUSTID --���� ����
   WHERE  C.NAME = '������' --�˻� ����
;
----------------------
--�������� ������ �հ� �ݾ�
SELECT SUM(O. SALEPRICE)
--SELECT * 
FROM CUSTOMER C, ORDERS O --������ ���̺�
WHERE C.CUSTID = O.CUSTID --���� ����
AND C.NAME = '������' --�˻�����
;
---------------
SELECT * FROM BOOK;
SELECT * FROM ORDERS;
--������ å�� �Ǹŵ� å ���(�̵��� ������ ���ǻ�)
SELECT * 
FROM BOOK B, ORDERS O --������ ���̺�
WHERE B.BOOKID = O.BOOKID --��������
AND B.PUBLISHER LIKE '%�̵��' 
ORDER BY B.PUBLISHER, B.BOOKNAME
;
--=================================
--(�ǽ�) ���̺� �����ؼ� ��û������ ã�� 
--1. '�߱��� ��Ź��' ��� å�� �ȸ� ���� Ȯ��(å ����, �Ǹűݾ�, �Ǹ�����)
SELECT * FROM BOOK;
SELECT * FROM ORDERS;

SELECT B.BOOKNAME, O.SALEPRICE, O.ORDERDATE
FROM BOOK B, ORDERS O 
WHERE B.BOOKID = O.BOOKID
AND B.BOOKNAME = '�߱��� ��Ź��'
;
SELECT B.BOOKNAME, O.SALEPRICE, O.ORDERDATE
  FROM BOOK B INNER JOIN ORDERS O 
    ON B.BOOKID = O.BOOKID
WHERE B.BOOKNAME = '�߱��� ��Ź��'
;


--2. '�߱��� ��Ź��' ��� å�� �� ���� �ȷȴ��� Ȯ��(COUNT)
SELECT COUNT(O. SALEPRICE) 
FROM BOOK B, ORDERS O 
WHERE B.BOOKID = O.BOOKID
AND BOOKNAME = '�߱��� ��Ź��'
;

--3. '�߽ż�' ������ å���� �������� (å��, ��������)
SELECT * FROM CUSTOMER;
SELECT * FROM ORDERS;

SELECT O.SALEPRICE, O.ORDERDATE
FROM CUSTOMER C, ORDERS O 
WHERE C.CUSTID = O.CUSTID 
AND C.NAME = '�߽ż�'
;

--4. '�߽ż�'�� ������ �հ�ݾ� Ȯ��(SUM)
SELECT SUM(O. SALEPRICE) 
FROM CUSTOMER C, ORDERS O 
WHERE C.CUSTID = O.CUSTID 
AND C.NAME = '�߽ż�'
;

--5. ������, �߽ż� ������ ���� Ȯ��(�̸�, �Ǹűݾ�, �Ǹ����� )
SELECT C.NAME, O.SALEPRICE, O.ORDERDATE
FROM CUSTOMER C, ORDERS O
WHERE C.CUSTID = O.CUSTID 
AND C.NAME IN ('������','�߽ż�')
ORDER BY C.NAME, O.ORDERDATE
;

SELECT C.NAME, O.SALEPRICE, O.ORDERDATE
FROM CUSTOMER C, ORDERS O
WHERE C.CUSTID = O.CUSTID AND(C.NAME = '������' OR C. NAME = '�߽ż�')
;

SELECT C.NAME, O.SALEPRICE, O.ORDERDATE
FROM CUSTOMER C, ORDERS O
WHERE C.CUSTID = O.CUSTID 
AND (C.NAME = '������' OR C.NAME = '�߽ż�')
;
--===========================
--3�� ���̺� ����(����)�ؼ� ������ ��ȸ(�˻�, ����)
--����, å����, ���ǻ�, �ǸŰ���, �Ǹ�����
SELECT C.NAME, B.BOOKNAME, B.PUBLISHER, O.SALEPRICE, O.ORDERDATE 
 FROM ORDERS O, BOOK B, CUSTOMER C
 WHERE O.BOOKID = B.BOOKID  --��������
  AND O.CUSTID = C.CUSTID --��������
;
SELECT C.NAME, B.BOOKNAME, B.PUBLISHER, O.SALEPRICE, O.ORDERDATE 
 FROM ORDERS O, BOOK B, CUSTOMER C
 WHERE  B.BOOKID = O.BOOKID --��������
  AND O.CUSTID = C.CUSTID --��������
;
--ANSI ǥ�� SQL
SELECT C.NAME, B.BOOKNAME, B.PUBLISHER, O.SALEPRICE, O.ORDERDATE 
 FROM BOOK B INNER JOIN ORDERS O
     ON B.BOOKID = O.BOOKID
     INNER JOIN CUSTOMER C
     ON O.CUSTID = C.CUSTID
;
------------------------------
--(�ǽ�) BOOK, CUSTMER, ORDERS ���̺� ������ ��ȸ
--1. ��̶��� ������ å ����, ���԰���, ��������, ���ǻ�
--2. ��̶��� ������ å �߿� 2014-01-01 ~2014-07-08���� ������ ����
--3. '�߱��� ��Ź��'��� å�� ������ ����� �������� Ȯ��
--4. �߽ż�, ��̶��� ������ å����, ���Աݾ�, �������� Ȯ��
----(����: ����, �������� ������)
--5. �߽ż��� ������ å ����, �հ� �ݾ�, ��հ�, ���� ���å �ݾ�, ���� �� å �ݾ�
-------------------------------

--1. ��̶��� ������ å ����, ���԰���, ��������, ���ǻ�
SELECT C.NAME, B.BOOKNAME, O.SALEPRICE, O.ORDERDATE, B.PUBLISHER 
 FROM ORDERS O, BOOK B, CUSTOMER C
 WHERE O.BOOKID = B.BOOKID  
  AND O.CUSTID = C. CUSTID
  AND C.NAME = '��̶�'
;

--2. ��̶��� ������ å �߿� 2014-01-01 ~2014-07-08���� ������ ����
SELECT ORDERDATE, TO_CHAR(ORDERDATE, 'YYYY-MM-DD HH24:MI:SS') FROM ORDERS;

SELECT *
 FROM ORDERS O, BOOK B, CUSTOMER C
 WHERE O.BOOKID = B.BOOKID  
  AND O.CUSTID = C. CUSTID
  AND C.NAME = '��̶�'
  AND O.ORDERDATE  BETWEEN TO_DATE('2014-01-01', 'YYYY-MM-DD')
                AND TO_DATE('2014-07-09', 'YYYY-MM-DD') --2014-07-09 00:00:00
;


--3. '�߱��� ��Ź��'��� å�� ������ ����� �������� Ȯ��
SELECT B.BOOKNAME, C.NAME, O.ORDERDATE, O.SALEPRICE
FROM BOOK B, CUSTOMER C, ORDERS O
WHERE O.BOOKID = B.BOOKID  AND O.CUSTID = C.CUSTID --��������
AND B.BOOKNAME = '�߱��� ��Ź��'
;

---4. �߽ż�, ��̶��� ������ å����, ���Աݾ�, �������� Ȯ��
----(����: ����, �������� ������)

SELECT C.NAME, B.BOOKNAME, O.SALEPRICE, O.ORDERDATE
FROM CUSTOMER C, ORDERS O ,BOOK B
WHERE O.BOOKID = B.BOOKID AND O.CUSTID = C.CUSTID 
AND C.NAME IN ('��̶�','�߽ż�')
ORDER BY C.NAME, O.ORDERDATE
--ORDER BY 1,4 (��ġ��)
;

--5. �߽ż��� ������ å ����, �հ� �ݾ�, ��հ�, ���� ���å �ݾ�, ���� �� å �ݾ�

SELECT COUNT(*),SUM(O. SALEPRICE) ,AVG(O.SALEPRICE),  MAX((O.SALEPRICE)), MIN((O.SALEPRICE))
    FROM CUSTOMER C, ORDERS O 
  WHERE C.CUSTID = O.CUSTID 
  AND C.NAME = '�߽ż�' --���� ���� ��� ���
;


SELECT C.NAME, COUNT(*), SUM(O.SALEPRICE), 
        ROUND(AVG(O.SALEPRICE)) --�ݿø�ROUND
        , MAX(O.SALEPRICE), MIN(O.SALEPRICE)
    FROM CUSTOMER C, ORDERS O
    WHERE C.CUSTID = O.CUSTID
    GROUP BY C.NAME
;










