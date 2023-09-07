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

8. 연관 관계 매핑
1) @ManyToOne
2) @OneToMany
3) @OneToOne
4) @ManyToMany

9. 영속성 전이

10. 지연로딩