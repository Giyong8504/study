참고)
투명도
opacity : 0~1; 1에 가까울수록 투명, 0에 가까울수록 불투명
<br>

- text-align : 좌우 가운데 정렬 left | rigth | center;

		justify : 양쪽정렬  - 글을 끝에 라인에 맞춰서 정렬

- line-height : 행간 - 숫자만 입력 비율
							1.2 : 20% 상하 여백
							30px : 30px 만큼 행간도 가능(px 단위가능)

- letter-spacing : 자간 - 글자 사이 간격
- word-spacing : 단어 사이 간격
- font-weigth : 글자의 굵기
	- nomal - 기본값
	- bold - 굵게
	- 100~900 : 폰트마다 지원범위가 다르다.

- font-family : 글꼴
	선택자 {font-family: 글꼴명1, 글꼴명2 ...;}
	
	font-family : '맑은고딕',AppleGothic;

	- 시스템폰트 - OS에 설치된 기본 폰트 (글꼴에 띄어쓰기 있을때는 '' 을 꼭넣어서 해야한다.)
	- google font 검색 후 import
	
	
## 2. 공간
- Block 레벨 요소
	- 줄개행
	- 공간을 지정할 수 있다. 너비, 높이를 지정할 수 있다.
	- 외부여백(margin) : 모든 방향에 설정 가능, 내부 여백 O
		- 예) div, p, table, form ...

- Inline 레벨 요소
	- 줄개행을 하지 않음.
	- 공간 지정 X, 너비, 높이 설정X
	- 외부 여백(margin) : 좌우 여백만 설정 가능, 내부 여백은 모두 가능
		- 예) span, a, i
	
	- display: inline : 기본값
		- block: 블록형태가 아닌 선택자를 block 속성으로 변경
		- inline-block
			- inline + block
		- none : 감춤. (공간을 채워서 위로 올려버림)
			- visibility: visible; 보임 (영역을 그대로 차지하고 안보임)
			- hidden; 안보임 처리
		-flex
	
		
- 여백
	- 외부 여백(margin)
			margin: 50px; - 상하좌우 전부 50px
			margin: 20px 50px; (20px : 좌우, 50px : 상하)
			margin: 20px 30px 40px;
							상    좌,우,  하
			margin: 20px 30px 40px 50px  (시계방향)
							상			우			하 	좌
			margin-left : 왼쪽 여백
			margin-right : 오른쪽 여백
			margin-top : 위쪽
			margin-botton : 아래쪽
			
	- 내부 여백(padding)
			padding: 50px;
			padding: 20px 50px;
			padding: 20px 30px 40px;
			padding: 20px 30px 40px 50px;
			
			padding-left : 왼쪽 내부 여백
			padding-right : 오른쪽 내부 여백
			padding-top : 위쪽 내부 여백
			padding-botton : 아래쪽 내부 여백
			
	- 경계선
			border-width : 선의 두께
			border-style : 선의 스타일 solid - 직선, dotted - 점선, dashed
			border-color : 선의 색상
	
	- 단축 표기법
			border : 두께 스타일 색상
			border-left: 왼쪽 경계선
			border-right: 오른쪽 경계선
			border-top : 상단 경계선
			border-botton : 하단 경계선
			border-radius : 경계선을 둥글게 - px 또는 % 50%로 하면 원이 됨.
			
## 3. 레이아웃
- box-sizing:
	- content-box : 기본값 : 너비, 높이 기준: 컨텐츠 내용
	- border-box : 너비, 높이 기준: 경계선 기준 
<br>

- position : 배치
	- static : 정적 위치 배치 (기본값)
	- 상대 위치 배치
		- relative : 현재 요소의 위치(우측 상단)
		- absolute : 문서 우측 상단, 상위 요소에 상대 배치 속성(relative,absolute,fixed) 이 있으면, 기준이 상위 요소
		- fixed : 현재 보이는 화면 기준
				top : 양수 : 위에서 -> 아래, 음수 -> 위에서 위쪽
				bottom : 양수 : 아래서 -> 위쪽, 음수 아래서 아래쪽
				left : 양수 : 왼쪽 -> 오른쪽, 음수 : 왼쪽 -> 왼쪽
				rigth : 양수 : 오른쪽 -> 왼쪽, 음수 : 오른쪽 -> 오른쪽
				
	- z-index : 층위 - 숫자가 높을 수록 위쪽에 배치
<br>

- float
	- left - 왼쪽 배치
	- right - 오른쪽 배치
<br>
	
- clear 속성 : float 적용 속성제거
	- clear : left;
	- clear : right;
	- clear : both;
	
- media query - 기기에 맞게 사이즈 자동 변경 
```
	@media all and (max-width: 720px) { //화면 720px 이하까지 적용되는 css
	
	}
	@media all and (min-width:720px) {// 화면 720px 이상부터 적용되는 css
	
	}
```

## 4. 그래픽
- background - 배경색, 배경 이미지
		background-color: 색상 -> 1) 색상명, 2)rgb(), rgba() 3)hex code #.. .. ..
		background-image: urr("이미지경로")
		background-repeat: repeat-x; 좌 -> 우 이미지 반복 출력
		repeat-y; 우 -> 좌 이미지 반복 출력
		no-repeat; : 반복없이 한개만 보이기
		
		background-position: 20px 100px;  : 좌->우 20px, 위->아래 100px
												left|center|right		top|center|bottom
													왼쪽|가운데|우측				위|가운데|아래쪽
		
		**background:[색상] 이미지(url) 반복 위치  -> 한꺼번에 쓰는 방법

- overflow
	- 컨텐츠의 내용이 영역 크기보다 클 경우
		- visible : 기본값 : 넘치더라도 보임.
		- hidden : 넘치는 영역 감추기
		- scroll : 스크롤바 노출
		- auto : 스크롤바 자동 노출
##### 참고)
- 글자가 넘칠 때 말 줄임표(...)
- text-overflow: ellipsis;
	- overflow: hidden 함께 쓰이고
	- white-spacing: warp - 글자가 끝에 도달하면 다음줄 개행| nowrap 줄개행 x
	
## 6. transition
- 전환효과(CSS가 적용되기전 지연시간 - 애니메이션 효과)
- transition-duration : 전환효과 진행시간
- transition-property : 전환효과 적용 속성		
- transition-timing-function : 애니메이션 효과(linear, ease, ease-in, ease-out,ease-in-out)
- transition-delay : 전환효과가 발생하기전 대기시간

transition: 속성 지연시간 애니매이션효과 전환발생 대기시간 -> 위에 내용 축약형
**속성과 지연시간은 필수요소

flexbox