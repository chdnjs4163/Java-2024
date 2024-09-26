package chp08.exercise08;

public class Monster {
    private String name;
    private int hp;
    private static int maxHP = 30;

    public Monster(String name){
       this. name = name;
       this.hp = maxHP;
    }
    public void attack(Monster enemy){
        enemy.hp -= 10;
        System.out.printf("[%s]의 공격 -> %s의 체력: %d/%d\n", name, enemy.name, enemy.hp,enemy.maxHP);

    }
    public static void battle(Monster a, Monster b){
        while (a.hp > 0 && b.hp > 0){
            Monster attacker = (Math.random() > 0.5) ? a : b;
             Monster defender = (attacker == a) ? b : a;
            attacker.attack(defender);
        }
    }
}

