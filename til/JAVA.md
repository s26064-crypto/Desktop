# 자바(Java) 기초 정리

---

## 1. 주석 (Comment)

프로그램 실행에는 영향을 주지 않고 설명을 작성할 때 사용

### 한 줄 주석
```java
// 뒤의 내용은 모두 주석
// 백엔드 완전 개꿀잼
```

### 여러 줄 주석
```java
/*
여러 줄 주석
백: 백엔드는
앤: 앤간한 버그는 다 찾아내는 직업계의
드: 드라이버다
*/
```

---

## 2. 자바(Java)란?

- 프로그래밍 언어
- 표준 스펙 + 구현으로 구성됨

---

## 3. 자바 표준 스펙

- 자바를 만들기 위한 설계도
- 여러 회사가 이 기준으로 개발
- JCP(Java Community Process)에서 관리

---

## 4. 자바 구현

- 여러 회사가 자바를 실제로 구현

예시:
- Amazon Corretto → AWS 환경 최적화

---

## 5. 자바 컴파일 & 실행 과정

### 컴파일
```bash
javac Hello.java
```

- .java → .class 변환
- 문법 오류 검사
- 실행 최적화

### 실행
```bash
java Hello
```

- JVM이 실행됨

---

## 6. IntelliJ 특징

- 컴파일 + 실행 자동 처리
- 결과 파일 → out 폴더 생성

---

## 7. 자바 특징 (운영체제 독립성)

- JVM만 있으면 어디서든 실행 가능

---

## 변수 (Variable)

### 변수란?
```java
int age = 20;
```

값을 저장하는 공간

---

### 선언 & 초기화
```java
int age;      
age = 20;     

int age = 20;
```

---

### 값 변경
```java
int age = 20;
age = 21;
```

---

### 변수 사용
```java
int a = 10;
int b = 20;

int sum = a + b;
```

---

### 변수 이름 규칙


가능:
```java
int age;
int studentAge;
int student_age;
```

불가능:
```java
int my age;     //  공백 사용 불가
int my-age;     //  특수문자 사용 불가 (-)
```

---

### 자료형 (타입)
```java
int age = 20;
double pi = 3.14;
boolean flag = true;
String name = "Tom";
```

---

### 출력
```java
System.out.println(age);
```

---

## 연산자

### 산술 연산자
```java
a + b
a - b
a * b
a / b
a % b
```

---

### 증감 연산자
```java
a++;
++a;
```

a++ : 나중에 증가  
++a : 먼저 증가  

---

### 비교 연산자
```java
a == b
a != b
a > b
a < b
```

---

### 논리 연산자
```java
&&
||
!
```

---

### 대입 연산자
```java
a += 5;
a -= 3;
a *= 2;
```

---

## 반복문

### while문
```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

---

### do-while문
```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

---

### break
```java
if (i == 5) {
    break;
}
```

---

### continue
```java
if (i == 3) {
    continue;
}
```

---

## 핵심 요약

- 주석: 설명용
- 변수: 값 저장
- 연산자: 계산
- 반복문: 반복 실행
- 자바: JVM 기반으로 모든 OS에서 실행 가능

---

## Scanner

- 사용자로부터 입력을 받는 도구
```java
import java.util.Scanner; // Scanner 사용 준비

Scanner sc = new Scanner(System.in) // 입력 받을 준비
```
