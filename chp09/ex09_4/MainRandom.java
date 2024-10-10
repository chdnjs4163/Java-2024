package chp09;

import java.util.Random;

public class MainRandom {

    public static void main(String[] args) {
//        정수, 실수, 논리값, 특정 개수도 설정 가능
        Random random = new Random();

        System.out.printf("임의의 정수값: %d\n", random.nextInt());
        System.out.printf("0~9 사이의 임의의 정수값: %d\n", random.nextInt(10));
        System.out.printf("1~10사이의 임의의 정수값: %d\n", random.nextInt(10)+1);
        System.out.printf("임의의 실수값: %f\n", random.nextDouble(100));
        System.out.printf("임의의 실수값: %b\n", random.nextBoolean());
    }
}
