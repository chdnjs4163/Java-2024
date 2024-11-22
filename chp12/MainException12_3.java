package chp12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainException12_3 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        try {
            System.out.println("* 나누는수를 입력하세요:");
            int dividend = s1.nextInt();
            double result = 30 / dividend;
            System.out.printf("%d을 %d로 나눈 수의 결과는 %.2f\n",30,dividend,result);
        }catch (InputMismatchException e) {
            System.out.println("정수를 입력해야만 합니다.");
        }catch (ArithmeticException e) {
            System.out.println("정수를 입력해야만 합니다.");
        }

        System.out.println("프로그램을 종료합니다.");
        s1.close();

    }
}
