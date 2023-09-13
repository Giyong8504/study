# 스프링 시큐리티 
- 회원 인증(로그인), 인가(접근 통제), +보안(CSRF))

1. 의존성 설치

2. 스프링 시큐티리 설정 
3. __회원가입__ 구현
	1) UserDetails 인터페이스 : DTO 
		- 아이디와 비번에 대한 설정은 여기에.
		- 회원탈퇴, 회원차단, 비밀번호 만료... 전부 구현되어있음. security가 다 구현해놓음.
		
	2) UserDetailsService 인터페이스 : Service
		
		
	3) PasswordEncoder : 비밀번호 해시화의 기능을 제공한다
	
	
4. 시큐리티를 이용한 회원 인증(로그인) 구현 
5. 로그인 정보 가져오기
1) Principal 요청메서드에 주입  : String getName() : 아이디  : 요청 메서드의 주입  //잘 쓰진않음

2) SecurityContextHolder 를 통해서 가져오기
	- 요청메서드와 같이 주입할 수 없는 상황에서 사용이 가능하다.

3) @AuthenticationPrincipal  : UserDetails 구현 객체 주입, 요청 메서드의 주입을 통해서만 사용 가능하다.

4) Authentication
	Object getPrincipal(...) : UserDetails의 구현 객체 a

/error 템플릿 경로 : 응답 코드.html
- EL변수
	- status : 응답 코드
	- path : 현재 경로
	- error
	- message
	- timestamp : 발생한 날짜 시간
	
	

6. thymeleaf-extras-springsecurity6
	1) xmlns:sec="http://www.thymeleaf.org/extras/spring-security"
		
	2) sec:authorize="hasAnyAuthority(...)", sec:authorize="hasAuthority(...)"
	3) sec:authorize="isAuthenticated()" : 로그인 상태 
	4) sec:authorize="isAnonymous()" : 미로그인 상태 
	
	5) csrf 토큰 설정하기 
		- ${_csrf.token}
		- ${_csrf.headerName}
	
7. 페이지 권한 설정하기 
	- AuthenticationEntryPoint 
	
8.  Spring Data JPA Auditing + Spring Security
- 로그인 사용자가 자동 DB 추가 
1) AuditorAware 인터페이스



POST 요청시 CSRF 토큰 검증 : 검증 실패시 403
- 자바 스크립트 ajax 형태로 POST 데이터를 전송할시 CSRF 토큰 검증 