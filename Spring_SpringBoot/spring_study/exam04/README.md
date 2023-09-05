# 스프링부트

1. 설정 및 소개

프로필을 가지고 분리한다.
다들 환경이 다르기 떄문. 

spring.profiles.active=프로필명

application.properties : 기본설정 파일
application-prod.properties : 프로필 명이 prod인 설정파일

mvn clean package : 배포 파일 생성 jar
화면 오른쪽 메이븐에서 실행
- 내부에 서버가 내장되어 있음

실행명
java --jar jar파일


java -jar -Dspring.profiles.active=prod 배포파일.jar

-> application-prod.properties


Spring Data JPA

Ppring Security



public class MvcConfig implements WebMvcConfigurer { 설정 인터페이스
