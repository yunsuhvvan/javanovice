[12-3] 다음 중 올바르지 않은 문장을 모두 고르시오.
class Box<T extends Fruit> { // T 지네릭 타입 를 선언
T item;
void setItem(T item) { this.item = item; }
T getItem() { return item; }
}
a. Box<?> b = new Box();
b. Box<?> b = new Box<>();
c. Box<?> b = new Box<Object>();
d. Box<Object> b = new Box<Fruit>();
e. Box b = new Box<Fruit>();
f. Box<? extends Fruit> b = new Box<Apple>();
g. Box<? extends Object> b = new Box<? extends Fruit>();



c,d,g

 a. 지네릭 타입을 지정해 주지 않았지만 문제가 되지는 않는다 그래도 new Box() 대신 new Box<>() 를 사용하는 것이 좋다.
 b. a와 동일
*c. <T extends Fruit>인데  Object 선언 타입 불일치 ,  Fruit 포함 자손들만 들어올 수 있으므로 불가능 
*d. 타입 불일치
 e. OK. 하지만 바람직하지 않음O ‘Box<?> b’ 가  더 나음
 f. Fruit 포함 자손들만 들어올 수 있으므로 가능 
*g. new 에러 연산자는 타입이 명확해야하므로 와일드 카드와 같이 사용불가

