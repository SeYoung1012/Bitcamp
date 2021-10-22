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
   
   
Insert into BOOK values ('1','�޷���Ʈ �� ��ȭ��. 2',null,'�̹̿�',null,'���丮����',to_date('21/07/27','RR/MM/DD'),13800,12420,10);
Insert into BOOK values ('2','�޷���Ʈ �� ��ȭ��',null,'�̹̿�',null,'���丮����',to_date('21/07/08','RR/MM/DD'),13800,12420,10);
Insert into BOOK values ('3','��ũ���׽� �ͽ�������','ö���� �츮 �λ��� ������ ����','���� ���̳�','������','��ũ�ν�',to_date('21/04/28','RR/MM/DD'),18000,16200,10);
Insert into BOOK values ('4','���� ���� �ƴϴ�',null,'�迬��',null,'����',to_date('21/03/12','RR/MM/DD'),14000,12600,10);
Insert into BOOK values ('5','�ֽ������� ����(������)','������ ����� �������� �ʴ´�|','õ����','������','�������̵��',to_date('21/06/10','RR/MM/DD'),18000,16200,10);
Insert into BOOK  values ('6','���� ����(���೪�� �뺧�� 7)',null,'������',null,'���೪��',to_date('15/03/30','RR/MM/DD'),8000,7200,10);
Insert into BOOK  values ('7','�̵峪�� ���̺귯��',null,'��Ʈ ���̱�','������','���÷翣��',to_date('21/04/28','RR/MM/DD'),15800,14220,10);
Insert into BOOK  values ('8','���� ī�ױ� �ΰ������','�ô븦 �ʿ��� �ΰ������� ���̺�','���� ī�ױ�','�ӻ���','��������',to_date('19/10/07','RR/MM/DD'),11500,10350,10);
Insert into BOOK  values ('9','���� ���� ���̵�',null,'��ȿ��',null,'�ѱ������Ź�',to_date('21/06/15','RR/MM/DD'),14000,12600,10);
Insert into BOOK  values ('10','��̶�� ����',null,'��ҿ�',null,'�����',to_date('20/11/16','RR/MM/DD'),15000,13500,10);
Insert into BOOK values ('11','���߰� ���ϰ� �ְ� �� �� ���̴�',null,'������',null,'��ũ��',to_date('21/05/14','RR/MM/DD'),15000,13500,10);
Insert into BOOK  values ('12','4~7������ �߿��� �ñ�� �����ϴ�',null,'���Ӽ�',null,'ī�ÿ����',to_date('21/08/02','RR/MM/DD'),16000,14400,10);
Insert into BOOK  values ('13','�ؽ�Ʈ �׸� �������',null,'������',null,'������2�Ͻ�',to_date('21/07/15','RR/MM/DD'),18000,16200,10);
Insert into BOOK  values ('14','���� �ɸ���(���庻 HardCover)','����� �ο� ������ ��ġ�� ���� �ɸ���','��� �Ͽ���','������','���÷翣��',to_date('21/01/13','RR/MM/DD'),19800,17820,10);
Insert into BOOK  values ('15','�װ� �ʿ����� ���ڴ�',null,'��ȫ',null,'��ī(FIKA)',to_date('21/04/26','RR/MM/DD'),15500,13950,10);
Insert into BOOK  values ('16','���� �˰���',null,'��ȸ��',null,'�ҿ�һ��̾�Ƽ',to_date('21/04/28','RR/MM/DD'),16000,14400,10);
Insert into BOOK values ('17','���ʴ� ��� �����Ǵ°�',null,'�ڽÿ�',null,'�迵��',to_date('21/08/10','RR/MM/DD'),16500,14850,10);
Insert into BOOK values ('18','����� ��(���庻 HardCover)','���� ���ٸ� ȸ���','���� ���ٸ�','��¿�','���������Ͽ콺',to_date('21/07/28','RR/MM/DD'),33000,29700,10);
Insert into BOOK values ('19','ũ������ ����',null,'�̱⹮',null,'�迵��',to_date('21/07/01','RR/MM/DD'),22000,19800,10);
Insert into BOOK  values ('20','���(���庻 HardCover)',null,'�����',null,'����',to_date('13/04/01','RR/MM/DD'),13000,11700,10);
Insert into BOOK  values ('21','���� �ֽ� ��� �޷��� ���',null,'�ڼ���',null,'�˿���ġ�ڸ���',to_date('20/05/30','RR/MM/DD'),16000,14400,10);
Insert into BOOK  values ('22','���μ��� �ѱ��� �����. 17',null,'���μ�',null,'�����޸�',to_date('21/07/21','RR/MM/DD'),12000,10800,10);
Insert into BOOK  values ('23','�ΰ� �ǰ�(���蹮������ 103)','������ ���繫 ���� 70�ֳ� Ư����','������ ���繫','�����','������',to_date('12/04/10','RR/MM/DD'),8000,7200,10);
Insert into BOOK  values ('24','�ڽ���(������)','���̾� Ŭ���� 4 [����]','Į ���̰�','ȫ�¼�','���̾𽺺Ͻ�',to_date('10/01/20','RR/MM/DD'),18500,16650,10);
Insert into BOOK  values ('25','������ �ʹ� ���� ���� �쿡��',null,'������',null,'���̺�',to_date('21/06/10','RR/MM/DD'),16000,14400,10);
Insert into BOOK  values ('26','���� ����� ��Ǯ�̵ȴ�',null,'ȫ���',null,'����ü',to_date('21/06/16','RR/MM/DD'),16000,14400,10);
Insert into BOOK values ('27','���̰� ���� ����',null,'�̲ɴ�',null,'�츮�б�',to_date('21/06/07','RR/MM/DD'),12500,11250,10);
Insert into BOOK values ('28','�ְ��� ��ȭ�� ��� ��������°�','���� �ܼ��ϰ� ���� �ٲٴ� ������� ���','������ �ϵ�','������','����Ͻ��Ͻ�',to_date('21/07/06','RR/MM/DD'),16000,14400,10);
Insert into BOOK  values ('29','���μ��� ����� �����. 9',null,'���μ�',null,'�ܲ޾���',to_date('21/06/30','RR/MM/DD'),12000,10800,10);
Insert into BOOK values ('30','�����θ�ŭ ������ ����� �� ����',null,'������',null,'������Ͽ콺',to_date('21/06/10','RR/MM/DD'),16800,15120,10);
Insert into BOOK values ('31','����Ʈ û�� �̷��� ������?',null,'������(���Ͼ�)',null,'������',to_date('21/08/20','RR/MM/DD'),18000,16200,10);
Insert into BOOK values ('32','���� 100��¥�� ��','��/����/�ٴ�/�ϴ�/����','�̿��� ���ÿ�','���','�Ϲ�ũ',to_date('21/08/25','RR/MM/DD'),13000,11700,10);
Insert into BOOK  values ('33','�Ƹ��(���庻 HardCover)',null,'�տ���',null,'â��',to_date('17/03/31','RR/MM/DD'),12000,10800,10);
Insert into BOOK values ('34','�������б� �ڹͽ�. 25',null,'���뿵',null,'����',to_date('21/08/04','RR/MM/DD'),9800,8820,10);
Insert into BOOK  values ('35','������ �ں�������',null,'������',null,'�ٻ��ʴ�',to_date('21/06/14','RR/MM/DD'),15000,13500,10);
Insert into BOOK  values ('36','������ �ٲٴ� ������','���� �϶󸮺��� ���� ���ͽ�����','��ī�� ��','�Ӱ���','���÷翣��',to_date('21/08/09','RR/MM/DD'),17500,15750,10);
Insert into BOOK  values ('37','�������� ���ڷ� �����϶�',null,'�ʳ���',null,'�˿���ġ�ڸ���',to_date('19/05/22','RR/MM/DD'),18000,16200,10);
Insert into BOOK  values ('38','���� �������� ������ �־�',null,'����',null,'�Ϸθ���',to_date('21/03/24','RR/MM/DD'),15000,13500,10);
Insert into BOOK  values ('39','���ְ� �� ���ֺ� ������ 100',null,'����ö',null,'�߾ӺϽ�',to_date('21/06/01','RR/MM/DD'),18000,16200,10);
Insert into BOOK  values ('40','���� �Ӽ�(150�� ��� �����)',null,'���ȣ',null,'����������Ͻ�',to_date('20/06/15','RR/MM/DD'),16800,15120,10);
Insert into BOOK  values ('41','���Ƕ� �����ΰ�(����Ŭ ����)','���ѹα��� ���ǿ� ���� �ٽ� �����غ���','����Ŭ ����','���ö','�������',to_date('14/11/20','RR/MM/DD'),15000,13500,10);
Insert into BOOK  values ('42','�׷��� �׷�(���庻 HardCover)',null,'������',null,'�迵��',to_date('21/04/12','RR/MM/DD'),14500,13050,10);
Insert into BOOK  values ('43','��� ������� �ұ�',null,'������',null,'�迵��',to_date('20/10/25','RR/MM/DD'),17500,15750,10);
Insert into BOOK  values ('44','���� �� ��(���庻 HardCover)','�����۵���б� ��ŸƮ�� �ְ� ����','���� ƿ','������','�ѱ������Ź���',to_date('14/11/20','RR/MM/DD'),16000,14400,10);
Insert into BOOK  values ('45','���踦 �ǳ� �ʿ��� ����',null,'�̲ɴ�',null,'���е���',to_date('18/02/09','RR/MM/DD'),11500,10350,10);
Insert into BOOK  values ('46','�������� ���� ���մϴ�',null,'������',null,'���������Ͽ콺',to_date('21/05/26','RR/MM/DD'),16000,14400,10);
Insert into BOOK  values ('47','������� �̱��ֽ� ���Ѹż���',null,'�����',null,'��Ű',to_date('21/06/02','RR/MM/DD'),16000,14400,10);
Insert into BOOK  values ('48','���� �� �巡 ���(���庻 HardCover)',null,'�ڼ���',null,'â��',to_date('21/07/23','RR/MM/DD'),13000,11700,10);
Insert into BOOK  values ('49','�����ϴ� ��� vs �������� �ʴ� �ΰ�',null,'ȫ����',null,'���帮������',to_date('21/08/20','RR/MM/DD'),15800,14220,10);
Insert into BOOK  values ('50','�Ƹ��(â��û�ҳ⹮�� 78)(�ݾ���)',null,'�տ���',null,'â��',to_date('17/03/31','RR/MM/DD'),10000,9000,10);
   
   
Insert into MEMBER values ('2','�̾�','010-222','b@b.com','1','����','2','2');
Insert into MEMBER  values ('3','AAA','010-AAAA-AAAA','AAA@AAA.COM','1','AAA-HO','ABC','ABC');

SET DEFINE OFF;
Insert into ORDERS  values ('1','1',248400,to_date('21/08/31','RR/MM/DD'));
Insert into ORDERS values ('2','4',24840,to_date('21/08/31','RR/MM/DD'));

SET DEFINE OFF;
Insert into ORDER_BOOK  values ('1','2',13800,'20','��ǰ�غ���');
Insert into ORDER_BOOK  values ('2','1',13800,'2','��ǰ�غ���');

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

   
   
   
   