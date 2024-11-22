package chp11.ex11_8;

public class HolyKnight extends Knight implements Healer {
    public int dp = 100;
    public HolyKnight(String name) {
        super(name);
    }

    @Override
    public void heal() {
        System.out.printf("[%s]의 체력이 가득 찹니다\n",name);
    }

    @Override
    public void recovery() {
        System.out.printf("[%s]의 체력 회복력이 증가됩니다.\n",name);
    }

    @Override
    public void slash() {
        System.out.printf("[%s]의 신성력이 깃든 베기 공격~~~\n",name);
    }
}
