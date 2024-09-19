package chp08.ex8_8;

import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.printf("* 계좌번호입력(5자리):");
        String accountNumber = scanner1.nextLine();

        System.out.printf("* 성명 입력:");
        String name = scanner1.nextLine();

        System.out.printf("* 비밀번호(4자리):");
        String pwd = scanner1.nextLine();

        System.out.printf("* 입금할 금액:");
        int balance = scanner2.nextInt();

 //     처음 통장 개설했을 떄
        Account account = new Account(accountNumber, name, pwd, balance);
        System.out.println(account);

//      통장에서 2600000원 입금
        System.out.printf("* 입금할 금액:");
        int deposit = scanner2.nextInt();
        account.deposit(deposit);

//      통장에서 200000원 출금
        System.out.printf("* 출금할 금액:");
        int wuthdraw = scanner2.nextInt();
        account.withdraw(wuthdraw);

        System.out.printf("%s 님의 통장 잔액은 %d 원입니다.\n",account.getName(), account.getBalance());
        scanner1.close();
        scanner2.close();

    }
}
