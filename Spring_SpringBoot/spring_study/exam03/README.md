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

![image](https://github.com/Giyong8504/study/assets/128211712/db3b1d31-9ca1-4a21-a3de-f002981aea5f)

	
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

## 1. 요청 매핑
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

## 2. 커맨드 객체
- getter, setter 형태의 객체 

	JSP : 속성 관리하는 객체 
	1) PageContext pageContext
	2) HttpServletRequest
	3) HttpSession sseion
	4) Servlet
	
	-> EL 속성으로 자동추가 : 클래스명에서 앞글자만 소문자인 속성명

## 3. 커맨드 객체 : 중첩 , 콜렉션 프로퍼티
	하나의 파라미터에 여러개의 데이터 매핑 : 배열 또는 컬랙션(Collection - List, Set)
	
## 4. 리다이렉트
요청 메서드의 반환값 "redirect: 주소": response::sendRedirect(...);

예) return "redirect:/member/login"; -> 응답헤더

## 5. 컨트롤러 구현 없는 경로 매핑
WebMvcConfigurer
	- void addViewControllers(...) 설정 메서드
	(바로 url 없이 설정할 수 있는것. 예) 회사 소개) 

## 6. 폼 태그
#### 1) <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
#### 2) form:form
	- medelAttribute : 커맨드 객체의 이름(EL식 속성 이름)
	- 커맨드 객체의 이름이 command 이면 생략 가능
	- ModelAttribute : -> 커맨드 객체의 EL식 속성명을 변경

#### 3) input 관련 커스텀 태그
	- <form:input> / type='text' / path="요청 파라미터 명/ 커맨드 객체의 속성 명
	- <form:password>
	- <form:hidden>



#### 4) select 관련 커스텀 태그

```
	- <form:select>
		- path, items
	- <form:options>
		- items, itemLabel, itemValue
	- <form:option>
		- value, label
```

#### 5) 체크박스 관련 커스텀 태그
 	```
	- <form:checkboxes>
		- path, items, itemLabel, itemValue
		- items : 배열, 컬렉션
		
	- <form:checkbox>
	 ```
			- label, value
#### 6) 라디오버튼 관련 커스텀 태그
	```
	- <form:radiobuttons>
	- <form:radiobutton>
	```

#### 7) textarea

```  
 <form:textarea>
```

#### 8) CSS 및 HTML 태그와 관련된 공통 속성
	- cssClass: HTML의 class 속성값
	- cssErrorClass : 폼 검증 에러가 발생했을 때 사용할 HTML의 class 속성값
	- cssStyle: HTML의 style 속성값
		
	- id, title, dir
	- disabled, tabindex
	- onfocus, onblur, onchange onclick, ondblclick
	- onkeydown, onkeypress, onkeyup
	- onmousedown, onmousemove, onmouseup
	- onmouseout, onmouseover
	
	- htmlEscape 
#### 7. 모델
	Model 
		.addAttribute(String name, Object value)
		.addAllAtrribute(Map....)
	
	->  요청 메서드로 정의 : 주입
	
	
요청 메서드에 자동 주입
1) 커맨드 객체 : 요청 데이터
2) Model
3) Errors : 커맨드 객체 검증 실패(유효성 검사)시 에러에 대한 정보 

서블릿 기본 객체 : 스프링 컨테이네어 관리 객체 추가 :  요청 메서드의 주입, 의존성 자동 주입(@Autowired)
4) HttpServletRequest
5) HttpServletResponse 
6) HttpSession


-----------
# 스프링 웹 MVC

## 스프링 MVC
#### 1. 메시지
1) MessageSource
2) ResourceBundleMessageSource
	<%@ taglib profix="spring" uri="http://www.springframework.org/tags"%>
	<spring:message code="메세지 코드" />
		- arguments="값1, 값2..."
3) 다국어 지원 위한 메시지 파일
   commons_en.proproperties
   commons_jp.properties
   commons._zn.properties

