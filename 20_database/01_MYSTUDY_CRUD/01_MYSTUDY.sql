--���� �ּ� ��ȣ 
/* 
���� �� �ּ� ��ȣ

*/ 
--������ ������� ���̺� ���� 
--DDL
CREATE TABLE MEMBER (
    ID VARCHAR2 (20) PRIMARY KEY, --NOT NULL + UNIQUE
    NAME VARCHAR2(30) NOT NULL, 
    PASSWORD VARCHAR2(200) NOT NULL,
    PHONE VARCHAR2(20),
    ADDRESS VARCHAR2(300)
);
----
--DML
INSERT INTO MEMBER (ID, NAME, PASSWORD)
VALUES ('HONG','ȫ�浿','1234');

--DCL 
COMMIT;
ROLLBACK; --�ӽ� ó���� �۾� ���

INSERT INTO MEMBER (ID, NAME, PASSWORD)
VALUES ('HONG2', 'ȫ�浿2', '1234');
COMMIT;
--Ű �ߺ��Է½� : ORA-00001: unique constraint (MYSTUDY.SYS_C006999) violated
INSERT INTO MEMBER (ID, NAME, PASSWORD)
VALUES ('HONG2', 'ȫ�浿2', '1234');

--NOT NULL ������ ���Է� ���� : ORA-01400: cannot insert NULL into ("MYSTUDY"."MEMBER"."PASSWORD")
INSERT INTO MEMBER (ID, NAME)
VALUES ('HONG3', 'ȫ�浿3');
------------------------------------
SELECT * FROM MEMBER;

