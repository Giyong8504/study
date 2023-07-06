# 화살표 함수
- 함수를 매개변수로 사용되는 경우

1) function, 함수명 생략
2) 매개변수 정의 부분 구현 코드 사이 =>
3) 구현 코드가 한줄 일경우 {...} 생략, return 예약어도 생략 가능
4) 매개변수가 1개일 경우 (...) 생략 가능. 다만, 매개변수가 없는 경우 (...) 생략 불가하다.

```
const add = (num1, num2) => num1 + num2; 

생략▼▼▼

const add = (a, b) => a + b;

매개변수가 1개일경우 ▼  ( ) 생략
const print = x => console.log(x);

매개변수가 없을 경우 ▼ ( ) 생략안됨.
const print2 = () => console.log("출력");

```

- this는 함수를 정의할 때 결정 (this의 범위를 변경 X)
- arguments 객체 X




# 내장객체
- 네이티브 객체 (ECMAscript Core) 
1. 내장 생성자 
	- Object
		- 모든 객체는 Object.prototype을 상속 / Object 생성자로 만들어진 객체
		- new Object();  -> {}  이렇게 생략 가능
		- 객체와 관련된 핵심적인 메서드, 속성 정의
		
		- 모든 속성
			- value
			- configurable : 설정 가능 여부
				- false : 설정 변경 불가 / 다만 writable: true -> writable: false 변경 한번가능
					- 삭제 불가
					
					```
					const person = {
						name : "이이름",
						age : 40,
						showInfo() {
						console.log(this.name, this.age);
						}
					};
						Object.defineProperty(person,'age',{configurable: false});
						//삭제불가
					```
					
					<br>
					
			- writable : 쓰기 가능여부(쓰기, 수정)
			- enumerable : 열거 가능 여부
			<br>
			
			- set : setter 설정
			- get : getter 설정
			
			<br> 
			
		- 속성의 설정 상태 확인
			- Object.getOwnPropertyDescriptor() 
			- Object.getOwnPropertyDescriptors()
		
		- 속성의 설정 변경
			- Object.defineProperties()
			-	Object.defineProperty()
			
		- Object.create: 상세하게 객체 생성 정의
		- Object.freeze(..): 객체동결 
			- 속성 수정, 삭제, 추가 불가
		- Object.seal(...) : 객체 밀봉
			- 삭제 불가, 추가 불가, 수정은 가능
			
		Object.prototype.hasOwnProperty()
			- **객체가 소유한 속성중**에서 특정 속성이 포함되어있는지 체크하는 메서드 (내꺼만 체크)
		
		> 참고)
		> '속성명' in 객체 : 객체에 있는 모든 속성(+상속 포함)'속성명' 포함되어 있는지 체크 (전체체크)
			
		- Object.isExtensible() : 속성추가 가능한지 여부
		- Object.preventExtensions() : 속성 추가 방지 / 동결, 밀봉 상태에서 추가를 못하게 막는 것은 이 메서드를 활용
		
		- Object.keys() : 속성명을 배열 객체로 반환
				const keys = Object.keys(person);
				
				<br>
				
		- Object.values() : 속성값을 배열 객체로 반환
				const values = Object.values(person);
		
	- String 
		- let str = "ABC"; //원시타입
		- str = str.toLowerCase(); -> new String(str).toLowerCase() -> str
		
		- split(..) : 특정 문자열로 잘라서 -> 배열 객체
			> 참고 ) 배열에서 특정문자열로 결합 -> 문자열
			>	join(..);
		
				```javascript
				별표처리 하기 
				let userId = "user01";
				const len = userId.length;
				userId=userId.substring(0,2).padEnd(len,"*");
				```
				
		> 참고)
		>	Number, String -> Wrapper 생성자 객체
	<br>
	
	> 참고)
	> 태그함수 : 템플릿 리터널에서 적용가능
	>			(전개 연산자(가변 매개변수)...)
	<br>
	
	- Array
	...
	
2. 내장 객체
	- Math
	- JSON
	
- 호스트 객체 : 웹브라우저 객체
	- window
			.location
			.history
			.screen
			.navigator
			.document
			
			...
			

배열


배열의 기초
1. 배열 리터럴로 생성하기
2. length 프로퍼티
3. Array 생성자로 생성하기
4. 배열 요소의 참조
5. 배열의 객체
6. 배열 요소의 추가와 삭제
7. 배열 요소가 있는지 확인하기