package champion;

public class Ezreal extends Champion {

    public Ezreal() {
        super("Ezreal", 1, 100, 15, 3);
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(name + "의 신비한 화살!!");
        int qDamage = attackDamage * 2;
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
