package hero;

public class Pistol {
    private int power = 0;
    private Hero hero = null;

    public Pistol() {
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
