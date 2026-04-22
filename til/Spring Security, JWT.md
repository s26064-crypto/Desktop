## 1. Spring Security
- Spring 기반 애플리케이션에서 인증(Authentication)과 인가(Authorization)를 처리하는 보안 프레임워크이다.
  - 한마디로: "누가 로그인했는지" + "그 사람이 무엇을 할 수 있는지를 관리"하는 시스템이다.

### 인증(Authentication)
- 사용자가 누구인지 확인

####  예시
- 아이디/비밀번호 로그인
- 토큰 검증

### 인가(Authorization)
- 사용자가 무엇을 할 수 있는지 결정

#### 예시
- 일반 사용자 → 게시글 조회만 가능
- 관리자 → 삭제/수정 가능

### Spring Security 동작 흐름
1. 요청 들어옴
2. Spring Security Filter가 가로챔
3. 인증 확인 (로그인 여부)
4. 권환 확인 (접근 가능 여부)
5. 통과 or 차단

## 2.JWT(JSON Web Token)
- 사용자의 인증 정보를 JSON 형태로 암호화해서 전달하는 토큰 방식이다.

### 특징
- 서버가 세션을 저장하지 않음
- 토큰 자체에 정보가 들어있음
- 주로 로그인 이후 인증 수단으로 사용

### 구조
```text
Header.Payload.Signature
```
###### 1) Header
- 토큰 타입 + 암호화 방식

###### 2) payload
- 사용자 정보(id, role 등)

###### 3) Signature
- 위조 방지용 서명