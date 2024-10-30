package jdbc2.view;

import jdbc2.entity.Customer;

public class CustomerView {

    public String title = "고 객 정 보";

    public  void  printCustomer(Customer customer ){
        System.out.printf("- 고객명: %s\n",customer.getCustomerName());
        System.out.printf("- 나이: %d\n",customer.getAge());
        System.out.printf("- 등급: %s\n",customer.getLevel());
        System.out.printf("- 직업: %s\n",customer.getJob());
        System.out.printf("- 적립금: %d\n\n",customer.getReward());


    }


    public  void printHead(){
        System.out.println("===============================");
        System.out.println("========= " + title +  "   ======");
        System.out.println("===============================");
    }

    public  void  printFooter(){
        System.out.println("===============================");
        System.out.println("========= Print Done  ======");
        System.out.println("===============================");
    }
}
