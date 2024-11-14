package chp11.ex11_5;

public class MainVehicle {

    public static void main(String[] args) {
        Vehicle vehicle = new Bicycle();

        vehicle.horn();
        vehicle.move("보광동","이태원");

        Bicycle bicycle = new Bicycle();
        bicycle.horn();
        bicycle.move("한강진역","이태원"); //Vehicle의 defoult 메소가 호출
        Bicycle.stop("맥심프랜트");

        Vehicle vehicle1 = new Train();
         vehicle1.horn();
         vehicle1.move("서울", "남원"); // Train의 오버라이딩된 메소드 호출

        Vehicle.stop("대전");
    }
}
