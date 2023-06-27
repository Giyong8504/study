# HTML
### 1. 정의
- HyperText Markup Language
- 웹페이지의 구조를 표현
- 확장자 .html
```
태그로 구성된 문서
<태그명>... 내용...</태그명>
여는 태그          닫는 태그

<단일태그 /> : /는 생략 가능 : <단일태그>
예) <mete ...>
```
<br>

### 2. 기본 구조
- head 태그 : 사이트의 정보(meta), 자원들(CSS, JS)
	- 보이지 않는 부분을 정의
   
- body 태그 : 보이는 부분
<br>

### 3. HTML 요소
- 요소(Element) : HTML 태그
<br>

### 4. HTML 속성(attributes)
- 태그에 있는 추가 정도
```
속성명 = "값"
```
<br>

- 태그 고유의 기능이 참고하는 정보로써 속성
```
a : 하이퍼링크 (특정 페이지로 넘어가는)
    - href="이동할 경로"

img : 이미지를 출력하는 태그
    - src="이미지 경로"
```

	참고)
		F5, CTRL + R : 새로고침
<br>

### 5. 헤더(Headings) 태그
- 제목을 표현하는 태그
```
<h1~6> </h1~6>
주제목...> 부제목
```
<br>

### 6. 문단(Paragrahs) 태그
```
<p></p>
```

### 7. 서식(Text Formatting) 태그
```
<b></b>
<i></i>
<strong></strong>
<del></del>
<strike></strike>
```
<br>

### 8. 인용,인용문, 정의(Quotation and Citation Elements) 태그

### 9. 주석(Comments)
- 설명 : 브라우저가 해석 X -> 출력X
- 출력 배제
```
	<!-- 설명 -->
	
	<!-- --> 시작
	<!--//--> 끝
```
<br>
	
### 10. 링크(Links)
- 하이퍼링크
```
- a
- href
- target - 주소를 이용할 창
	- _self : 기본값. 태그가 출력되는 현재창
	- _blank : 새창
	- _parent : 부모창 / 참고) 자식창
	- _top : 가장 상위에 있는 창
	- _창의 이름을 지정 -> 자식창으로 이동 가능
```						
			
##### 참고)
iframe : 문서에 포함 시킬 수 있는 브라우저 창
- src : 웹페이지 경로
- width : 너비
- height : 높이
- name : 창의 이름
- br : 줄개행
```
<br/><br>
```

##### 참고)
경로
- 절대경로
	- 전체 경로 / 전체 URL -> /...
	- 이미지 경로 변경에 유연하게 대처 어렵다.
			
- 상대경로 : 기준 경로가 필요하다.
	- 현재 웹 파일이 포함된 URL에서 파일을 제외한 기준 경로
```
file:///C:/Users/Administrator/Desktop/김기용/1.웹기초/day01 - 기준경로
file:///C:/Users/Administrator/Desktop/김기용/1.웹기초/day01/images/logo.png
				
file:///C:/Users/Administrator/Desktop/김기용/1.웹기초/day01/ex - 기준경로
file:///C:/Users/Administrator/Desktop/김기용/1.웹기초/day01/images/logo.png

file:///C:/Users/Administrator/Desktop/김기용/1.웹기초/day01/ex/../images/logo.png
```
						
						
##### 참고)
```
. : 현재경로
.. : 상위경로
```
<br>

### 11. 이미지(Images)
- img
	- src : 이미지 경로
	- width
	- height
		- 이미지에 너비와 높이를 전부 다 지정하면 이미지 왜곡이 발생
		- 너비 또는 높이 한가지 기준으로 사이즈를 설정
		- alt : 대체 텍스트 : 이미지가 보이지 않는 경우 대체하는 텍스트 (음성관련 기능도 가능함(청각장애인분들을 위한))
<br>

### 12. 테이블(Tables)
- 표를 만드는 태그
```html
	<table>
		<thead>
			<tr>
				<th>항목명</th>
				<th>항목명</th>
				<th>항목명</th>
				...
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>값</td>
				<td>값</td>
				<td>값</td>
				...
			</tr>
		</tbody>
		<tfoot>
			<tr>
				<td>요약정리</td>
				<td>요약정리</td>
				<td>요약정리</td>
				...		
			</tr>
		</tfoot>
	</table>
```
	td, th
		- align : 좌우, 가운데
							left, right,center
			
		- valign : 상하, 가운데
							top,bottom,middle
							
		- rowspan : 행 병합
		- colspan : 열 병합
		
### 13. 리스트(List)태그
	<ul> : unordered list : 순서 표기를 하지 않는 목록 ● ● ● ●
		<li>항목</li>
		
		list-style-type : disc - 채워진 원(기본값)
											circle - 채워지지 않은 원
											square - 사각형
											none - 없음
		
	<ol> : ordered list : 순서 표기를 하는 목록 1.2.3.4
		<li>항목</li>
		
		-type : 순서표기 형태
					- 1(기본값) : 숫자
					- A(대문자 알파벳 순서)
					- a(소문자 알파벳 순서)
					- I(대문자 로마자 표기법)
					- i(소문자 로마자 표기법)
					
	참고) 
	<style>
		.. 적용할 스타일 정의
	</style>
					
