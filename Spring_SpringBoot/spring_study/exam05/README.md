# Spring Data : 추상화(공통)
## Spring Data JPA

1. JPA란?
1) JPA(Java Persistence API')는 자바 ORM 기술에 대한 API 표준입니다.
2) ORM이란 'Object Relational Mapping'의 약자로 객체와 관계형 데이터베이스를 매핑해주는 것을 말합니다.

2. 영속성 컨텍스트
   Persistence  - 영속성 컨텍스트
- 상태변화 감지 메모리 영역
- 처음 추가된 상태 -> INSERT 쿼리
- 기존 엔티티에서 변경 -> UPDATE 쿼리
- 제거 상태로 변경 -> DELETE
- EntityManager : 영속성 관리 객체 : 스프링이 관리하는 객체 등록되어 있다(bean)
  - void persist(엔티티 객체)  -> 엔티티 영속 상태 -> 엔티티의 변화 감지
  - void flush() : 변화 상태 -> DB에 반영
  - void detach() : 영속성 분리 -> 엔티티의 변화 감지 X
  - void merge() : 분리상태 엔티티 -> 영속 상태 : 엔티티의 변화 감지 O
  - void clear() : 영속성 상태 있는 엔티티를 모두 비우기
  - void close() : 영속성 메모리 제거
  - void remove() : 영속성 상태 -> 제거 상태 (변화 감지 상태) : DELETE 쿼리
	- void find() :

ddl-auto : 테이블, 인덱스, 제약조건
create : 서버가 시작되면 기존 테이블, 인덱스, 제약조건 DROP -> 다시 테이블, 인덱스, 제약조건 생성
create-drop : create + 서버가 종료 될때도 기존 테이블, 인덱스, 제약조건 DROP
update : 테이블 DROP X -> 변경사항만 반영(컬럼 삭제 X, 추가, 변경 O)
validate : 테이블 DROP X, 변경 사항 -> 오류 발생
none: 아무것도 X

	개발 시 : create - 개발 초창기
				update - 개발 중기
				
	실 서버 : validate, none


JPQL  : Java Persistence Query Language
- 엔티티 기준의 쿼리, 조회 결과 -> 영속 상태

3. Entity 설계하기
1) 엔티티 매핑 관련 애노테이션
   @GeneratedValue
   - 자동 증감번호
   - DBMS : 자동 증감번호 생성 전략에 차이
   mysql : PRIMARY KEY + AUTO_INCREMENT : 시스템에서 알아서 생성
   oracle : 시퀀스 객체
   - 테이블
	 
	 @Lob : Large Object
		 매칭되는 것 : text : 여러줄 입력가능하다. 더 크게 사용하고 싶다면 DB에서 변경해주면 된다.



```
	Enum 클래스의 ORDINAL?
	상수의 순서.
	기본값이 ORDINAL 이다.
	이건 쓰지말자. 순서 바뀌면 큰일난다.
	
	그래서 STRING을 사용함.
	@Enumerated(EnumType.STRING)
```



@Transient //DB필드로 생성되지 않는다 내부에서 사용되는 부분을 정의할 수 있다


2) 공통속성화 : 추상클래스가 적합하다! 상속의 이점을 사용하자
    - 상속
    - @MappedSuperclass : 반드시 넣어야지만 상위클래스임을 인식한다.
		
		
		@CreatedDate //처음 추가할 때 등록됨
		
		@LastModifiedDate // 수정 날짜가 등록됨.
		
3) 기본키(Primary Key) 여러개 조합해서 생성
@IdClass
캡쳐한 사진 파일명 : 유일성으로 조합 사진.png

- 기본생성자, 멤버 변수를 초기화 하는 생성자
- equals() and hashcode()


4. Repository 설계하기
JpaReopsitory 인터페이스를 상속 -> 구현 객체가 자동 생성 


### 추가되는 메서드
```
- Opitonal S findById(...)
- List<S> findAll(...) 전체조회
- S save(S entity) : EntityManager::persist :영속성안에 넣어주는 역할
- S saveAndFlush(S entity) : -> save() + flush()
- List<S> saveAll(Colletion<S> entity)
- List<S> saveAllAndFlush(Colletion<S> entity)
- void delete(S entity) : EntityManager::remove(...)
- long count(...) 
- void flush()
```
<br>


