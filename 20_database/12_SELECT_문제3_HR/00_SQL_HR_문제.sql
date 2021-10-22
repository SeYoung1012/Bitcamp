/****** HR ����Ÿ ��ȸ ����2 ****************
/*1�� HR �μ��� � ����� �޿������� ��ȸ�ϴ� ������ �ð� �ִ�. 
  Tucker ��� ���� �޿��� ���� �ް� �ִ� ����� 
  �̸��� ��(Name���� ��Ī), ����, �޿��� ����Ͻÿ�
*****************************************************/

/*2�� ����� �޿� ���� �� ������ �ּ� �޿��� �ް� �ִ� ����� 
  �̸��� ��(Name���κ�Ī), ����, �޿�, �Ի����� ����Ͻÿ�
********************************************************/

/*3�� �Ҽ� �μ��� ��� �޿����� ���� �޿��� �޴� ����� 
  �̸��� ��(Name���� ��Ī), �޿�, �μ���ȣ, ������ ����Ͻÿ�
***********************************************************/

/*4�� ��� ����� �ҼӺμ� ��տ����� ����Ͽ� ������� �̸��� ��(Name���� ��Ī),
  ����, �޿�, �μ���ȣ, �μ���տ���(Department Avg Salary�� ��Ī)�� ����Ͻÿ�
***************************************************************/

/*5�� HR ��Ű���� �ִ� Job_history ���̺��� ������� ���� ���� �̷��� ��Ÿ���� ���̺��̴�. 
  �� ������ �̿��Ͽ� ��� ����� ���� �� ������ ���� �̷� ������ ����ϰ��� �Ѵ�. 
  �ߺ��� ��������� ������ �� ���� ǥ���Ͽ� ����Ͻÿ�
  (�����ȣ, ����) --UNION ���
*********************************************************************/

/*6�� �� �������� �� ����� ���� �̷� ������ Ȯ���Ͽ���. ������ '��� �����
  ���� �̷� ��ü'�� ������ ���ߴ�. ���⿡���� ��� ����� 
  ���� �̷� ���� ����(JOB_HISTORY) �� �������濡 ���� �μ������� 
  �����ȣ�� ���� ������� ����Ͻÿ�(���տ����� UNION)
  (�����ȣ, �μ�����, ����)--UNION ���
**********************************************************************/
  
/*7�� HR �μ������� �ű� ������Ʈ�� �������� �̲� �ش� �����ڵ��� 
  �޿��� �λ� �ϱ�� �����Ͽ���. 
  ����� ���� 107���̸� 19���� ������ �ҼӵǾ� �ٹ� ���̴�. 
  �޿� �λ� ����ڴ� ȸ���� ����(Distinct job_id) �� ���� 5�� �������� 
  ���ϴ� ����� �ش�ȴ�. ������ ������ ���ؼ��� �޿��� ����ȴ�. 
  5�� ������ �޿� �λ���� ������ ����.
  HR_REP(10%), MK_REP(12%), PR_REP(15%), SA_REP(18%), IT_PROG(20%)
**********************************************************************/

/*8�� HR �μ������� �ֻ��� �Ի��Ͽ� �ش��ϴ� 2001����� 2003����� �Ի��ڵ��� �޿��� 
  ���� 5%, 3%, 1% �λ��Ͽ� ���п� ���� �������� �����ϰ��� �Ѵ�. 
  ��ü ����� �� �ش� �⵵�� �ش��ϴ� ������� �޿��� �˻��Ͽ� �����ϰ�, 
  �Ի����ڿ� ���� �������� ������ �����Ͻÿ� DECODE CASE WHEN ����
**********************************************************************/

/*9�� �μ��� �޿� �հ踦 ���ϰ�, �� ����� ������ ���� ǥ���Ͻÿ�.
  Sum Salary > 100000 �̸�, "Excellent"
  Sum Salary > 50000 �̸�, "Good"
  Sum Salary > 10000 �̸�, "Medium"
  Sum Salary <= 10000 �̸�, "Well"
**********************************************************************/

/*10�� 2005�� ������ �Ի��� ��� �� ������ "MGR"�� ���Ե� ����� 15%, 
  "MAN"�� ���Ե� ����� 20% �޿��� �λ��Ѵ�. 
  ���� 2005����� �ٹ��� ������ ��� �� "MGR"�� ���Ե� ����� 25% �޿��� �λ��Ѵ�. 
  �̸� �����ϴ� ������ �ۼ��Ͻÿ�  
  --�������� ������� �̾ƺ���. (SALARY �� ������)  
**********************************************************************/

