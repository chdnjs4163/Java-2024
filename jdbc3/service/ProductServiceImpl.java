package jdbc3.service;

import jdbc3.entity.Product;
import jdbc3.repository.ProductRepository;
import jdbc3.view.ProductView;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductServiceImpl implements ProductService {


    @Override
    public void search(Scanner s1, Scanner s2) {
        System.out.print("* 검색종류 선택(1. 제품명, 2. 제조업체):");
        int searchType = s1.nextInt();
        String type = "제품명";
        switch (searchType){
            case 1: type="제품명";
                break;
            case 2: type="제조업체";
                break;
        }
        System.out.print("* 검색어 입력:");
        String searchWord = s2.nextLine();

        ArrayList<Product> arrList = ProductRepository.getList(type,searchWord);
        ProductView.printView(arrList);

    }
}
