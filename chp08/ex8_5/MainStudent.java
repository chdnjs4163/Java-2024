package chp08.ex8_5;

public class MainStudent {


    public static void main(String[] args) {
        Student s1 = new Student(20240101, "유현주");
        Student s2 = new Student(20240102, "박현경");
        Student s3 = new Student(20240103, "윤이나");

        System.out.printf("생성된 Student 객체의 개수: %d개",Student.count);
    }
}