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

    public void setName(String newName) {
        this.name = newName;
    }

    public void addPistol(Pistol pistol) {

        // Disarm the owner of the pistol
        Hero owner = pistol.getHero();
        if (owner != null) {
            owner.removePistol(pistol);
            pistol.setHero(null);
        }
        // Arm the hero
        this.pistols.add(pistol);
        pistol.setHero(this);
    }

    public Pistol removePistol(Pistol pistol) {
        // If this pistol is in the list of pistols of this hero
        // we will remove it
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
