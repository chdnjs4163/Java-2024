package chp10.ex10_9;

public class MainAnimal {

    public static void main(String[] args) {
//        추상클래스는 new 연사자로 객체 생성이 불가능하다.
 //       Animal animal = new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.setName("달이");
        dog.eat("사료");
        dog.cry("멍멍");
        dog.sleep(5);
        dog.wag();

        cat.setName("나비");
        cat.sleep(8);
        cat.cry("야옹야옹");
        cat.grooming();
        cat.eat("생선");

//      업캐스팅을 하면 부모 클래스의 모든 맴버 사용가능
//      but 자식클래스의 맴버는 부모클래스의 메소드를 오버라이딩된 메소드만 사용 가능
        Animal animal = new Dog();

    }
}
