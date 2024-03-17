package hero;

import java.util.ArrayList;
public class Hero {
    private int strength;
    private String name;
    private ArrayList<Pistol> pistols = new ArrayList<>();;

    public Hero() {
        // initialise instance variables
        strength = 0;
        name = "hero.Hero";
    }
    public Hero(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public int increaseStrength(int y) {
        this.strength += y;
        return this.strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String newNom) {
        this.name = newNom;
    }

    public void addPistol(Pistol pistol) {

        // désarmer le propriétaire du pistol
        Hero proprietaire = pistol.getHero();
        if (proprietaire != null) {
            proprietaire.removePistol(pistol);
            pistol.setHero(null);
        }
        // armer cet héro
        this.pistols.add(pistol);
        pistol.setHero(this);
    }

    public Pistol removePistol(Pistol pistol) {
        // si ce pistol est dans la liste des pistol de cet héro
        // on va le retirer
        if (pistols.contains(pistol)) {
            pistols.remove(pistol);
            return pistol;
        }

        // sinon, on ne fait rien
        return null;
    }

    public ArrayList<Pistol> getPistols() {
        return this.pistols;
    }

    public int totalStrength() {
        int totalStrength = this.strength;

        for (Pistol pistol : this.pistols) {
            totalStrength += pistol.getPower();
        }

        return totalStrength;
    }
}
