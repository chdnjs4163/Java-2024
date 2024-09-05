package chp07.lab1;

public class MainDog {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();


        d1.setName("레옹");
        d1.setBreeds("말티즈");
        d1.setAge(15);

        d2.setName("넬로");
        d2.setBreeds("푸들");
        d2.setAge(7);


        System.out.printf("d1 => (name: %s, breed: %s, age:%d)\n", d1.getName(), d1.getBreeds(), d1.getAge());
        System.out.printf("d2 => (name: %s, breed: %s, age:%d)\n", d2.getName(), d2.getBreeds(), d2.getAge());

        d1.wag();
        d2.wag();

        d1.bark();
        d1.bark(5, "왈왈");

        d2.bark();
        d1.bark(3, "컹컹컹");




    }


}