#### 2. 커맨드 객체 검증
- 커맨드 객체 : 템플릿쪽에서 EL식 변수로 접근
  변수명은 커맨드 객체 클래스명에서 첫 글자만 소문자

1) Validator 인터페이스 - 틀 내에서 제공해준다.
	- supports(...) : 검증할 커맨드 객체의 유형을 한정
	- validate(...) : 실 검증 코드가 작성되는 메서드

2) Errors 
   - 커맨드 객체 자체의 오류 -
   reject("에러코드")
   reject("에러코드", "기본메세지")

   	- 커맨드 객체의 특정 필드 한정 오류 -
   	rejectValue("양식 필드명(name)", "에러코드")
   	rejectValue("양식 필드명(name)", "에러코드", "기본메세지")
   	
   	
   	boolean hasErrors()  : reject, rejectValue가 한개라도 호출되면 true
   	
   	- 에러의 정보 
   	
   	- 템플릿 연동 
		<form:errors path = "필드명 이름" />
		
		
   	#fields.errors("필드명") : 특정 필드의 에러 메세지, 배열 
   	#fields.globalErrors() : 커맨드 객체 자체 에러 메세지
   		참고)#fields.errors('global')
   	
   	
   	- @ModelAttribute  : 커맨드 객체 -> EL 식 변수 추가 

3) ValidationUtils : 필수 항목 검증을 쉽게 할 수 있는 정적 메서드 정의 
   rejectIfEmpty(...) : 항목이 null
   rejectIfEmptyOrWhitespace(...) : 항목이 null 이거나 공백만 포함 하는지

#### 3. 에러 코드에 해당하는 메시지 코드를 찾는 규칙
- 에러코드 + "." + 커맨드객체이름 + "." + 필드명
- 에러코드 + "." + 필드명
- 에러코드 + "." + 필드타입(자료형)
- 에러코드

#### 4. 프로퍼티 타입이 List나 목록인 경우 다음 순서를 사용해서 메시지 코드를 생성한다.

에러코드 + "." + 커맨드객체이름 + "." + 필드명[인덱스].중첩필드명
에러코드 + "." + 커맨드객체이름 + "." + 필드명.중첩필드명
에러코드 + "." + 필드명[인덱스].중첩필드명
에러코드 + "." + 필드명.중첩필드명
에러코드 + "." + 중첩필드명
에러코드 + "." + 필드타입(자료형)
에러코드

#### 5. 글로벌 범위 Validator와 컨트롤러 범위 Validator
1) 글로벌 범위 Validator 설정과 @Valid 애노테이션
-  WebMvcConfigurer의 getValidalor()
- @Valid 커맨드 객체  : 검증을 할 커맨드 객체
	- Bean Validation API + Hibernate Validator

2) @InitBinder 애노테이션을 이용한 컨트롤러 범위 Validator
   @InitBinder
   protected void InitBinder(WebDataBinder binder) {
   binder.setValidator(new RegisterRequestValidator());
   }

3) 컨트롤러 범위 Validator  > 글로벌 범위 Validator
WebMvcConfigurer
	getValidator() : 전역 Validator 설정
	-> @Valid 애노테이션을 커맨드 객체 앞에 

#### 6. Bean Validation API
- jakarta.validation 패키지
+ Hibernate Validator <-- 구현체 

1) 설정
2) Bean Validation의 주요 애노테이션
   @AssertTrue
   @AssertFalse
   @DecimalMax
   @DecimalMin
   @Max
   @Min
   @Digits
   @Size
   @Null
   @NonNull
   @Pattern

@NotEmpty
@NotBlank
@Positive
@PositiveOrZero
@Email
@Future
@FutureOrPresent
@Past
@PastOrPresent

@CreditCardNumber


----------

# 스프링 웹 MVC
## 1. 세션
## 2. 인터셉터

HandlerInterceptor 인터페이스 **중요!!** 

1) boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception;
	- 컨트롤러 빈을 실행 하기전 호출 (공통기능 부분들을 추가) 
	- 공통 기능 + 통제
		- 반환값이 true -> 컨트롤러 빈이 실행
		- 반환값이 false -> 컨트롤러 빈이 실행 안됨.

2) void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception;
	- 컨트롤러 빈을 실행, ModelAndView 반환 직후 호출,(응답전)

3) void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception;
	- 응답이 완료된 직후 호출된다.


WebMvcConfigurer <- 여기에 설정을 추가한다.
	


Ant 경로 패턴
1) *
2) ?
3) **


#### 3. 쿠키

HttpServletRequest
	String[] getCookies()
	
@CookieValue 쿠키명과 동일한 변수명



참고)
ModelMapper : 동일한 명칭의 getter, setter 자동호출




-------------


# 스프링 웹 MVC

1. 날짜 값 변환
@DateTimeFormat
	- pattern
	
에러코드 : typeMismatch

2. @PathVariable : 경로 변수
3. 익셉션 처리
@ExceptionHandler
	- 요청 메서드의 주입 가능한 객체
	1) 발생한 예외 객체
	2) Model
	3) HttpServletRequest
	4) HttpServletResponse
	5) HttpSession
	
@ControllerAdvice 



------------




스프링 파일 업로드(MultipartFile)
1. multipart - 파일 양식을 나눠서 업로드.

2. 설정

```
web.xml
<multipart-config>
    <max-file-size>20971520</max-file-size> <!--  1MB * 20 -->
    <max-request-size>41943040</max-request-size> <!-- 40MB -->
</multipart-config>
```

1kb -> 1024byte
1mb -> 1024kb

1024 * 1024 * 20 -> 20MB

3. MultipartFile


프로필과 프로퍼티 파일
1. @Profile
	- 설정 관련 빈을 분리해서 관리하는 것. 설정 관리 빈을 다르게 생성할 수 있다.
		- spring.profiles.active=프로필명  -> 부트에서도 사용하니 외우기.
	

2. PropertySourcesPlaceholderConfigurer
	-> static 메서드로 정의
	-> @Bean

3. @Value

	@Value("${설정이름}") : 자동으로 알아서 문자열로 주입된다.


spring.profiles.active : properties 파일 방식의 설정



> 참고)
> yml 파일 방식의 설정 방법 (들여쓰기 방식으로 설정하게 된다.)
> spring 
> 	profiles
> 		active=dev


-------


# JSON 응답과 요청 처리
1. JSON이란?
1) JSON(JavaScript Object Notation): 자바스크립트 객체 표기법
{"이름1" : "값1", "이름2" : "값2"...}
- 통일된 형식으로 다른 플렛폼도 서비스를 이용할 수 있게 형식을 정한것.

2. Jackson 의존 설정
	1) jackson-databind
	2) jackson-datatype-jsr310
		
3. @RestController : 요청과 응답에 특화 
1) 스프링5에서 추가
2) 기존 컨트롤러와 다른점은 **반환값이 객체**이다.
	-> getter를 호출 -> JSON 출력
3) 문자열 반환 -> 문자열 출력
4) 반환값(void)-> 응답 바디 empty.
	
	
	
4. @ResponstBody :
1) 스프링4 까지는 자주 사용된 애노테이션
2) 일반 컨트롤러@Controller)에서 JSON 요청과 응답을 처리



5. @Jsonlgnore
- JSON 변환 배제 (보여지지 않은 부분에 사용)



6. @JsonFormat
- 날짜의 형식화 (패턴으로 알려주면된다.)
- pattern
	
	
7. @RequestBody 이름과 값형태의 문자만 받는다. 요청에 대한 바디를 해석
-	다른 형태로 요청하면 응답이 null로 온다.
- 요청 데이터를 JSON 형식으로 인식할 수 있도록 알려주는 애노테이션
-	 Content-Type : application/json



> 참고)
> 	ARC(Advanced Rest Client)



8. ResponseEntity 
	- 응답 상태 코드 + 응답 바티에 대한 상세한 통제
