# JSTL
1. 설치하기
Jsp Standard Tag Libarary
- 커스텀 태그
- 외부 라이브러리
- JSTL API 구현체가 있다.
- JSTL Implemetaion  
<br>

2. 코어(core) 라이브러리
- 제어구문, 속성값을 설정 할때
- <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<br>

1) <c:set>
- EL 변수, 속성 값을 추가
	- var : 변수명
	- value : 값 
	- scope : page(기본값)|request|session|application
<br>

> 참고)
> 1. PageContext PageContext
> 2. HttpSevletRequest request
> 3. HttpSession session
> 4. ServletContext application
> 	- setAttribute
>		- getAttribute
>		- removeAttribute

<br>

2) <c:remove>
- EL속성에서 제거
- var : 제거될 El 속성명 / 모든 범위(page,request|session|application)의 속성이 제거된다.
- scope : page, request, session, application - 특정 범위의 속성값만 제거 할 때
<br>

3) <c:if>
- 조건문
	- test : EL 조건
		- true와 , false는 문구를 입력해도 인식
<br>

	
4) <c:choose>
	: 다중 조건

```	
	<c:choose>
		<c:when test="조건1">
			...
		</c:when>
		<c:when test="조건1">
			...
		</c:when>
		<c:when test="조건1">
			...
		</c:when>
			...
		<c:otherwise>
			모든 조건이 거짓일 때 출력되는 영역
	</c:choose>
	
```	

<br>

5) <c:forEach>
	- begin : 시작번호
	- end : 종료번호
	- step : 증감 단위 - 기본값은 1
	- var : 변수 : 카운트 변수

	- <c:forEach> 액션의 items 애트리뷰트를 사용해서 처리할 수 있는 데이터
	- items : 배열, 콜렉션(collection - List, Set), Iterator, Enumeration, 콤마(,) 구분된 문자열
				var : 변수 - 요소 하나하나  (var에 담으면) 
	- varStatus : 반복 상태에 대한 값이 담겨 있는 객체
		- index : 0부터 시작하는 순서에 대한 번호
		- count : 1부터 시작하는 순서에 대한 번호
		- current : 반복하는 현재 요소
		- first : 첫번째 반복인지 체크
		- last : 반복의 마지막인지 체크
	
<br>

6) <c:forTokens>
- java.util.StringTokenizer
- items : EL식 문자열, 문자열
- delims : 문자열에 포함된 구분 문자
- var
<br>

7) <c:catch>

```
	<c:catch var="에러객체 속성">
	// 에러가 발생할 수 있을 가능성이 있는 코드
	</c:catch>
```

<br>

8) <c:redirect>
	HttpSevletRequest
		.sendRedirect("주소"); -> 응답헤더 : Location: 주소
		
	- url : 주소
	- <c:param name="이름" value="값" /> -> 쿼리스트링 값 (	? 뒤에 키 값으로 들어가게 된다.)
	
	?이름=값
<br>

9) <c:import>
	
	<jsp:include page=".../> 와 비슷, 차이점은 - 동일 서버의 자원만 추가 버퍼에 추가(jsp, servlet, text, html)
	<c:import>는 외부서버 자원도 버퍼에 추가 가능
	- 요청 처리 중에 버퍼에 추가
	- 요청 데이터를 버퍼에 담는 과정중에 추가
		<c:param name="..." value="..." />
	
	- url : 해당 주소의 출력 결과물이 버퍼에 담겨 출력
	- var : 출력 버퍼의 내용을 EL식 변수에 담을 수 있다.
	
	
<br>
	
> 참고)
> <%@ include file=".."%> : 물리적으로 번역될 때 출력 결과물이 추가

<br>

10)<c:url>
	- 변경될 수 있는 컨텍스트(Context) 경로를 알아서 추가 
	- var : 컨텍스트 경로가 추가된 경로를 EL식 변수에 담는다.

<br>

11)<c:out>
EL 식으로 바로 출력하면 -> HTML 태그가 브라우저에서 해석되고 출력
<c:out>으로 출력하면 HTML 태그는 문자열로 출력 (해석이 안돼서 그대로 출력된다)
- escapeXml : 기본값 true, false -> HTML 해석
- default : value 값이 null인 경우 기본값으로 대체

<br>

3. 포매팅(fmt) 라이브러리
- 형식화 관련 라이브러리
- 날짜, 시간형식, 숫자형식, 메세지(다국어), 시간대
1) fmt:formatDate
- java.text.SimpleDateFormat
- java.util.Date

- value : date 객체를 EL속성
- type 
	- date - 날짜만 표기
	- time - 시간만 표기
	- both - 날짜와 시간 표기
- dateStyle : full|long|short
- timeStyle : full|long|short
- patten : 직접 패턴을 지정

```
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
```

<br>

2) fmt:formatNumber
- 숫자 형식화
- java.text.DecimalFormat

- value : 숫자 -> 형식화
- groupingUsed
	- true - 기본값(세자리 마다, )
	- false - 숫자만 출력				
- pattern
	- # : #,###.#### 세자리마다
		- 예) 10000.12 -> 10,000.12
	- 0 : 0,000.0000 세자리마다
		- 예) 10000.12 -> 10,000.1200
		
