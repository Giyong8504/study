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
