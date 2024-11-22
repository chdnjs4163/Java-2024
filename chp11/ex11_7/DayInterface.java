package chp11.ex11_7;

// 상수 사용예제
// 상수는 무조건 대문자 중간에 쓸때는 언더바
public interface DayInterface {
// 인터페이스에서는 상수만 사용되기 때문에 public static final을 생략할 수 있다.
// final은 처음에 초기화를 한 후에는 다른 값으로 변경할 수 없다.
// static은  인테페이스명을  .앞에  붙여서 상수를 사용할 수 있다.

    String MONDAY = "월요일";

    public static final String TUESDAY  = "화요일";

}
