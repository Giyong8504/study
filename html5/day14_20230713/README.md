#Window 객체
- 가장 상위 객체
- 창을 생성 할때마다 독립적인 window 객체 생성

## 1. Window 객체의 주요 프로퍼티
- console

```
	.log(...) : 값 확인
	.dir(...) : 객체의 속성과 값...
	.error(...) : 값 확인, 에러처럼 보이기 위해서 빨간색으로 출력
	.trace() : 코드까지 도달하는데 거친 경로 stack 형태로 보여줄 때
```
<br>

- opener : 창을 열어준 window 객체 (열어준 창의 객체 window이다.)
	- open(URL, 창의 이름, 옵션) : 반환값은 현재 열려진 window 객체
		```
		옵션 
		width - 너비
		heighr - 높이
		scorllbar = yes
		```		
	<br>
	
	- close() : 창 닫기
<br>

- 창의 너비와 높이
	- innerWidth, innerHeigth : 스크롤바를 제외한 너비, 높이
	- outerWidth, outerHeight : 스크롤바를 포함한 너비 ,높이
	<br>
	
- 스크롤한 정도
	- pageXOffset : 가로(좌-> 우) 스크롤 정도
	- pageYOffset : 세로(상-> 하) 스크롤 정도
	
	
	
## 2.	window 객체의 주요 메서드
- alert(...) : 알림 대화상자
- prompt(...) : 입력 대화상자, 입력받은 값이 반환값
- confirm(...) : 확인, 취소 대화상자, 확인 버튼 -> true, 취소 버튼 -> false (확인을 한번 더)
<br>

- 지연실행 
	```
	setTimeout(function() { // 이벤트 핸들러
		// 5초뒤에 실행될 코드
	},5000);
	
	setTimeout(function() {
    console.log("작업 수행!");
	}, 5000);
	```
	<br>
	
- 반복 지연 실행
	```
	setInterval(function() {
		// 3초뒤에 실행될 코드
	},3000);
	```
	<br>
	
	- clearTimeout(..) : 지연실행 취소
	- clearInterval(..) : 반복지연 실행 취소
	<br>

>  참고)
> - 자바스크립트 : 싱글 쓰레드 모델
> 	- 이벤트 주도 **비동기 방식** -> 여러 작업을 동시에 처리
<br>

# Location 객체
- 주소창과 관련된 속성과 기능을 담당하는 객체


1. Location 객체의 프로퍼티
2. Location 객체의 메서드
	- assign(주소) : 주소 이동 - 방문기록을 하는 주소 이동
		- location.href 동일
		
	- replace(주소) : 주소 이동 - 방문기록을 하지 않는 이동 (DB에서 뒤로 가기하면 두번 기록을 방지함.)
	
	- reload : 새로고침
<br>

> 참고)
>	 ctrl + shift + n 
>	 시크릿 모드
	<br>
	
# History 객체
- 방문 기록을 다루는 객체

1. History 객체의 프로퍼티
- length : 방문 기록의 갯수
- scrollRestoration : "auto" : 이전페이지의 스크롤 위치 기억
										manual : 이전페이지의 스크롤 위치 기억 X
<br>
										
- back() : 뒤로 1단계 이동
- forward() : 앞으로 1단계 이동
- go(숫자)
	-  (숫자) 음수 : 숫자만큼 뒤로 
	-  (숫자) 양수 : 숫자만큼 앞으로
	
	
# Navigator 객체
- 브라우저의 환경 정보

## 1. Navigator 객체의 주요 프로퍼티
- geolocation (위치!)

## 2. Navigator 객체의 메서드
	
# Screen 객체
## 1. Screen 객체의 주요 프로퍼티
- orientation
	- landscape : 가로모드
	- portrait : 세로모드