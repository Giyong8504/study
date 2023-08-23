# JdbcTemplate
1. 설치 및 설정
1) spring-jdbc
  - 자원 해제: 자동
  - SQLException : 엄격한 예외, 컴파일러에서 체크 되는 예외
      : 예외가 발생하든 안하든 무조건 처리
	- DataAccessException
		- SQLException -> RuntimeException 형태로 변경

2) tomcat-jdbc
- 커넥션 풀 (미리 생성해서 만들어주는 공간)
  - 미리 연결 객체를 여러개 생성해서 필요할 때마다 빌려주고, 회수하는 방식
  - 반응성, 성능 향상의 효과
  
   - DBMS에서 연결이 유지 안되면 연결 종료 -> 커넥션 풀 객체의 연결 상태를 주기적으로 확인할 필요

2. DataSource 설정
3. JdbcTmeplate을 이용한 쿼리 실행
1) query() : 데이터 목록 조회, SELECT 문
- List query(String sql, RowMapper rowMapper)
- List query(String sql, Object[] args, RowMapper rowMapper)


<br>

```
필요한 mvn
- spring-context
- spring-jdbc
- tomcat-jdbc
- mysql connector/j
- lombok
```

<br>