package chp08.ex8_4;

public class MainAvenger {

    public static void main(String[] args) {
        Avenger thor = new Avenger("토르", 150);
        Avenger thanos = new Avenger("타노스", 160);
        thor.punch(thanos);
        thor.punch(thanos);
        thanos.punch(thor);

    }

}