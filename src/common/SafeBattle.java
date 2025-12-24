package common;

import champion.Champion;
import exception.DeadChampionActionException;

public class SafeBattle {

    private final Champion champ1;
    private final Champion champ2;

    public SafeBattle(Champion champ1, Champion champ2) {
        this.champ1 = champ1;
        this.champ2 = champ2;
    }

    // 사망 확인 예외처리
    private void checkAlive(Champion champion) {
        if (champion.getHp() <= 0) {
            throw new DeadChampionActionException(
                    champion.getName() + "은(는) 이미 사망하여 행동할 수 없습니다."
            );
        }
    }

    // 기본 공격 턴
    public void basicAttackTurn(Champion attacker, Champion defender) {
        checkAlive(attacker);
        checkAlive(defender);
        attacker.basicAttack(defender);
    }

    // 스킬 턴
    public void skillQTurn(Champion attacker, Champion defender) {
        checkAlive(attacker);
        checkAlive(defender);
        attacker.useQ(defender);
    }
}