Opitonal 클래스 null 값에 대한 처리.

<Br>

5. 쿼리 메서드
 
 
Pageable 인터페이스
-> PageRequest


6. @Query 애노테이션

7. Querydsl
- 비표준 이지만 더 많이쓴다.
- 조회 쿼리 관련 쿼리빌딩 라이브러리를 제공.
- Querydsl JPA
- Querydls APT
	- Q엔티티명.java가 자동생성된다. : 자동 생성 클래스를 만들어주게 된다.
	

논리 연산자를 대신할 수 있는 조건
BooleanBuilder --> Predicate
- and(Predicate...)
- or(Predicate...)
- not(Predicate...)

메서드 체이닝 으로 사용가능하다. 전부 this가 리턴이다.

builder 프리 구현클래스

QMember member = QMember.member; 싱글톤 패턴


8. 연관 관계 매핑
1) @ManyToOne
- 다대일관계 
- 게시글(Many) - 회원(One)
- Many쪽 테이블 외래키가 등록된다

- 엔티티명 + 기본키 형식으로 만들어진다.
	@JoinColumn(name="외래키명") 원하는 이름으로 생성가능하다. Alias 이군?

2) @OneToMany 본인이 작성한 글이나 장바구니만 조회하겠다.
- 일대다
- 회원(One) - 게시글(Many)
- 연관 관계의 주인을 명시 (mappedby)

- 연관 관계의 주인 
	- Many쪽이 관계의 주인이다.
	- 외래키가 있는 쪽
	- 데이터 수정, 변경가능하다.
	
	관계주인이 아닌 회원쪽은 절대 바꿀 수 없다.
	
	
	```
참고)
	lombok : toString()
		-> 멤버 변수의 출력 getter 메서드를 호출 한다. 근데 문제가 있음.
		
		BoardData::toString() -> getMember()가 호출된다. -> Member::toString() 호출됨.
		-> getBoardDatas() -> getMember() -> Member::......->
		서로 참조하기 떄문에 순환잠초 오류가 뜬다. 원인 : 롬복.
		
		해결방법 1) toString 메서드를 getter을 이용하지 않고 직접 멤버 변수로 정의한다.
					2) @ToString.Exclude : 순환참조가 발생하는 필드중에 하나에 적용하면된다.
양방향으로 참조할경우는 @toString.Exclude 애노테이션을 사용하면 참조가하나 끊겨서 오류가 해결된다.
```


3) @OneToOne 1:1 매핑

4) @ManyToMany : 다대다
- 잘 쓰진 않지만 중간 테이블이 생성해서 거기서 조회하게 한다.

해시코드 - 게시글

코드1 - 게시글1, 게시글2, 게시글3

게시글1 - 코드1, 코드2, 코드3


9. 영속성 전이
Cascade 를 사용하여 외래키 떄문에 삭제가 안되지만 자식을 먼저 삭제하여 부모를 삭제함으로써 Cascade와 같은 효과를 준다.



10. 지연로딩
- 즉시 로딩 : 처음부터 join 하는것다.
- 지연 로딩 : 연관된 엔티티는 필요할 때만 조회한다.


fetch (목록 조회는 반드시 이걸 사용해야한다. N+1 이유 때문에)
설정하는 속성 : FetchType.EAGER : 즉시로딩 - 필요할때만 설정하자.
										.LAZY : 지연로딩 - 글로벌 전략: 전체 엔티티는 기본설정을 지연로딩으로 설정하는게 좋다
										- 목록 조회 N+1 문제가 발생한다. 
										목록 조회시 먼저 한번 실행하고 나머지 10번을 수행해서 11번 조회하게 된다.
										JOIN FETCH를 통해서 해결.
										JPQL을 사용하면 오타와 오류 발생 시 한참들여다 봐야하는 문제가 생긴다.
										그래서 Querydsl을 사용하면 좋다.
							
















Predicate


ng.StackOverflowError
롬복떄문에 순환참조 오류가 뜬다.

