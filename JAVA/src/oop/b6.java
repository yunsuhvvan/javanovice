*상속 
1. 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것.
2. 생성자와 초기화 블럭은 상속되지 않는다 멤버만 상속된다.
3. 자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다.

*클래스관의 관계- 포함관계
1. 클래스간의 포함관계를 맺어주는 것은  한 클래스의 멤버변수로 다른 클래스 타입이 참조변수를 선언하는 것을 뜻한다.
 - Circle is a Point or Circle ahs a Point  // *대부분 90%가 포함 관계라고 함*

*오버라이딩
  1. 조상 클래스로부터 상속 받은 메서드의 내용을 변경하는 것을 오버라이딩이라고한다. 사전적의미는 ~위에 덮어쓰다
*오버라이딩의 조건
  1) 이름이 같아야한다
  2) 매개변수가 같아야한다
  3) 반환타입이 같아야한다.
     1. 접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다
     2. 조상클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
     
     
 *this와 super : 참조변수인 동시에 지역변수.. 구별하기 위해 사용된다
 
 * 접근 제어자 
- public   >     protected       >  default  >     private
    전부    같은패키지,자손클래스    같은패키지     같은 클래스
 
 
 * 다형성 
 - 여러가지 형태를 가질 수 있는 능력, 조상클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조할 수 있다.  
 Tv t = new CatptionTv();  //가능
 CaptionTv c = new Tv();   //불가능
 
* 참조변수의 형변환

1. 형변환은 참조변수의 타입을 변환하는 것이지 인스턴스를 변환하는것은 아니기 때문에 참조변수의 형변환은
   인스턴스에 아무런 영향을 미치지 않는다.
   단지  참조변수의 형변환을 통해서, 참조하고 있는 있는 인스턴스에서 사용할 수 있는 멤버의 개수를 조절하는 것 뿐이다.


* 매개변수의 다형성

1. 참조변수의 다형적인 특징은 매개변수에도 적용이 된다.
2. 매개변수가 조상타입의 참조변수라는 것은 메서드의 매개변수로 "조상클래스"의 자손타입의 참조변수면 어느 것이나 매개변수로 받아들일 수 있다는 뜻이다.


* 추상 클래스
1. 추상 클래스는 미완성 설계도
2. 클래스가 미완성이라는 것은 멤버의 개수에 관계된 것이 아니라, 단지 추상 메서드를 포함하고 있다는 의미이다.
3. 미완성 설계도로 완성된 제품을 만들 수 없듯이 추상클래스로는 인스턴스는 생성할 수 없다. (추상클래스는 상속을 통해서 자손 클래스에 의해서만 완성이 될 수 있다.)
4. 클래스 선언부의 abstact를 보고 이 클래스에는 추상 메서드가 있으니 상속을 통해서 구현해주어야 한다는 것을 알아차려야한다.
5. 추상 클래스는 추상 메서드를 포함하고 있다는 것을 제외하고는 일반 클래스와 전혀 다르지 않다. 추상 클래스에도 생성자가 있으며 , 멤버변수와 메서드도 가질 수 있다.

* 추상메서드
- abstact 리턴타입 메서드이름();  // 주석을 통해 어떤 기능을 수행할 목적으로작성하였는지 나타내기
추상클래스로부터 상속 받는 자손 클래스는 오버라이딩을 통해 조상인 추상클래스의 추상 메서드를 모두 구현해줘야한다.

* 인터페이스
1. 추상화 정도 :  [인터페이스 > 추상클래스]
2. 추상 클래스와 달리 몸통을 갖춘 일반 메서드 또는 멤버변수를 구성원으로 가질 수 없다.
3. 오직 추상메서드와 상수만을 멤버로 가질 수 있고 그외의 다른 어떠한 요소도 허용하지 않는다.

*작성
1. 모든 멤버변수는 public static final 이어야 하며 , 이를 생략할 수 있음
2. 모든 메서드는 public abstract 이여야 하며, 이를 생략할 수 있음

