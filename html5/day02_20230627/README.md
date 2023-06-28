# HTML5 (2일차)

### 13. 리스트(List)태그
```
<ul> : unordered list : 순서 표기를 하지 않는 목록 ● ● ● ●

<ul>
	<li>항목</li>
	<li>항목</li>
	<li>항목</li>
<ul>
```
- list-style-type : disc - 채워진 원(기본값)
- circle - 채워지지 않은 원
- square - 사각형
- none - 없음 (디자인적으로 이걸 많이씀.)

#### 적용방식
```
<ul style="list-style-type:disc 또는 circle, square, none 중 하나 입력">
```
<br>

```
<ol> : ordered list : 순서 표기를 하는 목록 1.2.3.4
<ol>
	<li>항목</li>
	<li>항목</li>
	<li>항목</li>
<ol>
```
<br>

#### type : 순서표기 형태
 - 1(기본값) : 숫자
 - A(대문자 알파벳 순서)
 - a(소문자 알파벳 순서)
 - I(대문자 로마자 표기법)
 - i(소문자 로마자 표기법)
<br>

#### 적용방식
```
<ol type="1 또는 A, a, I, i 중 하나 입력">
```

	참고) 
	<style>
		.. 적용할 스타일 정의
	</style>
	
	dl - Description List
		dt : 항목명
		dd : 항목 내용
<br>

### 14. Block &Inline 요소
#### HTML 문서
- Block : 문단
	- 줄개행
	- 너비, 높이 설정
	- 외부 여백(margin)은 모든 방향에서 적용 가능
```
<p></p>
<div></div>
```

- Inline : 글과 관련된 속성
	- 줄개행 X
	- 너비, 높이 결정 X
	- 외부 여백(margin) : 좌우 여백은 가능, 상하 여백 적용 X
```
<a></a>
<span></span>
```

### 15. class 속성 : 요소의 선택과 관련된 속성 : 여러 요소에 적용
<br>

### 16. id 속성 : 요소의 선택과 관련된 속성 : 한가지 요소에 적용 (딱하나만)
<br>

### 17. iframes
- src : 주소를 입력
- name : 창의 이름 : target을 통해서 창으로 이동
- scrolling : -yes : 표시, no : 없음, auto : 자동
- width, height
- frameborder : 테두리 표시 여부 -1 - 표시, 0 -표시X
<br>

### 18. Javascript
```
<script>
	자바스크립트 코드
</script>
```

--------------------
## HTML Head
1. <title> 요소 : 사이트제목 : 탭에 출력
2. <style> 요소 : 스타일시트를 적용하는 태그
3. <link> 요소 : 외부 CSS 파일을 연동할 때
4. <meta> 요소 : 사이트 정보
5. <script> 요소	: 자바스크립트
<br>

## 시멘틱 요소(Semantic Elements)
- 의미를 가진 태그를 의미.
- 이름만 봐도 알 수 있는 태그
```
<table>
<form>
<header> : 상단
<nav> : 메뉴
<section> 
<article>
<aside> 
<footer> : 하단
<main> : 문서의 메인 영역
```
<br>

### 1. 웹페이지의 영역을 정의하는 요소
<br>

### 2. 엔티티<Entities>
```
< : &lt;
> : &gt;
공백 1개 : &nbsp;
& :&amp;
&copy;
```

연습 사이트 dm.n-mk.kr
<br>

## Forms
```
<form>
	<input...>
</form>
```
<br>

## input
- type : 입력형태
- text : 한줄 텍스트
- password : 비밀번호 전용 - 안보임 처리
- radio : 여러개 중에서 한개 선택 (join.html)
	- name 속성이 같아야 하나의 그룹으로 묶인다. 값이 같으면 하나만 선택가능하게 바뀜
<br>

- label 태그로 감싸면 텍스트를 클릭해도 선택, 해제가 된다.
- checkbox : 여러개 중에서 여러개 선택
	- name 속성이 같아야 하나의 그룹으로 묶인다.
<br>

- checked : checkbox, radio 에서 체크된 상태
<br>

- date : 날짜 형식
- email : 이메일 형식 - 제출시에 형식을 체크, 형식이 이메일이 아니면 제출 X
- number : 숫자 형식
- color : 색상 선택
- range : 범위
- min : 최소값
- max : 최대값
- step : 증감단위
<br>

- submit : 양식 제출
- value : 버튼명
- reset : 입력항목 취소 :다시 입력
- button : submit 보다 더 선호
- type: button : 일반버튼
- submit : 제출버튼
<br>

- reset : 입력항목을 취소 : 다시 입력
	- name : 전송 데이터 항목의 이름
	- value : 입력 항목의 값
	- required : 필수 입력 항목 (미 기입시 제출 불가)
<br>

```		
join.html?userType=on&hobby=on&hobby=on&hobby=on
이름=값&이름=값
```
<br>

- select : 여러개중에서 선택(1개 또는 여러개)
  - option - value
		
		
		
