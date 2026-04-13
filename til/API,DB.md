## API & DB

* API와 DB는 프로그램에서 데이터를 처리하기 위한 핵심 기술
* API는 외부와 통신하고, DB는 데이터를 저장

---

### API (Application Programming Interface)

* 서버와 데이터를 주고받는 통신 방식
* 보통 JSON 형태로 데이터 전달
* GET, POST 등의 방식 사용
* REST API 형태로 많이 사용됨
* HTTP 프로토콜 기반으로 동작

### DB (Database)

* 데이터를 저장하고 관리하는 시스템
* 사용자 정보, 게시글 등을 저장
* MySQL, Oracle 등이 있음
* 테이블(Table), 행(Row), 열(Column) 구조로 데이터 저장
* SQL을 사용하여 데이터 조회/수정 (SELECT, INSERT, UPDATE, DELETE)

---

### 핵심 개념

* API: 외부 서버와 데이터 통신
* DB: 데이터를 저장하고 관리
* JDBC: Java에서 DB를 연결하는 기술

### API + DB 연동 흐름

1. 클라이언트가 API 요청 (GET/POST)
2. 서버에서 데이터 처리 후 JSON 응답
3. 받은 데이터를 가공
4. DB에 저장 (INSERT)
5. 필요 시 DB에서 조회 후 다시 API로 응답

### 간단 코드 예시 (Java - API 호출)

```java
public class ApiTest {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
        BufferedReader br = new BufferedReader(
                new InputStreamReader(url.openStream())
        );

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line); // API 데이터 출력
        }
    }
}
```

### 코드 예시 (Java - DB 저장)

```java

public class DBTest {
    public static void main(String[] args) throws Exception {

        // DB 연결 (SQLite 파일 생성 또는 연결)
        Connection conn = DriverManager.getConnection(
                "jdbc:sqlite:test.db" // test.db라는 파일 DB에 연결
        );

        // SQL 실행을 위한 객체 생성
        Statement stmt = conn.createStatement();

        // 테이블 생성 (이미 있으면 생성 안 함)
        stmt.executeUpdate(
            "CREATE TABLE IF NOT EXISTS posts (id INTEGER, title TEXT)"
        );

        // 데이터 삽입 (id=1, title='Hello API')
        stmt.executeUpdate(
            "INSERT INTO posts VALUES (1, 'Hello API')"
        );

        // DB 연결 종료
        conn.close();

        // 실행 완료 메시지 출력
        System.out.println("DB 저장 완료!");
    }
}
```

---

### 동작 방식

#### API

* URL 생성 → 요청 전송 → 응답 수신

#### DB

* DB 연결 → SQL 실행 → 결과 반환 → 종료

#### 특징

#### API

* 실시간 데이터 통신 가능
* 다양한 서비스와 연동 가능

#### DB

* 데이터 영구 저장 가능
* 대량 데이터 처리 가능

#### 장점

* API + DB 사용 시 완전한 프로그램 구현 가능
* 데이터 활용 범위 확대
* 웹/앱 개발 필수 기술

#### 단점

* 설정이 복잡함
* 오류 발생 시 디버깅 어려움
* 네트워크 및 DB 의존성 존재
* API는 네트워크 상태에 따라 속도가 느려질 수 있음
* DB는 설계가 잘못되면 성능 저하 발생

### API vs DB

| 구분 | API       | DB     |
| -- | --------- | ------ |
| 역할 | 데이터 요청/응답 | 데이터 저장 |
| 대상 | 서버        | 데이터베이스 |
| 형태 | JSON      | 테이블    |
