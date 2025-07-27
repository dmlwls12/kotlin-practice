# Kotlin Todo List (Spring Boot + Thymeleaf)

간단한 할 일 관리 웹 애플리케이션입니다.  
Kotlin과 Spring Boot, Thymeleaf를 기반으로 만들어졌으며, 할 일 추가 / 조회 / 삭제 기능을 포함합니다.

---

## 📦 기술 스택

- Kotlin
- Spring Boot
- Spring Web
- Spring Data JPA
- Thymeleaf
- H2 (기본 내장 DB, 필요시 MySQL 등 변경 가능)

---

## ✨ 주요 기능

| 기능 | 설명 |
|------|------|
| 할 일 추가 | 텍스트 입력 후 버튼을 눌러 DB에 저장 |
| 할 일 조회 | 저장된 할 일 목록을 리스트로 출력 |
| 할 일 삭제 | 각 항목 옆 버튼으로 삭제 가능 |

---

## 📁 프로젝트 구조

todo/
├── controller/
│ └── TodoController.kt
├── service/
│ └── TodoService.kt
├── repository/
│ └── TodoRepository.kt
├── domain/
│ └── Todo.kt
└── resources/
└── templates/
└── todo.html


