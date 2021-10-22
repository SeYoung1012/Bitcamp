CREATE TABLE BOOK (
	"BOOK_ID" VARCHAR2(20 BYTE), 
	"BOOK_TITLE" VARCHAR2(100 BYTE), 
	"SUBTITLE" VARCHAR2(100 BYTE), 
	"WRITER" VARCHAR2(50 BYTE), 
	"TRANSLATOR" VARCHAR2(50 BYTE), 
	"PUBLISHER" VARCHAR2(50 BYTE), 
	"RELEASE_DATE" DATE, 
	"BOOK_PRICE" NUMBER, 
	"SALE_RPICE" NUMBER, 
	"BOOK_SALE_RATE" NUMBER
   );
   
   
   CREATE TABLE CART (
   	"MEMBER_ID" VARCHAR2(20 BYTE), 
	"BOOK_ID" VARCHAR2(20 BYTE), 
	"BOOK_AMOUNT" VARCHAR2(20 BYTE), 
	"PRICE_SUM" NUMBER
   ); 
   
   CREATE TABLE MEMBER ( 
   	"MEMBER_ID" VARCHAR2(20 BYTE), 
	"NAME" VARCHAR2(50 BYTE), 
	"PHONE" VARCHAR2(20 BYTE), 
	"EMAIL" VARCHAR2(20 BYTE), 
	"ROLE" VARCHAR2(20 BYTE), 
	"ADDRESS" VARCHAR2(300 BYTE), 
	"LOGIN_ID" VARCHAR2(20 BYTE), 
	"LOGIN_PASSWORD" VARCHAR2(20 BYTE)
   );
   
   CREATE TABLE ORDERS( 
   	"ORDER_ID" VARCHAR2(20 BYTE), 
	"MEMBER_ID" VARCHAR2(20 BYTE), 
	"ORDER_PRICE" NUMBER, 
	"ORDER_DATE" DATE
   ); 
   
 CREATE TABLE ORDER_BOOK (
   	"ORDER_ID" VARCHAR2(20 BYTE), 
	"BOOK_ID" VARCHAR2(20 BYTE), 
	"BOOK_PRICE" NUMBER, 
	"BOOK_AMOUNT" VARCHAR2(20 BYTE), 
	"ORDER_STATUS" VARCHAR2(200 BYTE)
   );  
   
   
CREATE TABLE SHIPPING ( 
   	"SHIPPING_ID" VARCHAR2(20 BYTE), 
	"MEMBER_ID" VARCHAR2(20 BYTE), 
	"NICKNAME" VARCHAR2(20 BYTE), 
	"NAME" VARCHAR2(50 BYTE), 
	"PHONE" VARCHAR2(20 BYTE), 
	"ADDRESS" VARCHAR2(300 BYTE)
   ) 
   
   