/*11�� ������ �Ի��� ��� �� ���
  (���1) ������ �Ի��� ��� ���� �Ʒ��� ���� �� �ະ�� ��µǵ��� �Ͻÿ�(12��).
  1�� xx
--  2�� xx
  3�� xx
  ..
  12�� xx
  �հ� XXX
**********************************************************************/  
---------------------------------------------------------
/* (���2) ù �࿡ ��� ���� �Ի� ��� ���� ��µǵ��� �Ͻÿ�
  1�� 2�� 3�� 4�� .... 11�� 12��
  xx  xx  xx xx  .... xx   xx
**********************************************************************/
/*1�� HR �μ��� � ����� �޿������� ��ȸ�ϴ� ������ �ð� �ִ�. 
  Tucker ��� ���� �޿��� ���� �ް� �ִ� ����� 
  �̸��� ��(Name���� ��Ī), ����, �޿��� ����Ͻÿ�
*/
--���� Ǭ�� 
SELECT FIRST_NAME||' '||LAST_NAME AS NAME, JOB_ID, SALARY
  FROM EMPLOYEES
  WHERE LAST_NAME NOT LIKE '%Tucker' 
  AND SALARY > 10000 
  ORDER BY SALARY DESC
 ;


--�������� ���� ���
SELECT FIRST_NAME ||' '||LAST_NAME AS NAME, JOB_ID, SALARY
  FROM EMPLOYEES
WHERE SALARY > (SELECT * FROM EMPLOYEES WHERE LAST_NAME = 'Tucker')
ORDER BY SALARY
;

/*2�� ����� �޿� ���� �� ������ �ּ� �޿��� �ް� �ִ� ����� 
  �̸��� ��(Name���κ�Ī), ����, �޿�, �Ի����� ����Ͻÿ�
********************************************************/
--���� Ǭ ��
SELECT E.FIRST_NAME||' '||E.LAST_NAME AS NAME, E.JOB_ID, 
        E.SALARY , E.HIRE_DATE, J.JOB_ID AS J_JOB_ID
  FROM EMPLOYEES E,
      (SELECT JOB_ID, MIN(SALARY)MIN_SALARY FROM EMPLOYEES GROUP BY JOB_ID) J
   WHERE E.JOBID =  J.JOB_ID
   AND E.SALARY = J. MIN_SALARY 
   ORDER BY E.JOB_ID
 ;

--������ �ּ� �޿� ���ϱ�
SELECT JOB_ID, MIN(SALARY)MIN_SALARY
 FROM EMPLOYEES
 GROUP BY JOB_ID
;

---���ι�
SELECT E.FIRST_NAME||' '||E.LAST_NAME AS NAME, E.HIRE_DATE , 
        E.JOB_ID, E.SALARY 
      -- , M.JOB_ID AS M_JOB_ID, M.MIN_SALARY --���ʿ��� �÷�
    FROM EMPLOYEES E, 
      (SELECT JOB_ID, MIN(SALARY)MIN_SALARY
        FROM EMPLOYEES
            GROUP BY JOB_ID) M
WHERE E.JOB_ID = M.JOB_ID  --��������
 AND E.SALARY = M.MIN_SALARY
ORDER BY E.JOB_ID
;

--�����������
SELECT E.FIRST_NAME||' '||E.LAST_NAME AS NAME, E.HIRE_DATE , 
        E.JOB_ID, E.SALARY 
  FROM EMPLOYEES E
 WHERE SALARY = (SELECT MIN(SALARY) FROM EMPLOYEES WHERE JOB_ID = E.JOB_ID)
 ORDER BY JOB_ID
;


/*3�� �Ҽ� �μ��� ��� �޿����� ���� �޿��� �޴� ����� 
  �̸��� ��(Name���� ��Ī), �޿�, �μ���ȣ, ������ ����Ͻÿ�
***********************************************************/

