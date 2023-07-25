# 웹 기초
## 1. 요청과 응답 이해하기
- 요청(request) : 브라우저(클라이언트)
- 응답(response) : 서버(server)
<br>

### 요청전문
- 헤더(header)
	- 요청 쪽에 대한 정보
	- 요청 방식(method - GET, POST)
	- 요청 주소
	- 요청 IP
	- 브라우저 언어 설정
	- 브라우저 종류(User-Agent)
	- 요청 데이터의 형식
		- content-type:
			- content-type: application/x-www-form-urlencoded;
											application/json;
<br>

- 바디(body)
	- POST 방식으로 데이터를 전송
	
	application/x-www-form-urlencoded;
	
	
	application/json;
	{"subject" :"제목","content" : "내용"}
### 응답 전문
- 헤더(header)
	- 응답 바디의 데이터 종류
	- content-type : text/html
		-> 브라우저가 바디 데이터를 해석하기 위한 정보 (인식하고 해석해준다)
<br>

- 응답 상태 코드
	- 2xx
		- 200 : 정상응답 (브라우저 -> 서버 -> 응답)
		- 201 : 작성됨(POST) - 서버에 기록을 완료했을 때
<br>

	- 3xx
		- 301 : 영구 이동
		- 302 : 임시 이동
		- 304 : 캐시됨 : 동일한 주소로 되어있는 파일 -> 임시로 저장하고 서버에 요청 -> 일정시간 경과 후 삭제 다시 요청한다.
<br>

	- 4xx : 클라이언트 오류
		- 400 : 잘못된 요청(Bad Request)
		- 401 : 접속 권한 없음(Unauthorized)
		- 403 : 금지됨(forbidden) 
		- 404 : 페이지 없음(Not Found) - 주소가 잘못 되었을 때 나오는 것.
		- 405 : Method Not Allowed - GET, POST, DELETE, PUT, DELETE - 정의된 코드를 확인.
<br>
		
	- 5xx : 서버쪽 오류
		- 500 : 소스 코드의 오류
		- 501 : Bad Gateway
		- 503 : 서비스를 이용할 수 없음
<br

- 응답 서버쪽 정보
	- 서버쪽에서 브라우저 전달하는 명령
		- cash-cotrol
		- Location : 주소 : 서버에서 -> 브라우저에서 주소를 이동
		- refresh : 초 - 초마다 새로고침
		- Set-Cookie : 키=갑; 키=값; : 브라우저에게 쿠키값을 저장해 달라.
		- content-disposition: attachment; filename=... : 바디에 출력 흐름 파일로 변경 - 파일 다운로드
<br>

- 바디(body)
		- 서버 응답 데이터
<br>

## 2. HTTP(HyperText Transfer Protocol)
	httml 문서를 전송, 수신 프로토콜
<br>

## 3. 헤더(header)
## 4. HTTP 상태코드
## 5. HTTP 요청메서드
	- GET - 서버 자원 조회 (주소를 입력하는 것 자체가 해당 자원을 접근하는 것.)
<br>

```
https://news.naver.com
/main/main.naver


?
mode=LSD
&
mid=shm
&
sid1=105

질의(query)

쿼리 스트링 : 주소에 조회용데이터가 있다. 
-> 요청 body는 비어있는 상태로 전송 
//조회할 때 서버가 참고하는 데이터
```

<br>

> 참고) GET 방식
> DELETE

<br>

- POST : 작성하다 - 서버에 자원 기록
	- 요청 헤더 content-type 
		
	- 요청 데이터 body에 기록
		- 예) content-type: application/x-www-form-urlencoded
			subject=%A ....
			
				content-type: application/json
				{"subject" :"...","content" : "..."}
				
> 참고)
> PUT : 데이터 치환
> PATCH : 데이터의 부분 치환

	OPTIONS
<br>

-------------
# 서블릿(Servlet)
1. 서블릿(Servlet)의 개요
	- 자바의 웹 기술
	
	jakar ee 10 : jakarta.
	
	java ee8 : javax.
<br>

2. 서블릿(Servlet) 클래스 작성하기
	jakarta.servlet 패키지
	jakarta.Servlet.http 패키지
		HttpServlet 클래스(추상클래스)
		
	Servlet-api (자바에서 제공해주는 API)
	
	API(Application Programming Interface) : 애플리케이션 개발에 필요한 설계 틀

	HttpServletRequset : 요청 관련 정보 + 기능 
	
	HttpServletRespone : 응답 관련 기능 + 헤더 정의
	
	servlet 6.0 : 기본 인코딩 UTF-8
	servlet 4.0 : 기본 인코딩 


3. web.xml 파일에 서블릿(Servlet) 등록하기
	<web-app>
		<servlet>
			<servlet-name>서블릿 이름</servlet-name>
			<servlet-class></servlet-class>
		</servlet>
		<servlet-mapping>
			<servlet-name>서블릿 이름</servlet-name>
			<url-pattern>요청 URL</url-pattern>
		</servlet-mapping>
	</web-app>

4. XML 문법의 기초
	<?xml version="1.0" encoding="..."?>
5. 웹 브라우저로부터 데이터 입력 받기
HttpServletRequset
	String getParameter(String name) : 요청 데이터를 조회
		GET -쿼리스트링의 각각의 값
		POST - body 의 값
