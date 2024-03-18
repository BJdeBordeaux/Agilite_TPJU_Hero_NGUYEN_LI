package hero;

public class Pistol {
    private int power;
    private Hero hero;

    public Pistol() {
        power = 0;
        hero = null;
    }

    public Pistol(int power) {
        this.power = power;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
