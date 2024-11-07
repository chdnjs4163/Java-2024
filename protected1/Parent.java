package chp10.protected1;

public class Parent {

    String name;

    protected String id;

    protected  void printProtected() {
        System.out.println("protected 접근제한자는 패키지는 서로 다르지만 상관관계에 있는 부모의 맴버를 접근 가능");
    }

      void printDefault() {
        System.out.println("default 접근제한자는 패키지는 서로 다르면 부모의 맴버를 접근 불가능");
    }
}
