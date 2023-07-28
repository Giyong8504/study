사용시 필요한 것.
jakarta servlet-api
jakarta servlet.jsp-api
lombok

# 익스프레션 언어 (EL 표현식)
## 연산식
1. 애트리뷰트 형태로 전달되는 데이터
2. 애트리뷰트 값을 출력하는 EL식
<br>

# 익스프레션 언어의 기초분법
1. EL식의 문법
${...식...}
<br>

객체의 속성을 접근 : 마침표(.) : getter 호출
												변수명 패턴(앞자리에 숫자 - 사용 불가,$,_ 이외의 특수문자 X)
								[] 연산자 : 앞자리 숫자여도 인식, $,_ 이외의 특수문자도 인식 가능
<br>

2. 데이터 이름 하나로만 구성된 EL 식
<br>

3. JSP/ 서블릿 기술에서 사용되는 네 종류의 애트리뷰트
1) page : pageContext 
2) request : HttpServletRequest request
3) session : HttpSession session
4) application : servletContext application
5) El식 안에 있는 데이터 이름이 해석되는 순서
page > request > session > application
<br>

# 익스프레션 언어의 내장 객체
1. 익스프레션 언어의 내장 객체
1)pageScope : pageContext 범위의 속성
2)requestScope : HttpServletRequest 범위의 속성
3)sessionScope : HttpSession 범위의 속성
4)applicationScope : servletContext 범위의 속성
5)param
- HttpServletRequest
	- String getParameter()와 역할이 비슷
		- 숫자도 전부 문자 -> 변환 과정이 필요하다.
<br>

- Map 형태의 객체
- 요청 데이터를 마침표(.), [] 연산자를 통해서 바로 접근
	- 숫자, 논리값 -> 변경
<br>

6)paramValues
- HttpServletRequest
	- String[] getParameterValues(String...) 와 역할이 비슷
- 순서번호(0~)[] 접근가능
<br>

7)header
- 요청헤더 조회
<br>

8)headerValues
- 요청헤더 중에서 이름이 같고 데이터가 여러개인 경우(paramValues와 동일하게 사용)
<br>

9) cookie
- 개인화된 서비스 구현 기술
- 데이터가 브라우저에 저장
- 쿠키값 조회
<br>

10) initParam (init은 설정이다!)
- 전역 설정 조회
web.xml

```
<context-param>
	<param-name></param-name>
	<param-value></param-value>
</context-param>
```

<br>

11)pageContext
- JSP페이지의 주변 환경에 대한 정보를 제공하는 객체
<br>

# 익스프레션 언어의 연산자
1. 익스프레션 언어의 연산자
- 산술 연산자
- 비교 연산자
	- It : lesser than : <
	- gt : greater than : >
	- le : lesser than and equal : <=
	- ge : greater than and equal : >=
	- eq : ==
	- ne : !=

<br>

2. 엠프티 연산자
- null, 비어있는 값을 체크할 때 사용
<br>

3. 대괄호 연산자와 마침표 연산자
