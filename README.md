
# 디자인 패턴 정리

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

