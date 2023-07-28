# 액션 태그
- 액션 태그는 서버나 클라이언트에게 어떤 행동을 하도록 명령하는 태그
- 스크립트 태크, 주석, 디렉티브 태그와 함께 JSP 페이지를 구성하는 태그
- 커스텀 태그의 일종
- <jsp:.../>

# 액션태그의 종류
## 1. forward 액션 태그의 기능과 사용법
- 버퍼의 통제로 페이지 교체b
- page="JSP 페이지, 텍스트, HTML, 서블릿 경로"
- 요청을 처리하는 과정중에 기존 버퍼를 취소하고 현재 버퍼로 교체
	
 > 참고)
 > 실 페이지 이동  HttpServletResponse::sendRedirect("주소")

<br>

## 2. include 액션 태그의 기능과 사용법
-	 버퍼의 통제로 페이지 추가
- page="JSP 페이지, 텍스트, HTML, 서블릿 경로"
- 요청을 처리하는 과정중에 버퍼에 추가

<br>

```
forward를 만나면 해당 것만 담고 끝냄.

<%@ page contentType="text/html; charset=UTF-8" %>
<h1>ex01.jsp - 상단</h1>
<jsp:forward page="ex02.jsp" />
<h1>ex01.jsp - 하단</h1>
```

<br>

 > 참고)
 > 디렉티브 태그 <%@ include %>와 차이점이 있다!
 
<br>

3. include 액션 태그와 include 디렉티브 태그의 차이
4. param 액션 태그의 기능과 사용법
- forward, include가 요청 처리중에 버퍼에 추가 되므로 요청 데이터로 값을 추가

PequestDispatcher : HttpServletRequest::getRequestDispatcher("페이지 경로")...
- forward (HttpServletRequest, HttpServletResponse) : <jsp:forward.../>
- include (HttpServletRequest, HttpServletResponse) : <jsp:include.../>

5. 자바빈즈 액션 태그의 기능과 사용법
1) 자바빈즈 : 데이터 표현을 목적으로 하는 자바 클래스
- DTO(Data Transfer Object)
- VO(Value Object)

2) 자바빈즈 작성 규칙
3) useBean 액션 태그로 자바빈즈 사용하기
- <jsp:useBean id="식별이름" class="패키지명을 포함한 클래스명" scope="" />

scope - page(기본값) : PageContext
			request : HttpServletRequest
			session : HttpSession
			application : ServletContext

	- class에 명시된 클래스가 객체로 생성
	- 식별이름이 참조 변수
	- 기본 생성자로만 객체를 생성
	- 반드시 기본 생성자가 정의되어 있어야 정상 동작
	
4) setProperty 액션 태그로 프로퍼티 값 저장하기
- <jsp:setProperty name="bean 식별이름" property="속성명" value="값" />

5) getProperty 액션 태그로 프로퍼티 값 가져오기
<jsp:getProperty name="bean 식별이름" property="속성명" />

### 속성을 관리하는 내장 객체 4가지 **필수 암기**
- EL식 변수로 접근 바로 할 수 있는 값

pageContext PageContext : JSP 페이지 내에서 유지하는 속성
HttpServletRequest request : 요청이 유지되는 동안 보유하는 속성
HttpSession session : 세션이 유지되는 동안 보유하는 속성
ServletContext application : 애플리케이션이 실행되는 동안 보유하는 속성

PageContext < request < session < application

EL 변수로 적용되는 우선순위 : 범위가 좁을 수록 먼저 적용, 범위가 넓을 수록 나중에 적용.

pageContext > request > session > application


#### 각 속성 범위별로 조회할 수 있는 EL식 내장 객체 **중요 필수 암기**

```
각 속성 범위별로 조회할 수 있는 EL식 내장 객체
pageScope : PageContext 범위
requestScope: HttpServletRequest 범위
sessionScope : HttpSession 범위
applicationScope : application 범위
```

<br>

- 속성값을 설정
	- void setAttribute(Sting name, Object value); 
<br>

- 속성값을 조회
	- Object getAttribute(String name);
<br>

- 속성값을 제거
	- void removeAttribute(String name);
<br>

> 참고)
> JSP
> 	EL식(Expression Language)
>   	- 연산식, 속성을 변수로 사용
>			- 번역기술
>				jakarta.servlet.jsp.el

<br>
