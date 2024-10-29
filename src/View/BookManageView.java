package View;
import java.util.InputMismatchException;
import java.util.Scanner;
import BookDTO.BookDTO;
import java.util.List;

public class BookManageView {
    private Scanner scanner = new Scanner(System.in);

    // promptForField 메서드 수정
    public String promptForField(String message) {
        System.out.print(message);
        String input = scanner.nextLine();
        return input.trim().isEmpty() ? "" : input; // 빈 입력인 경우 "" 반환
    }


    public int showMenu() {
        System.out.println("1. 도서 추가");
        System.out.println("2. 도서 조회");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("5. 종료");
        System.out.print("메뉴 선택: ");
        return scanner.nextInt();
    }

    public BookDTO addBook() {
        String isbn; // ISBN 변수 선언
        while (true) {
            System.out.print("ISBN 입력 (13자리): ");
            isbn = scanner.next(); // 사용자로부터 ISBN 입력 받기

            // ISBN이 13자리인지 확인
            if (isbn.length() == 13) {
                break; // 13자리이면 루프 종료
            } else {
                System.out.println("ISBN은 13자리여야 합니다. 다시 입력하세요."); // 오류 메시지
            }
        }
        scanner.nextLine(); // 줄바꿈 문자 소비

        System.out.print("도서 이름 입력: ");
        String bookName = scanner.nextLine(); // 한 줄 전체를 읽기 위해 nextLine() 사용

        System.out.print("저자 입력: ");
        String author = scanner.nextLine(); // 저자 이름도 한 줄 전체를 읽기 위해 nextLine() 사용

        System.out.print("출판사 입력: ");
        String publisher = scanner.nextLine(); // 출판사 이름도 한 줄 전체를 읽기 위해 nextLine() 사용

        double price = 0; // 가격 초기화

        // 가격 입력을 받는 부분
        boolean validInput = false; // 유효한 입력 체크
        while (!validInput) {
            System.out.print("가격 입력 (숫자만 입력): "); // 안내 메시지
            // 입력된 값이 double인지 확인
            if (scanner.hasNextDouble()) {
                price = scanner.nextDouble(); // 숫자 입력 받기
                validInput = true; // 유효한 입력을 받았으므로 루프 종료
            } else {
                // 잘못된 입력일 경우 오류 메시지 출력
                System.out.println("유효한 숫자를 입력하세요.");
                scanner.next(); // 잘못된 입력을 초기화
            }
        }

        return new BookDTO(isbn, bookName, author, publisher, price);
    }

    public String searchBook() {
        System.out.print("조회할 도서 ISBN 입력: ");
        return scanner.next();
    }

    public void displayBooks(List<BookDTO> books) {
        for (BookDTO book : books) {
            System.out.println(book);
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
