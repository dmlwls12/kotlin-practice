# 게시판 프로젝트 (Kotlin + Spring Boot + MySQL)

간단한 CRUD 기능을 제공하는 게시판 프로젝트입니다.  
Kotlin과 Spring Boot 기반으로 작성되었으며, MySQL을 데이터베이스로 사용합니다.  
Thymeleaf를 통해 서버 사이드 렌더링 방식으로 HTML을 출력합니다.

---

## 프로젝트 구조

src
├── main
│ ├── kotlin
│ │ └── com.uijin
│ │ ├── controller # 웹 요청 처리
│ │ ├── domain # Board Entity 정의
│ │ ├── repository # JPA Repository
│ │ └── service # 비즈니스 로직
│ └── resources
│ ├── templates
│ │ └── posts # list.html, detail.html, form.html 등
│ └── application.yml # 환경 설정

---

## ✅ 기능 목록

- 게시글 목록 조회 (`GET /posts`)
- 게시글 상세 조회 (`GET /posts/{id}`)
- 게시글 작성 (`GET/POST /posts/new`)
- 게시글 삭제 (`POST /posts/{id}/delete`)

---

## 🛠 기술 스택

| 구분      | 기술                                |
|-----------|-------------------------------------|
| Language  | Kotlin                              |
| Framework | Spring Boot 3.x                     |
| DB        | MySQL                               |
| ORM       | Spring Data JPA (Hibernate)         |
| Template  | Thymeleaf                           |
| Build     | Gradle                               |
