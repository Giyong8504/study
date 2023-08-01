JSTL
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

	- <c:forEach> 액션의 items 애트리뷰트를 시용해서 처리할 수 있는 데이터
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
2) fmt:formatNumber
3) fmt:setLocale
4) fmt:timeZone과 fmt:setTimeZone
5) fmt:setBundle과 fmt:bundle
6) fmt:requestEncoding

<br>

4. 함수(functions) 라이브러리
- 문자열을 가공하는 라이브러리
- 태그를 사용하지 않고 EL식 변수 내에서 사용가능

<br>
