package chp11.ex11_8;

public class MainGameSimulation {
    public static void main(String[] args) {
        Knight atomic = new Knight("에토믹"); // 휴먼
        Knight uther = new HolyKnight("아서"); // 신성한능력을 가진
        Knight genji = new MagicKnight("간달프"); // 마법능력을 가진

        atomic.slash();
        uther.slash();
        genji.slash();

        Healer healer1 = (HolyKnight)uther; // 다운캐스팅
        Healer healer2 = new HolyKnight("웬서"); // 다른객체

        healer1.heal();
        healer1.recovery();
 //       healer1.slash();  // Healer 인터페이스의 참조변수이므로 Healer 인터페이스를 통해 구현된 메소드만 호출할 수 있다.

        Magician magician1 = (MagicKnight)genji;
        magician1.magicShield();
        magician1.teleport();

        MagicKnight magicKnight = new MagicKnight("긴달프");
        magicKnight.magicShield();
        magicKnight.teleport();
        magicKnight.slash();
    }
}
