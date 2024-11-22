package chp11.ex11_5_6;

public interface Vehicle {

    void horn();

    default public void move(String from, String to) {
        System.out.printf("%s에서 %s까지 이동합니다\n", from, to);
    }

    static  public  void stop(String place){
        System.out.println(place + "에 멈춰섰다.");
    }
}