Insert into BOOK values ('1','달러구트 꿈 백화점. 2',null,'이미예',null,'팩토리나인',to_date('21/07/27','RR/MM/DD'),13800,12420,10);
Insert into BOOK values ('2','달러구트 꿈 백화점',null,'이미예',null,'팩토리나인',to_date('21/07/08','RR/MM/DD'),13800,12420,10);
Insert into BOOK values ('3','소크라테스 익스프레스','철학이 우리 인생에 스며드는 순간','에릭 와이너','김하현','어크로스',to_date('21/04/28','RR/MM/DD'),18000,16200,10);
Insert into BOOK values ('4','아직 끝이 아니다',null,'김연경',null,'가연',to_date('21/03/12','RR/MM/DD'),14000,12600,10);
Insert into BOOK values ('5','주식투자의 지혜(개정판)','진정한 고수는 얽매이지 않는다|','천장팅','김재현','에프엔미디어',to_date('21/06/10','RR/MM/DD'),18000,16200,10);
Insert into BOOK  values ('6','구의 증명(은행나무 노벨라 7)',null,'최진영',null,'은행나무',to_date('15/03/30','RR/MM/DD'),8000,7200,10);
Insert into BOOK  values ('7','미드나잇 라이브러리',null,'매트 헤이그','노진선','인플루엔셜',to_date('21/04/28','RR/MM/DD'),15800,14220,10);
Insert into BOOK  values ('8','데일 카네기 인간관계론','시대를 초월한 인간관계의 바이블','데일 카네기','임상훈','현대지성',to_date('19/10/07','RR/MM/DD'),11500,10350,10);
Insert into BOOK  values ('9','세금 내는 아이들',null,'옥효진',null,'한국경제신문',to_date('21/06/15','RR/MM/DD'),14000,12600,10);
Insert into BOOK  values ('10','어린이라는 세계',null,'김소영',null,'사계절',to_date('20/11/16','RR/MM/DD'),15000,13500,10);
Insert into BOOK values ('11','잘했고 잘하고 있고 잘 될 것이다',null,'정영욱',null,'부크럼',to_date('21/05/14','RR/MM/DD'),15000,13500,10);
Insert into BOOK  values ('12','4~7세보다 중요한 시기는 없습니다',null,'이임숙',null,'카시오페아',to_date('21/08/02','RR/MM/DD'),16000,14400,10);
Insert into BOOK  values ('13','넥스트 그린 레볼루션',null,'조원경',null,'페이지2북스',to_date('21/07/15','RR/MM/DD'),18000,16200,10);
Insert into BOOK  values ('14','돈의 심리학(양장본 HardCover)','당신의 부에 영향을 미치는 돈의 심리학','모건 하우절','이지연','인플루엔셜',to_date('21/01/13','RR/MM/DD'),19800,17820,10);
Insert into BOOK  values ('15','그게 너였으면 좋겠다',null,'일홍',null,'피카(FIKA)',to_date('21/04/26','RR/MM/DD'),15500,13950,10);
Insert into BOOK  values ('16','운의 알고리즘',null,'정회도',null,'소울소사이어티',to_date('21/04/28','RR/MM/DD'),16000,14400,10);
Insert into BOOK values ('17','위너는 어떻게 결정되는가',null,'박시영',null,'김영사',to_date('21/08/10','RR/MM/DD'),16500,14850,10);
Insert into BOOK values ('18','약속의 땅(양장본 HardCover)','버락 오바마 회고록','버락 오바마','노승영','웅진지식하우스',to_date('21/07/28','RR/MM/DD'),33000,29700,10);
Insert into BOOK values ('19','크래프톤 웨이',null,'이기문',null,'김영사',to_date('21/07/01','RR/MM/DD'),22000,19800,10);
Insert into BOOK  values ('20','모순(양장본 HardCover)',null,'양귀자',null,'쓰다',to_date('13/04/01','RR/MM/DD'),13000,11700,10);
Insert into BOOK  values ('21','나는 주식 대신 달러를 산다',null,'박성현',null,'알에이치코리아',to_date('20/05/30','RR/MM/DD'),16000,14400,10);
Insert into BOOK  values ('22','설민석의 한국사 대모험. 17',null,'설민석',null,'아이휴먼',to_date('21/07/21','RR/MM/DD'),12000,10800,10);
Insert into BOOK  values ('23','인간 실격(세계문학전집 103)','다자이 오사무 사후 70주년 특별판','다자이 오사무','김춘미','민음사',to_date('12/04/10','RR/MM/DD'),8000,7200,10);
Insert into BOOK  values ('24','코스모스(보급판)','사이언스 클래식 4 [양장]','칼 세이건','홍승수','사이언스북스',to_date('10/01/20','RR/MM/DD'),18500,16650,10);
Insert into BOOK  values ('25','생각이 너무 많은 서른 살에게',null,'김은주',null,'메이븐',to_date('21/06/10','RR/MM/DD'),16000,14400,10);
Insert into BOOK  values ('26','돈의 역사는 되풀이된다',null,'홍춘욱',null,'포르체',to_date('21/06/16','RR/MM/DD'),16000,14400,10);
Insert into BOOK values ('27','죽이고 싶은 아이',null,'이꽃님',null,'우리학교',to_date('21/06/07','RR/MM/DD'),12500,11250,10);
Insert into BOOK values ('28','최고의 변화는 어떻게 만들어지는가','쉽고 단순하게 나를 바꾸는 사람들의 비밀','벤저민 하디','이한이','비즈니스북스',to_date('21/07/06','RR/MM/DD'),16000,14400,10);
Insert into BOOK  values ('29','설민석의 세계사 대모험. 9',null,'설민석',null,'단꿈아이',to_date('21/06/30','RR/MM/DD'),12000,10800,10);
Insert into BOOK values ('30','지구인만큼 지구를 사랑할 순 없어',null,'정세랑',null,'위즈덤하우스',to_date('21/06/10','RR/MM/DD'),16800,15120,10);
Insert into BOOK values ('31','아파트 청약 이렇게 쉬웠어?',null,'김태훈(베니아)',null,'지혜로',to_date('21/08/20','RR/MM/DD'),18000,16200,10);
Insert into BOOK values ('32','숲속 100층짜리 집','집/지하/바다/하늘/숲속','이와이 도시오','김숙','북뱅크',to_date('21/08/25','RR/MM/DD'),13000,11700,10);
Insert into BOOK  values ('33','아몬드(양장본 HardCover)',null,'손원평',null,'창비',to_date('17/03/31','RR/MM/DD'),12000,10800,10);
Insert into BOOK values ('34','좀비고등학교 코믹스. 25',null,'유대영',null,'겜툰',to_date('21/08/04','RR/MM/DD'),9800,8820,10);
Insert into BOOK  values ('35','숲속의 자본주의자',null,'박혜윤',null,'다산초당',to_date('21/06/14','RR/MM/DD'),15000,13500,10);
Insert into BOOK  values ('36','생각을 바꾸는 생각들','유발 하라리부터 조던 피터슨까지','비카스 샤','임경은','인플루엔셜',to_date('21/08/09','RR/MM/DD'),17500,15750,10);
Insert into BOOK  values ('37','월급쟁이 부자로 은퇴하라',null,'너나위',null,'알에이치코리아',to_date('19/05/22','RR/MM/DD'),18000,16200,10);
Insert into BOOK  values ('38','작은 별이지만 빛나고 있어',null,'소윤',null,'북로망스',to_date('21/03/24','RR/MM/DD'),15000,13500,10);
Insert into BOOK  values ('39','맛있게 쓴 옥주부 레시피 100',null,'정종철',null,'중앙북스',to_date('21/06/01','RR/MM/DD'),18000,16200,10);
Insert into BOOK  values ('40','돈의 속성(150쇄 기념 에디션)',null,'김승호',null,'스노우폭스북스',to_date('20/06/15','RR/MM/DD'),16800,15120,10);
Insert into BOOK  values ('41','정의란 무엇인가(마이클 샌델)','대한민국의 정의에 대해 다시 생각해보기','마이클 샌델','김명철','와이즈베리',to_date('14/11/20','RR/MM/DD'),15000,13500,10);
Insert into BOOK  values ('42','그러라 그래(양장본 HardCover)',null,'양희은',null,'김영사',to_date('21/04/12','RR/MM/DD'),14500,13050,10);
Insert into BOOK  values ('43','어떻게 말해줘야 할까',null,'오은영',null,'김영사',to_date('20/10/25','RR/MM/DD'),17500,15750,10);
Insert into BOOK  values ('44','제로 투 원(양장본 HardCover)','스탠퍼드대학교 스타트업 최고 명강의','피터 틸','이지연','한국경제신문사',to_date('14/11/20','RR/MM/DD'),16000,14400,10);
Insert into BOOK  values ('45','세계를 건너 너에게 갈게',null,'이꽃님',null,'문학동네',to_date('18/02/09','RR/MM/DD'),11500,10350,10);
Insert into BOOK  values ('46','강원국의 어른답게 말합니다',null,'강원국',null,'웅진지식하우스',to_date('21/05/26','RR/MM/DD'),16000,14400,10);
Insert into BOOK  values ('47','라오어의 미국주식 무한매수법',null,'라오어',null,'알키',to_date('21/06/02','RR/MM/DD'),16000,14400,10);
Insert into BOOK  values ('48','열두 살 장래 희망(양장본 HardCover)',null,'박성우',null,'창비',to_date('21/07/23','RR/MM/DD'),13000,11700,10);
Insert into BOOK  values ('49','생각하는 기계 vs 생각하지 않는 인간',null,'홍성원',null,'리드리드출판',to_date('21/08/20','RR/MM/DD'),15800,14220,10);
Insert into BOOK  values ('50','아몬드(창비청소년문학 78)(반양장)',null,'손원평',null,'창비',to_date('17/03/31','RR/MM/DD'),10000,9000,10);
   
   
Insert into MEMBER values ('2','이씨','010-222','b@b.com','1','서울','2','2');
Insert into MEMBER  values ('3','AAA','010-AAAA-AAAA','AAA@AAA.COM','1','AAA-HO','ABC','ABC');

