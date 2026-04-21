# Spring 어노테이션
- @를 이용하여 코드에 추가 정보를 부여하는 메타데이터를 정의하는 정형화된 방법

---

## 1. 컴포넌트 등록 (Bean 생성)

### @Component
기본적인 스프링 빈 등록

### @Service
서비스 계층 (비즈니스 로직 담당)

### @Repository
데이터 접근 계층 (DB 관련)

### @Controller
웹 요청 처리 (MVC 컨트롤러)

### 정리
위 어노테이션들은 모두 `@Component`의 확장 형태이며 역할 구분용이다.

---

## 2. 의존성 주입 (DI)

### @Autowired
자동으로 객체를 주입

```java
@Autowired
private UserService userService;
```

### @Qualifier
같은 타입의 Bean이 여러 개일 때 특정 Bean 선택

---

## 3. 설정 관련

### @Configuration
설정 클래스임을 표시

### @Bean
메서드를 통해 직접 Bean 등록

```java
@Configuration
public class AppConfig {
    @Bean
    public UserService userService() {
        return new UserService();
    }
}
```

---

## 4. 웹 관련 (Spring MVC)

### @RequestMapping
URL 매핑

### @GetMapping
GET 요청 처리

### @PostMapping
POST 요청 처리

```java
@GetMapping("/hello")
public String hello() {
    return "hello";
}
```

---

## 5. 기타 자주 쓰는 어노테이션

### @RestController
JSON 데이터를 반환하는 컨트롤러 (`@Controller + @ResponseBody`)

### @ResponseBody
데이터를 그대로 HTTP 응답으로 반환

### @RequestParam
요청 파라미터 값 받기
```java
@GetMapping("/search")
public String search(@RequestParam String name) {
    // 쿼리 스트링의 'name' 값을 가져옴
    return "Search result for: " + name;
}