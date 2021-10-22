/* (실습) 테이블(TABLE) 만들기 (테이블명 : TEST2)
    NO : 숫자타입 5자리, PRIMARY KEY 선언
    ID : 문자타입 10자리 (영문 10자리), 값이 반드시 존재(NULL허용안함)
    NAME : 한글 10 자리 저장 가능하도록 설정, 값이 반드시 존재
    EMAIL: 영문, 숫자, 특수문자 포함 30자리
    ADDRESS : 한글 100자
    INNUM : 숫자 타입 정수부 7자리, 소수부 3자리(1234567.123)
    REGDATE : 날짜타입  
 *****************************/   
 CREATE TABLE TEST2 (
    NO NUMBER(5) PRIMARY KEY, 
    ID VARCHAR2(10) NOT NULL,
    NAME VARCHAR2(30) NOT NULL,
    EMAIL VARCHAR2(30),
    ADDRESS VARCHAR2(300), --한글 100글자
    INNUM NUMBER(10, 3),
    REGDATE DATE 
);
SELECT * FROM TEST2;
INSERT INTO TEST2
VALUES(1111, 'TEST1' , '서강준1' , 'TEST1@test.com' , '서울시 ', 1234567.123, sysdate);

INSERT INTO TEST2(NO, ID, NAME)--컬럼 작성시 컬럼이름위치페 테이블 매칭
VALUES (22, 'TEST2', '서강준2');

INSERT INTO TEST2(NO, NAME, ID)
VALUES (33, '서강준3','TEST3');
COMMIT;
SELECT * FROM TEST2;
--=====================================
--특정 테이블의 데이터와 함께 테이블 구조를 함께 복사
CREATE TABLE TEST3 
AS 
SELECT * FROM TEST2;

SELECT * FROM TEST2;
SELECT * FROM TEST3;
-----------------------
--특정 테이블의 특정 컬럼과 특정 데이터만 복사해서 테이블 만들기
CREATE TABLE TEST4 
AS 
SELECT NO, ID, NAME, EMAIL FROM TEST2 WHERE NO = 1111;
------------
--특정 테이블 구조만 복사(데이터는 복사하지 않음)
CREATE TABLE TEST5
AS
SELECT * FROM TEST2 WHERE 1 = 2;  
--====================
SELECT * FROM TEST2;
DELETE FROM TEST2 WHERE ID = 'TEST3';

--테이블 전체 데이터 전체 삭제
DELETE FROM TEST2; -- 모든 데이터 삭제
ROLLBACK; --DELETE 문은 ROLLBACK 명령문으로 데이터 복구 가능
------------
--TRUNCATE 명령문 : 테이블 데이터 전체 삭제 처리(ROLLBACK 불가능)
TRUNCATE TABLE TEST2;
SELECT * FROM TEST2;
ROLLBACK;

--=================================
/* 테이블을 삭제 : DROP TABLE - 테이터와 함께 테이블 구조도 모두 삭제 처리
    DROP TABLE 유저명. 테이블명;
    drop table 유저명.테이블명 cascade constraints PURGE
    -cascade constraints : 참조 데이터가 있어도 삭제 처리
    -PURGE : 휴지통에 백업없이 완전히 삭제
*/
DROP TABLE TEST2;

--=====================
/* 테이블 수정: 컬럼 추가, 수정, 삭제
DDL : ALTEL TABLE 
-ADD : 추가
-MODIFY : 수정 - 데이터 상태에 따라 적용 가능 여부 결정(SIZE, 제약 조건 등)
    --컬럼 사이즈 작은 -> 큰 : 언제나 가능
    --컬럼 사이즈 큰 -> 작은 : 저장된 데이터에 따라 다름
    
-DROP COLUMN : 삭제
*****************************/
SELECT * FROM TEST3; 
--컬럼 추가 TEST3 테이블에 ADDCOL 컬럼 추가
ALTER TABLE TEST3 ADD ADDCOL VARCHAR2(10);

--컬럼 수정 TEST3 테이블에 ADDCOL  크기 -> VALCHAR2(20)
ALTER TABLE TEST3 MODIFY ADDCOL VARCHAR2(20);
UPDATE TEST3 SET ADDCOL = '123456789012345';
SELECT * FROM TEST3;

--컬럼 수정 TEST3 테이블의 ADDCOL 크기 - VARCHAR2(15), VARCHAR(10)
ALTER TABLE TEST3 MODIFY ADDCOL VARCHAR(15); --가장 큰 데이터 15 : 변경 OK
--오류 : 
ALTER TABLE TEST3 MODIFY ADDCOL VARCHAR(10); --가장 큰 데이터 15 : 변경 OK

--컬럼삭제 : DROP COLUMN
ALTER TABLE TEST3 DROP COLUMN ADDCOL;
--------------------
ALTER TABLE TEST3 RENAME COLUMN INNUM TO TESTNUM;
SELECT * FROM TEST3;
ALTER TABLE TEST3 MODIFY (TESTNUM NOT NULL); --NULL  데이터 있으면 적용안됨

alter table "MYSTUDY"."TEST3" rename to TEST333; --테이블명 변경
--=================================



