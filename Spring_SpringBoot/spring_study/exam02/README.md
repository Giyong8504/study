# AOP 프로그래밍
Aspect Oriented Programming : 프록시

1. 프록시(proxy) : 대신하다, 대리하다
계산기
팩토리얼 연산
!5 -> 5 * 4 * 3 * 2 * 1

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
