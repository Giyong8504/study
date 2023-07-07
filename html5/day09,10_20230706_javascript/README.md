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
	
	- Number
		- 다른 타입의 자료 -> 숫자로 변환
		
		- NaN(Not a Nuber)
				```
				const num1 = "abc";
				Number(num1);
				NaN // 결과
				```
				
		<br>
		
		- isNaN(값) 숫자가 아니면 true(NaN) / false - 숫자
			- 참고) 문자로 된 숫자 -> false 롱 ㅣㄴ식
				- 판별 기준이 Number 생성자 값을 넣어서 호출했을 때 NaN나오면 true
				
				```
				const num1 = "abc";
				isNaN(num1);
				true // 결과
				```
				
		- parseInt(...) : 정수로 변환
		- parseFloat(...) : 실수로 변환
		<br>
		
	Boolean(..)
		- false 또 true로 인식될 수 있는 값을 실제 논리값으로 변환(true, false)
		
		- false : 0,'', null, undefined
		- true : false로 인식하는 값을 제외한 모든 값.
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
			

# 배열
배열의 기초
- 배열의 객체 : 배열X, 배열의 기능을 유사하게 구현한 객체

배열의 기초
1. 배열 리터럴로 생성하기
	- new Array(매개변수)
		- 매개변수가 : 숫자 
			- 갯수가 1개 : 배열 객체의 공간 갯수(음수는 사용 불가)
			- 갯수가 2개 이상 : 배열의 요소
		[[prototype]] : Array.prototype
	
	```
	const 변수명 [...]; //대괄호로 줄여서 사용.
	const fruits = ["Apple","orange","Melon","Banana","Apple"];
	```
	
	- 배열의 값으로 사용 가능한 자료형 : 전부 다 (원시타입 + 객체)
	
	- 속성명이 순서 번호
		- 숫자는 마침표 연산자로 접근 X -> [숫자]
	
	- 배열명[숫자]
		```
		fruits[0];
		fruits[1];
		fruits[2];
		```
	
<br>

	
2. length 프로퍼티
3. Array 생성자로 생성하기
<br>



4. 배열 요소의 참조
5. 배열의 객체

6. 배열 요소의 추가와 삭제
	- 객체와 같이 추가, 삭제하면 배열처럼 동작 하지않는다.
	
	```
	fruits[10] = "banana";
	fruits;
	(11) ['apple', 'orange', 'mango', 'melon', 비어 있음 × 6, 'banana']
	```
	<br>
	

	- 추가 방법
		- push(...items) : 끝에 추가
		- unshift(...items) : 맨 앞에 추가
		<br>
		
	- 삭제)
		- push() : 끝에서 꺼내기 (반환값이 꺼낸 요소)
		- shift() : 앞에서 꺼내기 (반환값이 꺼낸 요소)
		<br>
		
	- 중간 추가, 삭제, 변경
		- splice : 
		
		```
		const fruits = ["apple" , "orange" , "mango","melon"];
		
		
		삭제하면서 추가하기 (변경)
		const fruits = ["apple" , "orange" , "mango","melon"];
		fruits.splice(1,2, "banana", "watermelon");
		(2) ['orange', 'mango']
		fruits;
		(4) ['apple', 'banana', 'watermelon', 'melon']
		```
		
		<br>

	
7. 배열 요소가 있는지 확인하기
	- indexOf
	- lastIndexOf
	- 없으면 -1 (if문에 꼭 -1을 활용해야 정확히 자료가 나온다.)
<br>

```
const fruits = ["apple" , "orange" , "mango","melon","apple"];
if(fruits.indexOf("apple") != -1){
    console.log("있다!");
}
```
<br>



------------
# 배열의 메서드
1. Array.prototype의 메서드 목록


	- 얕은 복사(shallow copy) : 주소만 복사
	- 깊은 복사(deep copy) : 새로운 객체 + 복사
		-	concat(..) : 반환값이 새로운 배열 객체
		- slice(..) : 반환값이 새로운 배열 객체
<br>

#### 참고)
- 자바스크립트 코딩 가이드라인 : Airbnb javascript 가이드
	- 배열 복사 : slice 권장
	- 배열 추가 : concat() 권장
		- ... : 전개연산자 (spread operatro)
			- 1) 깊은 복사
			- 2) 배열 -> 일반 변수
			- 3) 객체 
			```
			function add(num1, num2) {
			return num1 + num2;
			}
			
			const nums = [10,20];
			
			add(...nums);
			```
			<br>
			

			






다차원 배열

## 유사 배열
### 배열 객체는?
1) 속성명이 순서 번호
2) length 속성
3) 프로토타입 체인 -> Array.prototype

> 만약에 1),2)만 충족된 형태는 **유사 배열 객체** 이다.
<br>

```
▼▼▼ 유사배열 객체 ▼▼▼
const fruits = { 0: "apple", 1: "melon", 2: "mango", 3: "banana", length: 4}
fruits;

{0: 'apple', 1: 'melon', 2: 'mango', 3: 'banana', length: 4}0: "apple"1: "melon"2: "mango"3: "banana"length: 4[[Prototype]]: Objectconstructor: ƒ Object()hasOwnProperty: ƒ hasOwnProperty()isPrototypeOf: ƒ isPrototypeOf()propertyIsEnumerable: ƒ propertyIsEnumerable()toLocaleString: ƒ toLocaleString()toString: ƒ toString()valueOf: ƒ valueOf()__defineGetter__: ƒ __defineGetter__()__defineSetter__: ƒ __defineSetter__()__lookupGetter__: ƒ __lookupGetter__()__lookupSetter__: ƒ __lookupSetter__()__proto__: (...)get __proto__: ƒ __proto__()set __proto__: ƒ __proto__()

for (let i = 0; i < fruits.length; i++){
        console.log(fruits[i]);
    }
		
apple
melon
mango
banana
```
<br>

```
▼▼배열로 바꾸기▼▼
Object.setPrototypeOf(fruits,Array.prototype);
(4) ['apple', 'melon', 'mango', 'banana']
```
<br>

참고) 
	ES6 : 물리적 배열
		- Int8Array
		- Int16Array..
		
		- HTML5
			- WebRTC
			- FileAPI
			- WebGL
			
ECMAscript6+ 에 추가된기능
이터레이터
Symbol.iterator
	.next()
	
	for ... of 구문으로 간단하게 조회 가능. (Symbol.iterator가 구현되어 있는 경우 사용가능)
```
for (const ch of str){
    console.log(ch)
}
```
<br>

# 비구조화 할당
1. 배열의 비구조화 할당

```
const fruits = ["apple" , "orange" , "mango","melon"];
const [a,b,c,d] = fruits;

const person = { name: "이이름", age :40};
for (const data of Object.entries(person)){
const [key,value] = data;
console.log(key, value);
}
			
for (const [key,value] of Object.entries(person)) {
console.log(key, value);
```
<br>
			
```
let a = 1;
let b = 2;
undefined
let tmp = a;
a = b;
b = tmp;
```
			
			
			
## 전개연산자
```
const person = { name : "이이름", age :40 };
const person2 = {...personm,age : 30};
const person2 = {...person,age : 30};
```
<br>