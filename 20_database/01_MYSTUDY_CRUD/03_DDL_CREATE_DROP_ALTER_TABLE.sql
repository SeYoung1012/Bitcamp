/* (�ǽ�) ���̺�(TABLE) ����� (���̺�� : TEST2)
    NO : ����Ÿ�� 5�ڸ�, PRIMARY KEY ����
    ID : ����Ÿ�� 10�ڸ� (���� 10�ڸ�), ���� �ݵ�� ����(NULL������)
    NAME : �ѱ� 10 �ڸ� ���� �����ϵ��� ����, ���� �ݵ�� ����
    EMAIL: ����, ����, Ư������ ���� 30�ڸ�
    ADDRESS : �ѱ� 100��
    INNUM : ���� Ÿ�� ������ 7�ڸ�, �Ҽ��� 3�ڸ�(1234567.123)
    REGDATE : ��¥Ÿ��  
 *****************************/   
 CREATE TABLE TEST2 (
    NO NUMBER(5) PRIMARY KEY, 
    ID VARCHAR2(10) NOT NULL,
    NAME VARCHAR2(30) NOT NULL,
    EMAIL VARCHAR2(30),
    ADDRESS VARCHAR2(300), --�ѱ� 100����
    INNUM NUMBER(10, 3),
    REGDATE DATE 
);
SELECT * FROM TEST2;
INSERT INTO TEST2
VALUES(1111, 'TEST1' , '������1' , 'TEST1@test.com' , '����� ', 1234567.123, sysdate);

INSERT INTO TEST2(NO, ID, NAME)--�÷� �ۼ��� �÷��̸���ġ�� ���̺� ��Ī
VALUES (22, 'TEST2', '������2');

INSERT INTO TEST2(NO, NAME, ID)
VALUES (33, '������3','TEST3');
COMMIT;
SELECT * FROM TEST2;
--=====================================
--Ư�� ���̺��� �����Ϳ� �Բ� ���̺� ������ �Բ� ����
CREATE TABLE TEST3 
AS 
SELECT * FROM TEST2;

SELECT * FROM TEST2;
SELECT * FROM TEST3;
-----------------------
--Ư�� ���̺��� Ư�� �÷��� Ư�� �����͸� �����ؼ� ���̺� �����
CREATE TABLE TEST4 
AS 
SELECT NO, ID, NAME, EMAIL FROM TEST2 WHERE NO = 1111;
------------
--Ư�� ���̺� ������ ����(�����ʹ� �������� ����)
CREATE TABLE TEST5
AS
SELECT * FROM TEST2 WHERE 1 = 2;  
--====================
SELECT * FROM TEST2;
DELETE FROM TEST2 WHERE ID = 'TEST3';

--���̺� ��ü ������ ��ü ����
DELETE FROM TEST2; -- ��� ������ ����
ROLLBACK; --DELETE ���� ROLLBACK ��ɹ����� ������ ���� ����
------------
--TRUNCATE ��ɹ� : ���̺� ������ ��ü ���� ó��(ROLLBACK �Ұ���)
TRUNCATE TABLE TEST2;
SELECT * FROM TEST2;
ROLLBACK;

--=================================
/* ���̺��� ���� : DROP TABLE - �����Ϳ� �Բ� ���̺� ������ ��� ���� ó��
    DROP TABLE ������. ���̺��;
    drop table ������.���̺�� cascade constraints PURGE
    -cascade constraints : ���� �����Ͱ� �־ ���� ó��
    -PURGE : �����뿡 ������� ������ ����
*/
DROP TABLE TEST2;

--=====================
/* ���̺� ����: �÷� �߰�, ����, ����
DDL : ALTEL TABLE 
-ADD : �߰�
-MODIFY : ���� - ������ ���¿� ���� ���� ���� ���� ����(SIZE, ���� ���� ��)
    --�÷� ������ ���� -> ū : ������ ����
    --�÷� ������ ū -> ���� : ����� �����Ϳ� ���� �ٸ�
    
-DROP COLUMN : ����
*****************************/
SELECT * FROM TEST3; 
--�÷� �߰� TEST3 ���̺� ADDCOL �÷� �߰�
ALTER TABLE TEST3 ADD ADDCOL VARCHAR2(10);

--�÷� ���� TEST3 ���̺� ADDCOL  ũ�� -> VALCHAR2(20)
ALTER TABLE TEST3 MODIFY ADDCOL VARCHAR2(20);
UPDATE TEST3 SET ADDCOL = '123456789012345';
SELECT * FROM TEST3;

--�÷� ���� TEST3 ���̺��� ADDCOL ũ�� - VARCHAR2(15), VARCHAR(10)
ALTER TABLE TEST3 MODIFY ADDCOL VARCHAR(15); --���� ū ������ 15 : ���� OK
--���� : 
ALTER TABLE TEST3 MODIFY ADDCOL VARCHAR(10); --���� ū ������ 15 : ���� OK

--�÷����� : DROP COLUMN
ALTER TABLE TEST3 DROP COLUMN ADDCOL;
--------------------
ALTER TABLE TEST3 RENAME COLUMN INNUM TO TESTNUM;
SELECT * FROM TEST3;
ALTER TABLE TEST3 MODIFY (TESTNUM NOT NULL); --NULL  ������ ������ ����ȵ�

alter table "MYSTUDY"."TEST3" rename to TEST333; --���̺�� ����
--=================================



