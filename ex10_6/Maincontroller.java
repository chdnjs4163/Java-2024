package chp10.ex10_6;



public class Maincontroller {
    public static void main(String[] args) {
        Square square = new Square();
        square.name = "정사각형";
        square.setWidth(7);

        Triangle triangle = new Triangle();
        triangle.name ="삼각형";
        triangle.setWidth(15);
        triangle.setHeight(9);

        Circle circle = new Circle();
        circle.name = "원";
        circle.setR(15);

//        ArrayList<Shape> arrayList = new ArrayList<>();
//        arrayList.add(square);
//        arrayList.add(triangle);
//        arrayList.add(circle);
        Shape[] arr = {square,triangle,circle};

        viewShapes(arr);

    }

    public static void viewShapes(Shape[] arrayList){
        for (Shape shape : arrayList) {
            System.out.printf("%s의 면적은 %.2f㎠입니다.\n", shape.name,shape.area());
        }
    }
}