--JOB_ID�� �̾Ƽ� ��� ���� �� ����.
SELECT E.FIRST_NAME||' '||E.LAST_NAME AS NAME, E.DEPARTMENT_ID, E.SALARY, E.JOB_ID, AVG. AVG_SALARY 
    FROM EMPLOYEES E , 
    (SELECT JOB_ID, ROUND(AVG(SALARY)) AVG_SALARY FROM EMPLOYEES GROUP BY  JOB_ID) AVG
    WHERE E.JOB_ID = AVG.JOB_ID
    AND E.SALARY > AVG.AVG_SALARY
    ORDER BY E.SALARY DESC
; 

--���� DEPARTMENT_ID �� ��ȸ 
SELECT E.FIRST_NAME||' '||E.LAST_NAME AS NAME, E.DEPARTMENT_ID, E.SALARY, E.JOB_ID, AVG. AVG_SALARY 
    FROM EMPLOYEES E , 
    (SELECT DEPARTMENT_ID, ROUND(AVG(SALARY)) AVG_SALARY FROM EMPLOYEES GROUP BY  DEPARTMENT_ID) AVG
    WHERE E.DEPARTMENT_ID = AVG. DEPARTMENT_ID
    AND E.SALARY > AVG.AVG_SALARY
    ORDER BY E.SALARY DESC
;    



SELECT DEPARTMENT_ID, ROUND(AVG(SALARY))AVG_SALARY
  FROM EMPLOYEES
  GROUP BY DEPARTMENT_ID
  ORDER BY  DEPARTMENT_ID
;


--���ι� ��ȸ 
SELECT E.FIRST_NAME||' '||E.LAST_NAME AS NAME, E.JOB_ID
     , E.DEPARTMENT_ID, E.SALARY
     --, A.DEPARTMENT_ID --�ߺ��� ���̺�
     , A.AVG_SALARY
--SELECT *
    FROM EMPLOYEES E
       , (SELECT DEPARTMENT_ID, ROUND(AVG(SALARY)) AVG_SALARY 
               FROM  EMPLOYEES GROUP BY DEPARTMENT_ID) A --�μ��� ��� �޿�
    WHERE E.DEPARTMENT_ID = A.DEPARTMENT_ID --�������� �����μ�
    AND E.SALARY > A.AVG_SALARY
    ORDER BY E.DEPARTMENT_ID, E.SALARY
;

--�� ���� : �μ��ڵ� 30�� �μ� ������ ��ȸ 
SELECT E.FIRST_NAME||' '||E.LAST_NAME AS NAME, E.JOB_ID
     , E.DEPARTMENT_ID, E.SALARY
  FROM EMPLOYEES E  
WHERE E.DEPARTMENT_ID = 30
ORDER BY SALARY;
-------------------
--��� ���� ���� ������� ��ȸ
SELECT E.FIRST_NAME||' '||E.LAST_NAME AS NAME, E.JOB_ID
     , E.DEPARTMENT_ID, E.SALARY
    FROM EMPLOYEES E
  WHERE SALARY > (SELECT AVG(SALARY) FROM EMPLOYEES 
                    WHERE DEPARTMENT_ID = E.DEPARTMENT_ID ) 
ORDER BY DEPARTMENT_ID , SALARY 
;


/*4�� ��� ����� �ҼӺμ� ��տ����� ����Ͽ� ������� �̸��� ��(Name���� ��Ī),
  ����, �޿�, �μ���ȣ, �μ���տ���(Department Avg Salary�� ��Ī)�� ����Ͻÿ�
***************************************************************/

SELECT E.JOB_ID, E.FIRST_NAME||' '||E.LAST_NAME AS NAME,E.SALARY, E.DEPARTMENT_ID, AVG. AVG_SALARY AS "Department Avg Salary"
    FROM EMPLOYEES E , 
    (SELECT JOB_ID, TRUNC(AVG(SALARY)) AVG_SALARY FROM EMPLOYEES GROUP BY JOB_ID) AVG
    WHERE E.JOB_ID = AVG.JOB_ID 
    ORDER BY SALARY DESC
;    

---�μ��� ��� �޿�, ��տ���
SELECT DEPARTMENT_ID, ROUND(AVG(SALARY))AVG_SALARY,
       ROUND(AVG(SALARY)) * 12 AS "Department Avg Salary"
  FROM EMPLOYEES 
GROUP BY DEPARTMENT_ID
ORDER BY 1
;

--�̸��� ��(NAME ��Ī), ����, �޿�, �μ���ȣ, �μ���տ���

SELECT E.FIRST_NAME||' '||E.LAST_NAME AS NAME,E.JOB_ID,
      E.SALARY, E.DEPARTMENT_ID    
      ,A.AVG_SALARY
      ,A.AVG_SALARY12 AS "Department Avg Salary" 
    FROM EMPLOYEES E,
        (SELECT DEPARTMENT_ID, ROUND(AVG(SALARY))AVG_SALARY,
            ROUND(AVG(SALARY)) * 12 AS AVG_SALARY12
            FROM EMPLOYEES
            GROUP BY DEPARTMENT_ID) A
    WHERE E.DEPARTMENT_ID = A.DEPARTMENT_ID
    ORDER BY E.DEPARTMENT_ID, E.SALARY
;

-------
--��� ���� ���� - SELECT ���� ���� ���� ���
SELECT E.FIRST_NAME||' '||E.LAST_NAME AS NAME, E.JOB_ID,
      E.SALARY, E.DEPARTMENT_ID 
      , (SELECT  ROUND(AVG(SALARY)) * 12  FROM EMPLOYEES 
        WHERE DEPARTMENT_ID = E.DAPARTMENT_ID) AS "Department Avg Salary" 
  FROM EMPLOYEES E
  ORDER BY DEPARTMENT_ID, SALARY
;




/*5�� HR ��Ű���� �ִ� Job_history ���̺��� ������� ���� ���� �̷��� ��Ÿ���� ���̺��̴�. 
  �� ������ �̿��Ͽ� ��� ����� ���� �� ������ ���� �̷� ������ ����ϰ��� �Ѵ�. 
  �ߺ��� ��������� ������ �� ���� ǥ���Ͽ� ����Ͻÿ�
  (�����ȣ, ����) --UNION ���
*********************************************************************/


SELECT E.EMPLOYEE_ID , E.JOB_ID FROM EMPLOYEES E WHERE E.EMPLOYEE_ID IN (EMPLOYEE_ID,JOB_ID)
UNION 
SELECT J.EMPLOYEE_ID , J.JOB_ID FROM JOB_HISTORY J WHERE J.EMPLOYEE_ID IN(EMPLOYEE_ID,JOB_ID); 


SELECT * FROM JOB_HISTORY;
--UNION ��� : �÷���, Ÿ��, ����, ���� ��ġ, ORDER BY ���� �� �������� �ۼ�  
SELECT EMPLOYEE_ID, JOB_ID FROM EMPLOYEES
UNION
SELECT EMPLOYEE_ID , JOB_ID FROM JOB_HISTORY
ORDER BY EMPLOYEE_ID, JOB_ID;

--UNION ALL : ��� ������ ��ȸ(�ߺ�����)
SELECT EMPLOYEE_ID, JOB_ID FROM EMPLOYEES
UNION ALL
SELECT EMPLOYEE_ID , JOB_ID FROM JOB_HISTORY
ORDER BY EMPLOYEE_ID, JOB_ID;


/*6�� �� �������� �� ����� ���� �̷� ������ Ȯ���Ͽ���. ������ '��� �����
  ���� �̷� ��ü'�� ������ ���ߴ�. ���⿡���� ��� ����� 
  ���� �̷� ���� ����(JOB_HISTORY) �� �������濡 ���� �μ������� 
  �����ȣ�� ���� ������� ����Ͻÿ�(���տ����� UNION)
  (�����ȣ, �μ�����, ����)--UNION ���
**********************************************************************/   

SELECT E.EMPLOYEE_ID , E.DEPARTMENT_ID, E.JOB_ID FROM EMPLOYEES E WHERE E.EMPLOYEE_ID IN(EMPLOYEE_ID,DEPARTMENT_ID,JOB_ID)
UNION ALL
SELECT J.EMPLOYEE_ID , J.DEPARTMENT_ID, J.JOB_ID FROM JOB_HISTORY J WHERE J.EMPLOYEE_ID IN(EMPLOYEE_ID,DEPARTMENT_ID,JOB_ID) 
ORDER BY EMPLOYEE_ID, JOB_ID;

SELECT EMPLOYEE_ID, DEPARTMENT_ID, JOB_ID FROM EMPLOYEES
UNION ALL
SELECT EMPLOYEE_ID ,DEPARTMENT_ID, JOB_ID FROM JOB_HISTORY
ORDER BY EMPLOYEE_ID, JOB_ID;



