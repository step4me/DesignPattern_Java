Design Patterns with Java
=========================

> [윤식당](http://program.tving.com/tvn/younskitchen)을 보며 영감을 받아 레스토랑 타이쿤을 만든다고 가정하고, 디자인 패턴을 연습했습니다.

# 1. 생성 패턴
> 객체 생성에 관련된 패턴. 객체의 생성과 조합을 캡슐화해 특정 객체가 생성되거나 변경되어도 프로그램 구조에 영향을 크게 받지 않도록 유연성 제공

## Abstract Factory
> 구체적인 클래스에 의존하지 않고 서로 연관되거나 의존적인 객체들의 조합을 만드는 인터페이스를 제공하는 패턴

## Factory Method
> 객체 생성 처리를 서브 클래스로 분리해 처리하도록 캡슐화 하는 패턴

## Singleton
> 전역 변수를 사용하지 않고 객체를 하나만 생성하도록 하며, 생성된 객체를 어디에서든지 참조할 수 있도록 하는 패턴
> 다중 쓰레드 환경에서 인스턴스를 2개 이상 만드는 경우 생기므로
> 1) 인스턴스를 만드는 메서드를 동기화하거나 KitchenGasStove.java
> 2) 정적 변수에 인스턴스를 만들어 바로 초기화 시킨다. ConcurrentGasStove.java 

## Prototype
> 기존 객체를 복제함으로써 객체를 생성한다.

# 2. 구조 패턴
> 클래스나 객체를 조합해 더 큰 구조를 만드는 패턴. 서로 다른 인터페이스를 지닌 2개의 객체를 묶어 단일 인터페이스를 제공하거나 객체들을 서로 묶어 새로운 기능을 제공

## Adapter Pattern
> 클래스의 인터페이스를 사용자가 기대하는 다른 인터페이스로 변환하는 패턴으로, 호환성이 없는 인터페이스 때문에 함께 동작할 수 없는 클래스들이 함께 작동하도록 해준다.

![Alt text](/classDiagram/AdapterPattern.png "Class Diagram of Adapter Pattern")

## Composite
> 여러 개의 객체들로 구성된 복합 객체와 단일 객체를 클라이언트에서 구별 없이 다루게 해주는 패턴

## Decorator
> 객체의 결합을 통해 기능을 동적으로 유연하게 확장할 수 있게 해주는 패턴

# 3. 행위 패턴
> 객체나 클래스 사이의 알고리즘이나 책임 분배에 관련된 패턴. 한 객체가 혼자 수행할 수 없는 작업을 여러 개의 객체로 분배하면서도 객체 사이의 결합도를 최소화하는 것에 중점.

## Strategy
> 행위를 클래스로 캡슐화해 동적으로 행위를 자유롭게 바꿀 수 있게 해주는 패턴

![Alt text](/classDiagram/StrategyPattern.png "Class Diagram of Strategy Pattern")

## Template Method
> 어떤 작업을 처리하는 일부분을 서브 클래스로 캡슐화해 전체 일을 수행하는 구조는 바꾸지 않으면서 특정 단계에서 수행하는 내역을 바꾸는 패턴

## Observer
> 한 객체의 상태 변화에 따라 다른 객체의 상태도 연동되도록 일대다 객체 의존 관계를 구성하는 패턴

## State
> 객체의 상태에 따라 객체의 행위 내용을 변경해주는 패턴. Strategy pattern과 구조 동일
> 현재 시스템이 어떤 상태에 있는지와 상관없게 구성하고, 상태 변화에도 독립적이도록 코딩해야 새로운 요구사항을 반영하기 쉬움
> 상태를 클래스로 분리해 캡슐화, 상태에 의존적인 행위들도 상태 클래스에 같이 두어 특정 상태에 따른 행위를 구현하도록 바꾼다

![Alt text](/classDiagram/StatePattern.png "Class Diagram of State Pattern")

## Command
> 실행될 기능을 캡슐화함으로써 주어진 여러 기능을 실행할 수 있는 재사용성이 높은 클래스를 설계하는 패턴

### reference
* [JAVA 객체지향 디자인 패턴: UML과 GoF 디자인 패턴 핵심 10가지로 배우는](http://www.hanbit.co.kr/media/books/book_view.html?p_code=B3400922670)
* [자바 디자인 패턴의 이해 - Gof Design Pattern](https://www.inflearn.com/course/%EC%9E%90%EB%B0%94-%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4/)
* [Adapter Pattern](https://ko.wikipedia.org/wiki/%EC%96%B4%EB%8C%91%ED%84%B0_%ED%8C%A8%ED%84%B4)