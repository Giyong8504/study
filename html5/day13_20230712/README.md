# 웹 브라우저 객체 (사실 day 11이지만 day13으로 폴더 시작함.)
## 1. **웹브라우저에서 자바스크립트 실행 순서**
- 서버 응답(텍스트 형태 HTML) -> 브라우저 변환 (Document 객체), DOMTree 재구성(이진 트리) 완료  (작업 시간 소요) 
-> DOMContentLoaded 이벤트 발생 (Document 객체 반환, DOMTree)
-> load 이벤트 발생 (정적 자원의 로딩 완료 - 이미지, 비디오 css파일 , js파일 ...)
															

### 참고) 

```
	<script>
		자바스크립트코드 ->자바스크립트 엔진(V8)에 의해서 해석
	</script>
	
	<script src="스크립트 파일경로"></script>
		자바스크립트 파일 확장자 .js
		
			HTML 요소의 이벤트 처리
```
<br>


## 2. async와 defer 속성
- script태그에 추가하는 속성
	- async : 비동기처리
	- defer : script 파일을 DOMContentLoaded 이벤트 이후에 실행 


## 3. CSS와 렌더링 

## 4. 웹 브라우저 렌더링 엔진과 자바스크립트 엔진

<br>

참고)
- Document 객체 안에 Document 객체
	- 컴포지트 패턴 : UI 관련
- java.swing..
	- Component 객체 - Component 객체
안드로이드
- View 객체 - View 객체

<br>

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
