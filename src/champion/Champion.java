package champion;

import common.GameConstants;

public abstract class Champion {

    // 자식생성자에서 사용할수있는 protected 사용
    protected String name;
    protected int level;
    protected int hp;
    protected int attackDamage;
    protected int defense;

    private static int createdCount = 0;

    // 생성자
    public Champion(String name, int level, int hp, int attackDamage, int defense) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.defense = defense;

        createdCount++;
    }

    // 기본공격 공통 메서드
    public void basicAttack(Champion target) {
        System.out.println(name + "이(가) 기본 공격을 합니다.");
        target.takeDamage(attackDamage);
    }

    // 공격받는 공통 메서드
    public void takeDamage(int damage) {
        int actualDamage = damage - defense;

        if(actualDamage<0) actualDamage = 0;

        hp -= actualDamage;
        System.out.println(name + "이(가) " + actualDamage + "의 피해를 받았습니다.");
        System.out.println("HP : " + hp);
    }

    // 레벨업 공통 메서드
    public void levelUp() {
        if(level >= GameConstants.MAX_LEVEL) {
            System.out.println(name + "이(가) 최대 레벨입니다!");
            return;
        }
        level++;
    }

    // 추상 메서드 추가
    public abstract void useQ(Champion target);
    public abstract void useW(Champion target);
    public abstract void useE(Champion target);
    public abstract void useR(Champion target);

    // CreatedCount 조회용
    public static int getCreatedCount() {
        return createdCount;
    }

    public String getName() {
        return name;
    }

}
