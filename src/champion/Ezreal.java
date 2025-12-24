package champion;

import common.GameConstants;

public class Ezreal extends Champion {

    public Ezreal() {
        super("Ezreal", 1, 100, 15, 3);
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(name + "의 신비한 화살!!");
        int qDamage = attackDamage * 2;

        // 치명타 확률 상수 사용
        if(Math.random() * 100 < GameConstants.EZREAL_CRITICAL) {
            qDamage *= 2;
            System.out.println("치명타!");
        }
        target.takeDamage(qDamage);
    }

    @Override
    public void useW(Champion target) {
    }

    @Override
    public void useE(Champion target) {
    }

    @Override
    public void useR(Champion target) {
    }
}
