CREATE table member(
num INT PRIMARY KEY,
NAME VARCHAR(50),
addr VARCHAR(50)
);

DESC member;

INSERT INTO member(num, NAME, addr) VALUES(1, '정초희', '서울');

INSERT INTO member(num, NAME) VALUES(2, '손정의');

INSERT INTO member VALUES(3, '스티브잡스','미국');


SELECT num, NAME, addr
FROM member;

SELECT *
FROM member;

DELETE FROM member
WHERE num = 2;

UPDATE member 
SET NAME = '스티브잡수', addr = '미쿡'
WHERE num =3;

DESC emp;

SELECT *
FROM emp;

SELECT *
FROM dept;


#emp 테이블에서 사원번호, 사원이름, 직업을 출력.
SELECT empno, ename, job
FROM emp;

#emp 테이블에서 사원번호, 급여, 부서번호를 출력하세요.
#단, 급여가 많은 순서대로 출력
SELECT empno, sal, deptno
FROM emp
ORDER BY sal DESC;

#emp 테이블에서 사원번호, 급여, 입사일을 출력.
#단, 급여가 적은 순서대로.
SELECT empno, sal, hiredate
FROM emp
ORDER BY sal;

#emp 테이블에서 직업, 급여를  출력.
#단, 직업명으로 오릅차순, 급여로 내림차순 정렬해서. (직업명으로 오름차순 하되 직업명이 같으면 급여기준으로 내림차순하라는 의미)
SELECT job, sal
FROM emp
ORDER BY job ASC, sal DESC;


SELECT empno 사원번호, ename 사원이름
FROM emp;

#emp 테이블에서 부서번호가 10번인 사원들의 급여와
#10% 인상된 금액 같이 출력
SELECT sal, 1.1*sal
FROM emp
WHERE deptno = 10
ORDER BY sal DESC;

#emp 테이블에서 급여가 3000이상인 사원들의 모든 정보를 출력
SELECT *
FROM emp
WHERE sal>=3000
ORDER BY empno;

#emp 테이블에서 부서번호가 30번이 아닌 사람들의 이름과 부서번호를 출력
SELECT ename, empno
FROM emp
WHERE deptno !=30;
#혹은
SELECT ename, empno
FROM emp
WHERE deptno <>30;

#emp 테이블에서 부서번호가 10 번이고 급여가 3000 이상인사원들의 이름과 급여를 출력
SELECT ename, sal
FROM emp
WHERE deptno = 10 and sal>=3000;

#emp 테이블에서 직업이 SALESMAN이거나 MANAGER인 사원의 사원번호와 부서번호를 출력
SELECT empno, deptno
FROM emp
WHERE job = 'SALESMAN' OR job = 'MANAGER';
#위와 같은 방법은 scan을 두번 하므로 AND를 이용하여 한번만 scan해서 출력하기
SELECT empno, deptno
FROM emp
WHERE job <> 'PRESIDENT' AND job <> 'CLERK' AND job <> 'ANALYST';

#부서번호가 10번이거나 20번인 사원의 사원번호와 이름, 부서번호 출력
#OR 이용하면
SELECT empno, ename, deptno
FROM emp
WHERE deptno =10 OR deptno =20;
#IN 이용하면
SELECT empno, ename, deptno
FROM emp
WHERE deptno IN (10,20);
#OR 혹은 IN은 되도록이면 쓰지말고 AND 사용하기
SELECT empno, ename, deptno
FROM emp
WHERE deptno<>30 AND deptno<>40;

#급여가 1000과 2000사이인 사원들의 사원번호, 이름, 급여를 출력
SELECT empno, ename, sal
FROM emp
WHERE sal>=1000 AND sal<=2000;
#혹은
SELECT empno, ename, sal
FROM emp
WHERE sal BETWEEN 1000 AND 2000;

#사원이름이 'FORD' 와 'SCOTT' 사이의 사원들의 사원번호, 이름을 출력
SELECT empno, ename
FROM emp
WHERE ename BETWEEN 'FORD' AND 'SCOTT';


#사원이름이 'J'로 시작하는 사원의 사원이름과 부서번호를 출력
SELECT ename, deptno
FROM emp
WHERE ename LIKE 'J%';

