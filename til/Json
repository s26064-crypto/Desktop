# Json(JavaScript Object Notation)

- 데이터를 저장하거나 서버와 클라이언트가 데이터를 주고받을 때 사용하는 텍스트 형식

예시

```json
{
  "name": "홍길동",
  "age": 17
}
```

## JSON을 사용하는 이유

- 예전에는 XML을 많이 사용했지만 JSON은 XML보다 짧고 읽기 쉽기 때문에 현재 대부분의 API에서 JSON을 사용한다.

```xml
<user>
  <name>홍길동</name>
  <age>17</age>
</user>
```

```json
{
  "name": "홍길동",
  "age": 17
}
```

사용 예시

- 프론트엔드 ↔ 백엔드
- 앱 ↔ 서버
- 데이터 저장 및 전송

## JSON의 기본 구조

- JSON은 크게 객체(Object)와 배열(Array)로 이루어진다.

### 1. 객체(Object)

- 중괄호 `{}` 를 사용한다.

```json
{
  "name": "홍길동",
  "age": 17
}
```

구조

```json
{
  "키": "값"
}
```

### 2. 배열(Array)

- 대괄호 `[]` 를 사용한다.
- 순서가 있는 데이터 목록이다.

```json
[
  "사과",
  "바나나",
  "포도"
]
```

## JSON에서 사용할 수 있는 자료형

### 1. 문자열(String)

- 반드시 큰따옴표 `" "` 를 사용한다.

```json
{
  "name": "홍길동"
}
```

### 2. 숫자(Number)

```json
{
  "age": 17
}
```

### 3. 논리형(Boolean)

```json
{
  "isStudent": true
}
```

### 4. null

```json
{
  "phone": null
}
```

### 5. 객체(Object)

```json
{
  "address": {
    "city": "광주"
  }
}
```

### 6. 배열(Array)

```json
{
  "skills": ["Java", "Spring"]
}
```

## API에서 JSON 사용 예시

요청(Request)

```json
{
  "id": "user1",
  "password": "1234"
}
```

응답(Response)

```json
{
  "message": "로그인 성공",
  "token": "abc123"
}
```

## JSON 규칙

- 키는 반드시 큰따옴표 사용
- 문자열은 큰따옴표 사용
- 마지막 쉼표 사용 금지

예시

```json
{
  "name": "홍길동"
}
```
