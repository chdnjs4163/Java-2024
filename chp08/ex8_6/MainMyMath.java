package chp08.ex8_6;

import java.util.Scanner;

public class MainMyMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 스캐너 사용
        System.out.print("첫번쨰 정수값: ");
        int n1 = scanner.nextInt();
        System.out.print("두번쨰 정수값: ");
        int n2 = scanner.nextInt();
        System.out.printf("%d과(와) %d중에 더 큰 값 : %d\n", n1, n2, MyMath.max(n1, n2));
        System.out.printf("%d과(와) %d중에 더 작은 값 : %d\n",n1, n2, MyMath.min(n1, n2));
        scanner.close(); // 스캐너는 사용후 닫아주기
    }
}
