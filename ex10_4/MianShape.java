package chp10.ex10_4;

public class MianShape {
    public static void main(String[] args) {
        Square s = new Square();
        s.name = "정사각형";
        Triangle t = new Triangle();
        t.name = "삼각형";
        Circle c = new Circle();
        c.name = "원";

        Shape[] shapes = {s, t, c};
        for(int i = 0; i < shapes.length; i++){
            System.out.printf("인덱스 번호 %d의 도형이름: %s\n", i, shapes[i].name);
        }
    }
}
