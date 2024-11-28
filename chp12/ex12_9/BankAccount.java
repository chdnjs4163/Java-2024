package chp12.ex12_9;

public class BankAccount {

    private final String userName;

    private final String accountNumber;

    private long balance;

    public BankAccount(String userName, String accountNumber, long balance) {
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
       return String.format("%s, %s, %d", userName, accountNumber, balance);
    }
}
