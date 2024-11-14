package chp11.ex11_4;

import chp10.ex10_9.Animal;

public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("새가 멋지게 날아갑니다.");
    }
}
