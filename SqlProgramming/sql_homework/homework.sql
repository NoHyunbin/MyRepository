-- Chapter01
-- 1. 테이블
-- 2. 로우, 컬럼
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
select hiredate, substr(hiredate, 1, 2) 년도,
                 substr(hiredate, 4, 2) 월,
                 substr(hiredate, 7, 2) 일
from emp;
-- 2.의 문제 예시 처럼 표기
select to_char(hiredate, 'MM/DD/YYYY') hiredate,
                 substr(to_char(hiredate, 'MM/DD/YYYY'), 7, 4) 년도,
                 substr(to_char(hiredate, 'MM/DD/YYYY'), 1, 2) 월,
                 substr(to_char(hiredate, 'MM/DD/YYYY'), 4, 2) 일
from emp;
-- 3
select round(sysdate-hiredate) 근무일수
from emp;
-- 4
select empno, ename, nvl(to_char(mgr, '9999'), 'C E O') as "직속 상관"
from emp
where mgr is null;
-- 5. dual
-- 6
select sysdate+100 from dual;
-- 7
select last_day(sysdate) from dual;
-- 8. comm컬럼의 값이 null이 아니면 sal+comm을 출력하고, null이면 sal을 출력한다
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
select count(deptno) "사원수"
from emp
where deptno=30 and comm is not null;
-- 8
select max(hiredate) "입사일", min(hiredate) "입사일"
from emp;
-- 9
select job, sum(sal)
from emp
group by job
having sum(sal)>300;
