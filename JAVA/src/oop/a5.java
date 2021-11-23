JVM의 메모리 구조


1. 메서드 영역(method area) 

프로그램 실행 중 어떤 클래스가 사용되면, JVM은 해당 클래스의 .class 파일을 읽어서 분석하여 클래스에 대한 정보를 이곳에 저정한다. (클레스 데이터 , 클래스 변수)

- 사용기간 : JVM 시작시 생성, 프로그램 종료시까지 .. 명시적으로 null선언시 GC대상

2. 힙 (heap)

인스턴스가 생성되는 공간. 프로그램 실행 중 생성되는 인스턴스는 모두 이곳에 생성된다. 
(instance variable, new 연산자를 통해 생성한 객체, 또는 인스턴스와 배열을 저장 
-사용기간 : 객체가 더 이상 쓰지 않거나, 명시적으로 null선언시 GC대상

3. stack area 

선입후출의 구조(FILO), 메서드 호출 시 생성 , 메서드 작업에 필요한 메모리 공간을 제공하고, 메서드가 작업을 수행하는 동안 지역변수 (매개변수 포함)
들과 연산의 중간 결과 등을 저장하는데 사용된다. 그리고 메서드가 작업을 마치면 할당되었던 메모리 공간은 반환되어 비워진다.

사용기간 :{}나, 메서드가 끝날때
