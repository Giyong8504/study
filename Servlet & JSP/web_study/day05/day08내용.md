1. 쿠키의 동작과정
1) 쿠키 생성단계
서버에서 응답헤더
- Set-Cookie: 이름=값; 이름=값;
HttpServletRespone
	addCookie(Cookie cookie)

2) 쿠키 저장단계
브라우저가 응답 헤더(Set-Cookie)의 내용을 참고해서 쿠키 저장

3) 쿠키 전송단계
브라우저는 매 요청시 마다 요청 헤더 cookie에 담아서 서버로 전송
HttpServletRequest
	Cookie[] getCookies()
	

2. 페이지 회원 인가 구현하기
	web.xml
	<error-page>
		<error-code>4xx|5xx</error-code>
		<location>에러페이지 출력할 jsp 경로</location>
	</error-page>