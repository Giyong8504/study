# JDBC로 데이터베이스 연동
- JDBC(Java DataBase Connetivity) API(Application Progarmming Interface)
1. 순서
1)java.sql.* 패키지 임포트
2)JDBC 드라이버 로딩
- Class.forName(...) : 실행중에 동적으로 데이터에 올리는 역할

3)데이터베이스 접속을 위한 Connection 객체 생성
- DriverManager
	- .getCnnection(String url)

쿼리문을 실행하기 위한 4) Statement/PreparedStatement/CallableStatemnent 객체생성
쿼리 실행
5) 쿼리 실행 결과 값(int , ResultSet) 사용
6) 사용된 객체(ResultSet, Statement/PreparedStatement/CallableStatemnent, Connection) 종료


# 데이터베이스 쿼리실행
1. Statment
1) 정적인 쿼리에 사용
2) 하나의 쿼리를 사용하고 나면 더는 사용할 수 없다.
3) Statement 객체의 메서드 종류
	- ResultSet executeQuery(String sql);
		- SELECT 문과 같이 데이터 조회를 위한 쿼리
		- 반환값 ResultSet : 조회된 데이터를 위치를 가지고 있는 객체
		
		ResultSet
			
	- int executeUpdate(String sql)
		- INSERT, UPDATE, DELETE 와 같은 데이터 변경 관련 쿼리
		- 반영된 레코드 갯수
		
2. PreparedStatement
1) 동적인 쿼리에 사용
		
```java
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/madang";
        String user = "madang", password="madang";

        try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
```

CREATE DATABASE kanban;

 이름 : kanban
 비밀번호 : aA!123456
3. CallableStatemnent : 프로시저를 호출
Connection
	.prepareCall(String sql)
	
kanban / aA!123456

회원번호 - userNo - PK, AI
아이디 - userId
비밀번호 - userPw
회원명 - userNm
이메일 - email
전화번호 - mobile
가입일자 - regDt
회원정보 수정일시 - modDt

---------

마이바티스(mybatis) 프레임워크 설치 및 적용
1. 설정
- POOLED -> 커넥션

<select ...>
<update...>
<insert...>
<delete ...>

2. TypeHandler 적용하기
1) java.time 패키지 적용
- mybatis-typeHandler-jsr310 의존선 추가

```
    <typeHandlers>
        <typeHandler handler="org.apache.ibatis.type.LocalDateTimeTypeHandler" />
        <typeHandler handler="org.apache.ibatis.type.LocalDateTypeHandler" />
        <typeHandler handler="org.apache.ibatis.type.LocalTimeTypeHandler" />
    </typeHandlers>
		
```

<br>


2) Enum 타입 적용
```
<typeHandler handler="org.apache.ibatis.type.EnumOrdinalTypeHandler" />
```
<br>

3. 적용해보기
SqlSession

4. MyBatis와 SLF4J 연동하기
SLF4J API
logback classic

<settings>
	




--------
트랜잭션
SQL 작성의 단위


COMMIT 할때 까지의 단위 트랜잭션 : DB에 영구 반영

COMMIT 전까지는 ROLLBACK : 복구 가능

