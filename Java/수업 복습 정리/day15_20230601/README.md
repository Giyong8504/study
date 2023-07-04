다른 클래스 공유 방법
전체 클래스명을 작성해야 공유 가능함.
예) java.lang.String


java.lang 패키지 - 자바의 핵심적인 뼈대가 될 수 있는 패키지

JDK - Java Development Kit
- 자바에서 기본이 될 수 있는 클래스가 있는 패키지


참고)
컴파일러가 자동추가해 주는 소스
1. 기본 생성자 
2. 생성자의 첫번째 줄에 - super()
3. 인터페이스 메서드 - public abstract
4. 인터페이스에 정의된 변수x -> public static final : 정적 상수
5. 지역 내부클래스 지역변수 -> 상수화 final
6. 패키지정의 바로 아래줄 import java.lang.*; 추가됨.
7. 상속을 정의하지 않은 모든 클래스 extends Objcet 가 담겨있다.
(상속관계를 명시하지 않으면 Object 클래스를 상속받는다.)
8. 객체의 참조 변수를 출력 -> toString()이 붙는다.




Object 클래스
1. Object 클래스에 정의된 메서드

2. toString() 메서드      //Integer.toHexString 16진수로 표현 ->10f87f48
public String toString() {     
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    exam01.Student@10f87f48
   
참고)
Class getClass() : 클래스의 정보가 담겨 있는 객체를 반환
      .getName() : 클래스의 이름(전체 클래스명 - 패키지명을 포함한 클래스명

  **** 재정의를 통해서 멤버 변수의 값을 출력하는 값으로 많이 활용된다.****

==========================================

Class 클래스
1. Class 클래스란? 자동으로 생성되어있어서 갔다 쓰면됨. 정보조회를 위해.

-클래스의 정보가 담겨있는 클래스 (객체?) /

-클래스 로더에 의해서 클래스 파일이 데이터 영역에 구성될 때 생성

2. Class 클래스를 선언하고 클래스 정보를 가져오는 방법
1)모든 클래스의 정적 변수 class로 조회  - 객체 생성없이 클래스명으로 바로 조회
2) Object 클래스의 getClass() - 객체 생성 이후 조회 가능.
3) Class.forName(클래스명); - 동적으로 클래스를 데이터영역에 로드, 클래스 클래스 객체 생성. 반환값은 클래스 객체.
(원격에서 자바 객체를 자원을 공유할 때 사용 데이터영역에 올리기 위해 쓰는 것.)


3. Class 클래스를 활용해 클래스정보 알아보기


4. Class.forName()을 사용해 동적 로딩하기
-실행중에 동적으로 데이터 영역에 클래스를 로드
-반환값으로 Class 클래스 객체 반환
-엄격하기에 예외처리를 해주어야한다.

=========================================


3. equals()메서드
   public boolean equals(Object obj) {
        return (this == obj);
   }

- Object의 기본 equals는 동일성 비교(주소 비교)

-동일성 비교 (완전히 동일하냐!?)
   == : 동일성 비교 / 동일한 객체인지 체크/ 동일한 주소인지 체크
값의 비교가 아니라 주소의 비교


-동등성 비교 : 가치가 같은 객체인지
  Object에 있는 equals를 재정의를 통해서 동등성 비교로 구현.
안의 있는 값이 같으면 동등성비교를 함.
  



4. hashCode()메서드
(찾기위한 검색어(중복이되면 절대 안됨.) 1개만있어야 찾기 쉬움.)
- 객체의 주소값
- 동등한 객체이면 일반적으로 hashcode도 같게 정의
- java.util.Objects
  hash?


hash(Object... values)   
자료형 .... --> 가변 매개변수



(동등한 객체는 hashcode와 equals가 같아야 동등하다 판단한다.)
(두가지를 정의해야.)



A - 1,2,3,4
B - 3,4,5,6

A와 B의 합집합 ,1,2,3,4,5,6
집합 자료 -> 중복이 없는 자료
HashSet <-- 이거 집합임.

String클래스
1.String을 선언하는 두가지 방법
String str = "ABC";

String str = new String("ABC");


참고)
java.util 패키지 - 개발에 편의성이 모여있는 패키지

Objects
Arrays
Collections





Wrapper 클래스
1. 기본 자료형을 위한 클래스
2. Wrapper 클래스의 종류
3. Integer 클래스 사용하기
4. 오토박싱과 언박싱
































