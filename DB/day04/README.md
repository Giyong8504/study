# 날짜, 시간 함수
- 날짜 : 기본 형식(ISO) : 문자열 -> 날짜 자동 변환
## 1. STR_TO_DATE(string, format)
	-> 문자열 형식날짜 -> 날짜
<br>

2. DATE_FORMAT(date, format)
- 날짜 -> 형식화된 문자열
<br>

3. ADDDATE(date, interval)

```
SELECT * FROM orders
WHERE orderdate=STR_TO_DATE('07-10-2014', '%m-%d-%Y');


INTERVAL 10 DAY -> 10일 후
INTERVAL -10 DAY -> 10일 전

SELECT orderid, orderdate, ADDDATE(orderdate, INTERVAL 10 DAY) 확정일자
FROM orders;
```				
<br>

4. DATE(date)
-> 날짜와 시간 -> 날짜 부분만 반환
<br>

5. DATEDIFF(date1, date2)
-> date1, date2의 날짜의 차이(일수)

```
SELECT orderdate, DATEDIFF(SYSDATE(), orderdate) 경과일수
FROM Orders;
```

<br>

6. SYSDATE() : 현재 시스템의 날짜와 시간
- NULL 값 처리
	- 값이 없음
	- 연산불가능
<br>

1) NULL 값에 대한 연산과 집계 함수
	- NULL은 연산 X -> 집계 함수에서 제외
<br>

2) NULL 값을 확인하는 방법 - IS NULL, IS NOT NULL
- 비교 연산 x
- IS NULL : 값이 NULL일 때 참
- IS NOT NULL : 값이 NULL이 아닐 때 참
<br>

>참고)
> 오라클
> - NULL, ''(빈값) -> NULL
>
> MySQL
> - NULL  -> NULL, ''(빈값) -> 값

```
SELECT * FROM customer
WHERE (phone IS NULL OR phone= '');
```

3) IFNULL 함수
- 컬럼에 NULL인 값을 기본값으로 대체
- IFNULL(컬럼명, '컬럼명이 NULL 일때 대체할 값')
<br>

# 행번호 출력
```
SET 변수명 := 값;
	/
	변수명 앞에 @
	
SET @seq:=0;
```

1. SET : = 기호

--------------

# 뷰(view)
- 하나 이상의 테이블을 합하여 만든 가상의 테이블
- 합한다는 말은 SELECT 문을 통해 얻은 최종 결과
- 복잡한 쿼리를 작성해야 하는 조회 -> 가상의 테이블 1개로 단순하게 변경
- 보안적 이점
- DDL 언어(데이터 정의어)
- 조회

<br>

1. 뷰의 생성
```
CREATE VIEW 뷰이름
	AS SELECT 문
```
<br>

2. 뷰의 수정
```
아래의 내용으로 생성하면 오류가 적다.

CREAT OR REPLACE VIEW 뷰이름
AS SELECT 문
```
<br>

3. 뷰의 삭제
```
 DROP VIEW 뷰이름;
```
<br>

--------------
# 인덱스
- 인덱스(index - 색인)란 자료를 쉽고 빠르게 찾을 수 있도록 만든 데이터구조

목차 : 데이터의 물리적 주소가 기록 + 정렬

### 1. 인덱스의 특징 정리
- 인덱스는 테이블에서 한 개 이상의 속성을 이용하여 생성한다.
- 빠른 검색과 함께 효율적인 레코드 접근이 가능하다.
- 순서대로 정렬된 속성와 데이터의 위치만 보유하므로 테이블보다 작은 공간을 차지한다.
- 저장된 값들은 테이블의 부분집합이 된다.
- 일반적으로 **B-tree 형태**로 되어있다.
- 데이터의 **추가, 수정, 삭제 등의 변경이 발생하면 인덱스의 재구성이 필요**하다.
<br>

### 2. MySQL 인덱스의 종류
1) 클러스터 인덱스
- 검색의 기준
- 기본키
- UNIQUE 제약조건이 걸려 있는 키
- 둘다 없는 경우 MySQL이 내부적으로 클러스터 인덱스를 생성
<br>

2) 보조인덱스
- 보조 인덱스에 찾고 -> 레코드 -> 클러스터 인덱스

<br>

### 3. 인덱스의 생성
- DDL 데이터 정의어
```
CREATE [UNIQUE] INDEX 인덱스명
	ON 테이블명 (컬럼명 [ASC - 기본값|DESC], ...);
```
<br>

```
자세히 조회 ▼
SHOW INDEX FROM 테이블명;
```
<br>

### 4. 인덱스 재구성과 삭제
```
	인덱스 제구성 (느려질 때 한번씩)
	ANALYZE TABLE 테이블명;
```
<br>

```
DROP INDEX 인덱스명 ON 테이블;
```
<br>

--------
# 프로시저 - 저장프로그램
```
CREATE PROCEDURE 함수명([IN|OUT] 매개변수...)
BEGIN
	// 수행 코드 정의
	
END;
```
<br>

```
CALL 프로시저명(값);
```
<br>

1. 삽입 작업을 하는 프로시저
2. 제어문을 사용하는 프로시저
3. 결과를 반환하는 프로시저
4. 커서를 사용하는 프로시저


트리거
	- 추가, 수정, 삭제 -> 발생하는 이벤트 정의
	
```
	AFTER |INSERT|DELETE|UPDATE
	
	BEFORE |INSERT|DELETE|UPDATE
	
	INSTEAD OF INSERT
	
	CREATE TRIGGER 트리거명
		AFTER UPDATE
```

내장 객체
new : INSERT 쿼리시 -> 새로 추가된 데이터
old : UPDATE, DELETE 쿼리시 -> 기존데이터
<br>

# 사용자 정의함수

```
CREATE FUNCTION 함수명(매개변수) RETURNS 반환자료형

delimiter //
CREATE FUNCTION UPPER2(Word VARCHAR(40)) RETURNS VARCHAR(40)
BEGIN
	DECLARE Converted VARCHAR(40);
    
    SET Converted = UPPER(Word);
	RETURN Converted;

END;
//
delimiter ;
```