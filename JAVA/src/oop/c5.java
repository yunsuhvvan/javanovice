[12-2] 지네릭 메서드  makeJuice() 가 아래와 같이 정의되어 있을 때 이 메서드를 올바르게 호출한 문장을 모두 고르시오  (Apple과 Grape는 Fruit 의 자손이라고 가정하자 .)
    class Juicer {
    static <T extends Fruit> String makeJuice(FruitBox<T> box) {
    String tmp = "";
    for(Fruit f : box.getList()) tmp += f + " ";
    return tmp;
   }
}
a. Juicer.<Apple>makeJuice(new FruitBox<Fruit>());
b. Juicer.<Fruit>makeJuice(new FruitBox<Grape>());
c. Juicer.<Fruit>makeJuice(new FruitBox<Fruit>());
d. Juicer.makeJuice(new FruitBox<Apple>());
e. Juicer.makeJuice(new FruitBox<Object>());


 a. 타입 불일치
 b. 타입 불일치
*c. 타입 일치
*d. 지네릭스 타입 호출이 생략된 형태 , Juicer.<Apple>makeJuice(new FruitBox<Apple>());
    하지만 대부분 생략한다
 e. 생략이 되었다고 해도 Object는 Fruit보다 조상이므로 들어올 수 없음.. 
