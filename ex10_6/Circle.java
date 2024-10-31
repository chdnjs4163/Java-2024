package chp10.ex10_6;

public class Circle extends Shape{

    private int r;

    @Override
    double area() {
        double result = Math.PI * Math.pow(r, 2);
        return result;
    }

    public int getR() {
        return r;
    }

    public int setR(int i){
        return r;
    }
}
