package pokemon;
public class Attack {
    private String name;
    private int damage;

    public Attack() {
        name = "Quick Attack";
        damage = 10;
    }


    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}