1) status(...) : 응답 상태 코드
2) body(...) : 바디에 출력 데이터가 있다.
3) build() : 바디 출력x

9. @ExceptionHandler
	- JSON 응답으로 오류 페이지 공통으로 처리
	
	
10. @RestControllerAdvice


-------------



# 타임리프(Thymeleaf)
1. 설정
   thymeleaf-spring6
   thymeleaf - java8time // JDK8 Date & TIME API  -> #temporals : 형식화
   thymeleaf layout :레이아웃 기능

2. 특징
	- Natural Template
	- 원래 HTML과 서버사이드 렌더링 결과 거의 동일하게 보이는 효과
	- 번역 기술
		- cacheable



## 타임리프 기본문법
1. 타임리프의 주요 식(expression)
1) 변수 식 : ${식...}
   - 속성으로 설정 -> 내용 부분이 번역
   - 속성으로 설정을 못하는 경우 [[${...}]]

2) 메세지 식 : #{메세지 코드}

   참고)
   fmt:setBundle
   <fmt:message key="메세지 코드">




3) 링크 식 : @{링크}
	- 컨텍스트 경로 추가
	-  URL 변수 식, 요청 파라미터 쉽게 추가

   참고)
   <c:url value="...." />

   참고) 번역되는 속성 th:속성명




4) 선택 변수식
   th:object="${객체}"
   *{속성명}


참고)
th:block : 태그 없이 값을 설정, 번역 문법을 적용




2. 타임리프 식 객체
1) #strings
2) #numbers
3) #dates, #calendars, #temporals
4) #lists, #sets, #maps

- 없는 기능은 만들어 사용
- 스프링 빈으로 등록한 모든 객체를 @스프링빈 이름.메서드명(...)



3. th:text
	- 텍스트만 인식, HTML은 해석 X

	- th:utext  : HTML 해석



4. th:each
   status
   - 반복 상태에 대한 값을 가지고 있는 객체
   - index : 0부터 시작하는 순서
   - count : 1부터 시작하는 순서
   - last, first : 처음, 마지막
   - odd(홀수), even(짝수)
   참고)
   JSTL:
   <c:forEach varStatus="status">
	 
	 
	 
5. th:if : 조건식 사용빈도가 높다., th:unless  

   th:unless="${...}" : ${...} 조건을 반대로 바꿔주는 조건식
	 
	 
	 
6. th:switch 
   th:case="..."

   조건식에 사용 가능한 상수 : true, false
	 
	
	 
7. th:href, th:src ...
		th:name... , th:id...
		th:type...



8. th:object : 선택 변수식



9. th:classappend
	- 특정 조건하에서 클래스 속성을 추가하고 제거
	- 복잡하면 삼항 조건으로하고 나머지는 간단하게 생략해도 된다.
	
	```
	<a href="#" class="tab" th:classappend="${menuCode == 'member'} ? 'on'">회원관리</a>
	```



## 스프링 MVC 폼과 에러 메시지 연동
1. #fields.errors(..) : 배열형태의 반환값. : errors.rejectValue(필드명, 에러코드) - 필드 오류
2. #fields.globalErrors() : errors.reject(에러코드) - 커맨드 객체 자체 오류
 = #fields.errors('global') 이것과 동일한 기능이나 위의 2번을 사용하자.


th:field : 값을 유지할 떄 쓰고 태그에 따라 다르게 동작하게 된다.
- path와 동일한 역할 
- 필요한 속성을 알아서 체크해서 넣어준다.


참고)
<form:errors path="필드명" />을 -> #fields.errors(..) 사용한다.


타임리프 페이지 레이아웃
th:replace
- 특정 템플릿 파일에 있는 부분 HTML을 치환

th:fragment
- 치환될 부분 HTML이 정의된 영역 : 메인부분 레이아웃 치환 역할


참고) 
	<jsp:include.. 와 비슷한 용도이다. 
	템플릿을 치환하는 기능.