package chp08.ex8_9;

public class Coffee {
    private String name;
    private int price;

    public Coffee(String c, int p) {
        name = c;
        price = p;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public  void setPrice(int p){
        price = p;
    }
}