/*7�� HR �μ������� �ű� ������Ʈ�� �������� �̲� �ش� �����ڵ��� 
  �޿��� �λ� �ϱ�� �����Ͽ���. 
  ����� ���� 107���̸� 19���� ������ �ҼӵǾ� �ٹ� ���̴�. 
  �޿� �λ� ����ڴ� ȸ���� ����(Distinct job_id) �� ���� 5�� �������� 
  ���ϴ� ����� �ش�ȴ�. ������ ������ ���ؼ��� �޿��� ����ȴ�. 
  5�� ������ �޿� �λ���� ������ ����.
  HR_REP(10%), MK_REP(12%), PR_REP(15%), SA_REP(18%), IT_PROG(20%)
**********************************************************************/

SELECT DISTINCT JOB_ID, EMPLOYEE_ID, FIRST_NAME||' '||LAST_NAME AS NAME, SALARY
        ,ROUND(SALARY * 1.10) AS "HR_REP Increase Salary"
        ,ROUND(SALARY * 1.12) AS " MK_REP Increase Salary"
        ,ROUND(SALARY * 1.15) AS "PR_REP Increase Salary"
        ,ROUND(SALARY * 1.18) AS "SA_REP Increase Salary"
        ,ROUND(SALARY * 1.20) AS "IT_PROG Increase Salary"
    FROM EMPLOYEES 
    WHERE JOB_ID IN ('HR_REP','MK_REP','PR_REP','SA_REP', 'IT_PROG')
    ORDER BY JOB_ID
;

--CASE �����
SELECT EMPLOYEE_ID, FIRST_NAME||' '||LAST_NAME AS NAME,
        JOB_ID, SALARY, 
        CASE JOB_ID 
             WHEN 'HR_REP' THEN SALARY *1.10 
             WHEN 'MK_REP' THEN SALARY *1.12 
             WHEN 'PR_REP' THEN SALARY *1.15 
             WHEN 'SA_REP' THEN SALARY *1.18 
             WHEN 'IT_PROG' THEN SALARY *1.20              
             ELSE SALARY
        END AS "New Salary",
        CASE JOB_ID 
             WHEN 'HR_REP' THEN SALARY *0.10 
             WHEN 'MK_REP' THEN SALARY *0.12 
             WHEN 'PR_REP' THEN SALARY *0.15 
             WHEN 'SA_REP' THEN SALARY *0.18 
             WHEN 'IT_PROG' THEN SALARY *0.20              
             ELSE 0
        END AS "�����λ�ݾ�"
    FROM EMPLOYEES
    ORDER BY JOB_ID
;

--DECODE ��
SELECT EMPLOYEE_ID, FIRST_NAME||' '||LAST_NAME AS NAME,
        JOB_ID, SALARY, 
       DECODE (JOB_ID 
             , 'HR_REP' , SALARY *1.10 
             , 'MK_REP' , SALARY *1.12 
             , 'PR_REP' , SALARY *1.15 
             , 'SA_REP' , SALARY *1.18 
             , 'IT_PROG', SALARY *1.20              
             , SALARY
        ) AS "New Salary",
        DECODE( JOB_ID 
             , 'HR_REP' , SALARY *0.10 
             , 'MK_REP' , SALARY *0.12 
             , 'PR_REP' , SALARY *0.15 
             , 'SA_REP' , SALARY *0.18 
             , 'IT_PROG', SALARY *0.20              
             , 0
        ) AS "�����λ�ݾ�"
    FROM EMPLOYEES
    ORDER BY JOB_ID
;

/*8�� HR �μ������� �ֻ��� �Ի��Ͽ� �ش��ϴ� 2001����� 2003����� �Ի��ڵ��� �޿��� 
  ���� 5%, 3%, 1% �λ��Ͽ� ���п� ���� �������� �����ϰ��� �Ѵ�. 
  ��ü ����� �� �ش� �⵵�� �ش��ϴ� ������� �޿��� �˻��Ͽ� �����ϰ�, 
  �Ի����ڿ� ���� �������� ������ �����Ͻÿ� DECODE CASE WHEN ����
**********************************************************************/

SELECT HIRE_DATE, 
    CASE  WHEN TO_CHAR(HIRE_DATE, 'YYYY') = '2001' THEN (SALARY *1.05) 
                   WHEN TO_CHAR(HIRE_DATE, 'YYYY') = '2002' THEN (SALARY *1.03)
                   WHEN TO_CHAR(HIRE_DATE, 'YYYY') = '2003' THEN (SALARY *1.01)   
            
    END AS RISE_SALARY