* 구현
-만일 구현하는 인터페이스의 메서드 중 일부만 구현한다면, abstract를 붙혀 추상 클래스로 선언하여야한다.
 (abstract class Fighter implements Fightable)..
 - 상속과 구현도 동시에 가능
  (class Fighter extends Unit implemets Fightable)

* 인터페이스를 이용한 다형성
1. 인터페이스 타입의 매개변수가 갖는 의미는 메서드 호출 시 해당 인터페이스를 구현한 클래스의 인스턴스를 매개변수로 제공해야한다는 것이다.
2. 리턴타입이 인터페이스라는 것은 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것을 의미한다.

*인터페이스의 장점 
- 개발시간을 단축시킬 수 있다.
- 표준화가 가능하다
- 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
- 독립적인 프로그래밍이 가능하다.

-----------------
인터페이스 
1.상수 : 인터페이스에서 값을 정해줄테니 함부로 바꾸지 말고 제공해주는 값만 참조해라 (절대적)
2.추상메소드 : 가이드만 줄테니 추상메소드를 오버라이딩해서 재구현해라. (강제적)
3.디폴트메소드 : 인터페이스에서 기본적으로 제공해주지만, 맘에 안들면 각자 구현해서 써라. (선택적)
4.정적메소드 : 인터페이스에서 제공해주는 것으로 무조건 사용 (절대적)

절대적이란 정말 아무것도 손댈 수 없음을 의미하고, 강제적이란 그래도 인터페이스를 implements하지 않으면 피할수는 있기에 강제적이라고 표현했다.


추상 클래스(abstratc class)의 특징 :
1. 추상 클래스는 new연산자를 사용하여 객체를 생성할 수 없다.
2. 추상 클래스(부모)와 일반클래스(자식)는 상속의 관계에 놓여있다.
3. 추상 클래스는 새로운 일반 클래스를 위한 부모 클래스의 용도로만 사용된다.
4. 일반 클래스들의 필드와 메소드를 통일하여 일반 클래스 작성 시 시간을 절약할수 있다.
5. 추상 클래스는 단일 상속만 가능하며 일반 변수를 가질 수 있다.
6. 추상 클래스는 동일한 부모를 가지는 클래스를 묶는 개념으로 상속을 받아서 기능을 확장시키는것이 목적이다.

인터페이스(interface)의 특징 :
1. 인터페이스는 모든 메서드가 추상 메서드인 경우를 말한다.
2. 인터페이스는 추상 클래스보다 한 단계 더 추상화된 클래스라고 볼 수 있다.
3. 인터페이스에 적는 모든 메서드들은 추상 메서드로 간주되기 때문에 abstract을 적지 않는다.
4. 인터페이스는 static final 필드만 가질 수 있다. 필드를 선언할 때는 public static final 기능이 생략되어있다.
5. public static final을 사용하는 이유는 다음과 같다.
 > 구현 객체의 같은 동작을 보장하기 위한 목적(값을 추가하거나 그런것을 불가능하도록)
 > 인터페이스의 변수는 스스로 초기화 될 권한이 없음
 > 아무 인스턴스도 존재하지 않는 시점이기 때문
6. 인터페이스도 추상 클래스와 마찬가지로 new 연산자를 사용하여 객체를 생성할 수 없다.
7. 인터페이스는 구현 객체가 같은 동작을 한다는 것을 보장하는 것이 목적이다.
8. 인터페이스는 추상 클래스와 반대로 다중 상속이 가능하다.

추상 클래스와 인터페이스의 차이점

1. 추상 클래스(단일상속) / 인터페이스(다중상속)
2. 추상 클래스의 목적은 상속을 받아서 기능을 확장시키는 것
3. 인터페이스의 목적은 구현하는 모든 클래스에 대해 특정한 메서드가 반드시 존재하도록 강제하는 역할
(구현 객체가 같은 동작을 한다는 것을 보장하기 위함)

-------------------