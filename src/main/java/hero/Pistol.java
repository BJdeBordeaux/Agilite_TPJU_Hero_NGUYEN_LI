package hero;

import interfaces.ArmeSpecial;

public class Pistol {
    private int puissance = 0;
    private Hero hero = null;

    public Pistol() {
    }

    public Pistol(int puissance) {
        this.puissance = puissance;
    }


    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public int getPuissance() {
        return this.puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }
}
