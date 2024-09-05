package chp07.lab1;

public class MainSquare {

    public static void main(String[] args) {
     Square s1 = new Square();
     s1.setLength(15);
     int result1 = s1.area();

     Square s2 = new Square();
     s2.setLength(7);
     int result2 = s2.area(); // 따로할꺼면 변수를 지정해서 하기

        System.out.printf("길이 %d㎝인 정사각형의 면적은 %d㎠ 입니다. \n",s1.getLength(),result1);
        System.out.printf("길이 %d㎝인 정사각형의 면적은 %d㎠ 입니다. \n",s2.getLength(),result2);



    }
}



