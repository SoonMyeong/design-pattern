
# 디자인 패턴 정리
- 디자인 패턴은 보는 시각에 따라 다르게 보일 수 있다!

## 팩토리 메서드 패턴
### 구체적으로 어떤 인스턴스를 만들지 서브 클래스가 정한다.
- 다양한 구현체가 있고, 그중 특정한 구현체를 만들 수 있는 다양한 팩토리 제공

### 장점
- OCP 원칙 적용, 기존 코드를 건들지 않고 확장이 가능

### 단점
- 클래스가 늘어나는 단점

---
## 어댑터 패턴
### 기존 코드를 클라이언트가 사용하는 인터페이스의 구현체로 바꿔주는 패턴 ex) Spring security , 컬렉션
- 클라이언트가 사용하는 인터페이스를 따르지 않는 기존 코드를 재사용할 수 있게 해줌

### 장점
- 기존 코드 변경하지 않고 원하는 인터페이스 구현체 만들어 재사용 가능
-
### 단점
- 새 클래스가 생겨 복잡도가 증가할 수 있다. (공감;) 경우에 따라 기존 코드가 해당 인터페이스를 구현하도록 하면 복잡도가 줄어든다.
  (원칙적으로 SRP 관점에서 보면 코드를 분리하는게 맞다.)

---
## 컴포짓 패턴
### 그룹 전체와 개별 객체를 동일하게 처리할 수 있는 패턴  , ex) Java Swing Lib

### 장점
- 복잡한 트리 구조를 편하게 사용 가능
- 다형성, 재귀 활용 

### 단점
- 트리를 만들어야 해서 (공통된 인터페이스를 정의) 지나친 일반화를 해야 하는 경우도? 생길 수 있다.

---
## 퍼사드 패턴
### 복잡한 서브 시스템 의존성을 최소화 하는 방법
- 클라이언트가 사용해야 하는 복잡한 서브 시스템 의존성을 간단한 인터페이스로 추상화 할 수 있음

### 장점
- 서브 시스템에 대한 의존성을 한 곳으로 모을 수 있다.
### 단점
- 퍼사드 클래스가 서브 시스템에 대한 모든 의존성을 가지게 됨 (음.. 근데 패턴 적용 전보다 가독성 좋아져서 단점인지 잘 모르겠음)

---
## 플라이웨이트 패턴
## 객체를 가볍게 만들어 메모리 사용을 줄이는 패턴
- 자주 변하는 속성과 변하지 않는 속성을 분리하고 재사용하여 메모리 사용을 줄임 (로컬 캐시 이용)

### 장점
- 애플리케이션에서 사용하는 메모리 사용량 줄일 수 있음

### 단점
- 코드 복잡도 증가 (캐시화로 인한..)

---
## 프록시 패턴 ex) Spring AOP , 자바 다이나믹 프록시 (자바 리플랙션..!)
## 특정 객체에 대한 접근을 제어하거나 기능을 추가할 수 있는 패턴 (본 객체 접근 전 프록시 객체를 접근)
- 초기화 지연 (lazy loading), 접근 제어, 로깅, 캐싱 등 다양하게 응용해 사용할 수 있다.

### 장점
- 기존 코드를 변경하지 않고 새로운 기능 추가 가능
- 기존 코드가 해야하는 일만 유지할 수있다.

### 단점
- 코드 복잡도 증가

---
## 책임 연쇄 패턴
- 요청을 보내는 쪽 (Sender) 과 요청을 처리하는 쪽의 분리 패턴! (핸들러 체인을 사용해 요청 처리 함)
- 쓰이고 있는 사례로는  서블릿 필터!, 스프링 시큐리티

### 장점
- 클라이언트 코드 변경 하지 않고 새로운 핸들러를 체인에 추가할 수 있음!, SRP, OCP 를 지킴

### 단점
- 디버깅이 번거로움.. 필터 다 쫓아가야되니까 , 어렵진 않음

---
## 커맨드 패턴
- 요청을 캡슐화 하여 호출자 (invoker) 와 수신자 (receiver) 를 분리하는 패턴
- 요청을 처리하는 방법이 바껴도 호출자의 코드는 변경되지 않는다.


### 장점
- 기존 코드 변경하지 않고 새로운 커맨드 만들 수 있음
- 수신자의 코드가 변경되도 호출자 (invoker)의 코드는 변경되지 않는다.

### 단점
- 코드 복잡도 증가, 클래스 증가...

---
## 이터레이터 패턴
- 집합 객체 내부 구조를 노출시키지 않고 순회 하는 방법을 제공하는 패턴

### 장점
- 집합 객체가 가지고 있는 객체들에 손쉽게 접근 가능
- 일관된 인터페이스를 사용하여 여러 형태의 집합 구조 순회 가능

### 단점
- 클래스 및 복잡도 증가


---
## 상태 패턴
### 객체 내부 상태 변경에 따라 객체의 행동이 달라지는 패턴
### 상태에 특화된 행동들을 분리해 낼 수 있으며, 새로운 행동을 추가하더라도 다른 행동에 영향을 주지 않는다.


---
## 전략 패턴
### 여러 알고리듬을 캡슐화 하고 상호교환 가능하게 만드는 패턴 , ex) Java Comparator
### 평소 설계하게 될 때 인터페이스 설계하고.. 기능별? 로 나눌 때 흔히 사용했는데.. 그게 전략 패턴이였음, 스프링에서는 엄청 많이 쓰임
- 컨텍스트에서 사용할 알고리듬을 클라이언트가 선택 한다.

### 장점
- 새로운 전략 추가 시 기존 코드 건들지 않고 추가 할 수 있다. (OCP 지킴)
- 상속 대신 위임 사용 가능
### 단점
- 복잡도 증가..
- 클라이언트 코드가 구체적으로 전략을 알아야 함 (전략에 의존성이 생긴다.)

