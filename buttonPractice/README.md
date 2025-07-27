# Kotlin + SpringBoot 버튼 저장 실습 프로젝트

## 📌 기능 개요
- 버튼 클릭 시 POST 요청을 보내고, 서버에서 DB에 사용자 이름을 저장함
- H2 메모리 DB 사용
- REST API 기반으로 동작

## 🔧 기술 스택
- Kotlin
- Spring Boot
- JPA (Hibernate)
- H2 Database
- Postman / Curl 테스트

## 📂 디렉토리 구조

src/
├── controller
├── domain
├── repository
├── service

## 🔍 API 명세

| 메서드 | 엔드포인트 | 설명        |
|--------|------------|-------------|
| POST   | /users     | 사용자 저장 |
| GET    | /users     | 전체 사용자 조회 |

## ✨ 실행 방법

1. `./gradlew bootRun`
2. Postman 또는 curl로 POST 요청
3. 로그 확인 or H2 Console 접속

## 🧠 배운 점
- Kotlin에서 data class와 생성자 활용법
- Spring의 @RestController, @RequestBody, @PostMapping 개념
- DB와 연동하는 기본 흐름 (save, findAll)
