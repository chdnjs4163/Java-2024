package chp08.ex8_5;

public class Student {
//  공유(static)영역 할당 : 클래스변수
    static int count;

    // 힙(non-static) 영역 할당: 인스턴스변수
    int id;
    String name;

    Student(int id, String name){
        count++;
        this.id = id;
        this.name = name;
    }

}

