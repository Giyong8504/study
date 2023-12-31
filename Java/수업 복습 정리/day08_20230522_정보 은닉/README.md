# 정보 은닉

## 1. 접근제어자 - 클래스명, 멤버변수, 멤버 메서드
- public - 외부 패키지, 동일패키지 모두 클래스 내부, 외부 접근 가능 (import로 접근이 가능)
<br>

- protected - 동일 패키지에서만 내부, 외부접근 가능 (default와 동일) + 상속을 통하면 외부 패키지에 있는 클래스더라도 클래스 내부에서 접근가능
(+private) (default + private)
<br>

- defalut (접근제어자를 정의X) 
	- 동일 패키지에서만 내부, 외부 접근가능
	<br>
	
- private - 클래스 내부에서만 접근이 가능

- public(외부, 동일 패키지) > protected(동일 패키지+상속 -> 클래스 내부) > default(동일패키지) > private (클래스 내부)


> 참고)
> 실 클래스명
> 패키지명, 클래스명
<br>

- 통제 불가능한 부분은 막고, 통제 가능한 수단(메서드)을 추가 -> 캡슐화(정보은닉)
<Br>

## 2. get, set 메서드
```
set 멤버 변수명(...)
반환값 get 멤버 변수명( )
```
<br>

### this 예약어
- 지역변수 : 인스턴스 메서드 안에 정의 (주소값이 담겨있음)
	- 생성된 객체의 주소 값을 가지고 있는 지역변수
	- 인스턴스 자원을 접근하기 위한 용도
	- 클래스 내부에서만 스스로 접근 가능한 참조값.

메서드 : 생성자 메서드
내부에서 호출 할 때


### static - 정적인
- static 변수(정적인 메모리를 의미)
- static 변수 / 클래스 메서드
	- 정적인 방법으로 접근(권장사항)
	- 클래스 명으로 접근 : 클래스 변수
-	static 변수는 클래스 로더에 의해서 구성될 때 이미 공간을 할당 받는다.
<br>

### 로더에서 만들어지는 객체?
- Class 클래스 : 클래스 로더에 의해서 자동 생성되고 모든 클래스 정적 변수 class로 접근 가능
	- 클래스의 정보가 담겨 있는 객체
<br>

### 메모리
1) 데이터 영역 메모리 (코드 & 상수) (정적 메모리)
2) 스택 영역 메모리 (동적 메모리)
3) 힙 영역 메모리 (동적 메모리)

### 클래스 메서드 / 정적메서드
- static 키워드
- 객체 생성 없이 바로 사용가능한 메서드
- 지역변수로 this가 존재 X



### 변수
- 지역변수 : 스택에서 활성화되고, 제거되는 변수
- 멤버변수(인스턴스 변수) : 힙에서 생성, 가비지 콜렉터(GC) 제거 되는 변수
- 정적변수 : 데이터 영역에서 생성되는 변수


- 상수 - 데이터 영역에 만들어짐.
	- final 변수
	- 리터럴 상수
- static : 1개만 생성되고 공유
<br>

- 싱글톤 패턴(SingleTon) 
	- 객체를 한개만 생성하고 공유하는 방식
	- static은 메모리가 많이 소모되는 메모리 방지를 위한 방법.
<br>

- 함수가 필요할 때 메모리 스텍
- 객체 - 힙