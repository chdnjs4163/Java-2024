package chp12.ex12_6;

import java.util.Scanner;

public class MainMyAgeException {

    public static void main(String[] args) throws MyAgeException {
        Scanner s = new Scanner(System.in);
        System.out.println("* 나이를 입력:");
        int age = s.nextInt();
        if(age < 0 || age > 150 ){
            try {
                throw  new MyAgeException("나이 0세 ~ 150세까지만 입력이 가능합니다.");
            } catch (MyAgeException e) {
                System.out.println(e.getMessage());
            }
        }else{
            System.out.printf("당신의 나이는 %d세입니다.",age);
        }

        s.close();
    }
}
