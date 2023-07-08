## 2. 함수 호출
```javascript
함수명(...);

function add(num1, num2){
    return num1 + num2;
}
var result = add(10,20);
```
<br>

	

	



## 3. 함수의 실행흐름
## 4. 함수 선언문의 끌어올림 : 호이스팅
## 5. 값으로서의 함수
	- 함수가 객체
		- (매개변수, 반환값)
		
## 6. 참조에 의한 호출과 값에 의한 호출
	- 함수가 객체
	
참고)
함수 객체 - 1급 객체(자바스크립트에서는 함수가 객체가 된다.)
1) 값으로 사용가능 (함수형 프로그래밍)
	- 매개변수
		- **함수가 객체이고 값으로 쓰이기 때문에 대입하여도 사용이 가능하다.(매개변수로 사용이 가능)**
			```
function add(num1,num2){
    return num1+num2;
}
var add2 = add;
add2(10,20);

console.dir(add); 객체의 속성과 값 형태를 확인할 때 
			```
	
	- 반환값
	- 함수 안에 함수를 정의 (중첩 함수 정의)
<br>

2) 다른객체를 생성해 주는 객체! - 생성사 함수 객체 (js 에서는 )
	


# 변수의 유효범위 
1. 전역 유효 범위와 지역 유효범위
- 평가(번역) -> EC 객체 생성
							- 유효범위 체인
							
2. 변수의 충돌
	- 지역에 있는 변수가 우선 

3. 함수 안에서 변수 선언과 변수 끌어올림 : 호이스팅 
	평가(번역) -> EC 객체 생성 - 변수 레코드

4. 함수안에서 변수 선언 생략

5. 블록 유효 범위 : let과 const
	- var : 지역 범위 : 함수 스코프
		- ES6+ : 사용 지양 (이제는 쓰지말자)

## ---유효범위 { }---
let : 변수 선언자
const : 상수 선언자
	- ES6+ 변수 사용 권장사항
		- 변수는 const 선언자로 일단 선언
		- 변경이 필요한 변수인 경우만 선별적으로 let 선언

<br>

6. 함수 리터럴로 함수 정의하기
```
const add = function(num1, num2){
return num1 + num2;
};
```
- 함수 리터럴이 정의된 시점 이후 부터 실행가능	
<br>

7. 객체의 메서드

8. 매개변수로 함수
- 함수가 객체 : 값으로 사용가능
	-매개변수, 반환값
9. 즉시 실행함수
	- 함수를 정의 하자마자 바로 실행
```
	(function(){
		// 실행 코드
		
	})();
	
	(function() {
    alert("즉시 실행!");
		})();
```	

- 매개변수 사용가능
```
(function(num1,num2){
    return num1 + num2;
})(10,20);

const result= (function(num1,num2){
    return num1 + num2;
})(10,20);
```
<br>

- 반환값 사용가능


10. 가변길이 인수 목록 (Arguments 객체)
- 모든 함수 객체에 정의된 지역변수
	- arguments : 내부에서 재귀적으로 할 때 사용.
		- 매개변수 값
		- callee : 호출한 함수의 참조값 / 재귀함수. (재귀함수는 문제가 쉽게 해결될 때만 쓰자. 왠만하면 쓰지말자. 메모리소모가 크다.)

> 참고)
> 자바스크립트의 매개변수는 매우 유연하다
> 	- 정의된 것보다 더 써도 되고, 덜 써도 문제가 없다
>	ES6+
>		- ...변수명 : 가변 매개변수 / 전개 연산자
<br>

11. 생성자
	- 다른 객체를 생성해주는 함수 객체(1급 객체...)
	
	- new 연사자를 통해서 생성
			const 변수명 = new 생성자 함수(); **const p1 = new Person("이름1", 40);**

	- 객체가 생성되는 과정
		- 생성자 함수 객체의 prototype 객체의 상속 과정
		- prototype
			- .constructor : 함수 그자체를 스스로 참조하는 변수 
		
	```javascript
	function 예약어로 함수를 정의하면 ->Function.prototype 상속이 발생한다.
		Function 함수명 = new Function("매개변수 정의", "실행내용정의");
		
	instaneof 연산자 : 프로토타입 체인 연결 관계를 체크 / 객체의 출처를 체크한다.
	
	function 함수 -> Function.prototype -> Object.prototype
	
	```
함수가 객체 -> 값으로 사용
					-> 매개변수
						 화살표 함수 
				
								```javascript
								const fruits = ["apple" , "orange" , "mango"];
								
								fruits.forEach((fruits) => console.log(fruit));
								```
					-> 반환값
<br>
### 참고) 자바스크립트 상속 - Prototype 체인을 연결해서 상속이 발생한다.
- 객체간의 상속 : 프로토타입 체인의 연결 관계 
- [[Prototype]] : 포로토타입 체인 : 이것으로 인해 상속이 되는 것이다.
	- __proto__ : 브라우저에 따라서 호환이 안되는 경우도 있다.
		- Object.setPrototypeOf(...)

```javascript
obj1.__proto__ = obj2; //이렇게 연결하면 상속이 됨. 

Object.setPrototypeOf(obj1, obj2);



**메서드는 하나만 있으면 되므로 객체가 생성될 때마다 하면 메모리 소모가 심하다.

Person.prototype.showInfo = function() {
    console.log(this.name, this.age);
};

```

-------------------
#생성자간 상속
1. 생성자 함수의 prototype 객체의 상속

class 구문
	- class를 가장한 생성자 함수 객체
	
	ES6 - 클래스 또는 객체 내에서 함수의 축약표현
		this.getArea = function(){
		
		}
		
		getArea() {
		 
		}
<br>

```javascript
class Ellipsis {
    static count = 0;
    
    constructor(a, b){
        this.a = a;
        this.b = b;
    }
    
    getArea(){
        return this.a * this.b * Math.PI;
    }

    static getCount() {
        return Ellipsis.count++;
    }
}

class Circle extends Ellipsis{
    constructor(r) { 
        super(r,r);
        
        this.r = r;
    }
}
```
<br>

정보은닉 - 캡슐화

setter와 getter

	set 메서드 : setter
	
	get 메서드 : getter
	
	메서드 : 축약표현

	
#### **완전한 정보은닉아니다.**
```javascript
const person = {
    _name : null,
    _age : null,
    set name(name){
        this._name = name;
    },
    get name() {
        return this._name;
    },
    set age(age) {
        this._age = age;
    },
    get age() {
        return this._age;
    }
};  
```
<br>


#### **완전한 정보 은닉을 위해서 즉시 실행 함수를 응용해야한다.** 
```javascript
const person = (function(){
    let _name, _age;

    return {
        set name(name) {
            _name = name;
        },
        get name() {
            return _name;
        },
        set age(age){
            _age = age;
        },
        get age() {
            return _age;
        }
    }
})();
```
<br>
```javascript
class Person {
    constructor(_name, _age) {
        this._name = _name;
        this._age = _age;
    }

    set name(name){
        this._name = name;
    }

    get name() {
        return this._name;
    }

    set age(age) {
        this._age = age;
    }

    get age() {
        return this._age;
    }
}
```
