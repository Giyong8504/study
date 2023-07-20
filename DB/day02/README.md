# 데이터 조작어
## 1. WHERE 조건
- 조건식 : 참 거짓을 판별하는 연산식

1) 비교

|---|---|---|
|술어|연산자|사용예|
|비교|=,>,<=,<,>=|price < 20000|
|범위|BETWEEN 미만조건 불가|price BETWEEN 10000 AND 20000|
|집합|IN, NOT IN|price IN(10000,20000,30000)|
|패턴|LIKE|bookname LIKE '축구의 역사'|
|NULL|IS NULL, IS NOT NULL| price IS NULL|
|복합조건|AND, OR, NOT|price < 20000 AND bookname LIKE '축구의 역사'|

<br>

> 참고) FROME DUAL; - 값을 확인해 볼때 사용.



2) 범위
- 컬럼명 BETWEEN A AND B
	- 컬럼명 >= A AND 컬럼명 <= B
	
3) 집합
- IN : 교집합
- NOT IN : 차집합

```
SELECT * FROM book
WHERE publisher IN('굿스포츠','대한미디어');

// 두 개의 출판사 제외 조회
SELECT * FROM book
WHERE publisher NOT IN('굿스포츠','대한미디어');
```
<br>

4) 패턴

|---|---|---|
|와일드 문자|의미|사용예|
|+ |문자열을 연결|'골프'+'바이블' : '골프 바이블'|
|% |0개 이상의 문자열과 일치|'%축구%' : 축구를 포함하는 문자열|
|[] |1개의 문자와 일치|'[0-5]' : 0-5 사이 숫자로 시작하는 문자열|
|[^] |1개의 문자와 불일치|'[0-5]%' : 0-5 사이 숫자로 시작하지 않는 문자열|
|- |특정 위치의 1개의 문자와 일치|'_구%' : 두 번째 위치에 '구'가 들어가는 문자열|

- LIKE
	- 컬럼명 LIKE '단어' - 컬럼명이 단어와 일치하는 패턴
	
	- 컬럼명 LIKE '단어%' - 컬럼명이 단어로 시작하는 패턴
	- 컬럼명 LIKE '%단어' - 컬럼명이 단어로 끝나는 패턴
	- 컬럼명 LIKE '%단어%' - 컬럼명에 단어가 포함되는 패턴
		- goodsNm LIKE '_가슴살%' -> 철글자는 아무거나 나오고 두번째 글짜부터 가슴살로 시작하는 패턴
<br>

```
SELECT * FROM book
WHERE bookname LIKE '%축구%';

SELECT bookname, publisher 
FROM book
WHERE bookname LIKE '_구%';
```

## OR 조건은 () 로 반드시 써줘야 된다.

5) 
- 값이 없음
- 연산 불가

- IS NULL
- IS NOT NULL

6) 복합조건
- NOT 조건 : 조건을 반대로

## 2. ORDER BY
- 컬럼명 [ASC -오름차순,기본값 | DESC - 내림차순]

## 3. 집계함수와 GROUP BY
- GROUP BY : 컬럼의 동일한 값을 가지고 그룹화 할 때 -> 통계를 내기 위해서
	- COUNT(컬럼명...) : 레코드 갯수(NULL 제외)
	- SUM(컬럼명...) : 합계
	- AVG(컬럼명...) : 평균
	- MAX(컬럼명) : 최대값
	- MIN(컬럼명) : 최소값
	<br>
	
	```
SELECT SUM(saleprice) AS '주문합계'
FROM orders
WHERE custid=2;
	```
	<br>
	
> 참고)
> AS - Alias : 별칭 / 컬럼명, 테이블명 / 생략 가능
>    - 별칭에서 " '를 생략가능.
>    		- 생략이 불가한경우 - 띄어쓰기가 있을 경우
> 오라클에서는 테이블명 별칭을 사용할 때 AS는 사용 불가

- HAVING 절
	- GROUP BY와 함께 사용
	- 집계함수의 조건절(WHERE절에서는 집계합수 조건 X)


## 4. 두 개 이상의 테이블에서 SQL 질의 - 조인
- 카티전 프로덕트 연산 : 무작위 순서쌍 (데카르트 곱)

	- SELECT ...  FROM 테이블, 테이블...
		- 의미있는 데이터 -> 공통 값을 가지고 조회 조건
		- AS 별칭
		
- 동등조인(내부조인 INNER JOIN) : 같은 값을 가지고 테이블 연결
	- JOIN - 표준 SQL
		```
		FROM 테이블명1 INNER JOIN 테이블명2 ON 테이블명1.공통컬럼 = 테이블2.공통컬럼
																	USING 공통컬럼
		
		SELECT *FROM customer c
		JOIN orders o ON c.custid = o.custid; //INNER 생략가능
		
		```
<br>

```
SELECT c.name, b.bookname, price
FROM orders o, customer c, book b
WHERE o.custid = c.custid  AND o.bookid = b.bookid
AND b.price = 20000;
```
<br>

- 외부조인(OUTER JOIN)

- 테이블1 LEFT OUTER JOIN 테이블2
	- 테이블1은 전체가 나오고 테이블2는 테이블1과 공통값이 있으면 나오고 없으면 NULL
```
FROM 테이블명 LEFT|RIGHT OUTER JOIN 테이블명2
		ON 테이블1.공통 항목 = 테이블2.공통항목
```
<br>

- 테이블1 RIGHT OUTER JOIN 테이블2
	- 테이블 2는 전체가 나오고 테이블1은 테이블 2와 공통값이 있으면 나오고 없으면 NULL
<br>

## 5. 부속질의
- SELECT 문 안에 SELECT 문이 포함된 
	- 스칼라 부속질의 
	<br>
	
	>스칼라: 단일값
	>부속질의가 단일값으로 나오는 형태
	>SELECT...FROM
	>비교 조건
<br>
	
	- 인라인 뷰
		- SELECT...FROM (SELECT...)
			- 가상의 테이블
<br>
			
	- 상관 부속질의

## 6. 집합 연산