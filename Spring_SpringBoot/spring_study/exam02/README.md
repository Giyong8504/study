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

	
	
	
	

2AOP
3. @Aspect, @Pointcut, @Around를 이용한 AOP 구현
1) @Aspect
2) @Pointcut
3) @Around

4. ProceedingJoinPoint의 메서드
1) Signature getSignnature()
	- String getName()
	- String toLongString()
	- String toShortString()

2) Object getTarget()
3) Object[] getArgs()
