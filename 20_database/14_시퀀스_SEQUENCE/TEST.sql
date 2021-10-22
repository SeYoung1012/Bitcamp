--DB���� ���� 
-- USER SQL
CREATE USER "TEST" IDENTIFIED BY "testpw"  
DEFAULT TABLESPACE "SYSTEM"
TEMPORARY TABLESPACE "TEMP"
;
-- QUOTAS
ALTER USER "TEST" QUOTA UNLIMITED ON "USERS";
-- ROLES
ALTER USER "TEST" DEFAULT ROLE "CONNECT","RESOURCE";

-- SYSTEM PRIVILEGES
GRANT CREATE VIEW TO "TEST" 
---======================
--MEMBER ���̺� ����
CREATE TABLE MEMBER (
    ID VARCHAR2(20) PRIMARY KEY, 
    NAME VARCHAR2(30) NOT NULL,
    PASSWORD VARCHAR2(20) NOT NULL,
    PHONE VARCHAR2(20),
    EMAIL VARCHAR2(50)
);
COMMENT ON COLUMN "TEST"."MEMBER"."ID" IS '���̵�';
   COMMENT ON COLUMN "TEST"."MEMBER"."NAME" IS '����';
   COMMENT ON COLUMN "TEST"."MEMBER"."PASSWORD" IS '��ȣ';
   COMMENT ON COLUMN "TEST"."MEMBER"."PHONE" IS '��ȭ��ȣ';
   COMMENT ON COLUMN "TEST"."MEMBER"."EMAIL" IS '�̸���';
   COMMENT ON TABLE "TEST"."MEMBER"  IS '';
COMMIT;


--BORAD ���̺� ����
CREATE TABLE BOARD (
    BNO NUMBER PRIMARY KEY,
    TITLE VARCHAR2(150) NOT NULL,
    CONTENT VARCHAR2(3000)NOT NULL,
    ID VARCHAR2(20) REFERENCES MEMBER(ID) NOT NULL, --�ܷ�Ű ����
    REGDATE DATE NOT NULL 
);
COMMENT ON COLUMN "TEST"."BOARD"."BNO" IS '�۹�ȣ';
COMMENT ON COLUMN "TEST"."BOARD"."TITLE" IS '������';
COMMENT ON COLUMN "TEST"."BOARD"."CONTENT" IS '�۳���';
COMMENT ON COLUMN "TEST"."BOARD"."ID" IS '�ۼ��ھ��̵�';
COMMENT ON COLUMN "TEST"."BOARD"."REGDATE" IS '�ۼ��Ͻ�';
COMMENT ON TABLE "TEST"."BOARD"  IS '';
COMMIT;




--BORAD ���̺� ID �÷��� �ε��� ���� 
CREATE INDEX BOARD_IDX_ID ON BOARD (ID);

----------------------------------------------


--SQL Ȱ��
--1�� ��� 3�� ������ �Է� 
INSERT INTO MEMBER
  VALUES('hong', 'ȫ�浿','hong1234','010-1111-1111','hong@test.com');
COMMIT;
INSERT INTO MEMBER
  VALUES('kim', '������','kim1234','010-2222-2222','kim@test.com');
COMMIT;
INSERT INTO MEMBER
  VALUES('kang', '������','kang1234','010-3333-3333','kang@test.com');
COMMIT;

SELECT * FROM MEMBER;

--1�� 2���� �߰��� �Է� (�� 5�� �Է�)
INSERT INTO MEMBER
 VALUES('seo', '������', 'seo1234','010-4444-4444', 'seo@test.com');
COMMIT;
INSERT INTO MEMBER
 VALUES('moon', '����', 'moon1234','010-5555-5555', 'moon@test.com');
COMMIT;
SELECT * FROM MEMBER;

--2�� �Է� ���
--ȫ�浿�� �ۼ��� �Խñ� 2�� �Է� 
INSERT INTO BOARD
 VALUES('1', 'SQL����','�����ϴ� ���Դϴ�.','hong',SYSDATE); 
COMMIT;
INSERT INTO BOARD
 VALUES('2', 'SQL����2','�����ϰ� �ֽ��ϴ�.','hong',SYSDATE);
COMMIT;

--�Է� �� ������ Ȯ��
SELECT * FROM BOARD;

--2�� ����) ������ �����Ͱ� �ִ� �� ã��
SELECT * FROM MEMBER WHERE ID = 'kim';
--��ȭ��ȣ�� �̸����� 010-2222-1234, kim@mystudy.com���� ����
UPDATE MEMBER SET PHONE = '010-2222-1234'WHERE ID = 'kim';
UPDATE MEMBER SET EMAIL = 'kim@mystudy.com' WHERE ID = 'kim';
COMMIT;
--������ ������ ���� Ȯ��
SELECT * FROM MEMBER WHERE ID = 'kim';

--3�� ����) �߰� �Է��� 2���� ȸ�������� ����
SELECT * FROM MEMBER WHERE NAME = '������';
DELETE FROM MEMBER WHERE NAME = '������';
COMMIT;
SELECT * FROM MEMBER WHERE NAME = '����';
DELETE FROM MEMBER WHERE NAME = '����';
COMMIT;

--4�� TEST ������ ���̽��� �ִ� ���̺�� ���������� Ȯ���ϰ� �ۼ��Ͻÿ�
--MEMBER ���̺� ��������
SELECT * FROM MEMBER;
--BOARD ���̺� ��������
SELECT * FROM BOARD;
--=======================
--���� 2��
--2-1) MEMBER ���̺��� NAME �÷��� MEMBER_IDX_NAME �̶�� �ε����� ����ÿ�
CREATE INDEX MEMBER_IDX_NAME ON MEMBER (NAME);
COMMIT;

--2-2) MEMBER ���̺�� BOARD ���̺��� �����Ͽ� 
--MEMBER ���̺��� ���̵�, ����, ��ȭ��ȣ, �̸��ϰ� 
--BOARD���̺��� �۹�ȣ, ����, �ۼ��� ������ ��ȸ�� �� �ִ�(VIEW_MEMBER_BOARD)�� ����ÿ�

CREATE VIEW VIEW_MEMBER_BOARD 
AS
SELECT M.ID, M.NAME, M.PHONE, M.EMAIL,
       B.BNO, B.TITLE, B.REGDATE
FROM MEMBER M, BOARD B
 WHERE M.ID = B.ID
WITH READ ONLY;

--2-3) ȫ�浿�� �ۼ��� ���� MEMBER ���̺�� BOARD ���̺��� �����ؼ� 
--����, ������, �ۼ����� �ۼ��� ������ ��ȸ�Ͻÿ�

SELECT M.NAME, B.TITLE, B.REGDATE
 FROM MEMBER M, BOARD B
 WHERE M.NAME = 'ȫ�浿'
 ORDER BY B.REGDATE
 ;

