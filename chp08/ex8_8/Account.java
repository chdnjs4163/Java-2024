package chp08.ex8_8;

public class Account {

   private String accNumber;

   private String name;

   private  String pwd;

   private int balance;

    public Account(String accNumber, String name, String pwd, int balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.pwd = pwd;
        this.balance = balance;
    }

    public int getBalance(){
       return balance;
   }

    public void setBalance(int balance){
    this.balance = balance;
   }

   public String getName(){
       return name;
   }

   public String getPassword(){
       return pwd;
   }

// 입금하는 메소드: deposit
    public void deposit(int money){
        balance += money; // balance = balance + money
    }

// 출금하는 메소드: withdraw
    public void withdraw(int money){
        balance -= money;  // balance = balance - money
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNumber='" + accNumber + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}