- type
	- currency - 통화 / <fmt:setLocale
	- percent - 백분률 / 소수점 

<br>

3) fmt:setLocale
- java.util.Locale

<fmt:setLocale value="국가코드_언어코드" />
<fmt:setLocale value="언어코드" />

예)
<fmt:setLocale value="us_en" />
<fmt:setLocale value="en" />

<br>

4) fmt:timeZone과 fmt:setTimeZone
- 시간대 변경을 할때 사용

<fmt:timeZone value="zone id..">

...날짜, 시간
</fmt:timeZone>

<br>

5) fmt:setBundle과 fmt:bundle
-	메세지 기능
- 클래스패스/메세지파일명.properties
			/메세지파일명_en.properties : 브라우저 언어 설정이 영어/<fmt:setLocale value="en" />
- java.util.ResourceBundle

- basename="경로.파일명"
- <fmt:message key="메세지 코드"/>
	- java.text.MessageFormat

<br>

> 참고)
> properties 파일 - 주로 설정
> 키=값
> 키=값
> #은 주석

<br>

6) fmt:requestEncoding
- servlet 6.0 : tomcat 10 버전
	request.setCharacterEncoding(..);
	POST형식 데이터
- servlet 4.0 : tomcat 9 버전(한글 깨짐)
<br>

4. 함수(functions) 라이브러리
- 문자열을 가공하는 라이브러리
- 태그를 사용하지 않고 EL식 변수 내에서 사용가능
<%@ properties= taglib uri="jakarta.tags.functions" %>


<br>

----------------


커스텀 액션

1. 커스텀 액션을 만드는 방법
1) 태그 파일 작성해서 만드는 방법
	확장자.tag
	- 번역 기술 : 
2) 태그 클래스를 작성해서 만드는 방법
	- SimpleTag 인터페이스
	- SImpleTagSupport 클래스
		-  doTag
	
2. 태그파일을 이용해서 커스텀 액션 만들기
1) 태그 파일에서 사용할 수 있는 지시어
<%@ tag...

 참고)
 tag 속성 -> page 속성과 거의 비슷
 - body-content
				: empty - 단일 태그
				
					- 여는 태그, 닫는 태그
				: scriptless - 태그 안쪽에 자바 코드X, EL식, 다른 태그, 액션 태그
				: tagdependent - 태그의 내용물이 전부 문자열로 인식, EL식 번역X
 - trimDirectiveWhitespaces :true -> 태그 안쪽에 불필요한 공백 제거
 - pageEncoding="UTF-8" : 한글 깨짐 방지 ()
 
 ```
 tag 에서 항시 사용하기
<%@ tag body-content="empty" %>
<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
```
- tag 지시자 : <%@ tag ... %>
- include 지시자 : <%@ include file ...%>
- attribute 지시자
- variable 지시자
	예) <c:set var="num" value="값" />
	
- <%@ taglib prefix=".." tagdir="경로" %>

2) 한글을 포함하는 태그 파일
3) 애트리뷰트를 지원하는 태그 파일
-	 속성을 정의
<%@ attribute name="속성명" ...type="속성의 자료형" %>
- 속성명으로 된 자바 변수, EL식 변수
- type : 기본값 java.lang.String/ 따로 명시하지 않으면 전부 문자열 인식
		: 기본 자료형(int, long...) 설정 불가, 기본자료형은 기본형의 래퍼 클래스 형태로 설정
			예) int -> java.lang.Integer
속성명으로 된 자바 변수, EL 식 변수
- required : false - 기본값
				: true - 필수 속성
				
4) 태그 파일의 내장 객체
	HttpSevletRequest request
	HttpSevletResponse reponse
	JspWriter out
	ServletContext application
	HttpSession session
	ServletCOnfig config
	JspContext jspContext
	
5) 동적 애트리뷰트를 지원하는 태그파일
- <%@ tag dynamic-attribute="attrs" %>
- 설정한 속성이 전부 map 형태로 추가
	- attrs.속성명 바로 접근
- 자료형은 전부 문자열로 인식
- 필수 여부 설정 불가

참고)
	태그 속성으로 추가되는 EL식 변수 : 페이지 범위(pageContext)

6) 커스텀 액션의 본체를 처리하는 태그 파일
	body-content
					: scriptless - 자바코드 X, EL식 O, 다른 태그 O, 액션 가능O
					: tagdependent - 무조건 텍스트로만 인식
					
					<jsp:doBody />
					
3. 변수를 지원하는 커스텀 액션
<%@ variable name-given="EL식 속성명" variable-class="속성의 자료형" scope="EL식 속성명을 접근할 수 있는 위치"%>
- scope
	- AT_END : 태그가 끝난 후 태그 외부에서 접근 가능
	- AT_BEGIN : 본체가 있는 태그 : scriptless - > 여는 태그 바로 아래
	- NESTED : 본체 안에서 사용 가능

- name-from-attribute : 속성으로 지정된 값을 EL식 변수로 설정
- alias='...'

- 속성
rtexprvalue : true - 기본값 : EL 변수, 자바 코드를 속성값으로 사용가능
						: false - 지정한 타입의 기본형 자료만 가능(문자열)

본체가 없으면 empty