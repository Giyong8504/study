# Document 객체

## 1. Document 객체의 주요 프로퍼티
	- cookie : 개인화된 서비스 제공용도 브라우저에 저장된 데이터
	- referrer : 직전 URL
	
## 2. Document 객체 주요 메서드

# 문서제어
## 1. DOM 트리

# 노드 객체의 프로퍼티

- children : 자식 요소
- parentElement : 부모 요소
- firstElementChild : 자식의 첫번째 요소
- lastElementChild : 자식의 마지막 요소
- nextElementSibling : 바로 뒤에 있는 형제
- previousElementSibling : 바로 앞에 있는 형제
- childElementCount	: 자식 요소의 갯수 
<br>

### document 객체를 통해서 바로 접근할 수 있는 요소
- head
- body
- form 
	- name 속성
	- 입력 항목도 name으로 바로 접근
	<br>
	
# 자바스크립트로 웹 페이지 제어하기
## 1. 노드 객체 가져오기 (필수 암기)
1) id 속성으로 노드 가져오기
	- 한개만 선택
	
	document.getElementById("아이디명");
	
2) 요소 이름으로 노드 가져오기
	- 복수개 선택
	- document.getElementsByTagName("태그명");

3) class 속성 값으로 노드 가져오기
	- 복수개 선택(HTMLCollection)
	- document.getElementsByClassName("클래스명");
	
4) 태그명 
	- 복수개 선택자
	- document,getElementsByTagName("태그명");

5) name 속성 값으로 노드 가져오기
	- document,getElementsByName("name 속성명");

6) CSS 선택자로 노드 가져오기
	- document.querySelector("CSS 선택자"); : 단일 선택
	- document.querySelectorAll("CSS 선택자") : 복수개 선택


> 참고)
> 선택된 DOM은 살아있는 상태 : 변경사항이 바로 반영

<br>

## 2. 속성(attribute) 값의 읽기와 쓰기
- document
	- attribute : 속성 전체 정보 객체
	
	- getAttribute("속성명") : 속성값 조회
	- setAttribute("속성명","속성값) : 없으면 추가, 있으면 변경
	- removeAttribute("속성") : 속성제거
	<br>
	
- 사용자가 추가하는 정보성 속성 : data-속성명 = "값" (정보성이라고 data라 표기를 해주자. 내부에서 쓰기 위함.)
	- document 객체의 하위 속성 객체 **dataset**
		- 객체의 속성 추가, 수정, 삭제와 동일하게 관리가 가능하다. (data-는 생략);
		- 속성 제거 : **delete dataset.속성명**\
		<br>
			
- 클래스 속성 : 기능, 동작의 통제 용도로 추가, 제거를 주로 많이 한다.
	- document 객체의 하위 속성 classList 객체
		- add("클래스명") : 클래스 추가
		- contains("클래스명") : 클래스명 포함 여부
		- remove("클래스명") : 제거
		- toggle("클래스명") : 클래스명이 없으면 추가, 있으면 제거
		<br>
		
> 참고)
> 많이 사용되는 속성은 document 객체의 하위 속성으로 바로 접근 가능
> - type
> - name
> - id
> - href
> - src
> - action
> - target
> - width, height
> - className : 클래스
> - value
> - 속성이 살아있는 상태 : 변경이 되는데로 기능이 변경
<br>

## 3. HTML 요소의 내용을 읽고 쓰기
- document
	- .innerHTML : 자식요소의 HTML 문자열
						: 변경하면 바로 변경
	- .innerText : 자식요소의 Text 문자열(HTML 요소는 제거)
						: 변경하면 바로 변경
						
## 4. 노드 생성/삽입/삭제하기
- 노드생성
	- document
		.createElement("요소명"); : 메모리상에만 document객체 생성된 상태
		.creatTextNode("텍스트명") : 
	<br>
	
	- 삽입
		- document 객체
			- .append(추가할 자식 요소)
		<br>
		
		- 중간에 추가
			- document객체(부모)
				- .insertBefore("추가할 요소",기준요소);
	<br>
	
	- 제거
		- document 객체
			- removeChild("자식 요소");