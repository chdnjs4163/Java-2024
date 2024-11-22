package chp12.ex12_1_2;

public class MainException12_1 {

    public static void main(String[] args) {
     String[] arr = {"봄","여름","가을","겨울"};
     for (int  i=0; i <arr.length; i++){
         System.out.print(arr[i] + " ");
     }
        System.out.println();
        for (String season : arr) {
            System.out.print(season + " ");

        }
        System.out.println();

        try {
            System.out.println(arr[5]);
        }catch (ArithmeticException e){  //ArrayIndexOutOfBounds 이걸뺴도 실행가능 자식에서 예외가 발생해도 부모쪽에서 처리가능
            System.out.println("산술연산이 잘못 되었어요(나누는 수를 0으로 하면 안됩니다.)!!!!"); // 자식 클래스라서 아래로 가면 애러 발생
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열의 인덱스 번호가 너무 크네요!!!");
        }catch (Exception e){
            System.out.println("산술 또는 배열과 관련되지 않은 예외는 여기서 처리해 줄게요.!!!"); // 상위클래스가 무조건 아래쪽에 있어야한다(부모클래스)
        }

        System.out.println(arr[2]);
        System.out.println("프로그램이 종료됩니다.");

    }
}