#사원이름이 'J'를 포함하는 사원의 사원이름과 부서번호를 출력
SELECT ename, deptno
FROM emp
WHERE ename LIKE '%J%';

#사원이름의 두번째 글자가 'A'인 사원의 이름, 급여, 입사일을 출력
SELECT ename, sal, hiredate
FROM emp
WHERE ename LIKE '_A%';

#사원이름이 'ES'로 끝나는 사원의 이름, 금여, 입사일을 출력
SELECT ename, sal, hiredate
FROM emp
WHERE ename LIKE '%ES';

#입사년도가 81년인 사원들의 입사일과 사원번호를 출력
SELECT hiredate, empno
FROM emp
WHERE hiredate LIKE '1981%';

SELECT *
FROM emp;

#커미션이 NULL인 사원의 사원이름과 커미션을 출력
SELECT ename, comm
FROM emp
WHERE comm IS NULL; 

#커미션이 NULL이 아닌 사원의 사원이름과 커미션을 출력
SELECT ename, comm
FROM emp
WHERE comm IS NOT NULL;



# concat(칼럼명, '문자열') => 문자열 연결함수
SELECT CONCAT(ename, '님') NAME
FROM emp;

# lower(칼럼명 or '문자열') => 칼럼을 소문자로 변경
SELECT LOWER(ename) NAME
FROM emp;

# upper(칼럼명 or '문자열') => 칼럼을 대문자로 변경
SELECT UPPER('hello');

#lpad('문자열', 전체자리수, '남은자리를 채울 문자') -> 왼쪽에 채움
SELECT empno, LPAD(empno, 10, 0)
FROM emp;

#한글은 3byte
SELECT LENGTH('국어');

#LEFT(). RIGHT(), SUBSTRING()
SELECT ename, LEFT(ename,3), RIGHT(ename,3), SUBSTRING(ename,2, 3)
FROM emp;

#format() => 반환값이 문자열
SELECT FORMAT(12345.15346, 1);

#concat()
SELECT CONCAT(ename, 'a', 'b', 'c')
FROM emp;

#nvl() => null인 값을 변경해줌
SELECT ename, comm, nvl(comm, 0)
FROM emp; 

# NULL값이 있는 경우 AVG함수가 정확하지 않을 수 있다
SELECT SUM(comm)/COUNT(*), AVG(comm)
FROM emp;


SELECT ABS(-10);

SELECT CEIL(3.123456);

SELECT FLOOR(3.2443);

SELECT ROUND(3.123123, 2);

SELECT MOD(10,3);

#truncate() : 소수점 이하를 자르는 것
SELECT truncate(123123.123423, 3);

DESC emp;


SELECT CURDATE(), CURTIME(), NOW();

#오늘 날짜에서 2일 지난 날짜
SELECT ADDDATE(NOW(), INTERVAL 2 DAY);

#오늘 날짜에서 2시간 지난 날짜
SELECT ADDDATE(NOW(), INTERVAL 2 HOUR);

#지불 데이터 같은 곳에서 이와 같이 사용
INSERT INTO member(sdate, edate) VALUES(NOW(), ADDDATE(NOW(), INTERVAL 180 DAY));

#오늘 날짜에서 2일 전 날짜
SELECT SUBDATE(NOW(), INTERVAL 2 DAY);

#두 날짜를 빼서 일수를 구함
SELECT DATEDIFF('2021-05-25','2021-04-29');

#두 날짜 사이의 시간을 나타내줌
SELECT TIMESTAMPDIFF(HOUR, '2021-04-29', '2021-05-25');
SELECT TIMESTAMPDIFF(MINUTE, '2021-04-29', '2021-05-25');

#시스템에 있는 날짜를 원하는 포맷으로 변경
SELECT hiredate, DATE_FORMAT(hiredate, '%Y/%m/%d %h:%i:%s')
FROM emp;

#문자열을 숫자열로 바꿔줌
SELECT CONVERT('1234', signed);

#숫자를 문자로 검색해도 convert가 내부적으로 되어서 출력이 됨
SELECT empno, ename
FROM emp
WHERE empno = '7566';

#문자열을 date객체롤 바꿔줌
SELECT STR_TO_DATE('2021-05-25', '%Y-%m-%d');

DESC emp;

