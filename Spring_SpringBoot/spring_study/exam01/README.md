# 스프링 프레임워크란?
Spring Framework

1) 의존 주입(Dependency Inject : DI) 지원
	의존성(Dependency) 
	
	- 객체지향적인 관리 / 객체 관리  -> 가장 중요한 기능
	
2) AOP(Aspect-Oriented Programming) 지원 : 프록시(Proxy)
3) MVC 웹 프레임워크 제공
4) JDBC, JPA 연동, 선언적 트랜잭션 처리 등 DB 연동 지원
JPA(Java Persistence API - ORM 표준 설계)

5) 스프링 데이터, 스프링 시큐리티, 스프링 배치

2. 스프링 프로젝트 생성하기
	spring-context
	
3. 스프링은 객체 컨테이너
	**IoC** - Invesion Of Control : 제어의 역전 (면 단골주제)
		- 개발자가 해야되는 객체의 관리 -> 스프링 컨테이너가 대신 수행
		
	- 다양한 방식으로 객체 관리
	1) 모든 관리 객체가 싱글턴 객체(동일 객체)로 관리된다.
	
4. 스프링 DI(Dependency Injection - 의존주입)

0) 의존(Dependency)
	- 협동, 상호작용
	
1) DI를 통한 의존처리
2) DI와 의존 객체 변경의 유연한

5. 객체 조립기





------------



6. 두 개 이상의 설정파일 사용하기
1) 생성자 매개변수
2) @Import (매번 가변으로 정보를 넣기 힘드니 사용된다.)

> ex)
> @Import(AppCtx3.class) // 많을 경우 {}를 사용하여 추가.

<br>

의존 자동 주입
1. @Autowired
1) 멤버 변수
2) setter 메서드 : 의존성을 주입, 호출
3) Optional 멤버 변수, setter 메서드의 매개변수
4) @Autowired 애노테이션을 사용하지 않고 자동 주입
	: 컴포넌트 스캔
	: 생성자 매개변수에 의존 객체를 정의, 기본 생성자가 없어야 한다. (기본생성자가 있으면 자동으로 주입을 안해준다.)

> 참고)
> class Optional<T> {
> ...
> private final T value;
> ...
> }

2. 일치하는 빈이 없는 경우
3. @Qualifier
4. 빈 이름과 기본 한정

5. @Autowired 애노테이션의 필수 여부
	required=false : 의존하고 있는 객체가 스프링 컨테이너에 **없으면 호출하지 않는다**
	
	@Nullable : setter 메서드는 호출, 의존하는 객체가 없으면 null을 주입