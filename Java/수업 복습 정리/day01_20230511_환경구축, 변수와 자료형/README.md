# 환경구축 하기
<br>

## 자바 설치하기 
<br>

- <a href="https://www.oracle.com/kr/java/technologies/downloads/" target="_blank">JDK 다운로드</a>
- <a href="https://www.oracle.com/java/technologies/javase-jdk18-doc-downloads.html" target="_blank">JDK 문서 다운로드</a>

![image](https://github.com/Giyong8504/study/assets/128211712/4731eb37-a6b1-486d-b949-bea32d465828)

![image](https://github.com/Giyong8504/study/assets/128211712/076d1387-d9e8-4a51-86c5-192fee105983)

![image](https://github.com/Giyong8504/study/assets/128211712/85170272-b51c-4e55-b007-e0c2b54d6297)

![image](https://github.com/Giyong8504/study/assets/128211712/8e1752ff-f4b4-46c8-9e80-503086ce8f7d)

<br>

## IntelliJ 설치
<br>

- <a href="https://www.jetbrains.com/ko-kr/idea/" traget="_blank">IntelliJ 다운로드</a>

----------------
<br>

# 컴퓨터의 데이터 표현
- 우리가 사용하는 모든 데이터는 0과 1로 이루어져있다.
- 컴퓨터는 전기적 신호로 내부에서 0과 1로 만 받아드리며 불이 켜지는 경우와 꺼지는 경우라 생각하면 된다.
- 

자바 파일(java) -> 컴파일 -> 클래스 (class)

java 컴파일 -> 클래스(class) - 중간언어

	JVM(Java Virtual Machine) : 자바 가상머신
	플랫폼에 맞는 바이트 코드(실행코드)

컴퓨터
- 반도체 -> 신호(1), 없으면(0)

진법
- 10진법 0~9
- 2진법(0,1)
- 메모리

 System.out.print();
   --> 출력 
 System.out.println() -> ln -> 줄개행
  --> 출력 + 다음줄로 이동

System.out.printf()
f - > format : 형식

문자 - %s
숫자(정수) - %d
숫자(실수) - %f
	    %.자리수f
줄개행 - %n
; <--문장 종료 기호

주석 - 설명
한줄 설명(주석) //
여러줄 설명 /* 여러줄 설명 */

자바 API 문서
/**
 //문서 변환용 설명
*/

- class 컴파일 시 제외
-> 프로그램 실행 배제




변수
1. 변수란?
 - 공간에 담을 수 있는 변하는 수
 - 공간 = 메모리
 - 공간(메모리)의 이름

 - 공간 : 자료형
 - 이름 : 변수명

2. 변수 선언하기
 자료형 변수명 = 값; 선언 동시화 초기화
변수명 = 값; 초기화
 
 int number;

number = 숫자;  -> 오른쪽 숫자 -> number 공간에 저장


3. 변수 이름 정하기
 1) 의미가 명확하게 이해되는 단어
 2) 알파벳, 숫자, 일부 특수문자($, _)
 3) 숫자는 앞에 올 수 없다.
 4) 예약어
    ture, false, if, throw... 사용안됨.

 5) 변수명을 구성하는 단어가 여러개인 경우
    관례
    1) 단어의 첫 글자는 대문자, 첫단어의 첫글자는 소문자
    noOfStudent  - 카멜 표기법
    noOfOrder

    2) 단어와 단어 사이를 _로 표기
    no_of_student - 스네이크 표기법
    no_of_order



자료형
1. 기본자료형
 - 숫자를 담을 수 있는 자료형
  반도체 - 1, 0
  1bit - 1,0으로 표현하는 최소 공간
  1bit x 8  -> 1byte
  1 - 부호비트(양수 = 0 , 음수 = -)
  
  정수
  1byte 자료형 - byte : -2^7 ~2^7 - 1 (-128~127)
 
  2byte 자료형 - short : -2^15 ~ 2^15 - 1
  (16bit)

  4byte 자료형 - int : -2^31 ~ 2^31 -1 
  (32bit)  

  8byte 자료형 - long : -2^63 ~ 2^63 - 1
  (64bit)


  실수 - 소수점이 있는 숫자
  4byte 자료형 - float

  8byte 자료형 - double

  논리형 : 참, 거짓
	1byte = boolean
		true(참)
		false(거짓)
  
  문자형
     2byte - char
                     : 문자 1개
		 '문자'

  unsigned : 양의 정수

int num1 = 10;
10 - 재료가 되는 상수 - 리터럴 상수

가장 효율적인 정수 자료형은 int
가장 효율적인 실수 자료형은 double




  아스키코드
    숫자 -> 문자
    
  유니코드(2byte)
    숫자 -> 문자

  2. 참조자료형


  3. 상수 
   - 변하지 않는 수
   final 자료형 변수명
 

참조 자료형



형변환
-명시적 형변환 (자동 형변환)
작은 자료형 -> 큰자료형 (byte -> int)
byte -> short -> int -> long     -> float -> double
          char

정수 -> 실수(long, int -> double)
(덜 정밀) -> (더 정밀)

-명시적 형변환(강제 형변환)
큰자료형 -> 작은 자료형 : 명시적으로 형변환 의사 표현
int -> byte ->(byte)num1

실수 -> 정수
3.14 -> 3
