package Service;

import View.BookManageView;
import BookDTO.BookDTO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookManageService {
    private List<BookDTO> bookList = new ArrayList<>();
    private BookManageView view = new BookManageView();
    private final String FILE_NAME = "books.txt";

    public BookManageService() {
        loadBooksFromFile();
    }
    public void run() {
        while (true) {
            int menu = view.showMenu();
            switch (menu) {
                case 1:
                    addBook();
                    break;
                case 2:
                    showBooks();
                    break;
                case 3:
                    updateBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    view.displayMessage("프로그램을 종료합니다.");
                    return;
                default:
                    view.displayMessage("잘못된 메뉴 선택입니다.");
            }
        }
    }

    public void addBook() {
        BookDTO newBook = view.addBook();
        bookList.add(newBook);
        saveBooksToFile();
        view.displayMessage("도서가 추가되었습니다.");
    }

    public void showBooks() {
        view.displayBooks(bookList);
    }

    public void updateBook() {
        String isbnToUpdate = view.searchBook();
        BookDTO bookToUpdate = findBookByIsbn(isbnToUpdate);
        if (bookToUpdate != null) {
            bookList.remove(bookToUpdate);
            bookList.add(view.addBook());
            saveBooksToFile();
            view.displayMessage("도서 정보가 수정되었습니다.");
        } else {
            view.displayMessage("해당 ISBN을 가진 도서를 찾을 수 없습니다.");
        }
    }

    public void deleteBook() {
        String isbnToDelete = view.searchBook();
        BookDTO bookToDelete = findBookByIsbn(isbnToDelete);
        if (bookToDelete != null) {
            bookList.remove(bookToDelete);
            saveBooksToFile();
            view.displayMessage("도서가 삭제되었습니다.");
        } else {
            view.displayMessage("해당 ISBN을 가진 도서를 찾을 수 없습니다.");
        }
    }

    // ISBN으로 도서 찾기
    private BookDTO findBookByIsbn(String isbn) {
        for (BookDTO book : bookList) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    private void saveBooksToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (BookDTO book : bookList) {
                writer.write(book.getIsbn() + "," + book.getBookName() + "," + book.getAuthor() + "," + book.getPublisher() + "," + book.getPrice());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void loadBooksFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    String isbn = parts[0];
                    String bookName = parts[1];
                    String author = parts[2];
                    String publisher = parts[3];
                    double price = Double.parseDouble(parts[4]);
                    bookList.add(new BookDTO(isbn, bookName, author, publisher, price));
                }
            }
        } catch (IOException e) {
            System.out.println("저장된 도서 정보가 없습니다.");
        } catch (NumberFormatException e) {
            System.out.println("가격 정보에 오류가 있습니다.");
        }
    }
}
