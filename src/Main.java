import champion.Champion;
import champion.Draven;
import champion.Ezreal;
import common.ChampionPool;
import common.SafeBattle;
import exception.ChampionNotFoundException;
import exception.DeadChampionActionException;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ChampionPool pool = new ChampionPool();

        // 챔피언 Pool 생성
        pool.addChampion(new Ezreal());
        pool.addChampion(new Draven());

        try {
            // 챔피언 선택
            Champion champ1 = pool.getChampion("Ezreal")
                    .orElseThrow(() -> new ChampionNotFoundException("Ezreal"));

            Champion champ2 = pool.getChampion("Draven")
                    .orElseThrow(() -> new ChampionNotFoundException("Draven"));

            System.out.println("===== 1:1 결투 시작 =====");
            System.out.println(champ1.getName() + " VS " + champ2.getName());

            // 안전 전투 진행
            SafeBattle battle = new SafeBattle(champ1, champ2);

            battle.basicAttackTurn(champ1, champ2);
            battle.skillQTurn(champ2, champ1);
            battle.basicAttackTurn(champ1, champ2);
            battle.skillQTurn(champ2, champ1);

            // 승패 출력
            if (champ1.getHp() <= 0) {
                System.out.println("승자: " + champ2.getName());
            } else if (champ2.getHp() <= 0) {
                System.out.println("승자: " + champ1.getName());
            } else {
                System.out.println("[전투 종료!]");
            }
        } catch (ChampionNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (DeadChampionActionException e) {
            System.out.println(e.getMessage());
        }
    }
}