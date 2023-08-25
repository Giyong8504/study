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
WebMvcConfigurer 인터페이스 ** 암기.
@EnableWebMvc
핵심적인 객체들을 위의 애노테이션으로 다 구현해준다.


3. 코드 및 JSP 구현

4. 스프링 MVC 프레임워크 동작 방식

## 왜 바로 실행안하고 한번 거치는 이유? 
요청하게되면(/greet) -> DispatcherServlet에서 필요한 빈을 찾는다. 
-> HandlerMapping(요청에 따라서 빈을 찾는다.)요청된 URL과 매칭되는 컨트롤러를 검색한다.
-> 형태를 맞춰서 실행하기 위해 adapter가 필요함. 
-> 이후 컨트롤 빈을 실행함. 반환은 Model(데이터)/view(템플릿경로) 로 반환(경로와 데이터로 반환된다.)
-> 응답하기 위해서 viewResolver에서 경로를 검색 하고 view 찾고 응답하게 된다.

<br>

<img src="C:\Users\kky51\Pictures\Screenshots\img123.png">
	
<br>

- 컨트롤러 빈
1) @Controller
2) Controller 인터페이스 구현체
3) HttpRequestHandler

5. WebMvcConfigurer 인터페이스와 설정

6. 정리
1) DispatcherServlet 
2) HandlerMapping 요청이 들어오면 해당하는 컨트롤 빈을 찾는 역할
3) HandlerAdapter 형태에 맞춰 처리 : model로 반환 
4) ViewResolver	위 정보를 가지고 view를 찾아서 응답하고 실행한다.

<br>

참고)

### Ant 경로 패턴

```
** : 현재 경로와 하위 경로를 모두 포함한 모든 파일
예) /upload/**
		/upload/1.png
		/upload/sub/2.png
		
* : 현재 경로의 모든 파일
	/upload/**
		/upload/1.png
		
? : 글자 1개
예) /m?00
		-> /m100, /m200
```

<br>

------
# 스프링 웹 MVC

1. 요청 매핑
@GetMapping
@PostMapping
@PutMapping  완전한 치환
@PatchMapping 부분 치환
@DeleteMapping

- 스프링4 이전부터 사용된 애노테이션
@RequestMapping : method 속성을 설정 x -> 모든 요청 메서드에 매핑 / 공통 url을 설정할 떄 주로 사용

HttpServletRequest
	String getParameter(String name)

- 요청 메서드 : 요청 파라미터와 동일한 명칭의 변수명 : 자동 주입
	명칭이 다르면 ? 주입X
	
- @RequestParam : 요청 파라미터와 다른 명칭의 변수에 값을 주입

2. 커맨드 객체
- getter, setter 형태의 객체 

	JSP : 속성 관리하는 객체 
	1) PageContext pageContext
	2) HttpServletRequest
	3) HttpSession sseion
	4) Servlet
	
	-> EL 속성으로 자동추가 : 클래스명에서 앞글자만 소문자인 속성명

3. 커맨드 객체 : 중첩 , 콜렉션 프로퍼티
	하나의 파라미터에 여러개의 데이터 매핑 : 배열 또는 컬랙션(Collection - List, Set)
	
4. 리다이렉트

5. 컨트롤러 구현 없는 경로 매핑

6. 폼 태그
1) <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
2) <form:form>
	- medelAttribute : 커맨드 객체의 이름(EL식 속성 이름)

3) <input> 관련 커스텀 태그
	- <form:input> / type='text' / path="요청 파라미터 명/ 커맨드 객체의 속성 명
	- <form:password>
	- <form:hidden>
	

4) <select> 관련 커스탬 태그
	- <form:select>
		- path, items
	- <form:options>
		- items, itemLabel, itemValue
	- <form:option>
		- vlaue, label
		
5) 체크박스 관련 커스텀 태그
	- <form:checkboxes>
		- path, items, itemLabel, itemValue
		- items : 배열, 컬렉션
	
	- <form:checkbox>
		- label, value

6) 라디오버튼 관련 커스템 태그

7. 모델
	Model
		.addAttribute(String name, Object value)
		.addAllAtrribute(Map...)
		
	-> 많이 사용하는 부분들은 요청메서드로 정의 : 주입 한다.
		
		
		
		
