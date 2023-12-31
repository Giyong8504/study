# SQL 실습 환경 구성
1. MySQL 설치 및 Workbench 설치
2. 샘플 데이터 설치
<br>

# 데이터베이스 기본 개념
## 1. 데이터베이스
## 2. DBMS
## 3. 릴레이션
## 4. 릴레이션 스키마
## 5. 릴레이션 인스턴스
- 데이터 레코드 한개
- 튜플(Tuple)
<br>

## 6. 관계 데이터베이스 시스템
- 관계 : 테이블간 관계 (조인)

## 7. 키
1) 후보키
	- 회원명 휴대전화번호 주민번호 이메일 주소 
		- 주민번호
		- 회원명 + 휴대전화번호
		- 이메일 주소
	<br>
2) 기본키
- 레코드를 대표할 수 있는 후보키 중에서 하나를 선정 -> 기본키
	- 예) 주민번호
	
3) 대리키
- 기본키가 적합하지 않는 내용이 담겨 있거나, 선정하기가 어려운 경우, 이를 대신할 수 있는 증감번호 형태의 키
	
4) 외래키
- 다른 테이블의 기본키와 연결된 키
- 여러 테이블을 하나의 테이블 처럼 연결해서 조회
- 참조 무결성 제약조건
	- 부모테이블에 연결된 자식 레코드가 있는 경우, 부모테이블의 데이터 삭제 X
<br>

## 8. 무결성 제약조건
1) 도메인 무결성 제약조건
- 자료형 숫자이면 숫자만 입력 가능
- 자료형 문자이면 문자만 입력 가능
- 자료형 날짜이면 날짜만 입력 가능
<br>

2) 개체 무결성 제약조건
- 기본키 제약조건 (NOT NULL + UNIQUE)
<br>

3) 참조 무결성 제약조건
- 부모 테이블에 연결된 자식 테이블 레코드가 존재 -> 삭제 불가
<br>

-------------

# SQL (Structured Query Language)
- 데이터 정의어(Data definition Language - DDL)
	- 데이터 베이스, 테이블 등 데이터의 구조를 정의하는 언어
<br>

- 데이터 조작어(Data Manipulation Language - DML)
	- 추가(INSERT)
	- 수정(UPDATE)
	- 삭제(DELETE)
	- 조회(SELECT) - 질의문
<br>

- 데이터 통제 언어(Data Control Language - DCL)
	- 데이터 접근 권한
		- GRANT : 권한부여
		- REVORK : 권한회수
<br>

# 데이터의 정의어 (DDL)
## 1. CAEATE 문 : 생성
	- 데이터 베이스 -> 테이블
	- 데이터 베이스 생성
	
	```
	CREATE DATABASE 데이터베이스명;
	```
	
	<br>

> 참고) 데이터베이스를 선택해야 사용가능하다.
> USE 데이터베이스명;

<br>

#### 자료형
- 숫자
	- 정수 : 
		- TINYINT
		- SHORINT
		- INT(INTEGER)
		- BIGINT
		<br>
		
	- 실수
		- FLOAT
		- DOUBLE
	<br>
	
- 문자
	- CHAR(숫자)
		- 예) CHAR(5) : 5자리 공간 할당, 5자리까지 문자 입력가능. (고정 자리수 문자)
		<br>
		
	- VARCHAR(숫자) : 최대 숫자 만큼 문자를 입력 / 문자의 갯수만큼 공간이 유동적으로 변경 / 한줄 텍스트 
		- 예) VARCHAR(255) : 최대 255자릿수 문자까지  // ABC -> 3
	<br>
	
	- TINTEXT
	- MEDIUMTEXT
	- TEXT : 여러줄 텍스트
	- LONGTEXT
	<br>
	
- 날짜
	- DATE : 날짜
	- TIME : 시간
	- DATETIME : 날짜, 시간
<br>	

- 기타
	- SET("값1","값2","값3") : 값 1, 값2, 값3 중에서 1개 선택
	- ENUM("값1","값2","값3") : 값1, 값2, 값3 중에서 1개 선택
<br>


```MySQL
CRATE TABLE 테이블명 (
	컬럼명 자료형 [제약조건];
	컬럼명 자료형 [제약조건];
);
```
<br>

- 제약조건
	- 기본키 : PRIMARY KEY
	<br>
	
	NULL : 값이 없는 상태
		- MySQL
			- NULL 값이 없음, '' 빈값.
		- ORACLE
			- NULL ,'' -> NULL
	<br>
	- NOT NULL : NULL 허용 X / 필수 항목
	- UNIQUE : 중복을 허용 X, NULL은 중복 허용
	- DEFAULT : 기본값 (NULL인 경우 기본값으로 대체)
	- CHECK(조건식) : 조건식에 참이 아니면 X
	<br>
	
> 참고) 주석
> -- : 설명, 실행 배제
<br>

- 외래키 제약조건
	- ON DELETE CASCADE : 연쇄 삭제 -> 부모 레코드를 삭제하면 자식레코드 연쇄 삭제
	
	- SET NULL : 부모 레코드 삭제하면 자식레코드는 외래키 값이 NULL으로 변경

<br>

## 2. ALTER 문 - 변경

```
ALTER TABLE 테이블명 ADD 컬럼명 자료형 [제약조건]
											[AFTER 컬럼명]
									MODIFY 컬럼명 자료형 [제약조건]
													컬럼명 자료형 [제약조건] 
									DROP COLUMN 컬럼명;/ 삭제
									RENAME COLUMN 기존 컬럼명 새로운 컬럼명;
									//이름 변경
									ADD PRIMARY KEY(기본키 컬럼, ...)
```
<br>

```
ALTER TABLE newBook ADD isbn VARCHAR(13) AFTER bookid;
```
<br>
## 3. DROP 문 - 삭제
- 데이터베이스 삭제

```
DROP DATABASE 데이터베이스명;
DROP TABLE 테이블명;
```
<br>

테이블 삭제
```
DROP TABLE 테이블명;
```
<br>

데이터 조작어(DML) - 검색
1. SELECT문의 기본문법
```
SELECT |ALL| DISTINCT| 속성이름(들)
FROM 테이블 이름(들)
[WHERE 검색 조건(들)]
[GROUP BY 속성이름}
[HAVING BY 검색조건(들)]
[ORDER BY 속성이름 [ASC|DESC]]
```
<br>


#### SELECT 컬럼명 ... FROM 테이블명;

#### DISTINCT : 중복 제거외한 레코드

#### WHERE
- 비교(>, <, =,)
- 다르다 ( !=,  ^=, <>)
- AND, OR
	
#### 논리연산자
- AND
- OR
- NOT : 부정