package Controller;

import Service.BookManageService;

public class BookManageController {
    public static void main(String[] args) {
        BookManageService service = new BookManageService();
        service.run();
    }
}
