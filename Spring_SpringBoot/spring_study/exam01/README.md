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
	**IoC** - Invesion Of Control : 제어의 역전 (면접 단골주제)
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

# 의존 자동 주입 - 4가지의 붙일 수 있는 장소
1. @Autowired
1) 멤버 변수
2) setter 메서드 : 의존성을 주입, 호출
3) Optional 멤버 변수, setter 메서드의 매개변수
4) @Autowired 애노테이션을 사용하지 않고 의존성 자동 주입
	: 컴포넌트 스캔
	: 생성자 매개변수에 의존 객체를 정의, 기본 생성자가 없어야 한다. (기본생성자가 있으면 자동으로 주입을 안해준다.)
	: Lombok - @RequiredArgsConstructor
			: 초기화가 반드시 필요한 멤버변수만 생성자 매개변수에 추가
			참고) 초기화가 반드시 필요한 멤버 변수
				초기값이 없는 final 멤버 변수
				@NonNull 멤버변수

	```
	참고)
		class Optional<T> {
		...
		private final T value;
		...
		}
	```
2. 일치하는 빈이 없는 경우
3. @Qualifier
- 의존성 주입을 할 스프링 빈의 이름을 명시 (기본 메서드명이 빈의 이름이다.)

4. 빈 이름과 기본 한정

5. @Autowired 애노테이션의 필수 여부
	required=false : 의존하고 있는 객체가 스프링 컨테이너에 **없으면 호출하지 않는다**
	
	@Nullable : setter 메서드는 호출, 의존하는 객체가 없으면 null을 주입
	
# 컴포넌트 스캔
- 지정된 특정 패키지의 범위의 특정 애노테이션이 정의된 클래스를 자동 빈으로 생성
1. @Component
2. @ComponentScan

3. 기본 스캔 대상 - 암기!!

	```
	@Component
	@Service
	@Inject

	@Configuration 
	@Controller
	@RestController
	@Repository
	@ControllerAdvice
	@RestControllerAdvice
	@Aspect
	```

4. 컴포넌트 스캔에 따른 충돌 처리
- 빈의 이름 클래스명에서 앞자만 소문자 (패키지명은 고려하지 않는다.)
예) JoinService -> joinService

1) 빈 이름 충돌
- 기본 스캔 대상 애노테이션에 value 속성에 빈의 이름을 직접 지정

2) 수동 등록한 빈과 충돌
- 수동 등록한 빈이 우선으로 등록되고 실행된다.
3) excludeFilters
	 FilterType
		.ANNOTATION : 특정 애노테이션이 있느 클래스는 스캔범위에서 제외(기본값)
		.ASSIGNABLE_TYPE : 특정 클래스, 인터페이스
		.ASPECTJ : ANT 패턴 - aspectjweaver
		.REGEX : 정규표현식 패턴

빈 라이프 사이클과 범위 - 설정 클래스를 보고 스프링 컨테이너에서 객체를 만들고 주입해준다.
1. 컨테이너 초기화 : 빈 객체의 생성, 의존 주입, 초기화

2. 컨테이너 종료 : 빈 객체의 소멸

3. 빈 객체의 라이프 사이클
1) 객체 생성 -> 의존 설정 -> 초기화 -> 소멸

2) InitializingBean 
	- afterPropertiesSet(...) 초기화 단계 호출
	
3) DisposableBean 인터페이스
	- destroy() : 소멸 단계 전에 호출
		- 자원해제에 대한 처리를 주로 정의...
		
-> 직접 정의한 클래스에서만 사용 가능.
		
4. 빈 객체의 초기화와 소멸 : 커스텀 메서드
@Bean - 주로 외부클래스를 사용.
1) initMethod
2) destroyMethod

5. 빈 객체의 생성과 관리 범위
- 싱글톤 : 기본값
@Scope
	- singleton : 기본값
	- prototype : 객체를 조회할 때마다 새로운 객체를 생성