SET DEFINE OFF;
Insert into ORDERS  values ('1','1',248400,to_date('21/08/31','RR/MM/DD'));
Insert into ORDERS values ('2','4',24840,to_date('21/08/31','RR/MM/DD'));

SET DEFINE OFF;
Insert into ORDER_BOOK  values ('1','2',13800,'20','상품준비중');
Insert into ORDER_BOOK  values ('2','1',13800,'2','상품준비중');

SET DEFINE OFF;


CREATE UNIQUE INDEX "BOOKSTORE"."MEMBER_ID" ON "BOOKSTORE"."MEMBER" ("MEMBER_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index PK_SHIPPING
--------------------------------------------------------

  CREATE UNIQUE INDEX "BOOKSTORE"."PK_SHIPPING" ON "BOOKSTORE"."SHIPPING" ("SHIPPING_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index ORDER_ID
--------------------------------------------------------

  CREATE UNIQUE INDEX "BOOKSTORE"."ORDER_ID" ON "BOOKSTORE"."ORDERS" ("ORDER_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index PK_BOOK
--------------------------------------------------------

  CREATE UNIQUE INDEX "BOOKSTORE"."PK_BOOK" ON "BOOKSTORE"."BOOK" ("BOOK_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table SHIPPING
--------------------------------------------------------

  ALTER TABLE "BOOKSTORE"."SHIPPING" ADD CONSTRAINT "PK_SHIPPING" PRIMARY KEY ("SHIPPING_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "BOOKSTORE"."SHIPPING" MODIFY ("MEMBER_ID" NOT NULL ENABLE);
  ALTER TABLE "BOOKSTORE"."SHIPPING" MODIFY ("SHIPPING_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table CART
--------------------------------------------------------

  ALTER TABLE "BOOKSTORE"."CART" MODIFY ("BOOK_ID" NOT NULL ENABLE);
  ALTER TABLE "BOOKSTORE"."CART" MODIFY ("MEMBER_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table ORDERS
--------------------------------------------------------

  ALTER TABLE "BOOKSTORE"."ORDERS" ADD CONSTRAINT "ORDER_ID" PRIMARY KEY ("ORDER_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "BOOKSTORE"."ORDERS" MODIFY ("MEMBER_ID" NOT NULL ENABLE);
  ALTER TABLE "BOOKSTORE"."ORDERS" MODIFY ("ORDER_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table ORDER_BOOK
--------------------------------------------------------

  ALTER TABLE "BOOKSTORE"."ORDER_BOOK" MODIFY ("BOOK_ID" NOT NULL ENABLE);
  ALTER TABLE "BOOKSTORE"."ORDER_BOOK" MODIFY ("ORDER_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table MEMBER
--------------------------------------------------------

  ALTER TABLE "BOOKSTORE"."MEMBER" MODIFY ("LOGIN_PASSWORD" NOT NULL ENABLE);
  ALTER TABLE "BOOKSTORE"."MEMBER" MODIFY ("LOGIN_ID" NOT NULL ENABLE);
  ALTER TABLE "BOOKSTORE"."MEMBER" ADD CONSTRAINT "MEMBER_ID" PRIMARY KEY ("MEMBER_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "BOOKSTORE"."MEMBER" MODIFY ("MEMBER_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table BOOK
--------------------------------------------------------

  ALTER TABLE "BOOKSTORE"."BOOK" ADD CONSTRAINT "PK_BOOK" PRIMARY KEY ("BOOK_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "BOOKSTORE"."BOOK" MODIFY ("BOOK_TITLE" NOT NULL ENABLE);
  ALTER TABLE "BOOKSTORE"."BOOK" MODIFY ("BOOK_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table CART
--------------------------------------------------------

  ALTER TABLE "BOOKSTORE"."CART" ADD CONSTRAINT "FK_CART_BOOK_ID_BOOK_BOOK_ID" FOREIGN KEY ("BOOK_ID")
	  REFERENCES "BOOKSTORE"."BOOK" ("BOOK_ID") ENABLE;
  ALTER TABLE "BOOKSTORE"."CART" ADD CONSTRAINT "FK_CART_MEMBER_ID_MEMBER_MEMBE" FOREIGN KEY ("MEMBER_ID")
	  REFERENCES "BOOKSTORE"."MEMBER" ("MEMBER_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table ORDERS
--------------------------------------------------------

  ALTER TABLE "BOOKSTORE"."ORDERS" ADD CONSTRAINT "FK_ORDER_MEMBERE_ID_MEMBER_MEM" FOREIGN KEY ("MEMBER_ID")
	  REFERENCES "BOOKSTORE"."MEMBER" ("MEMBER_ID") ON DELETE CASCADE DISABLE;
--------------------------------------------------------
--  Ref Constraints for Table ORDER_BOOK
--------------------------------------------------------

  ALTER TABLE "BOOKSTORE"."ORDER_BOOK" ADD CONSTRAINT "FK_ORDER_BOOK_BOOK_ID_BOOK_BOO" FOREIGN KEY ("BOOK_ID")
	  REFERENCES "BOOKSTORE"."BOOK" ("BOOK_ID") ENABLE;
  ALTER TABLE "BOOKSTORE"."ORDER_BOOK" ADD CONSTRAINT "FK_ORDER_BOOK_ORDER_ID_ORDER_O" FOREIGN KEY ("ORDER_ID")
	  REFERENCES "BOOKSTORE"."ORDERS" ("ORDER_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table SHIPPING
--------------------------------------------------------

  ALTER TABLE "BOOKSTORE"."SHIPPING" ADD CONSTRAINT "FK_SHIPPING_MEMBER_ID_MEMBER_M" FOREIGN KEY ("MEMBER_ID")
	  REFERENCES "BOOKSTORE"."MEMBER" ("MEMBER_ID") ENABLE;

   
   
   
   