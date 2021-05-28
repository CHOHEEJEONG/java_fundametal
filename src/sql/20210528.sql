#emp
DESC emp;

SELECT *
FROM emp
ORDER BY empno;

INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm) 
VALUES(9010, 'KIM', 'MANAGER',7839 , CURDATE(), 50000, 40000); 

UPDATE emp
SET ename= 'KIM1', job='MANAGER1' , mgr=1212, hiredate= CURDATE(), sal=50001 , comm=40001 , deptno=40
WHERE empno= 9003;

DELETE FROM emp
WHERE empno= 9003;

SELECT empno, ename, job, mgr, date_format(hiredate, '%Y/%m/%d'), sal, nvl(comm,0), deptno
FROM emp
ORDER BY hiredate DESC
LIMIT 0,5;



#join
# emp 테이블의 모든 사원들의 이름, 부서번호, 부서명을 출력
SELECT ename, emp.DEPTNO, dname
FROM emp, dept
WHERE dept.DEPTNO = emp.DEPTNO;

#join할 때 이렇게 하기
SELECT ename, e.DEPTNO, dname
FROM emp e, dept d
WHERE d.deptno = e.DEPTNO;

SELECT *
FROM emp;

#굳이 이렇게 하지말기, 이 문법은 mariadb에만 있음
SELECT ename, e.deptno, dname
FROM emp e JOIN dept d
ON d.deptno = e.DEPTNO;
#마찬가지로 굳이 이렇게 하지말기
SELECT ename, e.deptno, dname
FROM emp e JOIN dept d
USING (DEPTNO);

#급여가 3000에서 5000 사이의 사원이름과 부서명을 출력
SELECT ename, dname
FROM emp e, dept d
WHERE d.DEPTNO = e.DEPTNO and sal BETWEEN 3000 AND 5000;

#부서명이 'ACCOUNTING' 인 사원의 이름, 입사일, 부서번호, 부서명을 출력
SELECT ename, hiredate, e.deptno, dname
FROM emp e, dept d
WHERE d.DEPTNO = e.DEPTNO AND dname = 'ACCOUNTING';

#커미션이 null이 아닌 사원의 이름, 입사일, 부서명을 출력
SELECT ename, hiredate, dname
FROM emp e, dept d
WHERE d.DEPTNO = e.DEPTNO AND comm IS NOT NULL;

SELECT *
FROM emp;

#참조키에서 값을 가지고 있지 않은 행은 inner join에서 제외가 됨
#empno가 9010인 사원이 deptno가 할당이 되어있지 않으므로 inner join해서 출력하면 전혀 안나옴
SELECT empno, ename, dname
FROM emp e, dept d
where d.DEPTNO = e.DEPTNO;

#위와 같은 경우는 어쩔 수 없이 left join을 해야 함
#deptno가 할당이 되어있지 않은 empno가 9010인 사원도 출력이 된다
SELECT empno, ename, dname
FROM emp e LEFT join dept d
on d.DEPTNO = e.DEPTNO;

#emp 테이블과 dept 테이블을 조인하여 부서번호, 부서명, 이름, 급여를 출력
SELECT e.deptno, dname, ename, sal
FROM emp e, dept d
WHERE d.DEPTNO = e.DEPTNO;

# 사원의 이름이 'ALLEN'인 사원의 이름과 부서명을 출력
SELECT ename, dname
FROM emp e, dept d
WHERE d.DEPTNO = e.DEPTNO AND ename = 'ALLEN';

#모든 사원의 이름, 부서번호, 부서명, 급여를 출력
#단, emp테이블에 없는 부서도 출력해보세요
SELECT ename, e.deptno, dname, sal
FROM emp e LEFT join dept d
ON d.DEPTNO = e.DEPTNO;

SELECT deptno, dname
FROM dept;

#부서별 사원수 
#단, 사원이 0명인 부서도 모두 출력
SELECT d.DEPTNO, dname, COUNT(empno)
FROM dept d LEFT JOIN emp e
ON d.DEPTNO = e.DEPTNO
GROUP BY deptno
ORDER BY deptno;


SELECT *
FROM emp;

SELECT *
FROM salgrade;

INSERT INTO salgrade(grade, losal, hisal) VALUES(6, 10000, 30000);

#사원의 이름과 급여, 급여의 등급을 출력
#join할 떄 join칼럼이 없으면 where에 join 안쓰면 됨
#이 방법은 결과는 나오지만 좋지 않음 join칼럼이 없기 때문에 엄청 많이 돌기 때문 -> 위험
SELECT ename, sal, grade
FROM emp e, salgrade s
WHERE sal BETWEEN losal AND hisal;

#사원의 이름과 부서명, 급여의 등급을 출력
SELECT ename, dname, grade
FROM emp e, dept d, salgrade s
WHERE d.DEPTNO = e.DEPTNO AND sal BETWEEN losal AND hisal;



#subQuery
#단일행 subQuery
#'ALLEN'과 같은 부서에서 근무하는 사원의 이름과 부서의 번호를 출력
SELECT ename, deptno
FROM emp
WHERE deptno = (SELECT deptno FROM emp WHERE ename = 'ALLEN');


#'ALLEN'과 동일한 직책(job)을 가진 사원의 사번과 이름, 직책을 출력
SELECT empno, ename,job
FROM emp
WHERE job = (SELECT job FROM emp WHERE ename = 'ALLEN');

#'ALLEN'의 급여와 동일하거나 더 많이 받는 사원의 이름과 급여를 출력
SELECT ename, sal
FROM emp
WHERE sal>= (SELECT sal FROM emp WHERE ename = 'ALLEN');

#'DALLAS'에서 근무하는 사원의 이름, 부서번호를 출력 
SELECT *
FROM dept;

SELECT *
FROM emp;

SELECT ename, DEPTNO
FROM emp
WHERE DEPTNO = (SELECT DEPTNO FROM dept WHERE loc = 'DALLAS'); 

# 'SALES' 부서에서 근무하는 모든 사원의 이름과 급여를 출력
SELECT ename, sal
FROM emp
WHERE deptno = (SELECT deptno FROM dept WHERE dname = 'SALES');

#자신의 직속 상관이 'KING'인 사원의 이름과 급여를 출력해보세요
SELECT ename, sal
FROM emp
WHERE mgr = (SELECT empno FROM emp WHERE ename = 'KING');


#다중행 subQuery
#급여를 3000 이상 받는 사원이 소속된 부서와 동일한 부서에서 근무하는 사원들의 이름과 급여, 부서번호를 출력
SELECT ename, sal, deptno
FROM emp
WHERE deptno IN (SELECT deptno FROM emp WHERE sal>=3000);

SELECT deptno FROM emp WHERE sal>=3000;


# 직책이 MANAGER인 사원이 속한 부서의 부서번호와 부서명, 부서위치를 출력
SELECT deptno, dname, loc
FROM dept
WHERE deptno IN (SELECT deptno FROM emp WHERE job = 'MANAGER');



SELECT *
FROM member;








