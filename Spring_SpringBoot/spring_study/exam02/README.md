# AOP 프로그래밍
Aspect Oriented Programming : 프록시

1. 프록시(proxy) : 대신하다, 대리하다
	계산기
	팩토리얼 연산
	!5 -> 5 * 4 * 3 * 2 * 1

<Br>


```	
 class BufferedInpuStream extends InpuStream {
	private InpuStream in;
	
	public BufferedInpuStream(InpuStream in) {
		this.in = in;
	}
	
	public int read() {
	
		// 버퍼 추가 기능... -> 추가 공통 기능 
		
		int ch = in.read(); // 핵심 기능을 대신 수행
	
		// 버퍼 추가 기능... -> 추가 공통 기능
		
		return ch;
	}
 }
  데코레이터 패턴
```

참고) 프록시 패턴
	- 제어, 통제의 관점 : 예) 방화벽
	
	- 스프링쪽에서 의미하는 프록시는 사실 데코레이터 패턴, 대신하다라는 의미에서 관례적으로 프록시라는 명칭을 사용한다.

<br>

	
2. AOP
- Aspect Oriented Programming : 관점 지향 프로그래밍
	관점 : 공통기능
	spring aop API (인터페이스로 구현체가 필요하다.)
	+ 구현체 : aspectjweaverd
	
	spring-context
	
3. @Aspect, @Pointcut, @Around를 이용한 AOP 구현
1) @Aspect : 공통 기능이 정의된 클래스
2) @Pointcut : 공통 기능 적용 범위
3) @Around : 공통 기능을 수행할 메서드

4. ProceedingJoinPoint의 메서드
1) Object proceed() // 핵심 기능 수행.

2) Signature getSignnature() : 호출한 메서드에 대한 정보
	- String getName() : 접근제어자 + 메서드 반환값 타입 + 메서드명 + 매개변수 ..
	- String toLongString()
	- String toShortString()

3) Object getTarget() : 호출한 메서드가 소속된 객체
4) Object[] getArgs() : 매개변수로 사용된 값


참고) 
@Enable .. -> 형태는 프록시

proxyCache -> ProxyCalculator : 순서의 보장이 매우중요한 프록시(반드시 순서를 지켜주어야한다.)



5. 프록시 생성방식

6. execution 명시자 표현식
	참고)
		Ant 패턴
		 패키지
			.
			 예) aopex.* : aopex의 하위 모든 클래스
			 
			..
			
				예) aopex..* : aopex의 하위 클래스 + 하위 클래스를 포함한 모든 클래스
				
			* : 모든 반환값, 모든 클래스, 모든 메소드, 모든 자료형	
			
			* aopex.*.* 모든 메서드 모든 클래스
			* aopex.* 이거만 해도 모두 다 호출한다.

<br>

7. @Order
 : 프록시 실행 순서가 중요한 경우 적용 순서 명시
 : 숫자가 작을 수록 먼저 수행
 
8. @Around의 Pointcut 