package chp10.ex10_11;

public class Item2 {

    private String name;

    int price;

    Item2(){
        this.name = "기본";
        System.out.println("Item2()의 기본생성자 호출됨");
    }

    public Item2(String name,int price) {
        this.price = price;
        this.name = name;
    }
}
