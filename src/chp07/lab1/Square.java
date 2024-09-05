package chp07.lab1;

public class Square {
    // 한변의 길이

    private int length;

    public int getLength() {
        return length;
    }


    public void setLength(int length) {
        this.length = length;
    }

//  직사각형의 넓이를 반환하는 메소드

    public int area() {
        int result = (int) Math.pow(length, 2); //length*length
        return result;

    }
}