FROM EMPLOYEES
ORDER BY HIRE_DATE
;

SELECT MIN(HIRE_DATE) FROM EMPLOYEES; --2001/01/13
--2001�� ���� �Ի��ڰ� ���ٴ� �����Ͽ�
--CASE WHEN �ε�񱳷� ��ȸ
SELECT EMPLOYEE_ID, FIRST_NAME||' '||LAST_NAME AS NAME,
        HIRE_DATE, SALARY,
        CASE WHEN HIRE_DATE < TO_DATE('2002-01-01', 'YYYY-MM-DD')
             THEN ROUND(SALARY * 1.05)
             WHEN HIRE_DATE < TO_DATE('2003-01-01', 'YYYY-MM-DD')
             THEN ROUND(SALARY * 1.03)
             WHEN HIRE_DATE < TO_DATE('2004-01-01', 'YYYY-MM-DD')
             THEN ROUND(SALARY * 1.01)
             ELSE 0
        END AS "����"        
    FROM EMPLOYEES 
 -- WHERE HIRE_DATE >= TO_DATE('2002-01-01', 'YYYY-MM-DD')
   --AND HIRE_DATE < TO_DATE('2004-01-01', 'YYYY-MM-DD')
  ORDER BY HIRE_DATE
;
--------
--�Ի����� ���� 4�ڸ� (YYYY) �������� ��ȸ
SELECT  EMPLOYEE_ID, FIRST_NAME||' '||LAST_NAME AS NAME,
        HIRE_DATE, SALARY,
        CASE  TO_CHAR(HIRE_DATE, 'YYYY') 
            WHEN '2001' THEN ROUND(SALARY * 1.05)
            WHEN '2002' THEN ROUND(SALARY * 1.03)     
            WHEN '2003' THEN ROUND(SALARY * 1.01)  
            ELSE 0
        END AS "����"       
    FROM EMPLOYEES
  --WHERE TO_CHAR(HIRE_DATE, 'YYYY') IN ('2001','2002','2003')
  ORDER BY HIRE_DATE
;

---DECODE :���� 4�ڸ� (YYYY) �������� ��ȸ

SELECT  EMPLOYEE_ID, FIRST_NAME||' '||LAST_NAME AS NAME,
        HIRE_DATE, SALARY,
        DECODE ( TO_CHAR(HIRE_DATE, 'YYYY'), 
             '2001' , ROUND(SALARY * 1.05)
            , '2002' , ROUND(SALARY * 1.03)     
            , '2003' , ROUND(SALARY * 1.01)  
            , 0
        ) AS "����"       
    FROM EMPLOYEES
  ORDER BY HIRE_DATE
;

/*9�� �μ��� �޿� �հ踦 ���ϰ�, �� ����� ������ ���� ǥ���Ͻÿ�.
  Sum Salary > 100000 �̸�, "Excellent"
  Sum Salary > 50000 �̸�, "Good"
  Sum Salary > 10000 �̸�, "Medium"
  Sum Salary <= 10000 �̸�, "Well"
**********************************************************************/

SELECT DEPARTMENT_ID, SUM(SALARY), 
    CASE WHEN SUM(SALARY) > 100000 THEN 'Excellent'
         WHEN SUM(SALARY) > 50000 THEN 'Good'
         WHEN SUM(SALARY) > 10000 THEN 'Medium'
         WHEN SUM(SALARY) <= 10000 THEN 'Well'
        END AS SUM_SALARY
 FROM EMPLOYEES
    GROUP BY DEPARTMENT_ID
;

--�μ��� �޿� �հ�
SELECT DEPARTMENT_ID , SUM(SALARY)SUM_SALARY
  FROM EMPLOYEES
  GROUP BY DEPARTMENT_ID
  ORDER BY DEPARTMENT_ID
;
-----------
--CASE WHEN �����ؼ� ���ϰ� ��
SELECT DEPARTMENT_ID ,SUM_SALARY,
    CASE WHEN SUM_SALARY > 100000 THEN 'Excellent'
         WHEN SUM_SALARY > 50000 THEN 'Good'
         WHEN SUM_SALARY > 10000 THEN 'Medium'
         WHEN SUM_SALARY <= 10000 THEN 'Well'    
    END AS "�򰡰��"  
  FROM  (SELECT DEPARTMENT_ID , SUM(SALARY)SUM_SALARY
        FROM EMPLOYEES
        GROUP BY DEPARTMENT_ID
        ) S
  WHERE DEPARTMENT_ID IS NOT NULL      
  ORDER BY DEPARTMENT_ID
