# mini-board

Spring Boot + Kotlin 기반 초소형 게시판 페이징 조회(Read) API 실습 프로젝트입니다.

---

## 📌 프로젝트 개요

- CRUD 중 **조회(Read)** 기능만 구현
- 특정 게시판(boardId) 단위로 **페이징 조회**
- **정렬 기준:** `createdAt DESC` (최신순)
- **JSON 형태로 응답**
- Postman 또는 브라우저로 테스트 가능

---

## 🛠️ 기술 스택 및 버전 정보

| 항목 | 버전 |
|---|---|
| Java | 21.0.7 |
| Kotlin | 1.9.25 |
| Spring Boot | 3.5.3 |
| Gradle | 8.14.2 (Gradle Wrapper 사용) |
| MySQL Driver | 8.0.33 |

---

## ✅ 주요 라이브러리 및 버전

| 라이브러리 | 버전 |
|---|---|
| Spring Boot Starter Web | 3.5.3 |
| Spring Boot Starter Data JPA | 3.5.3 |
| Jackson Module Kotlin | Spring Boot BOM 기준 자동 관리 |
| Kotlin Reflect | 1.9.25 |
| MySQL Connector Java | 8.0.33 |
| Spring Dependency Management | 1.1.7 |
| Kotlin JPA Plugin | 1.9.25 |

---

## ✅ 실행 방법

### 1. MySQL 데이터베이스 준비

- 데이터베이스 이름: `my_slow_board`
- 접속 정보 예시 (기본값 기준):

| 항목 | 값 |
|---|---|
| Host | localhost |
| Port | 3306 (기본값, 본인 환경에 따라 3307 등 다른 포트일 수 있음) |
| Username | root |
| Password | (본인 설정값) |

- MySQL에 아래 명령어로 DB 생성:

```sql
CREATE DATABASE my_slow_board;
