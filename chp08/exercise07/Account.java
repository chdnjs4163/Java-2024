package chp08.exercise07;

public class Account {
    private String accountName;
    private int balance;


    public Account(String accountName, int balance) {
        this.accountName = accountName;
        this.balance = balance;

    }

    public boolean transfer(Account account, int amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족하여 이체 불가능 ");
            return false;
        }
        else {
            balance = balance - amount;
            return true;
        }

    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}



