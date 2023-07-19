# 이벤트 처리
## 1. 이벤트 처리기를 등록하는 방법
- document 객체에 on으로 시작하는 속성
	- on이벤트명 : 이벤트 처리기
<br>

## 2. 이벤트 처리기의 문제점
- 속성에 이벤트 핸들러 객체의 값을 대입하는 형태
- 또 대입되면 기존 이벤트 핸들러가 동작 X

## 3. 이벤트 리스너를 등록하고 삭제하는 방법
- document
	- .addEventListener("이벤트명", 이벤트 핸들러);
	
# 이벤트 객체
## 1. 이벤트 객체의 공통 프로퍼티
- 이벤트 핸들러의 첫번째 매개변수 객체 : 이벤트 객체
- 이벤트가 발생한 정보
- 메서드, 속성
<br>


요소 안에서의 좌표
offsetX
offsetY

보이는 화면(Viewport)의 좌표
clientX
clientY

문서 전체에서의 좌표
pageX
pageY

 
target : 이벤트를 발생 시킨 요소 (클릭한 요소)
currentTarget : 이벤트 핸들러가 바인딩 되어 있는 요소 (this와 동일하다)
<br>

## 2. 마우스 객체
<br>

## 3. 키보드 이벤트 객체
1) 키보드와 관련된 이벤트가 가진 고유의 프로퍼티
- 키보드 이벤트
	- keydown : 키를 누를 때, 이벤트 계속 발생
	- keypress : 키를 누를 때, 이벤트가 한번 발생
	- keyup : 키를 뗄 때
		- event 객체
			- 입력한 키에 대한 정보
<br>

- 마우스 이벤트
	- 버블링 단계에서 이벤트가 전파
		- mouseover : 요소의 마우스 커서가 올라 왔을 때
		- mouseout : 마우스 커서가 요소에서 벗어 났을 때
	<br>
	
	- 버블링 단계에서 이벤트가 전파X
		- mouseenter : 마우스 커서가 요소위에 올라 왔을 때
		- mouseleave : 마우스 커서가 요소에서 벗어 났을 때
	<br>
	

## 4. 기타
- focus() : 입력 항목에 커서가 깜빡
- blur() : 입력 항목에서 커서가 사라지면
- change() : 선택 변경 - select, input[type='number|range|color|file']

<br>

# 이벤트 전파
- document
	- .addEventListener("이벤트명", 이벤트 핸들러, useCapture);
	- useCapture : false - 이벤트 전파는 버블링 단계발생(기본값)
							: true - 이벤트 전파가 캡쳐링 단계 발생 ()

이벤트 리스너의 안의 this
= e.currentTarget 으로 변경된다.

## 1. 캡쳐링 단계
- 타켓을 찾기 위해서 DOM Tree -> 내려오는 단계
- useCapture: true : 캡쳐링 단계에서 이벤트가 전파됨.
```javascript
        <script>
            window.addEventListener("DOMContentLoaded",function(){
                const box1 = document.querySelector(".box1");
                const box2 = document.querySelector(".box2");
                const box3 = document.querySelector(".box3");
                box1.addEventListener("click",function(){
                    console.log("box1 클릭!");
                }, false); // 버블링 단계에서 전파
                box2.addEventListener("click",function(){
                    console.log("box2 클릭!");
                }, true); // 캡쳐링 단계에서 전파
                box3.addEventListener("click",function(){
                    console.log("box3 클릭!");
                }, false);
            });
        </script>
```

<br>

## 2. 타겟 단계
- 이벤트 발생한 요소를 찾은 단계
- 이벤트가 실행
<br>

## 3. 버블링 단계
- 위로 올라가는 단계
- useCapture : false : 이벤트가 전파
<br>

## 4. 이벤트 전파 취소하기
- 이벤트 전파의 특성으로 기능의 오작동이 발생할 가능성
- 이벤트 객체
	- .stopPropagation() : 이벤트 번파 취소 메서드
	
	```javascript
	        <script>
            window.addEventListener("DOMContentLoaded",function(){
                const box1 = document.querySelector(".box1");
                const box2 = document.querySelector(".box2");
                const box3 = document.querySelector(".box3");
                box1.addEventListener("click",function(){
                    console.log("box1 클릭!");
                }, false); // 버블링 단계에서 전파
                box2.addEventListener("click",function(){
                    console.log("box2 클릭!");
                }, false); // 캡쳐링 단계에서 전파
                box3.addEventListener("click",function(e){
                    e.stopPropagation(); //버블링 단계 이벤트 전파 취소
                    console.log("box3 클릭!");
                }, false);
            });
        </script>
	```
	
	<br>
	

## 5. 기본 동작 취소하기
- 태그에 있는 기본 동작을 취소
- 이벤트 객체
	- .preventDefault();
<br>

이벤트 리스너안의 this
 = e.currentTarget 동일 : 이벤트가 바인딩 되어 있는 요소

## 2. this가 원하는 객체를 가리키도록 설정하는 방법

Function.prototype
		.bind(thisArg,[...]): call, apply와 다르게 호출 x, this 범위, 매개변수만 변경