;

--------
SELECT DEPARTMENT_ID , SUM(SALARY)SUM_SALARY,
        CASE WHEN SUM(SALARY) > 100000 THEN 'Excellent'
             WHEN SUM(SALARY) > 50000 THEN 'Good'
             WHEN SUM(SALARY) > 10000 THEN 'Medium'
             WHEN SUM(SALARY) <= 10000 THEN 'Well' 
        END AS "�򰡰��" 
  FROM EMPLOYEES
  WHERE DEPARTMENT_ID IS NOT NULL
  GROUP BY DEPARTMENT_ID
  ORDER BY  SUM_SALARY DESC
;

/*10�� 2005�� ������ �Ի��� ��� �� ������ "MGR"�� ���Ե� ����� 15%, 
  "MAN"�� ���Ե� ����� 20% �޿��� �λ��Ѵ�. 
  ���� 2005����� �ٹ��� ������ ��� �� "MGR"�� ���Ե� ����� 25% �޿��� �λ��Ѵ�. 
  �̸� �����ϴ� ������ �ۼ��Ͻÿ�  
  --�������� ������� �̾ƺ���. (SALARY �� ������)  
**********************************************************************/

SELECT EMPLOYEE_ID, FIRST_NAME||' '||LAST_NAME AS NAME,
        JOB_ID, HIRE_DATE, SALARY,
    CASE WHEN JOB_ID LIKE '%MGR%' AND TO_CHAR(HIRE_DATE, 'YYYY') > '2005'  THEN (SALARY *1.15) 
        WHEN JOB_ID LIKE '%MAN%' AND TO_CHAR(HIRE_DATE, 'YYYY') < '2005' THEN (SALARY *1.20) 
        WHEN JOB_ID LIKE '%MGR%' AND TO_CHAR(HIRE_DATE, 'YYYY') < '2005' THEN (SALARY *1.25) 
        
    END AS Increase_Salary
  FROM EMPLOYEES E
 ORDER BY Increase_Salary
;

---CASE WHEN �̿��ؼ� ��ȸ
SELECT EMPLOYEE_ID, FIRST_NAME||' '||LAST_NAME AS NAME,
        JOB_ID, HIRE_DATE, SALARY,
        --2005�� �����Ի��̰�, MGR : 15%�λ� OR MAN : 20% �λ�
        CASE WHEN TO_CHAR(HIRE_DATE, 'YYYY') < '2005'
             THEN CASE WHEN JOB_ID LIKE '%MGR%' THEN ROUND(SALARY * 1.15)
                       WHEN JOB_ID LIKE '%MAN%' THEN ROUND(SALARY * 1.20)
                       ELSE SALARY           
                 END 
             --2005����� �ٹ��ϰ� ������ MGR ������ 25%�޿� �λ�
             ELSE CASE WHEN JOB_ID LIKE '%MGR%' THEN ROUND(SALARY * 1.25)
                       ELSE SALARY  
                   END
                   
                  END AS "����� �޿�"  
        FROM EMPLOYEES 
    ORDER BY HIRE_DATE            
;
-------------
SELECT JOB_ID, SUBSTR(JOB_ID, -3) FROM EMPLOYEES;

SELECT EMPLOYEE_ID, FIRST_NAME||' '||LAST_NAME AS NAME,
        JOB_ID, HIRE_DATE, SALARY,
        --2005�� �����Ի��̰�, MGR : 15%�λ� OR MAN : 20% �λ�
        CASE WHEN TO_CHAR(HIRE_DATE, 'YYYY') < '2005'
             THEN DECODE(SUBSTR(JOB_ID, -3),
                    'MGR' , ROUND(SALARY * 1.15),
                    'MAN' , ROUND(SALARY * 1.20),
                        SALARY)          
             --2005����� �ٹ��ϰ� ������ MGR ������ 25%�޿� �λ�
             ELSE DECODE (SUBSTR(JOB_ID, -3), 
                   'MGR', ROUND(SALARY * 1.25),
                      SALARY)                                     
                 END AS "����� �޿�"  
        FROM EMPLOYEES 
    ORDER BY HIRE_DATE            
