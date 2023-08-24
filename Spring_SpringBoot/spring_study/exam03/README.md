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
- PreparedStatement
INSERT INTO member VALUES (?, ? ,? ...)
1) query() : 데이터 목록 조회, SELECT 문
- List query(String sql, RowMapper rowMapper)
- List query(String sql, Object[] args, RowMapper rowMapper)
- List query(string sql, RowMapper rowMapper, Object... args)


2) T queryForObject() : 데이터 레코드 한개, 단일값 - 통계 데이터 : 합계, 평균...
- 조회된 데이터가 한개 레코드가 아니면(0개 이거나 2개 이상인 경우) : 예외 발생
- try~ catch로 예외처리

3) update() : 데이터 변경 쿼리 - INSERT, UPDATE, DELETE / 반환값은 반영된 레코드 갯수
- int update(String sql)
= int update(String sql, Object... args)

<br>

참고)
	쿼리 수행시 기본적으로 로그는 출력 X
	slf4j api
	logback classic
	
	로그 레벨
	FATAL
	ERROR
	WARN : 경고
	INFO : 정보성
	DEBUG
	TRACE : 추적(제일 많은 양)
	
	
	
<br>

### logback.xml	
- Logback은 로그 메시지 형식과 기록 위치를 설정 파일에서 읽어온다. 
- 이 설정 파일을 src/main/resources에 다음과 같이 작성한다.
- src/main/resources/logback.xml	
	
```
<?xml version="1.0" encoding="UTF-8" ?>

<configuration>
    <appender name="stdout" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>%d %5p %c{2} - %m%n</pattern>
        </encoder>
    </appender>
    <root level="INFO">
        <appender-ref ref="stdout" />
    </root>

    <logger name="org.springframework.jdbc" level="DEBUG" />
</configuration>
	```

<br>

4. PreparedStatementCreator를 이용한 쿼리 실행
5. INSERT 쿼리 실행 시 KeyHolder를 이용해서 자동 생성 키값 구하기
6. 스프링의 익셉션 변환 처리
	- 각 연동 기술에 따라 발생하는 익셉션을 스프링이 제공하는 익셉션으로 변환함으로써 다음과 같이 구현 기술에 상관없이 동일한 코드로 익셉션을 처리할 수 있게 된다.
	SQLExcpetion, HibernateException, PersistenceException ->  DataAccessException
	(RuntimeException)


7. 트랜잭션 처리

SQL1
SQL2
SQL3
SQL4

COMMIT을 해야만 -> DB에 영구 반영

conn.setAutoCommit(false); // 추가 공통 기능 

pstmt.executeUpdate(...) //핵심 기능
pstmt.executeUpdate(...) //핵심 기능
pstmt.executeUpdate(...) //핵심 기능
pstmt.executeUpdate(...) //핵심 기능

conn.commit(); // 추가 공통 기능

conn.rollback(); // 다시 돌아감.


1) @Transactional
	-Proxy 구현(AOP)
2) PlatformTransactionManager
3) DataSourceTransactionManager


```
필요한 mvn
- spring-context
- spring-jdbc
- tomcat-jdbc
- mysql connector/j
- lombok
```

1. AppCtx 설정하기
2. models.member에 member, memberDao 설정하기

<br>

------------------

# 스프링 MVC
0. 의존성
spring webmvc
servlet-api
servlet.jsp-api
jstl api + 구현체







1. 톰캣 설정
2. 스프링 MVC 설정
WebMvcConfigurer 인터페이스
3. 코드 및 JSP 구현

4. 스프링 MVC 프레임워크 동작 방식
5. WebMvcConfigurer 인터페이스와 설정
6. 정리
1) DispatcherServlet
2) HandlerMapping
3) HandlerAdapter
4) ViewResolver