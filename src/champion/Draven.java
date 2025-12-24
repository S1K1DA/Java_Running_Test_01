package champion;

import common.GameConstants;

import static common.GameConstants.BASE_ATTACK_DAMAGE;

public class Draven extends Champion {

    public Draven() {
        super("Draven", 1, 120, BASE_ATTACK_DAMAGE, 4);
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(name + "의 회전 도끼!");
        int qDamage = attackDamage + 10;

        // 치명타 확률 상수 사용
        if(Math.random() * 100 < GameConstants.DRAVEN_CRITICAL) {
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
