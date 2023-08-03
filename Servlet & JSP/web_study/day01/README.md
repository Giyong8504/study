# maven
- 빌드, 의존성(필요한 라이브러리 jar(Java Archive) 관리, 배포, 테스트 툴
- xml

> gradle
> - groovy

## 1. 설치
- 다운로드 : https://maven.apache.org/download.cgi
- MVN : https://mvnrepository.com/
<br>

C:\Users\Administrator\Desktop\김기용\git업로드\apache-maven-3.9.3\bin
<br>

#### JAVA_HOME 이라는 환경 변수가 없으면 실행X
<br>

## 2. 사용
1) 메이븐 프로젝트 생성
mvn archetype:generate
	groupId : 소속(도메인 방식)
	artifactId : 프로젝트 구분 예) board, shopping
<br>

```
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>20</maven.compiler.source> : 자바 컴파일 버전
    <maven.compiler.target>20</maven.compiler.target> : 배포파일(jar) 컴파일 버전
  </properties>
```

<br>

```
	<dependency>
	.. 자바 라이브러리 jar
	
	<scope> ...
	<dependency>
```

<br>

- 메이븐이 설치 : 중앙 소스 관리 방식(사용자/.m2)
<br>

- scope
	- compiled : 기본값 / 배포 파일(jar) : 포함
	- runtime : 실행중에 로드되는 라이브러리
	- provided : 개발중에만 필요한 라이브러리, 배포시(jar)에서는 제외
	- test : 테스트시에만 필요한 라이브러리
<br>

2) 테스트
- mvn test
<br>

3) 컴파일
- mvn compile
	- 기존 컴파일 소스를 삭제하지 않고 컴파일 : 충돌 가능성 O
	- mvn clean / mvn compile
	- mvn clean compile : 기존 컴파일 소스 일괄 삭제 후 다시 컴파일

4) 컴파일된 소스 일괄 삭제(target 폴더 삭제)
- mvn clean
<br>

5) 배포
- mvn package
	- target : ...  .jar
<br>

	mvn clean package : 기존꺼를 지우고 하는것이 좋기 때문에 사용먼저.
	
	-> compile -> test -> package(jar)
		: 테스트가 통과되지 않으면 
<br>

# lombok
- getter, setter, Tostring
	: 데이터 용도의 클래스에 편의 코드 생성
<br>

- @Getter
- @Setter
- @Tostring

>참고)JPA : 연관관계 매핑 - 순환참고 오류
>getter 메서드를 통해서 값을 출력
>ToString.Exclude : 출력 제외 - 타이틀 값이 사라짐.
 
- @EqualsAndHashCode
- @Data : @Getter, @Setter, @Tostring, @EqualsAndHashCode 전체 다 묶어서 **@Data로 사용이 가능함**.
<br>

- @NoArgsConstructor : 기본 생성자
- @AllArgsConstructor : 모든 멤버 변수 초기화 매개변수
- @RequiredArgsConstructor : 반드시 초기화가 필요한 멤버 변수를 생성자 매개변수로 추가
	- 사용 : 멤버 변수가 상수인데 초기화가 안된경우
		- (final) 상수화 시켜서 해당 매개변수만 사용
	- @NonNull : 상수화를 사용하기 싫을 때
	<br>
	
	@Builder : 빌더 패턴

> 참고) 빌더 패턴
> - 객체를 생성하지 않고, 내부의 빌더를 통해서 객체를 생성하고 값의 초기화를 쉽게 해주는 것.
> - 기본 생성자가 private
> - 정적 내부 클래스 Builder
<br>


버전 : 1.18.28
- 1 -  메이저 버전 : 주요한 변화 -> 호환성 문제 O
- 18 - 마이너 버전 : 기능 추가, 주요한 변화, 호환성 문제 X
- 28 - 패치버전 : 오류 수정, 기능 개선, 호환성 문제 X



--------------
# 개발환경 구축

- tomcat10 버전
	- jakata ee 10 : jakata.
	<br>
	
- tomcat9 
	- java ee8 : javax
	<br>
	
	
클래스 패스 : 클래스를 인식할 수 있는 경로
src/main/java : 자바코드
src/main/resources : 정적 자원 - 설정 파일(xml, properties)를 주로 인식하게 된다.
														- css, js, 템플릿 파일, 이미지

src/test/java : 테스트용 자바 코드
src/test/resources : 테스트용 정적 자원

src/main/webapp : 기본 웹 경로 / 웹 자원으로 노출
src/main/webapp/WEB-INF : 설정
	- web.xml : 웹 배치 설정 - 서블릿, 필터에 대한 설정.
	- 웹 자원으로 노출 X
	- classes 
	- lib












인텔리제이에 pom.xml에 추가해야할 것.
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>20</maven.compiler.source>
    <maven.compiler.target>20</maven.compiler.target>
  </properties>
	
scr -> 마우스 오른쪽 디렉토리 -> java, test 넣기
