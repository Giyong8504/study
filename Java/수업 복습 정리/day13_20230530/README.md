# 내부클래스
1. 지역 내부클래스
지역 - 함수 내부

인터페이스, 추상클래스 -> 직접 객체를 지역 내부에 생성

인터페이스와 추상클래스가 객체가 되는 조건?
1) 환경 - 지역 내부, 멤버 변수
2) 객체가 될 수 없는 조건(추상메서드)을 해소.
   - 추상메서드의 구현체를 정의하면 가능.


2. 익명 내부 클래스




예외처리

1.오류와 예외
오류(Error) : 시스템적인 오류(인프라...)
               - 개발자가 통제 X
예외(Exception) : 프로그램 소스상의 오류
           -개발자가 통제 가능한 오류

10 / 0 - > ArithmeticException 오류


2.예외 클래스의 종류
Throwable 
  Exception을 바로 상속 받는 예외
    - 예) IOException - FileNotFoundException
       - 예외의 확인이 컴파일 시점에 이뤄진다.
       - 예외 발생시 컴파일 X (class 파일이 생성 X)
       - 엄격한 예외, 형식을 매우 중시
       - 예외가 발생하든 안하든 무조건 예외 처리


  Exception
    - RuntimeException 상속받은 예외
      예) ArithmeticException
          NullPointerException
             -> 참조 변수에 값이 null인 경우 메서드 호출시 발생

   - 예외가 발생할 수 있더라도 컴파일 O  -> class 파일이 생성
   - 예외 확인이 실행중(Runtime)에 이뤄진다.
   - 비교적 유연한 예외



java.exe -> 자바 class를 실행
javac.exe -> java 파일 -> class 파일로 컴파일


Throwable : 던질 수 있는 클래스
하위클래스 - Error - 오류


             - Exception - 예외 : 프로그램 소스상의 문제 - 버그

         Exception 상속받은 예외 클래스(RuntimeException X)
             -예외 확인 시점 : 컴파일 시에 확인, 예외 발생 ->컴파일  중단 
             - 예외시 class 파일 생성 X
             - 예) FileNotFoundException


         Exception - RuntimeException 을 상속받은 예외 클래스
             (Runtime - 실행)
         - 예외 확인 시점 : 실행시에 확인, 실행 시 발생 -> 프로그램 중단
         -실행을 하려면 class 파일 필요 - 컴파일이 진행되어야 가능

         - ArithmeticException , NullPointerException

컴파일 돼야만 클래스가 생성됨.


예외를 발생시키는 방법 
-> 예외 던지기(Throwable를 상속받은 클래스만 가능.)

throw 예외 객체 -> 예외 발생
- 예외는 던질 수 있는 클래스(Throwable 하위 클래스만 가능),
던지기(throw)를 해야 발생





3. 예외처리하기
try {
    // 예외가 발생할 가능성이 있는 코드

} catch (예외 객체){
   // 예외에 대한 적절한 처리
}

예외 발생시 문제 해결을 위한 가장 중요한 내용 - 오류 발생의 원인, 정보
Throwable : 예외의 정보를 확인하는 다양한 메서드가 정의
Throwable 
    - String.getMessage()  ****** 필수암기
    - void printStackTrace()  ******  필수암기

4. try-catch-finally문










===============
예외
Exception을 상속받은 예외 ㅋ ㅡㄹ래스
 - 예외가 체크되는 시점 컴파일시 -> 예외가 있으면 컴파일 X
 - class 파일이 생성 X

Exception - RuntimeException 상속받은 예외 클래스
 - 예외가 체크되는 시점 -> 실행시에 체크 된다.
 - 실행을 하려면? 컴파일이 먼저 이뤄져야 가능(class 파일이 생성)



==========================
             - Exception - 예외 : 프로그램 소스상의 문제 - 버그

         Exception 상속받은 예외 클래스(RuntimeException X)
             -예외 확인 시점 : 컴파일 시에 확인, 예외 발생 ->컴파일  중단 
             - 예외시 class 파일 생성 X
             - 예) FileNotFoundException


         Exception - RuntimeException 을 상속받은 예외 클래스
             (Runtime - 실행)
         - 예외 확인 시점 : 실행시에 확인, 실행 시 발생 -> 프로그램 중단
         -실행을 하려면 class 파일 필요 - 컴파일이 진행되어야 가능

         - ArithmeticException , NullPointerException

컴파일 돼야만 클래스가 생성됨.




