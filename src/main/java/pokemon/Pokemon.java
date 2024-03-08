package pokemon;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String name;
    private int level;
    private List<Attack> attacks;

    public Pokemon() {
        name = "Carapuce";
        level = 1;
        Attack quickAttack = new Attack();
        attacks = new ArrayList<>();
        attacks.add(quickAttack);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<Attack> attacks) {
        this.attacks = attacks;
    }

    public void addAttack(Attack attack) {
        attacks.add(attack);
    }

    public void levelUp(int x) {
        level += x;
    }
}