;


/*11�� ������ �Ի��� ��� �� ���
  (���1) ������ �Ի��� ��� ���� �Ʒ��� ���� �� �ະ�� ��µǵ��� �Ͻÿ�(12��).
  1�� xx
  --2�� xx
  3�� xx
  ..
  12�� xx
  �հ� XXX
**********************************************************************/  
---------------------------------------------------------
/* (���2) ù �࿡ ��� ���� �Ի� ��� ���� ��µǵ��� �Ͻÿ�
  1�� 2�� 3�� 4�� .... 11�� 12��
  xx  xx  xx xx  .... xx   xx
**********************************************************************/  

SELECT TO_CHAR(HIRE_DATE, 'MM')||'��', COUNT(*)
    FROM EMPLOYEES 
  GROUP BY TO_CHAR(HIRE_DATE, 'MM') 
   UNION 
   SELECT '�հ�', SUM(COUNT(*))
    FROM EMPLOYEES
    GROUP BY TO_CHAR(HIRE_DATE, 'MM') 
 ;
 
 SELECT TRIM(TO_CHAR(HIRE_DATE,'MM')||'��'), COUNT(*)
  FROM EMPLOYEES
  GROUP BY TRIM(TO_CHAR(HIRE_DATE,'MM')||'��')
 ;   
 
------
SELECT HIRE_DATE, TO_CHAR(HIRE_DATE, 'MM') FROM EMPLOYEES;

SELECT TO_CHAR(HIRE_DATE, 'MM')AS "��",
       COUNT(*) AS "�ο���"
    FROM EMPLOYEES
  GROUP BY TO_CHAR(HIRE_DATE, 'MM')
UNION 
SELECT '�հ�' AS "��",
     COUNT(*) AS "�ο���"
    FROM EMPLOYEES
;
----------
SELECT TO_NUMBER(TO_CHAR(HIRE_DATE, 'MM'))AS "��",
       COUNT(*) AS "�ο���"
    FROM EMPLOYEES
  GROUP BY TO_CHAR(HIRE_DATE, 'MM')
UNION 
SELECT 99 AS "��",
     COUNT(*) AS "�ο���"
    FROM EMPLOYEES
  ORDER BY 1
;

----------------
SELECT DECODE (MM, 99, '�հ�', MM || '��') AS "�Ի��",
       CNT AS "�ο���"
   FROM (SELECT TO_NUMBER(TO_CHAR(HIRE_DATE, 'MM'))AS MM,
       COUNT(*) AS CNT
    FROM EMPLOYEES
  GROUP BY TO_CHAR(HIRE_DATE, 'MM')
UNION 
SELECT 99 AS MM,
     COUNT(*) AS CNT
    FROM EMPLOYEES
    ORDER BY 1)
;

--------------------
/* (���2) ù �࿡ ��� ���� �Ի� ��� ���� ��µǵ��� �Ͻÿ�
  1�� 2�� 3�� 4�� .... 11�� 12��
  xx  xx  xx xx  .... xx   xx
**********************************************************************/      
SELECT 14 AS "1��", 13 AS "2��" , 17 AS "3��" FROM DUAL;

SELECT EMPLOYEE_ID, HIRE_DATE ,TO_CHAR(HIRE_DATE, 'MM'),
    DECODE(TO_CHAR(HIRE_DATE, 'MM') ,'01', 1, 0) AS "1��",
    DECODE(TO_CHAR(HIRE_DATE, 'MM') ,'02', 1, 0) AS "2��",
    DECODE(TO_CHAR(HIRE_DATE, 'MM') ,'03', 1, 0) AS "3��"
  FROM EMPLOYEES
  ORDER BY TO_CHAR(HIRE_DATE, 'MM')
  ;
  
  ------
  SELECT SUM(DECODE(TO_CHAR(HIRE_DATE, 'MM') ,'01', 1, 0)) AS "1��",
    SUM(DECODE(TO_CHAR(HIRE_DATE, 'MM') ,'02', 1, 0)) AS "2��",
    SUM(DECODE(TO_CHAR(HIRE_DATE, 'MM') ,'03', 1, 0)) AS "3��",
    '....',
     SUM(DECODE(TO_CHAR(HIRE_DATE, 'MM') ,'12', 1, 0)) AS "12��",
     COUNT(*) AS "�հ�"
  FROM EMPLOYEES
  ;

    
    

