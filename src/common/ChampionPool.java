package common;

import champion.Champion;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ChampionPool {

    private final Map<String, Champion> pool = new HashMap<>();

    // 챔피언 추가
    public void addChampion(Champion champion) {
        pool.put(champion.getName(), champion);
    }

    // 챔피언 조회
    public Optional<Champion> getChampion(String name) {
        return Optional.ofNullable(pool.get(name));
    }
}
