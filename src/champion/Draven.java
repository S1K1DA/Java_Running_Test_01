package champion;

public class Draven extends Champion {

    public Draven() {
        super("Draven", 1, 120, 20, 4);
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(name + "의 회전 도끼!");
        int qDamage = attackDamage + 10;
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
