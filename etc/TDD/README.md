TDD(Test-Driven Development)

JUnit5 : 단위테스트 
	
	참고)
		단위 테스트 : 기능 단위 대한 테스트 (메서드)
							기능 : service 
								예) JoinService
								
		통합 테스트 : MockMvc
	
1. 의존설정
	- junit-jupiter
	- maven-surefire-plugin
	
2. @Test 애노테이션과 테스트 메서드
	- 각 메서드 : 테스트 단위 / @Test 애노테이션으로 지정
	- 테스트의 종류를 쉽게 파악할수 있는 메서드명
	
3. 주요 단언 메서드
	- 예상되는 값이 나오는지
	- 예상되는 예외가 발생하는지 
	- 예상하는 값이 true, false

참고)
TDD 기본 원칙 
	- 가장 쉬운 테스트  -> 어려운 테스트  -> 기능 완성 
	- 테스트가 주목적 X, 설계 O, 부가적으로 테스트가 이뤄진다.
	
4. 테스트 라이프사이클
1) @BeforeEach 
2) @AfterEach
3) @BeforeAll
4) @AfterAll

5. @DisplayName, @Disabled
@DisplayName : 단위 테스트에 대한 설명
	- 클래스명 위 
	- 단위 테스트 메서드 위

6. 모든 테스트 실행하기

7. @TempDir
8. @Timeout 