-- Chapter01
-- 1. ���̺�
-- 2. �ο�, �÷�
-- 3. select
-- 4. DML ( Data Manipulation language )
-- 5. DDL ( Data Definition Language )
-- 6. DCL ( Data Control Language )
-- 7. SQL ( Structured Query Language )
-- 8. SQL * Plus
-- 9. 4

-- Chapter02
-- 1. 3
-- 2. 3
-- 3. 2
-- 4. 2
-- 5. 1
-- 6. 1
-- 7 
select empno, ename
from emp
order by empno desc;

-- Chapter03
-- 1
select * from emp
where mod(empno, 2)=1;
-- 2
select hiredate, substr(hiredate, 1, 2) �⵵,
                 substr(hiredate, 4, 2) ��,
                 substr(hiredate, 7, 2) ��
from emp;
-- 2.�� ���� ���� ó�� ǥ��
select to_char(hiredate, 'MM/DD/YYYY') hiredate,
                 substr(to_char(hiredate, 'MM/DD/YYYY'), 7, 4) �⵵,
                 substr(to_char(hiredate, 'MM/DD/YYYY'), 1, 2) ��,
                 substr(to_char(hiredate, 'MM/DD/YYYY'), 4, 2) ��
from emp;
-- 3
select round(sysdate-hiredate) �ٹ��ϼ�
from emp;
-- 4
select empno, ename, nvl(to_char(mgr, '9999'), 'C E O') as "���� ���"
from emp
where mgr is null;
-- 5. dual
-- 6
select sysdate+100 from dual;
-- 7
select last_day(sysdate) from dual;
-- 8. comm�÷��� ���� null�� �ƴϸ� sal+comm�� ����ϰ�, null�̸� sal�� ����Ѵ�
-- 9. case
-- 10. sysdate

-- Chapter04
-- 1. 3
-- 2. 1
-- 3. 3
-- 4. 1
-- 5. 1
-- 6. 1
-- 7
select count(deptno) "�����"
from emp
where deptno=30 and comm is not null;
-- 8
select max(hiredate) "�Ի���", min(hiredate) "�Ի���"
from emp;
-- 9
select job, sum(sal)
from emp
group by job
having sum(sal)>300;
