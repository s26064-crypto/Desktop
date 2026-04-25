# Spring Bean
- 스프링이 대신 만들어서 관리해주는 객체

기존 자바에서는 객체를 직접 만들어야 한다

```java
MemberService service = new MemberService();
```

하지만 스프링에서는 개발자가 직접 만들지 않고  
스프링이 대신 만들어서 관리해준다

```java
@Service
public class MemberService {

}
```

이렇게 하면 Bean으로 등록된다

> Bean = 스프링이 관리하는 객체

## 1. IoC (제어의 역전)
- 원래는 개발자가 객체를 직접 만들고 관리했다

```java
MemberRepository repository = new MemberRepository();
MemberService service = new MemberService(repository);
```

근데 스프링에서는 객체를 만들고 연결하는 걸 대신 해준다

즉, 관리 권한이 개발자 → 스프링으로 넘어간 것

## 2. DI (의존성 주입)
- 필요한 객체를 직접 만들지 않고 넣어주는 것

```java
@Service
public class MemberService {

    private final MemberRepository repository;

    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }
}
```

여기서 MemberService는 MemberRepository가 필요하지만  
직접 안 만들고 스프링이 넣어준다