#date을 알아서 convert해서 넣어줌
INSERT intO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES(9000, 'SUNG', 'SALESMAN', 7698, '2021-05-25', 10000,5000,30);

SELECT *
FROM emp;


SELECT COUNT(*), COUNT(empno), COUNT(ename), COUNT(comm)
FROM emp;

#null이 있어도 sum 구해줌
SELECT SUM(sal), SUM(comm)
FROM emp;

#평균 구할 때 주의/ null이 있는 평균을 구할 때 nvl 이용
SELECT AVG(sal), SUM(sal)/COUNT(empno), 
		AVG(comm), SUM(comm)/COUNT(empno), AVG(nvl(comm,0))
FROM emp;

#부서별 sal의 총합
SELECT deptno, COUNT(ename), SUM(sal), nvl(SUM(comm),0)
FROM emp
GROUP BY deptno
ORDER BY deptno;

#emp 테이블에서 부서번호와 부서별 평균 급여를 구해보세요.
SELECT deptno, AVG(nvl(sal,0))
FROM emp
GROUP BY deptno
ORDER BY deptno;

#emp 테이블에서 부서번호와 부서별 평균 급여를 구해보세요.
#(반올림해서 소수 첫째 자리 까지만)
SELECT deptno, ROUND(AVG(nvl(sal,0)),1)
FROM emp
GROUP BY deptno
ORDER BY deptno;

#emp 테이블에서 직업과 직업별 최대 급여를 구해보세요.
SELECT job, MAX(sal)
FROM emp
GROUP BY job
ORDER BY job;


#emp 테이블에서 부서번호와 급여가 1000 이상인 사원들의 부서별 평균급여의 반올림값을
#부서번호로 내림차순 정렬해서 출력
SELECT deptno, round(AVG(sal))
FROM emp
WHERE sal>=1000
GROUP BY deptno
ORDER BY deptno DESC;

#emp 테이블에서 부서번호와 급여가 2000이상인 사원들의 부서별 평균급여의 반올림값을
#평균 급여의 반올림 값으로 오름차순 정렬해서 출력
SELECT deptno, round(AVG(sal)) salavg
FROM emp
WHERE sal>=2000
GROUP BY deptno
ORDER BY round(AVG(sal));

#emp 테이블에서 각 부서별 같은 업무(job)를 하는 사람의 인원수를 구해서 부서번호, 업무, 인원수를 
#부서번호에 대해서 오름차순 정렬해서 출력
SELECT deptno, job, COUNT(job)
FROM emp
GROUP BY deptno, job
ORDER BY deptno;

#emp 테이블에서 부서번호와 급여가 1000이상인 사원들의 부서별 평균 급여를 출력
#단, 부서별 평균 급여가 3000이상인 부서만 출력
SELECT deptno, AVG(sal) salavg
FROM emp
WHERE sal>=1000
GROUP BY  deptno
HAVING AVG(sal)>=3000;



SELECT empno, ename
FROM emp
ORDER BY empno desc
LIMIT 0,5;

DESC member;

INSERT INTO member(num, NAME, addr) VALUES(10, '바이든', '미국');

SELECT num, NAME, addr
FROM member;


UPDATE member
SET NAME = '두테르테1', addr = '필리핀1'
WHERE num = 11;


SELECT num, NAME, addr
FROM member;

DELETE FROM member
WHERE num = '1';

SELECT num, NAME, addr
FROM member
ORDER BY num deSC
LIMIT 0, 2;


DESC dept;
SELECT deptno, dname, loc
FROM dept;

INSERT INTO dept(deptno, dname, loc) VALUES(50, 'Development', 'LA');

DELETE FROM dept
WHERE deptno = 50;

UPDATE dept
SET dname = 'development', loc = 'la'
WHERE deptno = 50;

SELECT deptno, dname, loc
FROM dept
ORDER BY deptno
LIMIT 0,10;


DESC emp;

SELECT *
FROM emp
ORDER BY empno;

INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) 
VALUES(9003, 'KIM', 'MANAGER',7839 , CURDATE(), 50000, 40000, 30); 

UPDATE emp
SET ename= 'KIM1', job='MANAGER1' , mgr=1212 , hiredate= CURDATE(), sal=50001 , comm=40001 , deptno=40 
WHERE empno= 9003;

DELETE FROM emp
WHERE empno= 9003;